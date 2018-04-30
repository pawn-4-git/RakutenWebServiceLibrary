/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Entity;

import rakuten.webservice.market.product.Entity.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaBookMagazineResultEntity {
    private Integer count;
    private Integer page;
    private Integer first;
    private Integer last;
    private Integer hits;
    private Integer carrier;
    private Integer pageCount;
    
    private List<RakutenIchibaBookMagazineResultItemEntity> items=new ArrayList<>();
    
    
    private List<RakutenIchibaItemGenreInformationEntity> genreInformation= new ArrayList<>();
    
    /**
     * @return the count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @return the page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * @return the first
     */
    public Integer getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(Integer first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public Integer getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(Integer last) {
        this.last = last;
    }

    /**
     * @return the hits
     */
    public Integer getHits() {
        return hits;
    }

    /**
     * @param hits the hits to set
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    /**
     * @return the carrier
     */
    public Integer getCarrier() {
        return carrier;
    }

    /**
     * @param carrier the carrier to set
     */
    public void setCarrier(Integer carrier) {
        this.carrier = carrier;
    }

    /**
     * @return the pageCount
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * @param pageCount the pageCount to set
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    

    
    /**
     * @return the genreInformation
     */
    public List<RakutenIchibaItemGenreInformationEntity> getGenreInformation() {
        return genreInformation;
    }

    /**
     * @param genreInformation the genreInformation to set
     */
    public void setGenreInformation(List<RakutenIchibaItemGenreInformationEntity> genreInformation) {
        this.genreInformation = genreInformation;
    }

    /**
     * @return the items
     */
    public List<RakutenIchibaBookMagazineResultItemEntity> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<RakutenIchibaBookMagazineResultItemEntity> items) {
        this.items = items;
    }

   
    
    
}
