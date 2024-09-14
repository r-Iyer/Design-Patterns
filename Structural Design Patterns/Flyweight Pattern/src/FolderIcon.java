public class FolderIcon implements Icon{
    String color; //type of file icon - e.g document, image
    Image image; // image of the icon
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }
    @Override
    public void displayIcon(Coordinates coordinates) {
        System.out.println("File Icon of color: " + this.color
            + " displayed at coordinates "+ coordinates.x_coordinate
            + "," + coordinates.y_coordinate);
    }
}
