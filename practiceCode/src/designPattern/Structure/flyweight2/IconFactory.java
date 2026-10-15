package designPattern.Structure.flyweight2;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class IconFactory {
    private Map<String, Icon> iconCache = new HashMap<>();

    public Icon getIcon(String key) {
        // Check if the icon already exists in the cache
        if(iconCache.containsKey(key)){
            return iconCache.get(key);
        }else{
            // Create a new icon based on the key (type of icon)
            Icon icon;
            if(key.equals("file")){
                icon = new FileIcon("document", "doumnet.png");
            } else if (key.equals("folder")) {
                icon = new FolderIcon("blue", "folder.png");
            } else {
                throw new IllegalArgumentException("Unsupported icon type: " + key);
            }
            iconCache.put(key,icon);
            return icon;
        }

    }


}
