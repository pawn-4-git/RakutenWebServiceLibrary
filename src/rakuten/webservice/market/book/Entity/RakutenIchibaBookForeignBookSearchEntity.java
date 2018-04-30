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
public class RakutenIchibaBookForeignBookSearchEntity {
    
    private String title;
    private String auther;
    private String publisherName;
    private String isbn;
    private String booksGenreid;
    private Integer hits;
    private Integer page;
    private Integer availability;
    private Integer outOfStockFlag;
    private String sort;
    private Integer limitedFlag;
    private Integer carrier;
    private Integer genreInformationFlag;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the auther
     */
    public String getAuther() {
        return auther;
    }

    /**
     * @param auther the auther to set
     */
    public void setAuther(String auther) {
        this.auther = auther;
    }

    /**
     * @return the publisherName
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * @param publisherName the publisherName to set
     */
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the booksGenreid
     */
    public String getBooksGenreid() {
        return booksGenreid;
    }

    /**
     * @param booksGenreid the booksGenreid to set
     */
    public void setBooksGenreid(String booksGenreid) {
        this.booksGenreid = booksGenreid;
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
