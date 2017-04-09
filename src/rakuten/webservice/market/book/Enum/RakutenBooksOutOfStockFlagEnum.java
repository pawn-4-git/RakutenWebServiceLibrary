/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Enum;

import rakuten.webservice.market.product.Enum.*;

/**
0：品切れや販売終了など購入不可の商品は結果に表示させない
1：品切れや販売終了など購入不可の商品を結果に表示させる
@author Pawn
 */
public enum RakutenBooksOutOfStockFlagEnum {

    All(1),
    InStock(0),
    ;
    
    private final int value;
    
    private RakutenBooksOutOfStockFlagEnum(final int value){
        this.value=value;
    }
    
    public int getValue(){
        return this.value;
    }
}
