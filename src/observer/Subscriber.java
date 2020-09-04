package observer;

import main.GithubRepo;

public interface Subscriber <T> {
	void update(T obj);
}
