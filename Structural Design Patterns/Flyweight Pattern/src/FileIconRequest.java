public class FileIconRequest extends IconRequest{
    String type;
    Image image;
    @Override
    public <T> T accept(IconRequest.IconRequestVisitor<T> iconRequestVisitor) {
        return iconRequestVisitor.visitFile(this);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }
    public FileIconRequest(String type, Image image) {
        super(IconType.FILE);
        this.type = type;
        this.image = image;
    }
}
