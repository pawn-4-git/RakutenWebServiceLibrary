/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.market.book.Entity;

import rakuten.webservice.market.book.Enum.RakutenBooksAvailabilityEnum;
import rakuten.webservice.market.book.Enum.RakutenBooksGenreInformationFlagEnum;
import rakuten.webservice.market.book.Enum.RakutenBooksLimitedFlagEnum;
import rakuten.webservice.market.book.Enum.RakutenBooksOutOfStockFlagEnum;
import rakuten.webservice.market.book.Enum.RakutenBooksSortEnum;
import rakuten.webservice.market.product.Enum.RakutenIchibaCarrierEnum;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaBooksCDSearchEntity {
    private String title;
    private String artistName;
    private String label;
    private String jan;
    private String booksGenreId;
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
     * @return the artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * @param artistName the artistName to set
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the jan
     */
    public String getJan() {
        return jan;
    }

    /**
     * @param jan the jan to set
     */
    public void setJan(String jan) {
        this.jan = jan;
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
    public void setAvailability(RakutenBooksAvailabilityEnum value){
        this.availability=value.getValue();
    }
     
    public void setOutOfStockFlag(RakutenBooksOutOfStockFlagEnum value){
        this.outOfStockFlag=value.getValue();
    }
    
    public void setSort(RakutenBooksSortEnum value){
        this.sort=value.getValue();
    }
    
    public void setLimitedFlag(RakutenBooksLimitedFlagEnum value){
        this.limitedFlag=value.getValue();
    }
    
    public void setCarrier(RakutenIchibaCarrierEnum value){
        this.carrier=value.getValue();
    }
    public  void setGenreInformationFlag(RakutenBooksGenreInformationFlagEnum value){
        this.genreInformationFlag=value.getValue();
    }
}
