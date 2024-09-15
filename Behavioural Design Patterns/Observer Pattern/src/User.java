
public class User implements IUser{

    String name;
    @Override
    public void getNotification(IChannel channel) {
        System.out.println("Channel: " + channel.getName() + 
        " has uploaded video: " + channel.getLatestVideo().getName());
        
    }

    @Override
    public void subscribeChannel(IChannel channel) {
        channel.addSubscriber(this);
    }

    @Override
    public void unSubscribeChannel(IChannel channel) {
        channel.removeSubscriber(this);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
    
}
