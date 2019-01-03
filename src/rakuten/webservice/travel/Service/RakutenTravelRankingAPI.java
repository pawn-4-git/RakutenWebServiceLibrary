/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.travel.Service;

import rakuten.webservice.market.product.Service.*;
import rakuten.webservice.base.JsonConverter;
import rakuten.webservice.base.WebserviceBase;
import rakuten.webservice.market.product.Entity.RakutenIchibaTagResultEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaTagSearchEntity;
import rakuten.webservice.travel.Entity.RakutenTravelRankingResultEntity;
import rakuten.webservice.travel.Entity.RakutenTravelRankingSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenTravelRankingAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenTravelRankingAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/Travel/HotelRanking");
        setVersion("20170426");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    /**
     * タグの検索を行う
     * @param rakutenTravelRankingSearchEntity
     * @return
     * @throws Exception 
     */
    public Object doSearch(RakutenTravelRankingSearchEntity rakutenTravelRankingSearchEntity) throws Exception {
        
        addParam("genre", rakutenTravelRankingSearchEntity.getGenre());
        addParam("carrier", rakutenTravelRankingSearchEntity.getCarrier());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenTravelRankingResultEntity rakutenTravelRankingResultEntity = (RakutenTravelRankingResultEntity)json.decode(streamStr,RakutenTravelRankingResultEntity.class);
        return rakutenTravelRankingResultEntity;
    }
    
}
