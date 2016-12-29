/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.market.product.Entity;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaGenreResultTagEntity {
    private String tagName;
    private long tagId;
    private long parentTagId;

    /**
     * @return the tagName
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * @param tagName the tagName to set
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * @return the tagId
     */
    public long getTagId() {
        return tagId;
    }

    /**
     * @param tagId the tagId to set
     */
    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    /**
     * @return the parentTagId
     */
    public long getParentTagId() {
        return parentTagId;
    }

    /**
     * @param parentTagId the parentTagId to set
     */
    public void setParentTagId(long parentTagId) {
        this.parentTagId = parentTagId;
    }
    
    
    
}
