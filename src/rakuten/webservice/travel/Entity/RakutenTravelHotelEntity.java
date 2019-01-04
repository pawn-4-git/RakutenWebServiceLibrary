/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.travel.Entity;

import java.math.BigDecimal;

/**
 *
 * @author Pawn
 */
public class RakutenTravelHotelEntity {
    private RakutenTravelHotelRatingInfoEntity hotelRatingInfo;
    private RakutenTravelHotelBaseInfoEntity hotelBasicInfo;
    
    

    /**
     * @return the hotelRatingInfo
     */
    public RakutenTravelHotelRatingInfoEntity getHotelRatingInfo() {
        return hotelRatingInfo;
    }

    /**
     * @param hotelRatingInfo the hotelRatingInfo to set
     */
    public void setHotelRatingInfo(RakutenTravelHotelRatingInfoEntity hotelRatingInfo) {
        this.hotelRatingInfo = hotelRatingInfo;
    }

    /**
     * @return the hotelBasicInfo
     */
    public RakutenTravelHotelBaseInfoEntity getHotelBasicInfo() {
        return hotelBasicInfo;
    }

    /**
     * @param hotelBasicInfo the hotelBasicInfo to set
     */
    public void setHotelBasicInfo(RakutenTravelHotelBaseInfoEntity hotelBasicInfo) {
        this.hotelBasicInfo = hotelBasicInfo;
    }

    
    
}
