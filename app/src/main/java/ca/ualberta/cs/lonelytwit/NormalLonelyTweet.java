package ca.ualberta.cs.lonelytwit;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {
	//Fix: narrowed down access from "public" to "private", only increase access as needed,
	//		most variables are only used by the class itself

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	// Fix: Simplified 'if' statement to make code more tidy
	public boolean isValid() {
		return tweetBody.trim().length() != 0
				&& tweetBody.trim().length() <= 10;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}

	private String getTweetBody() {
		return tweetBody;
	}
}