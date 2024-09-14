public class IconRequestVisitorImplDummy implements IconRequest.IconRequestVisitor<Icon>{
    private final IconFactory iconFactory = new IconFactory();
    @Override
    public Icon visitFile(FileIconRequest fileIconRequest) {
        FileIcon icon = ((FileIcon)iconFactory.getIcon(fileIconRequest.getIconType()));
        icon.setType(fileIconRequest.getType());
        icon.setImage(fileIconRequest.getImage());
        return icon;
    }
    @Override
    public Icon visitFolder(FolderIconRequest folderIconRequest) {
        FolderIcon icon = ((FolderIcon)iconFactory.getIcon(folderIconRequest.getIconType()));
        icon.setColor(folderIconRequest.getColor());
        icon.setImage(folderIconRequest.getImage());
        return icon;
    }
}
