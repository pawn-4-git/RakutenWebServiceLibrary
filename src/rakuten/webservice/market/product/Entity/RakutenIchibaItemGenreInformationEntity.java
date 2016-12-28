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
public class RakutenIchibaItemGenreInformationEntity {
    private List<RakutenIchibaItemGenreInformationItemEntity> parent;
    private List<RakutenIchibaItemGenreInformationItemEntity> current;
    private List<RakutenIchibaItemGenreInformationItemEntity> children=new ArrayList<>();
    
    /**
     * @return the children
     */
    public List<RakutenIchibaItemGenreInformationItemEntity> getChildren() {
        return children;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(List<RakutenIchibaItemGenreInformationItemEntity> children) {
        this.children = children;
    }

    /**
     * @return the parent
     */
    public List<RakutenIchibaItemGenreInformationItemEntity> getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(List<RakutenIchibaItemGenreInformationItemEntity> parent) {
        this.parent = parent;
    }

    /**
     * @return the current
     */
    public List<RakutenIchibaItemGenreInformationItemEntity> getCurrent() {
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(List<RakutenIchibaItemGenreInformationItemEntity> current) {
        this.current = current;
    }

   
    
}
