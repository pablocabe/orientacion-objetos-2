package ar.edu.unlp.info.oo2.repaso;

class RetweetTest {

    @Test
    public void retweetDevuelveOriginalTweet() {
        Tweet originalTweet = new Tweet ("a");
        Retweet retweet = new Retweet (originalTweet);
        assertEquals (tweet.getText(), retweet.getText());
    }


    @Test
    public void retweetConNuloLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new Retweet(null));
    }
}