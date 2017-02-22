/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author aselr
 */
public class Excepciones_Asel {
    
    public static class BRException extends Exception {

        public BRException() {
        }

        public BRException(String message) {
            super(message);
        }
    }
    
}
