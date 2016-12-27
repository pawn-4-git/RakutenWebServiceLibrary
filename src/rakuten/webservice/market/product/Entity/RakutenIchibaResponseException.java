/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Entity;

/**
 *
 * @author 寿成
 */
public class RakutenIchibaResponseException extends Exception {

    /**
     * Creates a new instance of <code>RakutenIchibaResponseException</code>
     * without detail message.
     */
    public RakutenIchibaResponseException() {
    }

    /**
     * Constructs an instance of <code>RakutenIchibaResponseException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public RakutenIchibaResponseException(String msg) {
        super(msg);
    }
}
