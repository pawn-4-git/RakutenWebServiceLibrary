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
import rakuten.webservice.travel.Entity.RakutenTravelHotelDetailSearchResultEntity;
import rakuten.webservice.travel.Entity.RakutenTravelHotelDetailSearchSearchEntity;
import rakuten.webservice.travel.Entity.RakutenTravelRankingResultEntity;
import rakuten.webservice.travel.Entity.RakutenTravelRankingSearchEntity;
import rakuten.webservice.travel.Entity.RakutenTravelSimpleHotelResultEntity;
import rakuten.webservice.travel.Entity.RakutenTravelSimpleHotelSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenTravelHotelDetailSearchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenTravelHotelDetailSearchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/Travel/HotelDetailSearch");
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
     * @param rakutenTravelHotelDetailSearchSearchEntity
     * @return
     * @throws Exception 
     */
    public Object doSearch(RakutenTravelHotelDetailSearchSearchEntity rakutenTravelHotelDetailSearchSearchEntity) throws Exception {
        
        addParam("hotelNo", rakutenTravelHotelDetailSearchSearchEntity.getHotelNo());
        addParam("carrier", rakutenTravelHotelDetailSearchSearchEntity.getCarrier());
        addParam("datumType", rakutenTravelHotelDetailSearchSearchEntity.getDatumType());
        addParam("hotelThumbnailSize", rakutenTravelHotelDetailSearchSearchEntity.getHotelThumbnailSize());
        addParam("responseType", rakutenTravelHotelDetailSearchSearchEntity.getResponseType());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenTravelHotelDetailSearchResultEntity rakutenTravelHotelDetailSearchResultEntity = (RakutenTravelHotelDetailSearchResultEntity)json.decode(streamStr,RakutenTravelHotelDetailSearchResultEntity.class);
        return rakutenTravelHotelDetailSearchResultEntity;
    }
    
}
