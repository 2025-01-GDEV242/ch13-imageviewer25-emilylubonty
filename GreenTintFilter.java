import java.awt.Color; 
/**
 * The green tint filter applies a green tint to images. 
 *
 * @author Emily Lubonty
 * @version 4-20-2025
 */
public class GreenTintFilter extends Filter
{
    /**
     * Constructor for objects of class GreenTintFilter
     * 
     * @param name Name of the filter. 
     */
    public GreenTintFilter(String name)
    {
        super(name); 
    }

    /**
     * Apply the green tint filter to the image
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
                if (green <= 255) {
                    green = green; 
                }
                image.setPixel(x, y, new Color(127, green, 127)); 
            }
        }
    }
}