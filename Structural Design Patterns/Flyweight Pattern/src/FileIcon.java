public class FileIcon implements Icon{
    String type; //type of file icon - e.g document, image
    Image image; // image of the icon
    @Override
    public void displayIcon(Coordinates coordinates) {
        System.out.println("Folder Icon of type: " + this.type
            + " displayed at coordinates "+ coordinates.x_coordinate
            + "," + coordinates.y_coordinate);
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
}
