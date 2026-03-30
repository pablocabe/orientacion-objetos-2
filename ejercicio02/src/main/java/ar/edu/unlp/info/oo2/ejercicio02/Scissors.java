package ar.edu.unlp.info.oo2.ejercicio02;

public class Scissors extends Hand {

    @Override
    public Hand playAgainst(Hand other) {
        return other.playAgainstScissors(this);
    }

    @Override
    public Hand playAgainstPaper(Paper paper) {
        return this;
    }

    @Override
    public Hand playAgainstRock(Rock rock) {
        return rock;
    }

    @Override
    public Hand playAgainstScissors(Scissors scissors) {
        return null;
    }

    @Override
    public Hand playAgainstSpock(Spock spock) {
        return spock;
    }

    @Override
    public Hand playAgainstLizard(Lizard lizard) {
        return this;
    }
    
}
