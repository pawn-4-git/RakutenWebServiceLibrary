/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Service;

import java.net.URLEncoder;
import static net.arnx.jsonic.JSON.encode;
import rakuten.webservice.market.product.Service.*;
import rakuten.webservice.base.JsonConverter;
import rakuten.webservice.base.WebserviceBase;
import static rakuten.webservice.base.WebserviceBase.getENCODING;
import rakuten.webservice.exception.RakutenIchibaRequestException;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookForeignBookResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookForeignBookSearchEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookMagazineResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookMagazineSearchEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookSearchEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemResultEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenIchibaBookMagazineSerchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenIchibaBookMagazineSerchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/BooksMagazine/Search");
        setVersion("20170404");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    public Object doSearch(RakutenIchibaBookMagazineSearchEntity rakutenIchibaBookMagazineSearchEntity) throws Exception {
        
        if(rakutenIchibaBookMagazineSearchEntity.getTitle()!=null&&URLEncoder.encode(rakutenIchibaBookMagazineSearchEntity.getTitle(), getENCODING()).length()<3){
            throw new RakutenIchibaRequestException("タイトルは３バイト以上である必要があります");
        }
        
        
        addParam("title",rakutenIchibaBookMagazineSearchEntity.getTitle());
        addParam("publishName",rakutenIchibaBookMagazineSearchEntity.getPublisherName());
        addParam("jan",rakutenIchibaBookMagazineSearchEntity.getJan());
        addParam("booksGenreid",rakutenIchibaBookMagazineSearchEntity.getBooksGenreid());
        
        addParam("hits",rakutenIchibaBookMagazineSearchEntity.getHits());
        addParam("page",rakutenIchibaBookMagazineSearchEntity.getPage());
        addParam("availability",rakutenIchibaBookMagazineSearchEntity.getAvailability());
        addParam("outOfStockFlag",rakutenIchibaBookMagazineSearchEntity.getOutOfStockFlag());
        addParam("sort",rakutenIchibaBookMagazineSearchEntity.getSort());
        addParam("limitedFlag",rakutenIchibaBookMagazineSearchEntity.getLimitedFlag());
        addParam("carrier", rakutenIchibaBookMagazineSearchEntity.getCarrier());
        addParam("genreInformationFlag", rakutenIchibaBookMagazineSearchEntity.getGenreInformationFlag());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenIchibaBookMagazineResultEntity rakutenIchibaBookMagazineResultEntity=(RakutenIchibaBookMagazineResultEntity)json.decode(streamStr,RakutenIchibaBookMagazineResultEntity.class);
        
        return rakutenIchibaBookMagazineResultEntity;
    }
    
}
