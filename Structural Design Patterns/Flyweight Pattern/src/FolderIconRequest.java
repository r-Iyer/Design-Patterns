public class FolderIconRequest extends IconRequest{
    String color;
    Image image;
    @Override
    public <T> T accept(IconRequest.IconRequestVisitor<T> iconRequestVisitor) {
        return iconRequestVisitor.visitFolder(this);
    }
    public String getColor() {
        return color;
    }
    public void setType(String color) {
        this.color = color;
    }
    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }
    public FolderIconRequest(String color, Image image) {
        super(IconType.FOLDER);
        this.color = color;
        this.image = image;
    }
}
