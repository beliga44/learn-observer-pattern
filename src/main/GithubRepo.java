package main;

public class GithubRepo extends Repo {
	
	public GithubRepo(String name) {
		super(name);
	}

	@Override
	public void pushRepo(String message) {
		System.out.println("Pushing " + this.name +  " Repo to Origin");
	}
}
