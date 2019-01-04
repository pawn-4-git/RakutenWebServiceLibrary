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
public class RakutenTravelSimpleHotelSearchEntity {
    private String largeClassCode;
    private String middleClassCode;
    private String smallClassCode;
    private String detailClassCode;
    private Integer hotelNo;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private BigDecimal searchRadius;
    private String squeezeCondition;
    private String carrier;
    private Integer datumType;
    private Integer page;
    private Integer hits;
    private Integer hotelThumbnailSize;
    private Integer responseType;
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
    public String getCarrier() {
        return carrier;
    }

    /**
     * @param carrier the carrier to set
     */
    public void setCarrier(String carrier) {
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
    public Integer getResponseType() {
        return responseType;
    }

    /**
     * @param responseType the responseType to set
     */
    public void setResponseType(Integer responseType) {
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
