package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import runner.Driver;

public class CategoriaPage {
	
	public CategoriaPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//span[contains(.,'Selecione uma categoria')]")
	protected WebElement btnCategoria;



	public void selectCategoria(String categoria) {
		// WebElement listaCategoria = Driver.findElement(By.xpath("cheese"));
		Select dropdown = new Select(btnCategoria);
		dropdown.selectByValue(categoria);
	}



}
