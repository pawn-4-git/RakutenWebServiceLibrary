/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Enum;

/**
 * 年齢制限の設定のための列挙体
 * age10s 10代
 * age20s 20代,
 * age30s 30代,
 * age40s 40代,
 * age50over 50代以上,
 * @author Pawn
 */
public enum RakutenIchibaAgeEnum {

    age10s(10),
    age20s(20),
    age30s(30),
    age40s(40),
    age50over(50),
    ;
    
    private final int value;
    
    private RakutenIchibaAgeEnum(final int value){
        this.value=value;
    }
    
    public int getValue(){
        return this.value;
    }
}
