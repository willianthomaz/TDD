package com.willianThomaz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class PrimeiroTeste {

    @Mock
    Calculadora calculadora;
    int numero1 = 10, numero2 = 5;

    @BeforeEach
    public void setUp(){
        calculadora = new Calculadora();
    }
    @Test
    public void somar2NumerosTest(){
        //cenário//

        //execução//
        int resultado = calculadora.somar(numero1,numero2);

        //verificações//
        Assertions.assertEquals(15, resultado);

        // Assertions.assertThat(resultado).isBetween(14,16);
    }

    @Test
    public void naoDeveSomarNumerosNegativos(){
        //cenário
        int numero1 = -10, numero2 = 5;

        //execução
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.somar(numero1,numero2));

    }
    @Test
    public void subtrair2NumerosTest(){
        //cenário//

        //execução//
        int resultado = calculadora.subtrair(numero1,numero2);

        //verificações//
        Assertions.assertEquals(5, resultado);
    }
    @Test
    public void naoDeveSubtrairNumerosNegativos(){
        //cenário
        int numero1 = -10, numero2 = 5;

        //execução
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.subtrair(numero1,numero2));
    }
    @Test
    public void multiplicar2NumerosTest(){
        //cenário//

        //execução//
        int resultado = calculadora.multiplicar(numero1,numero2);

        //verificações//
        Assertions.assertEquals(50, resultado);
    }
    @Test
    public void naoDeveMultiplicarNumerosNegativos(){
        //cenário
        int numero1 = -10, numero2 = 5;

        //execução
        Assertions.assertThrows(RuntimeException.class, () ->  calculadora.multiplicar(numero1,numero2));
    }
    @Test
    public void dividir2NumerosTest(){
        //cenário//

        //execução//
        int resultado = calculadora.dividir(numero1,numero2);

        //verificações//
        Assertions.assertEquals(2, resultado);
    }
    @Test
    public void naoDeveDividirPorZero(){
        //cenário
        int numero1 = 10, numero2 = 0;

        //execução
        Assertions.assertThrows(ArithmeticException.class, () -> calculadora.dividir(numero1,numero2));
    }

    public class Calculadora{
        int somar(int num, int num2){
            if (num < 0 || num2 < 0 ){
                throw new RuntimeException("Não é permitido somar numeros negativos ou divisão por 0.");
            }
            return num + num2;
        }
        int subtrair(int num, int num2){
            if (num < 0 || num2 < 0){
                throw new RuntimeException("Não é permitido subtrair numeros negativos.");
            }
            return num - num2;
        }
        int multiplicar(int num, int num2){
            if (num < 0 || num2 < 0){
                throw new RuntimeException("Não é permitido multiplicar numeros negativos.");
            }
            return num * num2;
        }

        int dividir(int num, int num2){
            if (num < 0 || num2 < 0 || num == 0 || num2 == 0){
                throw new ArithmeticException("Não é permitido dividir numeros negativos.");
            }
            return num / num2;
        }
    }
}
