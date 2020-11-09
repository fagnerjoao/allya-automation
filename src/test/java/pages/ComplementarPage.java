package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import runner.Driver;

public class ComplementarPage {
	
	public ComplementarPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//label[contains(.,'Você finalizou o cadastro básico.')]")
	protected WebElement txtSucessoCadast;


	public void verificarTxtSucessoCadast() {
		String txtEsperado = txtSucessoCadast.getText();
		Assert.assertEquals(txtEsperado, "Você finalizou o cadastro básico.Você finalizou o cadastro básico.");
	}

}
