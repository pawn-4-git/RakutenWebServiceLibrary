/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.travel.Entity;

import rakuten.webservice.market.product.Entity.*;
import java.util.List;

/**
 *
 * @author Pawn
 */
public class RakutenTravelRankingResultHotelEntity {
    private Integer rank;
    private Integer hotelNo;
    private String hotelName;
    private String middleClassName;
    private String userReview;
    private Integer reviewCount;
    private String hotelInformationUrl;
    private String planListUrl;
    private String checkAvailableUrl;
    private String reviewUrl;
    private String hotelImageUrl;
    private String hotelThumbnailUrl;
    private Integer reviewAverage;
    private String carrier;

    /**
     * @return the rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(Integer rank) {
        this.rank = rank;
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
     * @return the hotelName
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * @param hotelName the hotelName to set
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * @return the middleClassName
     */
    public String getMiddleClassName() {
        return middleClassName;
    }

    /**
     * @param middleClassName the middleClassName to set
     */
    public void setMiddleClassName(String middleClassName) {
        this.middleClassName = middleClassName;
    }

    /**
     * @return the userReview
     */
    public String getUserReview() {
        return userReview;
    }

    /**
     * @param userReview the userReview to set
     */
    public void setUserReview(String userReview) {
        this.userReview = userReview;
    }

    /**
     * @return the reviewCount
     */
    public Integer getReviewCount() {
        return reviewCount;
    }

    /**
     * @param reviewCount the reviewCount to set
     */
    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    /**
     * @return the hotelInformationUrl
     */
    public String getHotelInformationUrl() {
        return hotelInformationUrl;
    }

    /**
     * @param hotelInformationUrl the hotelInformationUrl to set
     */
    public void setHotelInformationUrl(String hotelInformationUrl) {
        this.hotelInformationUrl = hotelInformationUrl;
    }

    /**
     * @return the planListUrl
     */
    public String getPlanListUrl() {
        return planListUrl;
    }

    /**
     * @param planListUrl the planListUrl to set
     */
    public void setPlanListUrl(String planListUrl) {
        this.planListUrl = planListUrl;
    }

    /**
     * @return the checkAvailableUrl
     */
    public String getCheckAvailableUrl() {
        return checkAvailableUrl;
    }

    /**
     * @param checkAvailableUrl the checkAvailableUrl to set
     */
    public void setCheckAvailableUrl(String checkAvailableUrl) {
        this.checkAvailableUrl = checkAvailableUrl;
    }

    /**
     * @return the reviewUrl
     */
    public String getReviewUrl() {
        return reviewUrl;
    }

    /**
     * @param reviewUrl the reviewUrl to set
     */
    public void setReviewUrl(String reviewUrl) {
        this.reviewUrl = reviewUrl;
    }

    /**
     * @return the hotelImageUrl
     */
    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    /**
     * @param hotelImageUrl the hotelImageUrl to set
     */
    public void setHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
    }

    /**
     * @return the hotelThumbnailUrl
     */
    public String getHotelThumbnailUrl() {
        return hotelThumbnailUrl;
    }

    /**
     * @param hotelThumbnailUrl the hotelThumbnailUrl to set
     */
    public void setHotelThumbnailUrl(String hotelThumbnailUrl) {
        this.hotelThumbnailUrl = hotelThumbnailUrl;
    }

    /**
     * @return the reviewAverage
     */
    public Integer getReviewAverage() {
        return reviewAverage;
    }

    /**
     * @param reviewAverage the reviewAverage to set
     */
    public void setReviewAverage(Integer reviewAverage) {
        this.reviewAverage = reviewAverage;
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
    
}
