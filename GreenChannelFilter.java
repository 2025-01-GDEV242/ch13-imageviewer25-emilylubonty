import java.awt.Color; 

/**
 * The green channel filter makes pictures with a high green value appear lighter.
 *
 * @author Emily Lubonty
 * @version 4-20-2025
 */
public class GreenChannelFilter extends Filter
{

    /**
     * Constructor for objects of class GreenChannelFilter
     * 
     * @param name The name of the filter
     */
    public GreenChannelFilter(String name)
    {
        // initialise instance variables
        super(name);
    }
    
    /**
     * Applies green channel filter to an image.
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
                int greenAvg = (pix.getGreen()) / 1; 
                image.setPixel(x, y, new Color(greenAvg, greenAvg, greenAvg)); 
            }
        }
    }
    

}
