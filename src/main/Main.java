package main;
import observer.RepoNotificationManager;
import observer.SlackNotification;
import observer.TelegramNotification;

public class Main {
	
	public Main() {
		SlackNotification slackNotification = new SlackNotification();
		TelegramNotification telegramNotification = new TelegramNotification();
		
		GithubRepo learnObserverRepo = new GithubRepo("learn-observer-pattern");
		RepoNotificationManager repoNotificationManager = new RepoNotificationManager(learnObserverRepo);
		learnObserverRepo = new GithubNotificationWrapee(learnObserverRepo, repoNotificationManager);
		
		repoNotificationManager.subscribe(slackNotification);
		repoNotificationManager.subscribe(telegramNotification);
		
		learnObserverRepo.pushRepo("PUSH");
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}
