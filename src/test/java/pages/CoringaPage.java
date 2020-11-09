package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import runner.Driver;

public class CoringaPage {

	public CoringaPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//button[@type='submit']")
	protected WebElement btnSubmit;

	//@FindBy(xpath = "//button[contains(.,'Avançar >')]")
	@FindBy(css = ".next-btn")
	protected WebElement btnAvancar;

	@FindBy(css = ".back-btn")
	protected WebElement btnVoltar;

	
	
	public void clickCadastrar() {
		btnSubmit.click();
	}

	public void clickBtnAvancar() {
		btnAvancar.click();
	}

	public void clickBtnVoltar() {
		btnVoltar.click();
	}

}
