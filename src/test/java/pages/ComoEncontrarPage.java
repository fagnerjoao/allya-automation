package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import runner.Driver;

public class ComoEncontrarPage {
	

		public ComoEncontrarPage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}

		@FindBy(name = "url")
		protected WebElement inputUrl;


		public void inputUrl(String url) {
			inputUrl.sendKeys(url);
		}

}
