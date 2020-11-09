package tools;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.support.PageFactory;

import runner.Driver;

public class CapturarTela {

	public CapturarTela() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	Datas gerarData = new Datas();

	public void capturaTela() throws HeadlessException, AWTException, IOException {

		Robot robotObject = new Robot();

		// Obtem os detalhes do tamanho da tela
		Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

		// Captura imagem da tela
		BufferedImage tmp = robotObject.createScreenCapture(screenSize);

		// Fornece os detalhes do caminho para copiar a captura de tela
		String path = "/Users/fagner.joao.f.silva/Desktop/TestCase/testStep_ID" + System.currentTimeMillis() + ".jpg";

		// Copia a imagem para o caminho de destino
		ImageIO.write(tmp, "jpg", new File(path));

	}

}
