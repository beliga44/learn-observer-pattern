package observer;

import main.Repo;

public interface Publisher<T> {
	void subscribe(T obj);
	void broadcastToSubscriber();
}
