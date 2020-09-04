package observer;

import main.GithubRepo;
import main.Repo;

public class TelegramNotification implements GithubSubscriber<Repo> {

	public TelegramNotification() {
	}

	@Override
	public void update(Repo obj) {}

	@Override
	public void update(Repo obj, String message) {
		System.out.println("There's Telegram Message \"" + message + "\" " + "from repo:" + " " + obj.getName());
	}

}
