package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import runner.Driver;

public class LocaisDeAtuacaoPage {

	public LocaisDeAtuacaoPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}


	public void selectLocal(String local) {
		WebElement localAtuacao = Driver.findElement(By.xpath("//label[contains(.,'"+local+"')]"));
		localAtuacao.click();
	}

}
