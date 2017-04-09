/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Enum;

import rakuten.webservice.market.product.Enum.*;

/**
0 :ジャンルごとの商品数の情報を取得しない
1 :ジャンルごとの商品数の情報を取得する
 * @author Pawn
 */
public enum RakutenBooksGenreInformationFlagEnum {

   GetGenre(1),
    NotGetGenre(0),
    ;
    
    private final int value;
    
    private RakutenBooksGenreInformationFlagEnum(final int value){
        this.value=value;
    }
    
    public int getValue(){
        return this.value;
    }
}
