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
     * Applies the Warhol filter to the image
     *
     * @param image The image to be modified by the filter. 
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight() / 4; 
        int width = image.getWidth() / 4;
        
        for (int y = 0; y < height; y++){
            for (int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
            
                image.setPixel(x, y, image.getPixel(x, y));
                
            }
        }
        
    }
}
