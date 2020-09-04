package observer;

import java.util.Vector;

import main.GithubRepo;
import main.Repo;

public class RepoNotificationManager implements RepoNotificationPublisher <GithubSubscriber<Repo>, String> {

	private Vector<GithubSubscriber<Repo>> notificationSubscribers = new Vector<>();
	private Repo repo;
	
	public RepoNotificationManager(Repo repo) {
		this.repo = repo;
	}
	
	public void subscribe(GithubSubscriber<Repo> e) {
		notificationSubscribers.add(e);
	}
	
	public void broadcastToSubscriber(String message) {
		for (GithubSubscriber<Repo> subscriber : notificationSubscribers) {
			subscriber.update(repo, message);
		}
	}

	@Override
	public void broadcastToSubscriber() {}
}
