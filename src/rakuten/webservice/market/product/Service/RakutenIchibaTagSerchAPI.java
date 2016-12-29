/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Service;

import rakuten.webservice.base.JsonConverter;
import rakuten.webservice.base.WebserviceBase;
import rakuten.webservice.market.product.Entity.RakutenIchibaTagResultEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaTagSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenIchibaTagSerchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenIchibaTagSerchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/IchibaTag/Search");
        setVersion("20140222");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    /**
     * タグの検索を行う
     * @param rakutenIchibaTagSearchEntity
     * @return
     * @throws Exception 
     */
    public Object doSearch(RakutenIchibaTagSearchEntity rakutenIchibaTagSearchEntity) throws Exception {
        
        addParam("tagId", rakutenIchibaTagSearchEntity.getTagId());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenIchibaTagResultEntity rakutenIchibaTagResultEntity = (RakutenIchibaTagResultEntity)json.decode(streamStr,RakutenIchibaTagResultEntity.class);
        return rakutenIchibaTagResultEntity;
    }
    
}
