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
public class RakutenTravelHotelDetailSearchSearchEntity {
   private Integer hotelNo;
   private Integer carrier;
   private Integer datumType;
   private Integer hotelThumbnailSize;
   private String responseType;

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
   
    
   
}
