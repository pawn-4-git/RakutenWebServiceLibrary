/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Service;

import rakuten.webservice.market.product.Service.*;
import rakuten.webservice.base.JsonConverter;
import rakuten.webservice.base.WebserviceBase;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookSearchEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBooksBookSearchEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemResultEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenIchibaBooksBookSerchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenIchibaBooksBookSerchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/BooksBook/Search");
        setVersion("20130522");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    public Object doSearch(RakutenIchibaBooksBookSearchEntity rakutenIchibaBooksBookSearchEntity) throws Exception {
        
        addParam("title",rakutenIchibaBooksBookSearchEntity.getTitle());
        addParam("author",rakutenIchibaBooksBookSearchEntity.getAuthor());
        addParam("publisherName",rakutenIchibaBooksBookSearchEntity.getPublisherName());
        addParam("size",rakutenIchibaBooksBookSearchEntity.getSize());
        addParam("isbn",rakutenIchibaBooksBookSearchEntity.getIsbn());
        addParam("booksGenreId",rakutenIchibaBooksBookSearchEntity.getBooksGenreId());
        addParam("hits",rakutenIchibaBooksBookSearchEntity.getHits());
        addParam("page",rakutenIchibaBooksBookSearchEntity.getPage());
        addParam("availability",rakutenIchibaBooksBookSearchEntity.getAvailability());
        addParam("outOfStockFlag",rakutenIchibaBooksBookSearchEntity.getOutOfStockFlag());
        addParam("chirayomiFlag",rakutenIchibaBooksBookSearchEntity.getChirayomiFlag());
        addParam("sort",rakutenIchibaBooksBookSearchEntity.getSort());
        addParam("limitedFlag",rakutenIchibaBooksBookSearchEntity.getLimitedFlag());
        addParam("carrier", rakutenIchibaBooksBookSearchEntity.getCarrier());
        addParam("genreInformationFlag", rakutenIchibaBooksBookSearchEntity.getGenreInformationFlag());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenIchibaBookResultEntity rakutenIchibaBookResultEntity=(RakutenIchibaBookResultEntity)json.decode(streamStr,RakutenIchibaBookResultEntity.class);
        
        return rakutenIchibaBookResultEntity;
    }
    
}
