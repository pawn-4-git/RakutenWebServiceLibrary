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
public class RakutenIchibaGenreResultEntity {
   private List<RakutenIchibaGenreResultItemEntity> parents=new ArrayList<>();
   private List<RakutenIchibaGenreResultItemEntity> children=new ArrayList<>();
   private RakutenIchibaGenreResultItemEntity current=new RakutenIchibaGenreResultItemEntity();
   private List<RakutenIchibaGenreResultItemEntity> brothers=new ArrayList<>();
   private List<RakutenIchibaGenreResultTagGroupEntity> tagGroups=new ArrayList<>();

    /**
     * @return the parents
     */
    public List<RakutenIchibaGenreResultItemEntity> getParents() {
        return parents;
    }

    /**
     * @param parents the parents to set
     */
    public void setParents(List<RakutenIchibaGenreResultItemEntity> parents) {
        this.parents = parents;
    }

    /**
     * @return the children
     */
    public List<RakutenIchibaGenreResultItemEntity> getChildren() {
        return children;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(List<RakutenIchibaGenreResultItemEntity> children) {
        this.children = children;
    }

    /**
     * @return the brothers
     */
    public List<RakutenIchibaGenreResultItemEntity> getBrothers() {
        return brothers;
    }

    /**
     * @param brothers the brothers to set
     */
    public void setBrothers(List<RakutenIchibaGenreResultItemEntity> brothers) {
        this.brothers = brothers;
    }

    /**
     * @return the current
     */
    public RakutenIchibaGenreResultItemEntity getCurrent() {
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(RakutenIchibaGenreResultItemEntity current) {
        this.current = current;
    }

    /**
     * @return the tagGroups
     */
    public List<RakutenIchibaGenreResultTagGroupEntity> getTagGroups() {
        return tagGroups;
    }

    /**
     * @param tagGroups the tagGroups to set
     */
    public void setTagGroups(List<RakutenIchibaGenreResultTagGroupEntity> tagGroups) {
        this.tagGroups = tagGroups;
    }

    
}
