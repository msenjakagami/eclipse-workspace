/** Creates a checkerboardimage in a BMP file */
import java.io.FileOutputStream;
import java.io.IOException;
public class MakeBMP {
	public static void main(String[] args) {
		byte[] bmpHeader = {
				66, 77, //signature
				102, 6, 0, 0, //file size in bytes
				0, 0, 0, 0, //reserved (0)
				54, 0, 0, 0, //offset to imgdata
				40, 0, 0, 0, //header size (40)
				23, 0, 0, 0, //width (pixels)
				22, 0, 0, 0, //hight(pixels)
				1, 0, //planes (1)
				24, 0, //bits per pixel(1,4,8,24)
				0, 0, 0, 0, //compress (0=none,1=RLE8,2=RLE4)
				0, 0, 0, 0, //imgdata size
				(byte) 196, 14, 0, 0,//horizres pix/meter
				(byte) 196, 14, 0, 0,//vertres pix/meter
				0, 0, 0, 0, //# colors in image or 0
				0, 0, 0, 0, //# important colors or 0
		};
		try{
			FileOutputStream pic= new FileOutputStream("pic.bmp");
			//write header
			pic.write(bmpHeader);
			//write data -pixel data (r,g,b) (0-255)
			//every row needs to be a multiple of 4 bytes
			//(ie. add padding (22*(23*3+3) = 1584))
			int color = 0;
			for(int i = 0; i < 22; i++){ //rows
				for(int j = 0; j < 23; j++)
				{ //cols
					pic.write(color);
					pic.write(color);
					pic.write(color);
					if(i%2 == 0)//if(color == 0)
					{
						color = 255;
					} 
					else
					{
						color= 0;
					}
				}
				//pad 3 bytes
				pic.write(0);
				pic.write(0);
				pic.write(0);
			}
		} 
		catch(IOException e) {
			System.out.println( "Error processing file");
		}
		try{
			FileOutputStream pic= new FileOutputStream("img.bmp");
			//write header
			pic.write(bmpHeader);
			//write data -pixel data (r,g,b) (0-255)
			//every row needs to be a multiple of 4 bytes
			//(ie. add padding (22*(23*3+3) = 1584))
			int color = 0;
			for(int i = 0; i < 22; i++){ //rows
				for(int j = 0; j < 23; j++)
				{ //cols
					pic.write(color);
					pic.write(color);
					pic.write(color);
					if(j%2 == 0)//if(color == 0)
					{
						color = 255;
					} 
					else
					{
						color= 0;
					}
				}
				//pad 3 bytes
				pic.write(0);
				pic.write(0);
				pic.write(0);
			}
		} 
		catch(IOException e) {
			System.out.println( "Error processing file");
		}

	}

}
