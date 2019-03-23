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
public class RakutenTravelRoomBasicInfoEntity {
   private String roomClass;
   private String roomName;
   private String planId;
   private String planName;
   private BigDecimal pointRate;
   private Integer withDinnerFlag;
   private Integer dinnerSelectFlag;
   private Integer withBreakfastFlag;
   private Integer breakfastSelectFlag;
   private Integer payment;
   private String reserveUrl;
   private Integer salesformFlag;

    /**
     * @return the roomClass
     */
    public String getRoomClass() {
        return roomClass;
    }

    /**
     * @param roomClass the roomClass to set
     */
    public void setRoomClass(String roomClass) {
        this.roomClass = roomClass;
    }

    /**
     * @return the roomName
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * @param roomName the roomName to set
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * @return the planId
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * @param planId the planId to set
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * @return the planName
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * @param planName the planName to set
     */
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * @return the pointRate
     */
    public BigDecimal getPointRate() {
        return pointRate;
    }

    /**
     * @param pointRate the pointRate to set
     */
    public void setPointRate(BigDecimal pointRate) {
        this.pointRate = pointRate;
    }

    /**
     * @return the withDinnerFlag
     */
    public Integer getWithDinnerFlag() {
        return withDinnerFlag;
    }

    /**
     * @param withDinnerFlag the withDinnerFlag to set
     */
    public void setWithDinnerFlag(Integer withDinnerFlag) {
        this.withDinnerFlag = withDinnerFlag;
    }

    /**
     * @return the dinnerSelectFlag
     */
    public Integer getDinnerSelectFlag() {
        return dinnerSelectFlag;
    }

    /**
     * @param dinnerSelectFlag the dinnerSelectFlag to set
     */
    public void setDinnerSelectFlag(Integer dinnerSelectFlag) {
        this.dinnerSelectFlag = dinnerSelectFlag;
    }

    /**
     * @return the withBreakfastFlag
     */
    public Integer getWithBreakfastFlag() {
        return withBreakfastFlag;
    }

    /**
     * @param withBreakfastFlag the withBreakfastFlag to set
     */
    public void setWithBreakfastFlag(Integer withBreakfastFlag) {
        this.withBreakfastFlag = withBreakfastFlag;
    }

    /**
     * @return the breakfastSelectFlag
     */
    public Integer getBreakfastSelectFlag() {
        return breakfastSelectFlag;
    }

    /**
     * @param breakfastSelectFlag the breakfastSelectFlag to set
     */
    public void setBreakfastSelectFlag(Integer breakfastSelectFlag) {
        this.breakfastSelectFlag = breakfastSelectFlag;
    }

    /**
     * @return the payment
     */
    public Integer getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    /**
     * @return the reserveUrl
     */
    public String getReserveUrl() {
        return reserveUrl;
    }

    /**
     * @param reserveUrl the reserveUrl to set
     */
    public void setReserveUrl(String reserveUrl) {
        this.reserveUrl = reserveUrl;
    }

    /**
     * @return the salesformFlag
     */
    public Integer getSalesformFlag() {
        return salesformFlag;
    }

    /**
     * @param salesformFlag the salesformFlag to set
     */
    public void setSalesformFlag(Integer salesformFlag) {
        this.salesformFlag = salesformFlag;
    }
   
    
}
