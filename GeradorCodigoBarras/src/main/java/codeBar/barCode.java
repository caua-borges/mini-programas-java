package codeBar;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class barCode {
	public static void gerarCodigo() {
		try {
			String text = "Farofa"; // Código de barras a ser gerado
			String filePath = "/home/cauaborges/CodigoDeBarras/teste";
			int width = 600; // Largura da imagem
			int height = 140; // Altura da imagem
			String imageFormat = "png"; // Formato da imagem

			BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.CODE_39, width, height);
			Path path = FileSystems.getDefault().getPath(filePath);
			MatrixToImageWriter.writeToPath(bitMatrix, imageFormat, path);

			System.out.println("Código de barras gerado com sucesso.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}