/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.market.product.Entity;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaItemGenreInformationItemEntity {
    
    private String genreId;
    private String genreName;
    private Long itemCount;
    private Integer genreLevel;

    /**
     * @return the genreId
     */
    public String getGenreId() {
        return genreId;
    }

    /**
     * @param genreId the genreId to set
     */
    public void setGenreId(String genreId) {
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
     * @return the itemCount
     */
    public Long getItemCount() {
        return itemCount;
    }

    /**
     * @param itemCount the itemCount to set
     */
    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * @return the genreLevel
     */
    public Integer getGenreLevel() {
        return genreLevel;
    }

    /**
     * @param genreLevel the genreLevel to set
     */
    public void setGenreLevel(Integer genreLevel) {
        this.genreLevel = genreLevel;
    }
    
    
}
