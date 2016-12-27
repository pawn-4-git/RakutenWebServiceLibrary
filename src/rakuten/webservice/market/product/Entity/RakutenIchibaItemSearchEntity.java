/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Entity;

import rakuten.webservice.market.product.Enum.RakutenIchibaProductSearchAvailabilityEnum;
import rakuten.webservice.market.product.Enum.RakutenIchibaProductSearchOrFlgEnum;
import rakuten.webservice.market.product.Enum.RakutenIchibaProductSearchSortEnum;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaItemSearchEntity {
    
    private String keyword;
    private String shopCode;
    private String itemCode;
    private Long genreId;
    private Long tagId;
    private Integer hits;
    private Integer page;
    private String sort;
    private Long minPrice;
    private Long maxPrice;
    private Integer availability;
    private Integer field;
    private Integer carrier;
    private Integer imageFlag;
    private Integer orFlag;
    private String NGKeyword;
    private Integer purchaseType;
    private Integer shipOverseasFlag;
    private String shipOverseasArea;
    private Integer asurakuFlag;
    private Integer asurakuArea;
    private Integer pointRateFlag;
    private Integer pointRate;
    private Integer postageFlag;
    private Integer creditCardFlag;
    private Integer giftFlag;
    private Integer hasReviewFlag;
    private Float maxAffiliateRate;
    private Float minAffiliateRate;
    private Integer hasMovieFlag;
    private Integer pamphletFlag;
    private Integer appointDeliveryDateFlag;
    private Integer genreInformationFlag;
    private Integer tagInformationFlag;

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
     * @return the shopCode
     */
    public String getShopCode() {
        return shopCode;
    }

    /**
     * @param shopCode the shopCode to set
     */
    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the genreId
     */
    public Long getGenreId() {
        return genreId;
    }

    /**
     * @param genreId the genreId to set
     */
    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    /**
     * @return the tagId
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * @param tagId the tagId to set
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
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
    
    public void setSort(RakutenIchibaProductSearchSortEnum rakutenIchibaProductSearchSortEnum){
        this.sort=rakutenIchibaProductSearchSortEnum.toString();
    }

    /**
     * @return the minPrice
     */
    public Long getMinPrice() {
        return minPrice;
    }

    /**
     * @param minPrice the minPrice to set
     */
    public void setMinPrice(Long minPrice) {
        this.minPrice = minPrice;
    }

    /**
     * @return the maxPrice
     */
    public Long getMaxPrice() {
        return maxPrice;
    }

    /**
     * @param maxPrice the maxPrice to set
     */
    public void setMaxPrice(Long maxPrice) {
        this.maxPrice = maxPrice;
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
    
    public void setAvailability(RakutenIchibaProductSearchAvailabilityEnum rakutenIchibaProductSearchAvailabilityEnum){
        this.availability=rakutenIchibaProductSearchAvailabilityEnum.getValue();
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
     * @return the imageFlag
     */
    public Integer getImageFlag() {
        return imageFlag;
    }

    /**
     * @param imageFlag the imageFlag to set
     */
    public void setImageFlag(Integer imageFlag) {
        this.imageFlag = imageFlag;
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
    
    public void setOrFlag(RakutenIchibaProductSearchOrFlgEnum rakutenIchibaProductSearchOrFlgEnum){
        this.orFlag=rakutenIchibaProductSearchOrFlgEnum.getValue();
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
     * @return the purchaseType
     */
    public Integer getPurchaseType() {
        return purchaseType;
    }

    /**
     * @param purchaseType the purchaseType to set
     */
    public void setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
    }

    /**
     * @return the shipOverseasFlag
     */
    public Integer getShipOverseasFlag() {
        return shipOverseasFlag;
    }

    /**
     * @param shipOverseasFlag the shipOverseasFlag to set
     */
    public void setShipOverseasFlag(Integer shipOverseasFlag) {
        this.shipOverseasFlag = shipOverseasFlag;
    }

    /**
     * @return the shipOverseasArea
     */
    public String getShipOverseasArea() {
        return shipOverseasArea;
    }

    /**
     * @param shipOverseasArea the shipOverseasArea to set
     */
    public void setShipOverseasArea(String shipOverseasArea) {
        this.shipOverseasArea = shipOverseasArea;
    }

    /**
     * @return the asurakuFlag
     */
    public Integer getAsurakuFlag() {
        return asurakuFlag;
    }

    /**
     * @param asurakuFlag the asurakuFlag to set
     */
    public void setAsurakuFlag(Integer asurakuFlag) {
        this.asurakuFlag = asurakuFlag;
    }

    /**
     * @return the asurakuArea
     */
    public Integer getAsurakuArea() {
        return asurakuArea;
    }

    /**
     * @param asurakuArea the asurakuArea to set
     */
    public void setAsurakuArea(Integer asurakuArea) {
        this.asurakuArea = asurakuArea;
    }

    /**
     * @return the pointRateFlag
     */
    public Integer getPointRateFlag() {
        return pointRateFlag;
    }

    /**
     * @param pointRateFlag the pointRateFlag to set
     */
    public void setPointRateFlag(Integer pointRateFlag) {
        this.pointRateFlag = pointRateFlag;
    }

    /**
     * @return the pointRate
     */
    public Integer getPointRate() {
        return pointRate;
    }

    /**
     * @param pointRate the pointRate to set
     */
    public void setPointRate(Integer pointRate) {
        this.pointRate = pointRate;
    }

    /**
     * @return the postageFlag
     */
    public Integer getPostageFlag() {
        return postageFlag;
    }

    /**
     * @param postageFlag the postageFlag to set
     */
    public void setPostageFlag(Integer postageFlag) {
        this.postageFlag = postageFlag;
    }

    /**
     * @return the creditCardFlag
     */
    public Integer getCreditCardFlag() {
        return creditCardFlag;
    }

    /**
     * @param creditCardFlag the creditCardFlag to set
     */
    public void setCreditCardFlag(Integer creditCardFlag) {
        this.creditCardFlag = creditCardFlag;
    }

    /**
     * @return the giftFlag
     */
    public Integer getGiftFlag() {
        return giftFlag;
    }

    /**
     * @param giftFlag the giftFlag to set
     */
    public void setGiftFlag(Integer giftFlag) {
        this.giftFlag = giftFlag;
    }

    /**
     * @return the hasReviewFlag
     */
    public Integer getHasReviewFlag() {
        return hasReviewFlag;
    }

    /**
     * @param hasReviewFlag the hasReviewFlag to set
     */
    public void setHasReviewFlag(Integer hasReviewFlag) {
        this.hasReviewFlag = hasReviewFlag;
    }

    /**
     * @return the maxAffiliateRate
     */
    public Float getMaxAffiliateRate() {
        return maxAffiliateRate;
    }

    /**
     * @param maxAffiliateRate the maxAffiliateRate to set
     */
    public void setMaxAffiliateRate(Float maxAffiliateRate) {
        this.maxAffiliateRate = maxAffiliateRate;
    }

    /**
     * @return the minAffiliateRate
     */
    public Float getMinAffiliateRate() {
        return minAffiliateRate;
    }

    /**
     * @param minAffiliateRate the minAffiliateRate to set
     */
    public void setMinAffiliateRate(Float minAffiliateRate) {
        this.minAffiliateRate = minAffiliateRate;
    }

    /**
     * @return the hasMovieFlag
     */
    public Integer getHasMovieFlag() {
        return hasMovieFlag;
    }

    /**
     * @param hasMovieFlag the hasMovieFlag to set
     */
    public void setHasMovieFlag(Integer hasMovieFlag) {
        this.hasMovieFlag = hasMovieFlag;
    }

    /**
     * @return the pamphletFlag
     */
    public Integer getPamphletFlag() {
        return pamphletFlag;
    }

    /**
     * @param pamphletFlag the pamphletFlag to set
     */
    public void setPamphletFlag(Integer pamphletFlag) {
        this.pamphletFlag = pamphletFlag;
    }

    /**
     * @return the appointDeliveryDateFlag
     */
    public Integer getAppointDeliveryDateFlag() {
        return appointDeliveryDateFlag;
    }

    /**
     * @param appointDeliveryDateFlag the appointDeliveryDateFlag to set
     */
    public void setAppointDeliveryDateFlag(Integer appointDeliveryDateFlag) {
        this.appointDeliveryDateFlag = appointDeliveryDateFlag;
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

    /**
     * @return the tagInformationFlag
     */
    public Integer getTagInformationFlag() {
        return tagInformationFlag;
    }

    /**
     * @param tagInformationFlag the tagInformationFlag to set
     */
    public void setTagInformationFlag(Integer tagInformationFlag) {
        this.tagInformationFlag = tagInformationFlag;
    }

    
}
