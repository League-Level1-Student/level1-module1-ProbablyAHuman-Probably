package _07_duck;

public class Duck {

	int numberOfFriends;

	String favoriteFood;

	void quack() {
		System.out.println("awww!! look at that cute widdly ducky make such a cutesy widdle "
				+ "contented quack after its done feasting on " + favoriteFood + "!!");

	}

	void waddle() {
		System.out.println("and now look at him cutely waddle and be joined by his cutesy widdle "
				+ numberOfFriends + " quintillion bloodthirsty terrorist friends!!");

	}

	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

}
