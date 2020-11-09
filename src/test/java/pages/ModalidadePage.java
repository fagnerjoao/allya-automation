package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import runner.Driver;

public class ModalidadePage {

	public ModalidadePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(css = ".kind-square:nth-child(1)")
	protected WebElement cxslcModalidadeInternet;

	@FindBy(css = ".ng-dirty")
	protected WebElement inputCpf;

	@FindBy(css = ".ng-untouched")
	protected WebElement inputCnpj;

	public void clickCxslcModalidadeInternet() {
		cxslcModalidadeInternet.click();

	}

}
