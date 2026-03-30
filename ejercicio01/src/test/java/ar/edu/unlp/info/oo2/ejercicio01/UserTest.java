package ar.edu.unlp.info.oo2.ejercicio01;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

    private User user;

    @BeforeEach
    public void setUp(){
        user = new User ("Pablo");
    }

    @Test
    public void constructorAsignaScreennameCorrectamente() {
        assertEquals("Pablo", user.getScreenName());
    }

    
    @Test
    public void addTweetCorrectamente() {
        user.addTweet("a");
        assertEquals(1, user.getPosts().size());
    }


    @Test
    public void addRetweetCorrectamente() {
        user.addRetweet(new Tweet ("a"));
        assertEquals(1, user.getPosts().size());
    }


    @Test
    public void userNuevoSinPosts() {
        assertTrue(user.getPosts().isEmpty());
    }


    // Verificar polimorfismo?
    @Test
    public void addTweetAgregaInstanciaDeTweet() {
        user.addTweet("a");
        assertTrue(user.getPosts().get(0) instanceof Tweet);
    }

}