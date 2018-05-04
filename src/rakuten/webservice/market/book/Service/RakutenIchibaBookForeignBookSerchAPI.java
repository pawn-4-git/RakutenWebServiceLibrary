/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Service;

import rakuten.webservice.market.product.Service.*;
import rakuten.webservice.base.JsonConverter;
import rakuten.webservice.base.WebserviceBase;
import rakuten.webservice.exception.RakutenIchibaRequestException;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookForeignBookResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookForeignBookSearchEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookResultEntity;
import rakuten.webservice.market.book.Entity.RakutenIchibaBookSearchEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemResultEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenIchibaBookForeignBookSerchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenIchibaBookForeignBookSerchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/BooksForeignBook/Search");
        setVersion("20170404");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    public Object doSearch(RakutenIchibaBookForeignBookSearchEntity rakutenIchibaBookForeignBookSearchEntity) throws Exception {
        
        
        if(rakutenIchibaBookForeignBookSearchEntity.getTitle()==null&&rakutenIchibaBookForeignBookSearchEntity.getAuther()==null
                &&rakutenIchibaBookForeignBookSearchEntity.getPublisherName()==null
                &&rakutenIchibaBookForeignBookSearchEntity.getIsbn()==null
                &&rakutenIchibaBookForeignBookSearchEntity.getBooksGenreid()==null){
            throw new RakutenIchibaRequestException("タイトルまたは著者、出版社、ISBNコード、ジャンルのいずれかの指定が必要です");
        }
        if(rakutenIchibaBookForeignBookSearchEntity.getTitle()!=null&&rakutenIchibaBookForeignBookSearchEntity.getTitle().length()<3){
            throw new RakutenIchibaRequestException("タイトルは３文字以上である必要があります");
        }
        
        addParam("title",rakutenIchibaBookForeignBookSearchEntity.getTitle());
        addParam("auther",rakutenIchibaBookForeignBookSearchEntity.getAuther());
        addParam("publishName",rakutenIchibaBookForeignBookSearchEntity.getPublisherName());
        addParam("isbn",rakutenIchibaBookForeignBookSearchEntity.getIsbn());
        addParam("booksGenreid",rakutenIchibaBookForeignBookSearchEntity.getBooksGenreid());
        
        
        addParam("hits",rakutenIchibaBookForeignBookSearchEntity.getHits());
        addParam("page",rakutenIchibaBookForeignBookSearchEntity.getPage());
        addParam("availability",rakutenIchibaBookForeignBookSearchEntity.getAvailability());
        addParam("outOfStockFlag",rakutenIchibaBookForeignBookSearchEntity.getOutOfStockFlag());
        addParam("sort",rakutenIchibaBookForeignBookSearchEntity.getSort());
        addParam("limitedFlag",rakutenIchibaBookForeignBookSearchEntity.getLimitedFlag());
        addParam("carrier", rakutenIchibaBookForeignBookSearchEntity.getCarrier());
        addParam("genreInformationFlag", rakutenIchibaBookForeignBookSearchEntity.getGenreInformationFlag());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenIchibaBookForeignBookResultEntity rakutenIchibaBookForeignBookResultEntity=(RakutenIchibaBookForeignBookResultEntity)json.decode(streamStr,RakutenIchibaBookForeignBookResultEntity.class);
        
        return rakutenIchibaBookForeignBookResultEntity;
    }
    
}
