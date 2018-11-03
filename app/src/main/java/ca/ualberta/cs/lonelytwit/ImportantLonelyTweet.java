package ca.ualberta.cs.lonelytwit;

import android.util.Log;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {
	//Fix: narrowed down access from "public" to "private", only increase access as needed,
	//		most variables are only used by the class itself

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
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
		String string = getTweetDate() + " | " + getTweetBody() ;
		Log.i("Important Tweet", string);
		return string;
	}

	private String getTweetBody() {
		return tweetBody.toUpperCase();
	}
}