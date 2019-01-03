/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.travel.Entity;


/**
 *
 * @author Pawn
 */
public class RakutenTravelRankingSearchEntity {
    private String genre="";
    private int carrier=0;

   

    /**
     * @return the carrier
     */
    public int getCarrier() {
        return carrier;
    }

    /**
     * @param carrier the carrier to set
     */
    public void setCarrier(int carrier) {
        this.carrier = carrier;
    }

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

   
    
}
