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
import rakuten.webservice.travel.Entity.RakutenTravelSimpleHotelResultEntity;
import rakuten.webservice.travel.Entity.RakutenTravelSimpleHotelSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenTravelSimpleHotelAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenTravelSimpleHotelAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/Travel/SimpleHotelSearch");
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
    public Object doSearch(RakutenTravelSimpleHotelSearchEntity rakutenTravelSimpleHotelSearchEntity) throws Exception {
        
        addParam("largeClassCode", rakutenTravelSimpleHotelSearchEntity.getLargeClassCode());
        addParam("middleClassCode", rakutenTravelSimpleHotelSearchEntity.getMiddleClassCode());
        addParam("smallClassCode", rakutenTravelSimpleHotelSearchEntity.getSmallClassCode());
        addParam("detailClassCode", rakutenTravelSimpleHotelSearchEntity.getDetailClassCode());
        addParam("hotelNo", rakutenTravelSimpleHotelSearchEntity.getHotelNo());
        if(rakutenTravelSimpleHotelSearchEntity.getLatitude()!=null){
            addParam("latitude", rakutenTravelSimpleHotelSearchEntity.getLatitude().toString());
        }
        if(rakutenTravelSimpleHotelSearchEntity.getLongitude()!=null){
            addParam("longitude", rakutenTravelSimpleHotelSearchEntity.getLongitude().toString());
        }
        if(rakutenTravelSimpleHotelSearchEntity.getSearchRadius()!=null){
            addParam("searchRadius", rakutenTravelSimpleHotelSearchEntity.getSearchRadius().toString());
        }
        addParam("squeezeCondition", rakutenTravelSimpleHotelSearchEntity.getSqueezeCondition());
        addParam("carrier", rakutenTravelSimpleHotelSearchEntity.getCarrier());
        addParam("datumType", rakutenTravelSimpleHotelSearchEntity.getDatumType());
        addParam("page", rakutenTravelSimpleHotelSearchEntity.getPage());
        addParam("hits", rakutenTravelSimpleHotelSearchEntity.getHits());
        addParam("hotelThumbnailSize", rakutenTravelSimpleHotelSearchEntity.getHotelThumbnailSize());
        addParam("responseType", rakutenTravelSimpleHotelSearchEntity.getResponseType());
        addParam("sort", rakutenTravelSimpleHotelSearchEntity.getSort());
        addParam("allReturnFlag", rakutenTravelSimpleHotelSearchEntity.getAllReturnFlag());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenTravelSimpleHotelResultEntity rakutenTravelRankingResultEntity = (RakutenTravelSimpleHotelResultEntity)json.decode(streamStr,RakutenTravelSimpleHotelResultEntity.class);
        return rakutenTravelRankingResultEntity;
    }
    
}
