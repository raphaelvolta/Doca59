package org.doca59;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CustomFileLoader {
	
	//"PRODUCT_SANS_REGULAR.TTF"
	public Font loadFont(String fileName) {
		Font font = null;
		try {
			InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
			font = Font.createFont(Font.TRUETYPE_FONT, inputStream);
			if(Objects.isNull(inputStream))
				throw new NullPointerException();
		} catch (FontFormatException | IOException | NullPointerException e) {
			e.printStackTrace();
		}
		return font;
	}
	
	//"logo_temporario.png"
	public JLabel loadImage(String fileName, int width, int height) {
		JLabel jLabel = null;
		try {
			BufferedImage loginLogo = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(fileName));		
	        BufferedImage outputImage = new BufferedImage(width, height, loginLogo.getType());
			Graphics2D g2d = outputImage.createGraphics();
	        g2d.drawImage(loginLogo, 0, 0, width, height, null);
	        g2d.dispose();
			jLabel = new JLabel(new ImageIcon(outputImage));
			jLabel.setSize(width, height);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jLabel;
	}
	
}
