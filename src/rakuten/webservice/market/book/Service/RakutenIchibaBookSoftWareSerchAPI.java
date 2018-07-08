/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Service;

import java.net.URLEncoder;
import rakuten.webservice.market.product.Service.*;
import rakuten.webservice.base.JsonConverter;
import rakuten.webservice.base.WebserviceBase;
import static rakuten.webservice.base.WebserviceBase.getENCODING;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookSoftWareResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookSoftWareSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenIchibaBookSoftWareSerchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenIchibaBookSoftWareSerchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/BooksSoftware/Search");
        setVersion("20170404");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    public Object doSearch(RakutenIchibaBookSoftWareSearchEntity rakutenIchibaBookSoftWareSearchEntity) throws Exception {
        
        addParam("title",rakutenIchibaBookSoftWareSearchEntity.getTitle());
        addParam("booksGenreid",rakutenIchibaBookSoftWareSearchEntity.getBooksGenreid());
        addParam("os",rakutenIchibaBookSoftWareSearchEntity.getOs());
        addParam("makerCode",rakutenIchibaBookSoftWareSearchEntity.getMakerCode());
        addParam("label",rakutenIchibaBookSoftWareSearchEntity.getLabel());
        addParam("jan",rakutenIchibaBookSoftWareSearchEntity.getJan());
        
        
        addParam("hits",rakutenIchibaBookSoftWareSearchEntity.getHits());
        addParam("page",rakutenIchibaBookSoftWareSearchEntity.getPage());
        addParam("availability",rakutenIchibaBookSoftWareSearchEntity.getAvailability());
        addParam("outOfStockFlag",rakutenIchibaBookSoftWareSearchEntity.getOutOfStockFlag());
        addParam("sort",rakutenIchibaBookSoftWareSearchEntity.getSort());
        addParam("limitedFlag",rakutenIchibaBookSoftWareSearchEntity.getLimitedFlag());
        addParam("carrier", rakutenIchibaBookSoftWareSearchEntity.getCarrier());
        addParam("genreInformationFlag", rakutenIchibaBookSoftWareSearchEntity.getGenreInformationFlag());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenIchibaBookSoftWareResultEntity rakutenIchibaBookSoftWareResultEntity=(RakutenIchibaBookSoftWareResultEntity)json.decode(streamStr,RakutenIchibaBookSoftWareResultEntity.class);
        
        return rakutenIchibaBookSoftWareResultEntity;
    }
    
}
