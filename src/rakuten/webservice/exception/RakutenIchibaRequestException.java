/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.exception;

/**
 *
 * @author pawn
 */
public class RakutenIchibaRequestException extends Exception {

    /**
     * Creates a new instance of <code>RakutenIchibaResponseException</code>
     * without detail message.
     */
    public RakutenIchibaRequestException() {
    }

    /**
     * Constructs an instance of <code>RakutenIchibaResponseException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public RakutenIchibaRequestException(String msg) {
        super(msg);
    }
}
