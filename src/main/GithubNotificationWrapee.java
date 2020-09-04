package main;

import observer.RepoNotificationManager;

public class GithubNotificationWrapee extends GithubRepo {
	
	private RepoNotificationManager repoNotificationManager; 
	private Repo repo;
	
	public GithubNotificationWrapee(String name) {
		super(name);
	}
	
	public GithubNotificationWrapee(Repo repo, RepoNotificationManager repoNotificationManager) {
		super(repo.getName());
		this.repo = repo;
		this.repoNotificationManager = repoNotificationManager;
	}

	public void pushRepo(String message) {
		super.pushRepo(message);
		this.repoNotificationManager.broadcastToSubscriber(message);
	}

}
