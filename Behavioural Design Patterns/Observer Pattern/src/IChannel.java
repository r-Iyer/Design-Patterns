import java.util.List;

public interface IChannel {
    String getName();
    void uploadVideo(Video video);
    void deleteVideo(Video video);
    void pushNotification();
    Video getLatestVideo();
    void addSubscriber(IUser user);
    void removeSubscriber(IUser user);
    List<IUser> getSubscribers();
}
