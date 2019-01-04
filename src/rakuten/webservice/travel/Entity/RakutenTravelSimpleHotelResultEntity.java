/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.travel.Entity;

import rakuten.webservice.market.product.Entity.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawn
 */
public class RakutenTravelSimpleHotelResultEntity {

    private RakutenTravelPageInfoEntity pagingInfo;
    private List<List<RakutenTravelHotelEntity>> hotels;

    
    /**
     * @return the pagingInfo
     */
    public RakutenTravelPageInfoEntity getPagingInfo() {
        return pagingInfo;
    }

    /**
     * @param pagingInfo the pagingInfo to set
     */
    public void setPagingInfo(RakutenTravelPageInfoEntity pagingInfo) {
        this.pagingInfo = pagingInfo;
    }

    /**
     * @return the hotels
     */
    public List<List<RakutenTravelHotelEntity>> getHotels() {
        return hotels;
    }

    /**
     * @param hotels the hotels to set
     */
    public void setHotels(List<List<RakutenTravelHotelEntity>> hotels) {
        this.hotels = hotels;
    }

   
    
}
