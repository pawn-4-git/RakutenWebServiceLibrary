/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.book.Enum;

import rakuten.webservice.market.product.Enum.*;

/**
 * ソート順を指定する列挙体
standard:標準
sales:売れている
+releaseDate:発売日(古い)
-releaseDate:発売日(新しい)
+itemPrice:価格が安い
-itemPrice:価格が高い
reviewCount:レビューの件数が多い
reviewAverage:レビューの評価(平均)が高い

 * @author Pawn
 */
public enum RakutenBooksSortEnum {

    standard("standard"),
    sales("sales"),
    reviewCount("reviewCount"),
    reviewAverageAsc("reviewAverage"),
    releaseDateAsc("+releaseDate"),
    releaseDateDesc("-releaseDate"),
    itemPriceAsc("+itemPrice"),
    itemPriceDesc("-itemPrice"),
    ;
    
    private final String value;
    
    private RakutenBooksSortEnum(final String value){
        this.value=value;
    }
    
    public String getValue(){
        return this.value;
    }
}
