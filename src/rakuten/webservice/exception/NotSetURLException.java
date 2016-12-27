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
public class NotSetURLException extends Exception {

    /**
     * Creates a new instance of <code>NotSetURLException</code> without detail
     * message.
     */
    public NotSetURLException() {
    }

    /**
     * Constructs an instance of <code>NotSetURLException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotSetURLException(String msg) {
        super(msg);
    }
}
