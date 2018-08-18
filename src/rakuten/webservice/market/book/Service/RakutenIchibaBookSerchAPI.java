/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Service;

import java.util.LinkedHashMap;
import rakuten.webservice.market.product.Service.*;
import rakuten.webservice.base.JsonConverter;
import rakuten.webservice.base.WebserviceBase;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookSearchEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemResultEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenIchibaBookSerchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenIchibaBookSerchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/BooksTotal/Search");
        setVersion("20130522");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    public Object doSearch(RakutenIchibaBookSearchEntity rakutenIchibaBookSearchEntity) throws Exception {
        
        this.setParamap(new LinkedHashMap<>());
        
        addParam("keyword",rakutenIchibaBookSearchEntity.getKeyword());
        addParam("booksGenreId",rakutenIchibaBookSearchEntity.getBooksGenreId());
        addParam("isbnjan",rakutenIchibaBookSearchEntity.getIsbnjan());
        addParam("hits",rakutenIchibaBookSearchEntity.getHits());
        addParam("page",rakutenIchibaBookSearchEntity.getPage());
        addParam("availability",rakutenIchibaBookSearchEntity.getAvailability());
        addParam("outOfStockFlag",rakutenIchibaBookSearchEntity.getOutOfStockFlag());
        addParam("chirayomiFlag",rakutenIchibaBookSearchEntity.getChirayomiFlag());
        addParam("sort",rakutenIchibaBookSearchEntity.getSort());
        addParam("limitedFlag",rakutenIchibaBookSearchEntity.getLimitedFlag());
        addParam("field", rakutenIchibaBookSearchEntity.getField());
        addParam("carrier", rakutenIchibaBookSearchEntity.getCarrier());
        addParam("orFlag", rakutenIchibaBookSearchEntity.getOrFlag());
        addParam("NGKeyword", rakutenIchibaBookSearchEntity.getNGKeyword());
        addParam("genreInformationFlag", rakutenIchibaBookSearchEntity.getGenreInformationFlag());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenIchibaBookResultEntity rakutenIchibaBookResultEntity=(RakutenIchibaBookResultEntity)json.decode(streamStr,RakutenIchibaBookResultEntity.class);
        
        return rakutenIchibaBookResultEntity;
    }
    
}
