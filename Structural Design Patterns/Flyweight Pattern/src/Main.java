public class Main {
    public static void main(String[] args) throws Exception {

        Image image = new Image("filename");
        Coordinates coordinates1 = new Coordinates(1,1);
        Coordinates coordinates2 = new Coordinates(2,2);
        Coordinates coordinates3 = new Coordinates(3,3);
        
        IconController iconController = new IconController();

        IconRequest folderIconRequest = new FolderIconRequest("blue", image);
        IconRequest fileIconRequest = new FileIconRequest("document", image);

        Icon icon1 = iconController.getIcon(fileIconRequest);
        icon1.displayIcon(coordinates1);

        Icon icon2 = iconController.getIcon(folderIconRequest);
        
        icon2.displayIcon(coordinates2);

        Icon icon3 = iconController.getIcon(fileIconRequest);
        icon3.displayIcon(coordinates3);

        if(icon1 == icon3)
            System.out.println("Icon 1 and Icon 3 are one and the same object!");
    }
}
