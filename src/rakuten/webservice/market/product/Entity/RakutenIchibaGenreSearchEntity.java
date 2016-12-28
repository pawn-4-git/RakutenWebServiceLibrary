/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Entity;

import rakuten.webservice.market.product.Enum.RakutenIchibaGenreGenrePathEnum;
import rakuten.webservice.market.product.Enum.RakutenIchibaProductSearchAvailabilityEnum;
import rakuten.webservice.market.product.Enum.RakutenIchibaProductSearchOrFlgEnum;
import rakuten.webservice.market.product.Enum.RakutenIchibaProductSearchSortEnum;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaGenreSearchEntity {
    private long genreId=0;
    private int genrePath=0;

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
     * @return the genrePath
     */
    public int getGenrePath() {
        return genrePath;
    }

    /**
     * @param genrePath the genrePath to set
     */
    public void setGenrePath(int genrePath) {
        this.genrePath = genrePath;
    }
    
    public void setGenrePath(RakutenIchibaGenreGenrePathEnum rakutenIchibaGenreGenrePathEnum){
        this.genrePath=rakutenIchibaGenreGenrePathEnum.getValue();
    }
    
}
