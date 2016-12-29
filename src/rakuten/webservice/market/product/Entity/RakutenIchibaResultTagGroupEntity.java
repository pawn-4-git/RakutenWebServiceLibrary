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
public class RakutenIchibaResultTagGroupEntity {
    private List<RakutenIchibaTagResultTagEntity> tags=new ArrayList<>();
    private String tagGroupName;
    private long tagGroupId;

    /**
     * @return the tags
     */
    public List<RakutenIchibaTagResultTagEntity> getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(List<RakutenIchibaTagResultTagEntity> tags) {
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
