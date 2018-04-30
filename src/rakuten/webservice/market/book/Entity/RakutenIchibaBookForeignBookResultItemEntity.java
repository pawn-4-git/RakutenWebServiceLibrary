/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.market.book.Entity;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaBookForeignBookResultItemEntity extends RakutenIchibaBookResultItemEntity{
    private String titleKana;
    private String japaneseTitle;
    private String authorKana;

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
     * @return the japaneseTitle
     */
    public String getJapaneseTitle() {
        return japaneseTitle;
    }

    /**
     * @param japaneseTitle the japaneseTitle to set
     */
    public void setJapaneseTitle(String japaneseTitle) {
        this.japaneseTitle = japaneseTitle;
    }

    /**
     * @return the authorKana
     */
    public String getAuthorKana() {
        return authorKana;
    }

    /**
     * @param authorKana the authorKana to set
     */
    public void setAuthorKana(String authorKana) {
        this.authorKana = authorKana;
    }
    
    
    
}
