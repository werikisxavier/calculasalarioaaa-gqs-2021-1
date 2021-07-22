/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comissaovendas.util;

import com.comissaovendas.model.Venda;
import com.comissaovendas.model.Vendedor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author W-E-R
 */
public class CalcularSalarioTest {

    public CalcularSalarioTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Teste realizando calculo sem a utilização do Padrão AAA
     */
    @Test
    public void testRealizarCalculo() {
        Vendedor vendedor = new Vendedor("Vlad", 2000);
        Exception exception = assertThrows(Exception.class, () -> {
            vendedor.addVendas(new Venda(1000, 110));
        });

        String expectedMessage = "Percentual invalido";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        try {
            vendedor.addVendas(new Venda(1000, 10));
            vendedor.addVendas(new Venda(1000, 10));
            double resultadoEsperado = 2200;
            double resultadoObtido = CalcularSalario.realizarCalculo(vendedor);
            assertEquals(resultadoEsperado, resultadoObtido);

        } catch (Exception e) {
        }
    }

    /**
     * Test of testExcecao method
     */
    @Test
    public void testExcecaoAAA() {
        //Arrange
        Vendedor vendedor = new Vendedor("Vlad", 2000);
        String expectedMessage = "Percentual invalido";

        //Act
        Exception exception = assertThrows(Exception.class, () -> {
            vendedor.addVendas(new Venda(1000, 110));
        });

        //Assert
        assertTrue(exception.getMessage().contains(expectedMessage));
    }

    /**
     * Test of realizarCalculoAAA method, of class CalcularSalario.
     */
    @Test
    public void testRealizarCalculoAAA() {
        try {
            //Arrange
            Vendedor vendedor = new Vendedor("Vlad", 2000);
            vendedor.addVendas(new Venda(1000, 10));
            vendedor.addVendas(new Venda(1000, 10));
            double resultadoEsperado = 2200;
            
            //Act
            double resultadoObtido = CalcularSalario.realizarCalculo(vendedor);

            //Assert
            assertEquals(resultadoEsperado, resultadoObtido);
        } catch (Exception e) {
        }
    }

}
