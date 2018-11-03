package ca.ualberta.cs.lonelytwit;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public abstract class LonelyTweet implements Serializable {
    //Fix: narrowed down access from "public" to "private", only increase access as needed,
    //		most variables are only used by the class itself
    private static final long serialVersionUID = 1L;
    Date tweetDate;
    String tweetBody;

    Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public abstract boolean isValid();
}
