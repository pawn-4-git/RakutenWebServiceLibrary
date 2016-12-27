/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Enum;

/**
 * 検索対象商品の条件を指定
 * キーワードの検索をANDにするかORにするか
 * @author Pawn
 */
public enum RakutenIchibaProductSearchOrFlgEnum {

    AND(0),
    OR(1)
    ;
    
    private final int value;
    
    private RakutenIchibaProductSearchOrFlgEnum(final int value){
        this.value=value;
    }
    
    public int getValue(){
        return this.value;
    }
}
