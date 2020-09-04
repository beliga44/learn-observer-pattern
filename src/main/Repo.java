package main;

public abstract class Repo {
	protected String name;
	
	public Repo(String name) {
		this.name = name;
	}

	public abstract void pushRepo(String message);

	public String getName() {
		return this.name;
	}
}
