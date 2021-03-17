/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.market.book.Enum;

/**
 *
 * @author Pawn
 */
public enum RakutenBooksGenreId {
    BOOK("001",1),CD("002",2),DVD("003",3),PC("004",4),ForeignBook("005",5),GAME("006",6),MAGAZINE("007",7);
    
    private String value;
    
    private int type;

    private RakutenBooksGenreId(String value,int type) {
        this.value = value;
        this.type=type;
    }
    
    static public RakutenBooksGenreId getGenreId(int type){
        for(RakutenBooksGenreId genreId:RakutenBooksGenreId.values()){
            if(genreId.getType()==type){
                return genreId;
            }
        }
        return null;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }
    
    
}
