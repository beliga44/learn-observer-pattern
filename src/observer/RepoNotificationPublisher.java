package observer;

public interface RepoNotificationPublisher<T, E> extends Publisher<T> {
	void subscribe(T obj);
	void broadcastToSubscriber(E message);
}
