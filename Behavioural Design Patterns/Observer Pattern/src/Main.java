public class Main {
    public static void main(String[] args) throws Exception {
        
        IChannel shibajiExplorerChannel = new ExplorerChannel("Shibaji Explorer Channel");

        Video kashmirVideo = new Video("Kashmir");
        Video rajasthanVideo = new Video("Rajasthan");
        Video sikkimVideo = new Video("Sikkim");
        Video himachalVideo = new Video("Himachal");

        shibajiExplorerChannel.uploadVideo(kashmirVideo);

        IUser rohit = new User("Rohit");
        IUser rahul = new User("Rahul");
        IUser shobha = new User("Shobha");
        IUser rajesh = new User("Rajesh");

        rohit.subscribeChannel(shibajiExplorerChannel);
        rahul.subscribeChannel(shibajiExplorerChannel);

        shibajiExplorerChannel.uploadVideo(kashmirVideo);
        shibajiExplorerChannel.uploadVideo(rajasthanVideo);

        shobha.subscribeChannel(shibajiExplorerChannel);
        rohit.unSubscribeChannel(shibajiExplorerChannel);

        shibajiExplorerChannel.uploadVideo(sikkimVideo);

        rajesh.subscribeChannel(shibajiExplorerChannel);

        shibajiExplorerChannel.uploadVideo(himachalVideo);

    }
}
