/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Service;

import rakuten.webservice.base.JsonConverter;
import rakuten.webservice.base.WebserviceBase;
import rakuten.webservice.market.product.Entity.RakutenIchibaRankingResultEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaRankingSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenIchibaRankingSerchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenIchibaRankingSerchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/IchibaItem/Ranking");
        setVersion("20120927");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    /**
     * ランキングの検索を行う
     * @param rakutenIchibaRankingSearchEntity
     * @return
     * @throws Exception 
     */
    public Object doSearch(RakutenIchibaRankingSearchEntity rakutenIchibaRankingSearchEntity) throws Exception {
        
        addParam("genreId",rakutenIchibaRankingSearchEntity.getGenreId());
        addParam("age", rakutenIchibaRankingSearchEntity.getAge());
        addParam("sex", rakutenIchibaRankingSearchEntity.getSex());
        addParam("carrier", rakutenIchibaRankingSearchEntity.getCarrier());
        addParam("page", rakutenIchibaRankingSearchEntity.getPage());
        addParam("period", rakutenIchibaRankingSearchEntity.getPeriod());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenIchibaRankingResultEntity rakutenIchibaRankingResultEntity=(RakutenIchibaRankingResultEntity)json.decode(streamStr,RakutenIchibaRankingResultEntity.class);
        
        return rakutenIchibaRankingResultEntity;
    }
    
}
