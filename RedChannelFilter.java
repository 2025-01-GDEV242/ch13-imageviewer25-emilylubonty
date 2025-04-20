import java.awt.Color; 

/**
 * The red channel filter makes pictures with a high red value appear lighter.
 *
 * @author Emily Lubonty
 * @version 4-20-2025
 */
public class RedChannelFilter extends Filter
{

    /**
     * Constructor for objects of class RedChannelFilter
     * 
     * @param name The name of the filter
     */
    public RedChannelFilter(String name)
    {
        // initialise instance variables
        super(name);
    }
    
    /**
     * Applies red channel filter to an image.
     * 
     * @param image Image to be modified by the filter. 
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                Color pix = image.getPixel(x, y);
                int redAvg = (pix.getRed()) / 1; 
                image.setPixel(x, y, new Color(redAvg, redAvg, redAvg)); 
            }
        }
    }
    

}
