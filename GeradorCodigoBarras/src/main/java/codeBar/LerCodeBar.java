package codeBar;

import java.io.File;

import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class LerCodeBar {

	public static void lerCodigo() {

		try {
			File file = new File("/home/cauaborges/CodigoDeBaras/teste");
			BinaryBitmap binaryBitmap = new BinaryBitmap(
					new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(file))));
			Result result = new MultiFormatReader().decode(binaryBitmap);
			System.out.println("Conteúdo do código de barras: " + result.getText());
		} catch (Exception e) {
			System.err.println("Erro ao ler o código de barras: " + e);
		}
	}
}