/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Enum;

/**
 * mwn 男性
 * women 女性
 * @author Pawn
 */
public enum RakutenIchibaSexEnum {

    MEN(0),
    WOMEN(1),
    ;
    
    private final int value;
    
    private RakutenIchibaSexEnum(final int value){
        this.value=value;
    }
    
    public int getValue(){
        return this.value;
    }
}
