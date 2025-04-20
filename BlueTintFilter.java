import java.awt.Color; 
/**
 * The blue tint filter applies a blue tint to images. 
 *
 * @author Emily Lubonty
 * @version 4-20-2025
 */
public class BlueTintFilter extends Filter
{
    /**
     * Constructor for objects of class BlueTintFilter
     * 
     * @param name Name of the filter. 
     */
    public BlueTintFilter(String name)
    {
        super(name); 
    }

    /**
     * Apply the blue tint filter to the image
     *
     * @param image Image to be modified by the filter. 
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
                if (blue <= 255) {
                    blue = blue; 
                }
                image.setPixel(x, y, new Color(127, 127, blue)); 
            }
        }
    }
}