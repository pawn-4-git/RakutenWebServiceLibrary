/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.travel.Entity;

/**
 *
 * @author Pawn
 */
public class RakutenTravelPageInfoEntity {
     private Integer recordCount;
    private Integer pageCount;
    private Integer page;
    private Integer first;
    private Integer last;

    /**
     * @return the recordCount
     */
    public Integer getRecordCount() {
        return recordCount;
    }

    /**
     * @param recordCount the recordCount to set
     */
    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    /**
     * @return the pageCount
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * @param pageCount the pageCount to set
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * @return the page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * @return the first
     */
    public Integer getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(Integer first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public Integer getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(Integer last) {
        this.last = last;
    }
    
    
}
