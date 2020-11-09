package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import runner.Driver;

public class PropostaPadraoPage {
	
	public PropostaPadraoPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//input[@type='text']")
	protected WebElement inputProposta;
	
	@FindBy(xpath = "//div[@id='cke_1_contents']/div")
	protected WebElement inputTermosCondicoes;


	public void inputProposta(String proposta) {
		inputProposta.sendKeys(proposta);
	}
	
	public void inputTermosCondicoes(String termoCondicoes) {
		inputTermosCondicoes.sendKeys(termoCondicoes);
	}

}
