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
public class RakutenTravelHotelRatingInfoEntity {
    private BigDecimal serviceAverage;
    private BigDecimal locationAverage;
    private BigDecimal roomAverage;
    private BigDecimal equipmentAverage;
    private BigDecimal bathAverage;
    private BigDecimal mealAverage;

    /**
     * @return the serviceAverage
     */
    public BigDecimal getServiceAverage() {
        return serviceAverage;
    }

    /**
     * @param serviceAverage the serviceAverage to set
     */
    public void setServiceAverage(BigDecimal serviceAverage) {
        this.serviceAverage = serviceAverage;
    }

    /**
     * @return the locationAverage
     */
    public BigDecimal getLocationAverage() {
        return locationAverage;
    }

    /**
     * @param locationAverage the locationAverage to set
     */
    public void setLocationAverage(BigDecimal locationAverage) {
        this.locationAverage = locationAverage;
    }

    /**
     * @return the roomAverage
     */
    public BigDecimal getRoomAverage() {
        return roomAverage;
    }

    /**
     * @param roomAverage the roomAverage to set
     */
    public void setRoomAverage(BigDecimal roomAverage) {
        this.roomAverage = roomAverage;
    }

    /**
     * @return the equipmentAverage
     */
    public BigDecimal getEquipmentAverage() {
        return equipmentAverage;
    }

    /**
     * @param equipmentAverage the equipmentAverage to set
     */
    public void setEquipmentAverage(BigDecimal equipmentAverage) {
        this.equipmentAverage = equipmentAverage;
    }

    /**
     * @return the bathAverage
     */
    public BigDecimal getBathAverage() {
        return bathAverage;
    }

    /**
     * @param bathAverage the bathAverage to set
     */
    public void setBathAverage(BigDecimal bathAverage) {
        this.bathAverage = bathAverage;
    }

    /**
     * @return the mealAverage
     */
    public BigDecimal getMealAverage() {
        return mealAverage;
    }

    /**
     * @param mealAverage the mealAverage to set
     */
    public void setMealAverage(BigDecimal mealAverage) {
        this.mealAverage = mealAverage;
    }
    
}
