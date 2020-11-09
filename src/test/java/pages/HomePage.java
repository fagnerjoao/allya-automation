package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import runner.Driver;
import tools.Datas;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	Datas gerarData = new Datas();

	@FindBy(css = ".voce-page > p")
	protected WebElement abaColaborador;

	@FindBy(xpath = "//h1[contains(.,'Para você')]")
	protected WebElement lblParaVc;

	@FindBy(css = ".empresa-page > p")
	protected WebElement abaEmpresa;

	@FindBy(xpath = "//h1[contains(.,'Para sua empresa')]")
	protected WebElement lblParaEmp;

	@FindBy(css = ".negocio-page > p")
	protected WebElement abaParceiro;

	@FindBy(xpath = "//p[contains(.,'SEJA ENCONTRADO NO MOMENTO EM QUE SEU CLIENTE PRECISA.')]")
	protected WebElement lblParaNegocio;

	@FindBy(css = ".content-menu > .access-menu > .access-menu__cadaster > a")
	protected WebElement btnCadastreSe;

	@FindBy(id = "first_name")
	protected WebElement inputPrimeroNome;

	@FindBy(id = "surname")
	protected WebElement inputSobrenome;

	@FindBy(id = "empresa")
	protected WebElement inputNomeEmpresa;

	@FindBy(id = "email")
	protected WebElement inputEmail;

	@FindBy(id = "repeatEmail")
	protected WebElement inputRepetirEmail;

	@FindBy(id = "telefone")
	protected WebElement inputTelefone;

	@FindBy(id = "password")
	protected WebElement inputSenha;

	@FindBy(xpath = "//h3[contains(.,'Cadastro iniciado com sucesso! 🎉 💥 🎊')]")
	protected WebElement txtCadastroIniSucesso;

	public void clickAbaColaborador() {
		abaColaborador.click();

	}

	public void verificarTituloPaginaInicial() throws Throwable {

		Assert.assertEquals(Driver.getDriver().getTitle(), "Allya – Faz seu salário render mais para alcançar seus objetivos");

	}

	public void verificarAbaColaborador() throws Throwable {
		abaColaborador.click();
		String txt = lblParaVc.getText();
		Assert.assertEquals(txt, "Para você");

	}

	public void clickAbaEmpresa() {
		abaEmpresa.click();

	}

	public void verificarAbaEmpresa() throws Throwable {
		abaEmpresa.click();
		String txt = lblParaEmp.getText();
		Assert.assertEquals(txt, "Para sua empresa");

	}

	public void clickAbaParceiro() {
		abaParceiro.click();

	}

	public void verificarAbaParceiro() throws Throwable {
		abaParceiro.click();
		String txt = lblParaNegocio.getText();
		Assert.assertEquals(txt, "SEJA ENCONTRADO NO MOMENTO EM QUE SEU CLIENTE PRECISA.");

	}

	public void inputNome() {
		String data = gerarData.gerarData();
		inputPrimeroNome.sendKeys("QA " + data);
	}

	public void inputSobrenome() {
		inputSobrenome.sendKeys("Allya");
	}

	public void inputNomeEmpresa() {
		String data = gerarData.gerarData();
		inputNomeEmpresa.sendKeys("QA " + data + "Allya");
	}

	public void inputEmail() {
		String data = gerarData.gerarData();
		String hora = gerarData.gerarHoraCompleta();
		inputEmail.sendKeys("renato.carvalho+" + "" + data + "/" + hora + "@allya.com.br");
		inputRepetirEmail.sendKeys("renato.carvalho+" + "" + data + "/" + hora + "@allya.com.br");

	}

	public void inputTelefone() {
		inputTelefone.sendKeys("8111223344");
	}

	public void inputSenha() {
		inputSenha.sendKeys("123456");
	}
	
	public void clickBtnCadastreSe() {
		btnCadastreSe.click();

	}
	
	public void verificarCadastroIniciado() {
		String txt = txtCadastroIniSucesso.getText();
		Assert.assertEquals(txt, "Cadastro iniciado com sucesso! 🎉 💥 🎊");

	}

}
