/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaGenreResultItemEntity {
    private long genreId;
    private String genreName;
    private int genreLevel;

    /**
     * @return the genreId
     */
    public long getGenreId() {
        return genreId;
    }

    /**
     * @param genreId the genreId to set
     */
    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }

    /**
     * @return the genreName
     */
    public String getGenreName() {
        return genreName;
    }

    /**
     * @param genreName the genreName to set
     */
    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    /**
     * @return the genreLevel
     */
    public int getGenreLevel() {
        return genreLevel;
    }

    /**
     * @param genreLevel the genreLevel to set
     */
    public void setGenreLevel(int genreLevel) {
        this.genreLevel = genreLevel;
    }
    
    
}
