package com.willianThomaz;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeiroTeste {

    Calculadora calculadora;

    @Before
    public void setUp(){
        calculadora = new Calculadora();
    }
    @Test
    public void somar2NumerosTest(){
        //cenário//
        int numero1 = 10, numero2 = 5;

        //execução//
        int resultado = calculadora.somar(numero1,numero2);

        //verificações//
        Assert.assertEquals(15, resultado);

        // Assertions.assertThat(resultado).isBetween(14,16);
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveSomarNumerosNegativos(){
        //cenário
        int numero1 = -10, numero2 = 5;

        //execução
        calculadora.somar(numero1,numero2);

    }
    @Test
    public void subtrair2NumerosTest(){
        //cenário//
        int numero1 = 10, numero2 = 5;

        //execução//
        int resultado = calculadora.subtrair(numero1,numero2);

        //verificações//
        Assert.assertEquals(5, resultado);
    }
    @Test(expected = RuntimeException.class)
    public void naoDeveSubtrairNumerosNegativos(){
        //cenário
        int numero1 = -10, numero2 = 5;

        //execução
        calculadora.subtrair(numero1,numero2);
    }
    @Test
    public void multiplicar2NumerosTest(){
        //cenário//
        int numero1 = 10, numero2 = 5;

        //execução//
        int resultado = calculadora.multiplicar(numero1,numero2);

        //verificações//
        Assert.assertEquals(50, resultado);
    }
    @Test(expected = RuntimeException.class)
    public void naoDeveMultiplicarNumerosNegativos(){
        //cenário
        int numero1 = -10, numero2 = 5;

        //execução
        calculadora.multiplicar(numero1,numero2);
    }
    @Test
    public void dividir2NumerosTest(){
        //cenário//
        int numero1 = 10, numero2 = 5;

        //execução//
        int resultado = calculadora.dividir(numero1,numero2);

        //verificações//
        Assert.assertEquals(2, resultado);
    }
    @Test(expected = RuntimeException.class)
    public void naoDeveDividirNumerosNegativos(){
        //cenário
        int numero1 = 0, numero2 = 5;

        //execução
        calculadora.dividir(numero1,numero2);
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
                throw new RuntimeException("Não é permitido dividir numeros negativos.");
            }
            return num / num2;
        }
    }


}
