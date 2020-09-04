package observer;

public interface GithubSubscriber<T> extends Subscriber<T> {
	void update(T obj, String message);
}
