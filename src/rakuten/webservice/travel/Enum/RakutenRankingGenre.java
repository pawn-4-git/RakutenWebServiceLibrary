/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package rakuten.webservice.travel.Enum;

/**
 *
 * @author Pawn
 */
public enum RakutenRankingGenre {
    
    All("all"),
    Onsen("onsen"),
    Premium("premium") ;
    
    private String value;
    
    private RakutenRankingGenre(final String value){
        this.value=value;
    }
    
    public String getValue(){
        return this.value;
    }
}
