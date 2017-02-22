/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import excepciones.Excepciones_Asel;

/**
 *
 * @author aselr
 */
public class LogicaNegocio_Asel {
    
    public static float calculaSalarioBruto(String tipo, float ventasMes, float horasExtra) throws Excepciones_Asel.BRException {
        float salarioBase = 0;
        float prima = 0;
        float horaExtra = 20;
        float salarioBruto = 0;
        if (tipo != null && ventasMes >= 0 && horasExtra >= 0) {

            if (tipo.equalsIgnoreCase("empleado")) {
                salarioBase = 1000;
            } else if (tipo.equalsIgnoreCase("encargado")) {
                salarioBase = 1500;
            }

            if (ventasMes >= 1000) {
                prima = 100;
            } else if (ventasMes >= 1500) {
                prima = 200;
            }

            salarioBruto = salarioBase + prima + (horasExtra * horaExtra);

        } else {
            throw new Excepciones_Asel.BRException("Ha habido un error");
        }

        return salarioBruto;
    }

    public static float calculaSalarioNeto(float salarioBruto) throws Excepciones_Asel.BRException {
        float retencion = 0;
        float salarioNeto = 0;

        if (salarioBruto >= 0) {
            
            if (salarioBruto >= 1000 && salarioBruto < 1500)
                retencion = 0.16f;
            else if (salarioBruto >= 1500)
                retencion = 0.18f;

            salarioNeto = salarioBruto - (salarioBruto * retencion);

            return salarioNeto;
        } else {
            throw new Excepciones_Asel.BRException("El salario bruto tiene que ser mayor o igual que 0");
        }

    }
    
}
