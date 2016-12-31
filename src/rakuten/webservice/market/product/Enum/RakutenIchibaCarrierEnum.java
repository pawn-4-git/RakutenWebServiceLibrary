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
public enum RakutenIchibaCarrierEnum {

    PC(0),
    MOBILE(1),
    ;
    
    private final int value;
    
    private RakutenIchibaCarrierEnum(final int value){
        this.value=value;
    }
    
    public int getValue(){
        return this.value;
    }
}
