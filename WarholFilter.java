import java.awt.Color; 
/**
 * The Warhol filter applies a green, red, and blue tint to the image. It
 * also makes the image a quarter of its original size. 
 *
 * @author Emily Lubonty
 * @version 4-20-2025
 */
public class WarholFilter extends Filter
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class WarholFilter
     * 
     * @param name Name of the filter
     */
    public WarholFilter(String name)
    {
        super(name); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight(); 
        int width = image.getWidth();  
        
        for (int y = 0; y < height; y++){
            for (int x = 0; x < width; x++) {
                Color pix = image.getPixel(x * 4, y * 4); 
                 
                
                int red = pix.getRed(); 
                int blue = pix.getBlue(); 
                int green = pix.getGreen(); 
                
                image.setPixel(x, y, new Color(red, green, blue));
                
            }
        }
        
    }
}
