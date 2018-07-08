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
import rakuten.webservice.exception.RakutenIchibaRequestException;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookGameResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookGameSearchEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookSearchEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemResultEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenIchibaBookGameSerchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenIchibaBookGameSerchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/BooksGame/Search");
        setVersion("20170404");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    public Object doSearch(RakutenIchibaBookGameSearchEntity rakutenIchibaBookGameSearchEntity) throws Exception {
        
        addParam("title",rakutenIchibaBookGameSearchEntity.getTitle());
        addParam("booksGenreid",rakutenIchibaBookGameSearchEntity.getBooksGenreid());
        addParam("hardware",rakutenIchibaBookGameSearchEntity.getHardware());
        addParam("makerCode",rakutenIchibaBookGameSearchEntity.getMakerCode());
        addParam("label",rakutenIchibaBookGameSearchEntity.getLabel());
        addParam("jan",rakutenIchibaBookGameSearchEntity.getJan());
        
        
        addParam("hits",rakutenIchibaBookGameSearchEntity.getHits());
        addParam("page",rakutenIchibaBookGameSearchEntity.getPage());
        addParam("availability",rakutenIchibaBookGameSearchEntity.getAvailability());
        addParam("outOfStockFlag",rakutenIchibaBookGameSearchEntity.getOutOfStockFlag());
        addParam("sort",rakutenIchibaBookGameSearchEntity.getSort());
        addParam("limitedFlag",rakutenIchibaBookGameSearchEntity.getLimitedFlag());
        addParam("carrier", rakutenIchibaBookGameSearchEntity.getCarrier());
        addParam("genreInformationFlag", rakutenIchibaBookGameSearchEntity.getGenreInformationFlag());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenIchibaBookGameResultEntity rakutenIchibaBookGameResultEntity=(RakutenIchibaBookGameResultEntity)json.decode(streamStr,RakutenIchibaBookGameResultEntity.class);
        
        return rakutenIchibaBookGameResultEntity;
    }
    
}
