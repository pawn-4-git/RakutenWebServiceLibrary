/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.market.book.Entity;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaBookMagazineResultItemEntity extends RakutenIchibaBookResultItemEntity{
    private String titleKana;
    private String cycle;

    /**
     * @return the titleKana
     */
    public String getTitleKana() {
        return titleKana;
    }

    /**
     * @param titleKana the titleKana to set
     */
    public void setTitleKana(String titleKana) {
        this.titleKana = titleKana;
    }

    /**
     * @return the cycle
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * @param cycle the cycle to set
     */
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

     
    
}
