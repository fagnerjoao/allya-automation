package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.testng.annotations.Test;
import pages.*;
import tools.CapturarTela;

public class cadastrarUsusarioSteps {

    CoringaPage toolsPage = new CoringaPage();
    CapturarTela capturaTela = new CapturarTela();
    HomePage homePage = new HomePage();
    ModalidadePage modalidadePage = new ModalidadePage();
    CnpjPage cnpjPage = new CnpjPage();
    ComplementarPage complementarPage = new ComplementarPage();

    @Test
    @Dado("que eu esteja na paginal inicial")
    public void valido_tela_inicia() throws Throwable {

    }

    @Quando("veirifico as abas  Colaborador, Empresas e Parceiro")
    public void veirifico_as_abas_colaborador_empresas_e_parceiro() throws Throwable {

        homePage.verificarTituloPaginaInicial();
        capturaTela.capturaTela();

        homePage.verificarAbaColaborador();
        capturaTela.capturaTela();

        homePage.verificarAbaEmpresa();
        capturaTela.capturaTela();

        homePage.verificarAbaParceiro();
        capturaTela.capturaTela();

    }

    @Quando("faço o cdastro")
    public void faço_o_cdastro() throws Throwable {

        homePage.clickBtnCadastreSe();

        homePage.inputNome();
        homePage.inputSobrenome();
        homePage.inputNomeEmpresa();
        homePage.inputEmail();
        homePage.inputTelefone();
        homePage.inputSenha();
        capturaTela.capturaTela();

        toolsPage.clickCadastrar();
        Thread.sleep(3000);
        homePage.verificarCadastroIniciado();
        capturaTela.capturaTela();

        modalidadePage.clickCxslcModalidadeInternet();
        toolsPage.clickBtnAvancar();

        cnpjPage.inputCpfCnpj();
        capturaTela.capturaTela();

    }

    @Então("valido a mensagem se sucesso a {string}")
    public void valido_a_tela_cpf_e_cnpj(String msnSucesso) throws Throwable {

        //complementarPage.verificarTxtSucessoCadast();
        capturaTela.capturaTela();

    }

}
