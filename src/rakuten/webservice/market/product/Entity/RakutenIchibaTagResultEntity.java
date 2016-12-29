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
public class RakutenIchibaTagResultEntity {
   private List<RakutenIchibaResultTagGroupEntity> tagGroups=new ArrayList<>();

    /**
     * @return the tagGroups
     */
    public List<RakutenIchibaResultTagGroupEntity> getTagGroups() {
        return tagGroups;
    }

    /**
     * @param tagGroups the tagGroups to set
     */
    public void setTagGroups(List<RakutenIchibaResultTagGroupEntity> tagGroups) {
        this.tagGroups = tagGroups;
    }

   
}
