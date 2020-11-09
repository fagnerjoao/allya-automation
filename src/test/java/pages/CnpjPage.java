package pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import runner.Driver;
import tools.CapturarTela;

public class CnpjPage {

	public CnpjPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	CapturarTela capturaTela = new CapturarTela();

	@FindBy(css = ".registration-title")
	protected WebElement titulo;

	@FindBy(css = ".ng-untouched")
	protected WebElement inputCpf;

	@FindBy(css = ".ng-dirty")
	protected WebElement inputCnpj;

	@FindBy(id = "txtCPF")
	protected WebElement outputCpfCnpj;

	@FindBy(id = "btnGerarCPF")
	protected WebElement btnGerarCPF;

	@FindBy(id = "btnGerarCNPJ")
	protected WebElement btnGerarCNPJ;

	public void inputCpfCnpj() throws InterruptedException, Throwable, AWTException, IOException {

		((JavascriptExecutor) Driver.getDriver())
				.executeScript("window.open('http://www.jmssolucoes.com.br/gerador-de-cpf-cnpj.aspx','_blank');");

		Thread.sleep(3000);

		ArrayList<String> tab_list = new ArrayList<String>(Driver.getDriver().getWindowHandles());

		Driver.getDriver().switchTo().window(tab_list.get(1));
		btnGerarCPF.click();
		String cpf = outputCpfCnpj.getText();
		btnGerarCNPJ.click();
		String cnpj = outputCpfCnpj.getText();
		Driver.getDriver().close();

		Driver.getDriver().switchTo().window(tab_list.get(0));
		try {
			inputCpf.sendKeys(cpf);
		} catch (Exception e) {
			capturaTela.capturaTela();
		}

		try {
			inputCnpj.sendKeys(cnpj);
		} catch (Exception e) {
			capturaTela.capturaTela();
		}

	}

}
