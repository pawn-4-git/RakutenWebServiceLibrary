/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Enum;

import rakuten.webservice.market.product.Enum.*;

/**
在庫状況
0：すべての商品
1：在庫あり
2：通常3～7日程度で発送
3：通常3～9日程度で発送
4：メーカー取り寄せ
5：予約受付中
6：メーカーに在庫確認
* @author Pawn
 */
public enum RakutenBooksAvailabilityEnum {

    All(0),
    InStock(1),
    Stock3_7days(2),
    Stock3_9days(3),
    MakerStock(4),
    Reservation(5),
    MakerStockCheck(6),
    ;
    
    private final int value;
    
    private RakutenBooksAvailabilityEnum(final int value){
        this.value=value;
    }
    
    public int getValue(){
        return this.value;
    }
}
