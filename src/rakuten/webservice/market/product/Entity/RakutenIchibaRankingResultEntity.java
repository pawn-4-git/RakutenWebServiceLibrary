/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaRankingResultEntity {
   private List<RakutenIchibaItemResultItemEntity> items=new ArrayList<>();

    /**
     * @return the items
     */
    public List<RakutenIchibaItemResultItemEntity> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<RakutenIchibaItemResultItemEntity> items) {
        this.items = items;
    }
    
   
   
}
