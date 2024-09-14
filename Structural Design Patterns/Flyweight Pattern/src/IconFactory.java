
import java.util.HashMap;
import java.util.Map;

public class IconFactory {
    Map<IconType,Icon> iconObjCache = new HashMap<>();

    Icon getIcon(IconType iconType) {
        Icon icon;
        if(iconObjCache.containsKey(iconType))
            return iconObjCache.get(iconType);
        icon = switch(iconType) {
            case FILE -> new FileIcon();
            case FOLDER -> new FolderIcon();
        };
        iconObjCache.put(iconType, icon);
        return icon;
    }
}
