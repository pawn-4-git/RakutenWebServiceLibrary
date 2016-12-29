/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Service;

import rakuten.webservice.base.JsonConverter;
import rakuten.webservice.base.WebserviceBase;
import rakuten.webservice.market.product.Entity.RakutenIchibaGenreResultEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaGenreSearchEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemResultEntity;
import rakuten.webservice.market.product.Entity.RakutenIchibaItemSearchEntity;

/**
 * 
 * @author Pawn
 */
public class RakutenIchibaGenreSerchAPI extends WebserviceBase{

    /**
     * 楽天商品検索APIの初期化コンストラクタ
     */
    public RakutenIchibaGenreSerchAPI(){
        setUrl("https://app.rakuten.co.jp/services/api/IchibaGenre/Search/");
        setVersion("20140222");
        setFormat("json");
        setFormatVersion("2");
    }
    
    
    public void setAccessParameter(String applicationId){
        setApplicationId(applicationId);
        setApplicationIdSetFlg(Boolean.TRUE);
    }
    
    /**
     * ジャンルの検索を行う
     * @param rakutenIchibaGenreSearchEntity
     * @return
     * @throws Exception 
     */
    public Object doSearch(RakutenIchibaGenreSearchEntity rakutenIchibaGenreSearchEntity) throws Exception {
        
        addParam("genreId", rakutenIchibaGenreSearchEntity.getGenreId());
        addParam("genrePath", rakutenIchibaGenreSearchEntity.getGenrePath());
        
        String streamStr=getHttpResponse();
        //API制限対策
        Thread.sleep(1000);
        
        JsonConverter json=new JsonConverter();
        RakutenIchibaGenreResultEntity rakutenIchibaGenreResultEntity=(RakutenIchibaGenreResultEntity)json.decode(streamStr,RakutenIchibaGenreResultEntity.class);
        
        return rakutenIchibaGenreResultEntity;
    }
    
}
