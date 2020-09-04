package observer;

import main.GithubRepo;
import main.Repo;

public class SlackNotification implements GithubSubscriber<Repo> {

	public SlackNotification() {
		
	}

	@Override
	public void update(Repo obj, String message) {
		System.out.println("There's Slack Message \"" + message + "\" " + "from repo:" + " " + obj.getName());
	}

	@Override
	public void update(Repo obj) {}

}
