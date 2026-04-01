package ar.edu.unlp.info.oo2.repaso;

public class Retweet extends Post{

    private Tweet originalTweet;

    public Retweet(Tweet originalTweet){
        if (originalTweet == null)
            throw new IllegalArgumentException("El tweet original no puede ser null");
        this.originalTweet = originalTweet;
    }

    @Override
    public String getText() {
        return this.originalTweet.getText();
    }
    
}
