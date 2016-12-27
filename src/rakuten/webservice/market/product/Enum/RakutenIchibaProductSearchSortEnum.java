/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Enum;

/**
 * ソート順を指定する列挙体
 * @author Pawn
 */
public enum RakutenIchibaProductSearchSortEnum {

    affiliateRateAsc("+affiliateRate"),
    affiliateRateDesc("-affiliateRate"),
    reviewCountAsc("+reviewCount"),
    reviewCountDesc("-reviewCount"),
    reviewAverageAsc("+reviewAverage"),
    reviewAverageDesc("-reviewAverage"),
    itemPriceAsc("+itemPrice"),
    itemPriceDesc("-itemPrice"),
    updateTimestampAsc("+updateTimestamp"),
    updateTimestampDesc("-updateTimestamp"),
    standard("standard")
    ;
    
    private final String value;
    
    private RakutenIchibaProductSearchSortEnum(final String value){
        this.value=value;
    }
    
    public String getValue(){
        return this.value;
    }
}
