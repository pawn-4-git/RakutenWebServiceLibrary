/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Enum;

/**
 * 楽天ジャンル検索API (version:2014-02-22)
 * ジャンルパス
 * 結果セットに祖先ジャンル（親ジャンルよりも上のジャンル）を含めるか否か
 * onlyParant：含めない
 * addAncestor：含める 
 * @author Pawn
 */
public enum RakutenIchibaGenreGenrePathEnum {

    onlyParant(0),
    addAncestor(1)
    ;
    
    private final int value;
    
    private RakutenIchibaGenreGenrePathEnum(final int value){
        this.value=value;
    }
    
    public int getValue(){
        return this.value;
    }
}
