import java.util.LinkedList;
import java.util.List;

public class ExplorerChannel implements IChannel{
    String name;
    List<IUser> subscribers = new LinkedList<>();
    List<Video> videos = new LinkedList<>();

    @Override
    public List<IUser> getSubscribers() {
        return subscribers;
        
    }
    @Override
    public void uploadVideo(Video video) {
        System.out.println("Uploading video..." + video.getName());
        videos.add(video);
        pushNotification();
    }
    @Override
    public void deleteVideo(Video video) {
        System.out.println("Removing video...");
        videos.remove(video);
    }
    @Override
    public void pushNotification() {
        System.out.println("Sending notification to all subscrivers..");
        for(IUser subsriber : subscribers) {
            System.out.println("Sending notification to " + subsriber.getName());
            subsriber.getNotification(this);
        }
        System.out.println("Sending notification completed.\n");
    }
    @Override
    public void addSubscriber(IUser user) {
        System.out.println("Added subsriber "+ user.getName());
        subscribers.add(user);
    }
    @Override
    public void removeSubscriber(IUser user) {
        System.out.println("Removed subsriber "+ user.getName());
        subscribers.remove(user);
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public Video getLatestVideo() {
        return videos.getLast();
    }
    public ExplorerChannel(String name) {
        this.name = name;
    }
}
