package com.willianThomaz;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CadastroPessoasTest {

    @Test
    @DisplayName("Deve criar cadastro de Pessoas")
    public void deveCriarCadastroDePessoas(){

        //cenário e execução
        CadastroPessoas cadastroPessoas = new CadastroPessoas();

        //verificação
        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();
    }
    @Test
    @DisplayName("Deve adicionar uma Pessoa")
    public void deveAdicionarUmaPessoa(){
        //cenário
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Wilson");

        //execução
        cadastroPessoas.adicionar(pessoa);

        //verificação
        Assertions.assertThat(cadastroPessoas.getPessoas())
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

    @Test
    @DisplayName("Não deve adicionar uma Pessoa com nome vazio")
    public void naoDeveAdicionarPessoaComNomeVazio(){
        //cenário
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        //execução
        org.junit.jupiter.api.Assertions.assertThrows(PessoaSemNomeException.class, () -> cadastroPessoas.adicionar(pessoa));
    }
    @Test
    @DisplayName("Deve remover uma Pessoa")
    public void deveRemoverUmaPessoa(){
        //cenário
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Wilson");
        cadastroPessoas.adicionar(pessoa);
        //execução
        cadastroPessoas.remover(pessoa);

        //verificação
        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();
    }
    @Test
    @DisplayName("Deve lançar erro ao remover Pessoa inexistente")
    public void deveLancarErroAoRemoverPessoaInexistente(){
        //cenário
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        //execução
        org.junit.jupiter.api.Assertions.assertThrows(CadastroVazioException.class, () -> cadastroPessoas.remover(pessoa));
    }

}
