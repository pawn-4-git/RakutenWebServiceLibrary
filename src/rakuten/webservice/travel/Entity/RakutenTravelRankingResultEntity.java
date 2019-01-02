/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.travel.Entity;

import rakuten.webservice.market.product.Entity.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawn
 */
public class RakutenTravelRankingResultEntity {
    private List<RakutenTravelRankingResultItemEntity> Rankings;

    /**
     * @return the Rankings
     */
    public List<RakutenTravelRankingResultItemEntity> getRankings() {
        return Rankings;
    }

    /**
     * @param Rankings the Rankings to set
     */
    public void setRankings(List<RakutenTravelRankingResultItemEntity> Rankings) {
        this.Rankings = Rankings;
    }
    
    
    
}
