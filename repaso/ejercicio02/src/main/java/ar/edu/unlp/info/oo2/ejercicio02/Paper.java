package ar.edu.unlp.info.oo2.ejercicio02;

public class Paper extends Hand {

    @Override
    public Hand playAgainst(Hand other) {
        return other.playAgainstPaper(this);
    }

    @Override
    public Hand playAgainstPaper(Paper paper) {
        return null;
    }

    @Override
    public Hand playAgainstRock(Rock rock) {
        return this;
    }

    @Override
    public Hand playAgainstScissors(Scissors scissors) {
        return scissors;
    }

    @Override
    public Hand playAgainstSpock(Spock spock) {
       return this;
    }

    @Override
    public Hand playAgainstLizard(Lizard lizard) {
        return lizard;
    }
    
}
