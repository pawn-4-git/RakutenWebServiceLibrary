/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.market.book.Entity;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaBookGameResultItemEntity extends RakutenIchibaBookResultItemEntity{
    private String titleKana;
    private String makerCode;

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
     * @return the makerCode
     */
    public String getMakerCode() {
        return makerCode;
    }

    /**
     * @param makerCode the makerCode to set
     */
    public void setMakerCode(String makerCode) {
        this.makerCode = makerCode;
    }

    
}
