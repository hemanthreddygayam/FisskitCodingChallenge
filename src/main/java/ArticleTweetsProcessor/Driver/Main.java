package ArticleTweetsProcessor.Driver;
import ArticleTweetsProcessor.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String url = "http://www.washingtonexaminer.com/report-trump-exhausted-bewildered/article/2599287";
        Handles handles = new Handles();
        TweetHandler tweetshandles = handles.getHandles(url);
        System.out.println(tweetshandles.getNumberOfHandles());
        System.out.println(tweetshandles.getAuthorHandle());
        System.out.println(tweetshandles.getTweetHandles());
    }
}
