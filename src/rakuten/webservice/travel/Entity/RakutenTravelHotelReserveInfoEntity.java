/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.travel.Entity;

/**
 *
 * @author Pawn
 */
public class RakutenTravelHotelReserveInfoEntity {
   private Integer reserveRecordCount;
   private Integer lowestCharge;
   private Integer highestCharge;

    /**
     * @return the reserveRecordCount
     */
    public Integer getReserveRecordCount() {
        return reserveRecordCount;
    }

    /**
     * @param reserveRecordCount the reserveRecordCount to set
     */
    public void setReserveRecordCount(Integer reserveRecordCount) {
        this.reserveRecordCount = reserveRecordCount;
    }

    /**
     * @return the lowestCharge
     */
    public Integer getLowestCharge() {
        return lowestCharge;
    }

    /**
     * @param lowestCharge the lowestCharge to set
     */
    public void setLowestCharge(Integer lowestCharge) {
        this.lowestCharge = lowestCharge;
    }

    /**
     * @return the highestCharge
     */
    public Integer getHighestCharge() {
        return highestCharge;
    }

    /**
     * @param highestCharge the highestCharge to set
     */
    public void setHighestCharge(Integer highestCharge) {
        this.highestCharge = highestCharge;
    }
   
   
    
}
