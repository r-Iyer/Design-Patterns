public abstract class IconRequest {
    private final IconType iconType;
    abstract <T> T accept(IconRequestVisitor<T> iconRequestVisitor);
    public interface IconRequestVisitor<T> {
        T visitFile(FileIconRequest fileIconRequest);
        T visitFolder(FolderIconRequest folderIconRequest);
    }
    protected IconRequest(IconType iconType) {
        this.iconType = iconType;
    }
    public IconType getIconType() {
        return iconType;
    }
}
