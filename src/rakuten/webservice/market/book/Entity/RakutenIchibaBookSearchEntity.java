/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Entity;


/**
 *
 * @author Pawn
 */
public class RakutenIchibaBookSearchEntity {
    
    private String keyword;
    private String booksGenreId;
    private String isbnjan;
    private Integer hits;
    private Integer page;
    private Integer availability;
    private Integer outOfStockFlag;
    private Integer chirayomiFlag;
    private String sort;
    private Integer limitedFlag;
    private Integer field;
    private Integer carrier;
    private Integer orFlag;
    private String NGKeyword;
    private Integer genreInformationFlag;

    /**
     * @return the keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * @param keyword the keyword to set
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * @return the booksGenreId
     */
    public String getBooksGenreId() {
        return booksGenreId;
    }

    /**
     * @param booksGenreId the booksGenreId to set
     */
    public void setBooksGenreId(String booksGenreId) {
        this.booksGenreId = booksGenreId;
    }

    /**
     * @return the isbnjan
     */
    public String getIsbnjan() {
        return isbnjan;
    }

    /**
     * @param isbnjan the isbnjan to set
     */
    public void setIsbnjan(String isbnjan) {
        this.isbnjan = isbnjan;
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
     * @return the availability
     */
    public Integer getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    /**
     * @return the outOfStockFlag
     */
    public Integer getOutOfStockFlag() {
        return outOfStockFlag;
    }

    /**
     * @param outOfStockFlag the outOfStockFlag to set
     */
    public void setOutOfStockFlag(Integer outOfStockFlag) {
        this.outOfStockFlag = outOfStockFlag;
    }

    /**
     * @return the chirayomiFlag
     */
    public Integer getChirayomiFlag() {
        return chirayomiFlag;
    }

    /**
     * @param chirayomiFlag the chirayomiFlag to set
     */
    public void setChirayomiFlag(Integer chirayomiFlag) {
        this.chirayomiFlag = chirayomiFlag;
    }

    /**
     * @return the sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * @param sort the sort to set
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * @return the limitedFlag
     */
    public Integer getLimitedFlag() {
        return limitedFlag;
    }

    /**
     * @param limitedFlag the limitedFlag to set
     */
    public void setLimitedFlag(Integer limitedFlag) {
        this.limitedFlag = limitedFlag;
    }

    /**
     * @return the field
     */
    public Integer getField() {
        return field;
    }

    /**
     * @param field the field to set
     */
    public void setField(Integer field) {
        this.field = field;
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
     * @return the orFlag
     */
    public Integer getOrFlag() {
        return orFlag;
    }

    /**
     * @param orFlag the orFlag to set
     */
    public void setOrFlag(Integer orFlag) {
        this.orFlag = orFlag;
    }

    /**
     * @return the NGKeyword
     */
    public String getNGKeyword() {
        return NGKeyword;
    }

    /**
     * @param NGKeyword the NGKeyword to set
     */
    public void setNGKeyword(String NGKeyword) {
        this.NGKeyword = NGKeyword;
    }

    /**
     * @return the genreInformationFlag
     */
    public Integer getGenreInformationFlag() {
        return genreInformationFlag;
    }

    /**
     * @param genreInformationFlag the genreInformationFlag to set
     */
    public void setGenreInformationFlag(Integer genreInformationFlag) {
        this.genreInformationFlag = genreInformationFlag;
    }
    
    
}
