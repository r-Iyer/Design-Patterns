public interface IUser {
    String getName();
    void getNotification(IChannel channel);
    void subscribeChannel(IChannel channel);
    void unSubscribeChannel(IChannel channel);
}
