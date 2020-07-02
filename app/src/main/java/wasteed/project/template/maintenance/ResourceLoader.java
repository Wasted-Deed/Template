package wasteed.project.template.maintenance;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.HashMap;

import wasteed.project.template.R;

public class ResourceLoader {
    private static HashMap<Image, Bitmap> resourceMap;

    public enum Image {
        IMAGE_0
    }

    public static void loadResources(Resources resources) {
        resourceMap = new HashMap<>();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        //resourceMap.put(Image.IMAGE_0, BitmapFactory.decodeResource(resources,
        //        R.drawable./*bitmap name*/, options));
    }

    public static Bitmap getBitmap(Image image) {
        return resourceMap.get(image);
    }
}
