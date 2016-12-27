/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Enum;

/**
 * 検索対象商品の条件を指定
 * All 購入可能かは考慮しない
 * Available 購入可能な商品のみ
 * @author Pawn
 */
public enum RakutenIchibaProductSearchAvailabilityEnum {

    All(0),
    Available(1)
    ;
    
    private final int value;
    
    private RakutenIchibaProductSearchAvailabilityEnum(final int value){
        this.value=value;
    }
    
    public int getValue(){
        return this.value;
    }
}
