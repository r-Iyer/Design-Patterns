public class Main {
    public static void main(String[] args) throws Exception {
        MultimediaFacade iMultimediaFacade = new MultimediaFacade();
        IMultimedia image = new Image();
        IMultimedia video = new Video();
        IMultimedia audio = new Audio();
        iMultimediaFacade.retrieveMultimedia(image);
        iMultimediaFacade.retrieveMultimedia(audio);
        iMultimediaFacade.retrieveMultimedia(video);
    }
}
