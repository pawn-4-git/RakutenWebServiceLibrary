/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Enum;

/**
 * PC 
 * MOBILE
 * @author Pawn
 */
public enum RakutenIchibaRankingSerchPeriodEnum {

    REALTIME("realtime"),
    ;
    
    private final String value;
    
    private RakutenIchibaRankingSerchPeriodEnum(final String value){
        this.value=value;
    }
    
    public String getValue(){
        return this.value;
    }
}
