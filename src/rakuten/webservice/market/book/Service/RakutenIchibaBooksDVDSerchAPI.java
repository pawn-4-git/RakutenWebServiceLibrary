/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Service;

import rakuten.webservice.base.JsonConverter;
import rakuten.webservice.base.WebserviceBase;
import rakuten.webservice.exception.RakutenIchibaRequestException;
import rakuten.webservice.market.book.Entity.RakutenIchibaBooksBookResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBooksCDResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBooksCDSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenIchibaBooksDVDSerchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenIchibaBooksDVDSerchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/BooksDVD/Search");
        setVersion("20130522");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    public Object doSearch(RakutenIchibaBooksCDSearchEntity rakutenIchibaBooksCDSearchEntity) throws Exception {
        
        if(rakutenIchibaBooksCDSearchEntity.getBooksGenreId()!=null&&!rakutenIchibaBooksCDSearchEntity.getBooksGenreId().startsWith("003")){
             throw new RakutenIchibaRequestException("楽天ブックスジャンルIDはDVD/BluRay検索では003で始まる必要があります");
        }
        
        addParam("title",rakutenIchibaBooksCDSearchEntity.getTitle());
        addParam("artistName",rakutenIchibaBooksCDSearchEntity.getArtistName());
        addParam("label",rakutenIchibaBooksCDSearchEntity.getLabel());
        addParam("jan",rakutenIchibaBooksCDSearchEntity.getJan());
        addParam("booksGenreId",rakutenIchibaBooksCDSearchEntity.getBooksGenreId());
        addParam("hits",rakutenIchibaBooksCDSearchEntity.getHits());
        addParam("page",rakutenIchibaBooksCDSearchEntity.getPage());
        addParam("availability",rakutenIchibaBooksCDSearchEntity.getAvailability());
        addParam("outOfStockFlag",rakutenIchibaBooksCDSearchEntity.getOutOfStockFlag());
        addParam("sort",rakutenIchibaBooksCDSearchEntity.getSort());
        addParam("limitedFlag",rakutenIchibaBooksCDSearchEntity.getLimitedFlag());
        addParam("carrier", rakutenIchibaBooksCDSearchEntity.getCarrier());
        addParam("genreInformationFlag", rakutenIchibaBooksCDSearchEntity.getGenreInformationFlag());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenIchibaBooksCDResultEntity rakutenIchibaBookResultEntity=(RakutenIchibaBooksCDResultEntity)json.decode(streamStr,RakutenIchibaBooksCDResultEntity.class);
        
        return rakutenIchibaBookResultEntity;
    }
    
}
