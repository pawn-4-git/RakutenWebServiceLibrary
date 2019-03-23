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
public class RakutenTravelDailyChargeEntity {
   private String stayDate;
   private Integer rakutenCharge;
   private Integer total;
   private Integer chargeFlag;

    /**
     * @return the stayDate
     */
    public String getStayDate() {
        return stayDate;
    }

    /**
     * @param stayDate the stayDate to set
     */
    public void setStayDate(String stayDate) {
        this.stayDate = stayDate;
    }

    /**
     * @return the rakutenCharge
     */
    public Integer getRakutenCharge() {
        return rakutenCharge;
    }

    /**
     * @param rakutenCharge the rakutenCharge to set
     */
    public void setRakutenCharge(Integer rakutenCharge) {
        this.rakutenCharge = rakutenCharge;
    }

    /**
     * @return the total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * @return the chargeFlag
     */
    public Integer getChargeFlag() {
        return chargeFlag;
    }

    /**
     * @param chargeFlag the chargeFlag to set
     */
    public void setChargeFlag(Integer chargeFlag) {
        this.chargeFlag = chargeFlag;
    }
   
   
}
