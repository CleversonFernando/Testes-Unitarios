package com.cleversonfernando.TestesUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcularTest {

private Calcular calcular = new Calcular();

    @Test
    void somar() {
        int resultado = calcular.somar(2, 2);

        Assertions.assertEquals(4,resultado);
        Assertions.assertNotEquals(3, resultado);
    }

    @Test
    void subtrair(){

        int resultado = calcular.subtrair(10, 2);

        Assertions.assertEquals(8, resultado);
        Assertions.assertNotEquals(3, resultado);

    }

    @Test
    void dividir(){
        int resultado = calcular.dividir(2,2);

        Assertions.assertEquals(1, resultado);
        Assertions.assertNotEquals(3, resultado);

    }
    @Test
    void divisaoPorZero(){
        var erro = Assertions.assertThrows(ArithmeticException.class,
                () -> calcular.dividir(1, 0));

        Assertions.assertEquals("/ by zero", erro.getMessage());

    }
}