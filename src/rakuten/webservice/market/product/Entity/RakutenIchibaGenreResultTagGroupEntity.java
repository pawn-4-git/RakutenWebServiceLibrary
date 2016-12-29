/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.market.product.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawn
 */
public class RakutenIchibaGenreResultTagGroupEntity {
    private List<RakutenIchibaGenreResultTagEntity> tags=new ArrayList<>();
    private String tagGroupName;
    private long tagGroupId;

    /**
     * @return the tags
     */
    public List<RakutenIchibaGenreResultTagEntity> getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(List<RakutenIchibaGenreResultTagEntity> tags) {
        this.tags = tags;
    }

    /**
     * @return the tagGroupName
     */
    public String getTagGroupName() {
        return tagGroupName;
    }

    /**
     * @param tagGroupName the tagGroupName to set
     */
    public void setTagGroupName(String tagGroupName) {
        this.tagGroupName = tagGroupName;
    }

    /**
     * @return the tagGroupId
     */
    public long getTagGroupId() {
        return tagGroupId;
    }

    /**
     * @param tagGroupId the tagGroupId to set
     */
    public void setTagGroupId(long tagGroupId) {
        this.tagGroupId = tagGroupId;
    }
    
}
