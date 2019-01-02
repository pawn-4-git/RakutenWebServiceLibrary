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
public class RakutenTravelRankingResultItemEntity {
    private String genre;
    private String title;
    private String lastBuildDate;
    private List<RakutenTravelRankingResultHotelEntity> hotels;

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the lastBuildDate
     */
    public String getLastBuildDate() {
        return lastBuildDate;
    }

    /**
     * @param lastBuildDate the lastBuildDate to set
     */
    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    /**
     * @return the hotels
     */
    public List<RakutenTravelRankingResultHotelEntity> getHotels() {
        return hotels;
    }

    /**
     * @param hotels the hotels to set
     */
    public void setHotels(List<RakutenTravelRankingResultHotelEntity> hotels) {
        this.hotels = hotels;
    }
    
    
}
