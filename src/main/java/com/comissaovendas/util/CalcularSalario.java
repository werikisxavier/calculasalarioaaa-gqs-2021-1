
package com.comissaovendas.util;

import com.comissaovendas.model.Venda;
import com.comissaovendas.model.Vendedor;


public class CalcularSalario {
    
    public static double realizarCalculo(Vendedor vendedor){
        double salarioTotal = 0.0;
        
        salarioTotal +=  vendedor.getSalario();
        
        for (Venda venda : vendedor.getVendas()) {
            salarioTotal += venda.getComissaoVendedor();
        }
        
        return salarioTotal;
    }
    
}
