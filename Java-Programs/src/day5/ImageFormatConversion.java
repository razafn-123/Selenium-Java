package day5;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageFormatConversion {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://png.pngtree.com/background/20210711/original/pngtree-520-fresh-flower-e-commerce-promotion-poster-background-picture-image_1097500.jpg");
		
			BufferedImage buffImage = ImageIO.read(url);
			
			ImageIO.write(buffImage, "png", new File("C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\images.png"));
			ImageIO.write(buffImage, "bmp", new File("C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\images.bmp"));
			ImageIO.write(buffImage, "gif", new File("C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\images.gif"));
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
