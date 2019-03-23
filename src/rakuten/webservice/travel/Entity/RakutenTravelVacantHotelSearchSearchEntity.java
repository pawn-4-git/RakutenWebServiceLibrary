/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.travel.Entity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rakuten.webservice.travel.Enum.RakutenRankingGenre;


/**
 *
 * @author Pawn
 */
public class RakutenTravelVacantHotelSearchSearchEntity {
    private String largeClassCode;
    private String middleClassCode;
    private String smallClassCode;
    private String detailClassCode;
    private Integer hotelNo;
    private String checkinDate;
    private String checkoutDate;
    private Integer adultNum;
    private Integer upClassNum;
    private Integer lowClassNum;
    private Integer infantWithMBNum;
    private Integer infantWithMNum;
    private Integer infantWithBNum;
    private Integer infantWithoutMBNum;
    private Integer roomNum;
    private Integer maxCharge;
    private Integer minCharge;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private BigDecimal searchRadius;
    private String squeezeCondition;
    private Integer carrier;
    private Integer datumType;
    private Integer hits;
    private Integer page;
    private Integer searchPattern;
    private Integer hotelThumbnailSize;
    private String responseType;
    private String sort;
    private String allReturnFlag;

    /**
     * @return the largeClassCode
     */
    public String getLargeClassCode() {
        return largeClassCode;
    }

    /**
     * @param largeClassCode the largeClassCode to set
     */
    public void setLargeClassCode(String largeClassCode) {
        this.largeClassCode = largeClassCode;
    }

    /**
     * @return the middleClassCode
     */
    public String getMiddleClassCode() {
        return middleClassCode;
    }

    /**
     * @param middleClassCode the middleClassCode to set
     */
    public void setMiddleClassCode(String middleClassCode) {
        this.middleClassCode = middleClassCode;
    }

    /**
     * @return the smallClassCode
     */
    public String getSmallClassCode() {
        return smallClassCode;
    }

    /**
     * @param smallClassCode the smallClassCode to set
     */
    public void setSmallClassCode(String smallClassCode) {
        this.smallClassCode = smallClassCode;
    }

    /**
     * @return the detailClassCode
     */
    public String getDetailClassCode() {
        return detailClassCode;
    }

    /**
     * @param detailClassCode the detailClassCode to set
     */
    public void setDetailClassCode(String detailClassCode) {
        this.detailClassCode = detailClassCode;
    }

    /**
     * @return the hotelNo
     */
    public Integer getHotelNo() {
        return hotelNo;
    }

    /**
     * @param hotelNo the hotelNo to set
     */
    public void setHotelNo(Integer hotelNo) {
        this.hotelNo = hotelNo;
    }

    /**
     * @return the checkinDate
     */
    public String getCheckinDate() {
        return checkinDate;
    }

    /**
     * @param checkinDate the checkinDate to set
     */
    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    /**
     * @return the checkoutDate
     */
    public String getCheckoutDate() {
        return checkoutDate;
    }

    /**
     * @param checkoutDate the checkoutDate to set
     */
    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    /**
     * @return the adultNum
     */
    public Integer getAdultNum() {
        return adultNum;
    }

    /**
     * @param adultNum the adultNum to set
     */
    public void setAdultNum(Integer adultNum) {
        this.adultNum = adultNum;
    }

    /**
     * @return the upClassNum
     */
    public Integer getUpClassNum() {
        return upClassNum;
    }

    /**
     * @param upClassNum the upClassNum to set
     */
    public void setUpClassNum(Integer upClassNum) {
        this.upClassNum = upClassNum;
    }

    /**
     * @return the lowClassNum
     */
    public Integer getLowClassNum() {
        return lowClassNum;
    }

    /**
     * @param lowClassNum the lowClassNum to set
     */
    public void setLowClassNum(Integer lowClassNum) {
        this.lowClassNum = lowClassNum;
    }

    /**
     * @return the infantWithMBNum
     */
    public Integer getInfantWithMBNum() {
        return infantWithMBNum;
    }

    /**
     * @param infantWithMBNum the infantWithMBNum to set
     */
    public void setInfantWithMBNum(Integer infantWithMBNum) {
        this.infantWithMBNum = infantWithMBNum;
    }

    /**
     * @return the infantWithMNum
     */
    public Integer getInfantWithMNum() {
        return infantWithMNum;
    }

    /**
     * @param infantWithMNum the infantWithMNum to set
     */
    public void setInfantWithMNum(Integer infantWithMNum) {
        this.infantWithMNum = infantWithMNum;
    }

    /**
     * @return the infantWithBNum
     */
    public Integer getInfantWithBNum() {
        return infantWithBNum;
    }

    /**
     * @param infantWithBNum the infantWithBNum to set
     */
    public void setInfantWithBNum(Integer infantWithBNum) {
        this.infantWithBNum = infantWithBNum;
    }

    /**
     * @return the infantWithoutMBNum
     */
    public Integer getInfantWithoutMBNum() {
        return infantWithoutMBNum;
    }

    /**
     * @param infantWithoutMBNum the infantWithoutMBNum to set
     */
    public void setInfantWithoutMBNum(Integer infantWithoutMBNum) {
        this.infantWithoutMBNum = infantWithoutMBNum;
    }

    /**
     * @return the roomNum
     */
    public Integer getRoomNum() {
        return roomNum;
    }

    /**
     * @param roomNum the roomNum to set
     */
    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * @return the maxCharge
     */
    public Integer getMaxCharge() {
        return maxCharge;
    }

    /**
     * @param maxCharge the maxCharge to set
     */
    public void setMaxCharge(Integer maxCharge) {
        this.maxCharge = maxCharge;
    }

    /**
     * @return the minCharge
     */
    public Integer getMinCharge() {
        return minCharge;
    }

    /**
     * @param minCharge the minCharge to set
     */
    public void setMinCharge(Integer minCharge) {
        this.minCharge = minCharge;
    }

    /**
     * @return the latitude
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the searchRadius
     */
    public BigDecimal getSearchRadius() {
        return searchRadius;
    }

    /**
     * @param searchRadius the searchRadius to set
     */
    public void setSearchRadius(BigDecimal searchRadius) {
        this.searchRadius = searchRadius;
    }

    /**
     * @return the squeezeCondition
     */
    public String getSqueezeCondition() {
        return squeezeCondition;
    }

    /**
     * @param squeezeCondition the squeezeCondition to set
     */
    public void setSqueezeCondition(String squeezeCondition) {
        this.squeezeCondition = squeezeCondition;
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
     * @return the datumType
     */
    public Integer getDatumType() {
        return datumType;
    }

    /**
     * @param datumType the datumType to set
     */
    public void setDatumType(Integer datumType) {
        this.datumType = datumType;
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
     * @return the searchPattern
     */
    public Integer getSearchPattern() {
        return searchPattern;
    }

    /**
     * @param searchPattern the searchPattern to set
     */
    public void setSearchPattern(Integer searchPattern) {
        this.searchPattern = searchPattern;
    }

    /**
     * @return the hotelThumbnailSize
     */
    public Integer getHotelThumbnailSize() {
        return hotelThumbnailSize;
    }

    /**
     * @param hotelThumbnailSize the hotelThumbnailSize to set
     */
    public void setHotelThumbnailSize(Integer hotelThumbnailSize) {
        this.hotelThumbnailSize = hotelThumbnailSize;
    }

    /**
     * @return the responseType
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * @param responseType the responseType to set
     */
    public void setResponseType(String responseType) {
        this.responseType = responseType;
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
     * @return the allReturnFlag
     */
    public String getAllReturnFlag() {
        return allReturnFlag;
    }

    /**
     * @param allReturnFlag the allReturnFlag to set
     */
    public void setAllReturnFlag(String allReturnFlag) {
        this.allReturnFlag = allReturnFlag;
    }
    
    
   
}
