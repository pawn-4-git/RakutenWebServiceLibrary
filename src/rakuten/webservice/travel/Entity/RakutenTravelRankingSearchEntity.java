/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.travel.Entity;

import java.util.HashMap;
import java.util.Map;
import rakuten.webservice.travel.Enum.RakutenRankingGenre;


/**
 *
 * @author Pawn
 */
public class RakutenTravelRankingSearchEntity {
    private String genre="";
    private int carrier=0;

    Map<RakutenRankingGenre,String> genreList=new HashMap<>();

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

    public void addGenre(RakutenRankingGenre rakutenRankingGenre){
        genreList.put(rakutenRankingGenre, rakutenRankingGenre.getValue());
        StringBuilder genreStr=new StringBuilder();
        int i=0;
        for(RakutenRankingGenre genre:genreList.keySet()){
            genreStr=genreStr.append(genreList.get(genre));
            i++;
            if(i!=genreList.size()){
                genreStr.append(",");
            }
        }
        this.genre=genreStr.toString();
    }
    
    public void deleteGenre(RakutenRankingGenre rakutenRankingGenre){
        genreList.remove(rakutenRankingGenre, rakutenRankingGenre.getValue());
        StringBuilder genreStr=new StringBuilder();
        int i=0;
        for(RakutenRankingGenre genre:genreList.keySet()){
            genreStr=genreStr.append(genreList.get(genre));
            i++;
            if(i!=genreList.size()){
                genreStr.append(",");
            }
        }
        this.genre=genreStr.toString();
    }
    
}
