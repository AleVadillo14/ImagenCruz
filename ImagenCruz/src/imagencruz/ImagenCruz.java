/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagencruz;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author alew_
 */
public class ImagenCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "C:/Users/alew_/Documents/NetBeansProjects/ImagenCruz/src/paisaje.jpg";
        try {
            BufferedImage img=ImageIO.read(new File(ruta));
            System.out.println("Ancho de la imágen: "+img.getWidth());
            System.out.println("Alto de la imágen: "+img.getHeight());
            int Wm=(img.getWidth()/2)-5;
            // int WM=img.getWidth();
            int Hm=(img.getHeight()/2)-5;
            // int HM=img.getHeight();
            // int x1=0;
            // int y1=0;
            Color nuevoColor= new Color(0,0,0);
            for(int x=0; x< img.getWidth();x++){
                //alto
                for(int y=0; y< img.getHeight();y++){
                    int rgb=img.getRGB(x, y);
                    Color color=new Color(rgb);

                    if (((x>Wm)&&(x<Wm+10))||((y>Hm)&&(y<Hm+10))){
                        img.setRGB(x, y, nuevoColor.getRGB());
                    }
                }
            }
            ImageIO.write(img, "jpeg",
            new File("C:/Users/alew_/Documents/NetBeansProjects/ImagenCruz/src/paisaje2.jpg"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
