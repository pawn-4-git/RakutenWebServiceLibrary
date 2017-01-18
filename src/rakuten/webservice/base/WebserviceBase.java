/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import rakuten.webservice.exception.NotSetApplicationIdException;
import rakuten.webservice.exception.NotSetURLException;
import rakuten.webservice.exception.NotSetVersionException;
import java.util.LinkedHashMap;
import java.util.Map;
import rakuten.webservice.exception.RakutenIchibaResponseException;

/**
 *
 * @author pawn
 */
public abstract class WebserviceBase {

    /**
     * @return the ENCODING
     */
    public static String getENCODING() {
        return ENCODING;
    }

    /**
     * @param aENCODING the ENCODING to set
     */
    public static void setENCODING(String aENCODING) {
        ENCODING = aENCODING;
    }
    private String url="";
    private String version="";
    private String applicationId="";
    private String affiliateId=null;
    private String format=null;
    private String callback=null;
    private String elements=null;
    private String formatVersion=null;
    private static String ENCODING = "UTF-8";
    private Boolean applicationIdSetFlg=false;
    
    //パラメータ設定用マップ
    private Map<String,String> paramap=new LinkedHashMap<>();
    //最後のkeyのための値
    private String endKey;
    
    private String encode(String url) throws UnsupportedEncodingException{
        return URLEncoder.encode(url, getENCODING());
    }
    
    /**
     * 基本URL作成
     * @return 
     * @throws java.lang.Exception
    */
    public String getBaseURL() throws Exception{
        if(url==null||"".equals(url)){
            throw new NotSetURLException("URLが設定されていません");
        }
        if(getVersion()==null||"".equals(version)){
            throw new NotSetVersionException("バージョンが設定されていません");
        }
        if(getApplicationId()==null||"".equals(applicationId)){
            throw new NotSetApplicationIdException("アプリケーションIDが設定されていません");
        }
        return url+"/"+getVersion()+"?applicationId="+getApplicationId()+"&";
    }
    
    /**
     * 連携用のURLを生成する
     * @return
     * @throws Exception 
     */
    public String getUrl() throws Exception{
        url=getBaseURL();
        String tmpurl=url;
        String originalUrl=url;
        if(affiliateId!=null){
            url=url+"affiliateId="+affiliateId+"&";
        }
        if(format!=null){
            url=url+"format="+format+"&";
        }
        if(callback!=null){
            url=url+"callback="+callback+"&";
        }
        if(elements!=null){
            url=url+"elements="+elements+"&";
        }
        if(formatVersion!=null){
            url=url+"formatVersion="+formatVersion+"&";
        }
        getParamap().keySet().stream().map((key) -> {
            url=url+key+"="+getParamap().get(key);
            return key;
        }).filter((key) -> (!endKey.equals(key))).forEach((_item) -> {
            url=url+"&";
        });
        tmpurl=url;
        url=originalUrl;
        return tmpurl;
    }
    
    public String getHttpResponse() throws MalformedURLException, Exception{
        
        URL url=new URL(getUrl());
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        con.setInstanceFollowRedirects(false);
        con.connect();
        Map headers = con.getHeaderFields();
        Iterator it = headers.keySet().iterator();
        //System.out.println("レスポンスヘッダ:");
        while (it.hasNext()){
            String key= (String)it.next();
        //   System.out.println("  " + key + ": " + headers.get(key));
        }

        //System.out.println("レスポンスコード[" + con.getResponseCode() + "] " +
        //                   "レスポンスメッセージ[" + con.getResponseMessage() + "]");
        //System.out.println("\n---- ボディ ----");
        
        //エラー対応　エラーがあった場合例外を返します
        switch (con.getResponseCode()) {
            case 500:
                //API制限対策
                Thread.sleep(1000);
                throw new RakutenIchibaResponseException("レスポンスコード:500 楽天ウェブサービス内エラー");
            case 400:
                //API制限対策
                Thread.sleep(1000);
                throw new RakutenIchibaResponseException("レスポンスコード:400 パラメーターエラー");
            case 403:
                //API制限対策
                Thread.sleep(1000);
                throw new RakutenIchibaResponseException("レスポンスコード:403が返されました");
            case 404:
                //API制限対策
                Thread.sleep(1000);
                throw new RakutenIchibaResponseException("レスポンスコード:404 対象データがありませんでした");
            case 429:
                //API制限対策
                Thread.sleep(1000);
                throw new RakutenIchibaResponseException("レスポンスコード:429 リクエスト過多");
            case 503:
                //API制限対策
                Thread.sleep(1000);
                throw new RakutenIchibaResponseException("レスポンスコード:503 メンテナンスリクエスト過多");
            
            
            default:
                break;
        }
        
        StringBuilder streamStr;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"))) {
            streamStr = new StringBuilder();
            while (true){
                String line = reader.readLine();
                if ( line == null ){
                    break;
                }
                streamStr.append(line).append("\n\r");
            }
        }
        con.disconnect();
        return streamStr.toString();
    }
    
    /**
     * 連携のためのパラメータを追加します
     * @param key
     * @param value 
     * @throws java.io.UnsupportedEncodingException 
     */
    public void addParam(String key,String value) throws UnsupportedEncodingException{
        if(value!=null&&!"".equals(value)&&!"null".equals(value)){
            this.getParamap().put(key, encode(value));
            setEndKey(key);
        }
    }
    
    public void addParam(String key,Integer value) throws UnsupportedEncodingException{
        if(value!=null){
            this.getParamap().put(key, encode(value.toString()));
            setEndKey(key);
        }
    }
    
    public void addParam(String key,Long value) throws UnsupportedEncodingException{
        if(value!=null){
            this.getParamap().put(key, encode(value.toString()));
            setEndKey(key);
        }
    }
    public void addParam(String key,Float value) throws UnsupportedEncodingException{
        if(value!=null){
            this.getParamap().put(key, encode(value.toString()));
            setEndKey(key);
        }
    }
    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * @param applicationId the applicationId to set
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * @return the affiliateId
     */
    public String getAffiliateId() {
        return affiliateId;
    }

    /**
     * @param affiliateId the affiliateId to set
     */
    public void setAffiliateId(String affiliateId) {
        this.affiliateId = affiliateId;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @return the callback
     */
    public String getCallback() {
        return callback;
    }

    /**
     * @param callback the callback to set
     */
    public void setCallback(String callback) {
        this.callback = callback;
    }

    /**
     * @return the elements
     */
    public String getElements() {
        return elements;
    }

    /**
     * @param elements the elements to set
     */
    public void setElements(String elements) {
        this.elements = elements;
    }

    /**
     * @return the formatVersion
     */
    public String getFormatVersion() {
        return formatVersion;
    }

    /**
     * @param formatVersion the formatVersion to set
     */
    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
    }

    /**
     * @return the paramap
     */
    public Map<String,String> getParamap() {
        return paramap;
    }

    /**
     * @param paramap the paramap to set
     */
    public void setParamap(Map<String,String> paramap) {
        this.paramap = paramap;
    }

    /**
     * @return the endKey
     */
    public String getEndKey() {
        return endKey;
    }

    /**
     * @param endKey the endKey to set
     */
    public void setEndKey(String endKey) {
        this.endKey = endKey;
    }

    /**
     * @return the applicationIdSetFlg
     */
    public Boolean getApplicationIdSetFlg() {
        return applicationIdSetFlg;
    }

    /**
     * @param applicationIdSetFlg the applicationIdSetFlg to set
     */
    public void setApplicationIdSetFlg(Boolean applicationIdSetFlg) {
        this.applicationIdSetFlg = applicationIdSetFlg;
    }
    
    
}
