import javax.swing.*;
import java.net.URL;

public class ImageData {
    private static final URL headUrl = ImageData.class.getResource("/static/head.png");
    private static final URL bodyUrl = ImageData.class.getResource("/static/body.png");
    private static final URL foodUrl = ImageData.class.getResource("/static/food.png");

    public static ImageIcon headIcon = new ImageIcon(headUrl);
    public static ImageIcon bodyIcon = new ImageIcon(bodyUrl);
    public static ImageIcon foodIcon = new ImageIcon(foodUrl);
}
