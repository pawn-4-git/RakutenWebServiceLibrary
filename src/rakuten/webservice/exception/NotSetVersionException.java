/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.exception;

/**
 *
 * @author 寿成
 */
public class NotSetVersionException extends Exception {

    /**
     * Creates a new instance of <code>NotSetVersionException</code> without
     * detail message.
     */
    public NotSetVersionException() {
    }

    /**
     * Constructs an instance of <code>NotSetVersionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotSetVersionException(String msg) {
        super(msg);
    }
}
