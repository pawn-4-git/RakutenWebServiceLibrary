/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Service;

import rakuten.webservice.base.JsonConverter;
import rakuten.webservice.base.WebserviceBase;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemResultEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenIchibaItemSerchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenIchibaItemSerchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/IchibaItem/Search");
        setVersion("20140222");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    public Object doSearch(RakutenIchibaItemSearchEntity rakutenIchibaItemSearchEntity) throws Exception {
        addParam("keyword",rakutenIchibaItemSearchEntity.getKeyword());
        addParam("shopCode",rakutenIchibaItemSearchEntity.getShopCode());
        addParam("itemCode",rakutenIchibaItemSearchEntity.getItemCode());
        addParam("genreId",rakutenIchibaItemSearchEntity.getGenreId());
        addParam("tagId",rakutenIchibaItemSearchEntity.getTagId());
        addParam("hits",rakutenIchibaItemSearchEntity.getHits());
        addParam("page",rakutenIchibaItemSearchEntity.getPage());
        addParam("sort",rakutenIchibaItemSearchEntity.getSort());
        addParam("minPrice",rakutenIchibaItemSearchEntity.getMinPrice());
        addParam("maxPrice",rakutenIchibaItemSearchEntity.getMaxPrice());
        addParam("availability",rakutenIchibaItemSearchEntity.getAvailability());
        addParam("field",rakutenIchibaItemSearchEntity.getField());
        addParam("garrier",rakutenIchibaItemSearchEntity.getCarrier());
        addParam("imageFlag",rakutenIchibaItemSearchEntity.getImageFlag());
        addParam("orFlag",rakutenIchibaItemSearchEntity.getOrFlag());
        addParam("NGKeyword",rakutenIchibaItemSearchEntity.getNGKeyword());
        addParam("purchaseType",rakutenIchibaItemSearchEntity.getPurchaseType());
        addParam("shipOverseasFlag",rakutenIchibaItemSearchEntity.getShipOverseasFlag());
        addParam("shipOverseasArea",rakutenIchibaItemSearchEntity.getShipOverseasArea());
        addParam("asurakuFlag",rakutenIchibaItemSearchEntity.getAsurakuFlag());
        addParam("asurakuArea",rakutenIchibaItemSearchEntity.getAsurakuArea());
        addParam("pointRateFlag",rakutenIchibaItemSearchEntity.getPointRateFlag());
        addParam("pointRate",rakutenIchibaItemSearchEntity.getPointRate());
        addParam("postageFlag",rakutenIchibaItemSearchEntity.getPostageFlag());
        addParam("creditCardFlag",rakutenIchibaItemSearchEntity.getCreditCardFlag());
        addParam("giftFlag",rakutenIchibaItemSearchEntity.getGiftFlag());
        addParam("hasReviewFlag",rakutenIchibaItemSearchEntity.getHasReviewFlag());
        addParam("maxAffiliateRate",rakutenIchibaItemSearchEntity.getMaxAffiliateRate());
        addParam("minAffiliateRate",rakutenIchibaItemSearchEntity.getMinAffiliateRate());
        addParam("hasMovieFlag",rakutenIchibaItemSearchEntity.getHasMovieFlag());
        addParam("pamphletFlag",rakutenIchibaItemSearchEntity.getPamphletFlag());
        addParam("appointDeliveryDateFlag",rakutenIchibaItemSearchEntity.getAppointDeliveryDateFlag());
        addParam("genreInformationFlag",rakutenIchibaItemSearchEntity.getGenreInformationFlag());
        addParam("tagInformationFlag",rakutenIchibaItemSearchEntity.getTagInformationFlag());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenIchibaItemResultEntity rakutenIchibaItemResultEntity=(RakutenIchibaItemResultEntity)json.decode(streamStr,RakutenIchibaItemResultEntity.class);
        
        return rakutenIchibaItemResultEntity;
    }
    
}
