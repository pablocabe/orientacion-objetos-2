package ar.edu.unlp.info.oo2.repaso;

public abstract class Hand {

    public abstract Hand playAgainst(Hand other);

    public abstract Hand playAgainstPaper(Paper paper);

    public abstract Hand playAgainstRock(Rock rock);

    public abstract Hand playAgainstScissors(Scissors scissors);

    public abstract Hand playAgainstSpock(Spock spock);

    public abstract Hand playAgainstLizard(Lizard lizard);
    
}
