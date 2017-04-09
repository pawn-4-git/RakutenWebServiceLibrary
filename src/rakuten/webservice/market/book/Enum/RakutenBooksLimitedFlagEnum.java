/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Enum;

import rakuten.webservice.market.product.Enum.*;

/**
0:すべての商品
1:限定版商品のみ
@author Pawn
 */
public enum RakutenBooksLimitedFlagEnum {

    All(0),
    Limit(1),
    ;
    
    private final int value;
    
    private RakutenBooksLimitedFlagEnum(final int value){
        this.value=value;
    }
    
    public int getValue(){
        return this.value;
    }
}
