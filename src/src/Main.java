/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import excepciones.Excepciones_Asel;
import logica.LogicaNegocio_Asel;

/**
 *
 * @author aselr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Excepciones_Asel.BRException {
        
        System.out.println("Salario bruto: "+LogicaNegocio_Asel.calculaSalarioBruto("empleado", 1000, 75));
        
        System.out.println("Salario neto: "+LogicaNegocio_Asel.calculaSalarioNeto(3000));
        
    }
    
}
