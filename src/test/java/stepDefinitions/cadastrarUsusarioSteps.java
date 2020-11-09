package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CnpjPage;
import pages.CoringaPage;
import pages.HomePage;
import pages.ModalidadePage;
import tools.CapturarTela;

public class cadastrarUsusarioSteps {

	CoringaPage toolsPage = new CoringaPage();
	CapturarTela capturaTela = new CapturarTela();
	HomePage homePage = new HomePage();
	ModalidadePage modalidadePage = new ModalidadePage();
	CnpjPage cnpjPage = new CnpjPage();

	@Dado("que eu esteja na página inicial")
	public void que_eu_acesso_o_site() throws Throwable {

		capturaTela.capturaTela();

	}

	@Quando("veirifico as abas  Colaborador, Empresas e Parceiro")
	public void veirifico_as_abas_colaborador_empresas_e_parceiro() throws Throwable {

		homePage.verificarAbaColaborador();
		capturaTela.capturaTela();

		homePage.verificarAbaEmpresa();
		capturaTela.capturaTela();

		homePage.verificarAbaParceiro();
		capturaTela.capturaTela();

	}

	@E("faço o cdastro inicial")
	public void faço_o_cdastro_inicial() throws Throwable {

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

	}

	@Então("valido a tela CPF e CNPJ")
	public void valido_a_tela_cpf_e_cnpj() throws Throwable {

		cnpjPage.inputCpfCnpj();
		capturaTela.capturaTela();

	}

}
