import java.awt.Color; 
/**
 * The red tint filter applies a red tint to images. 
 *
 * @author Emily Lubonty
 * @version 4-20-2025
 */
public class RedTintFilter extends Filter
{
    /**
     * Constructor for objects of class RedTintFilter
     */
    public RedTintFilter(String name)
    {
        // initialise instance variables
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
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                Color pix = image.getPixel(x,y);
                int red = pix.getRed(); 
                int blue = pix.getBlue(); 
                int green = pix.getGreen(); 
                if (red <= 255) {
                    red = red; 
                    
                }
                image.setPixel(x, y, new Color(red, 127, 127)); 
            }
        }
    }
}
