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
public class NotSetApplicationIdException extends Exception {

    /**
     * Creates a new instance of <code>NotSetApplicationIdException</code>
     * without detail message.
     */
    public NotSetApplicationIdException() {
    }

    /**
     * Constructs an instance of <code>NotSetApplicationIdException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public NotSetApplicationIdException(String msg) {
        super(msg);
    }
}
