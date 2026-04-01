package ar.edu.unlp.info.oo2.ejercicio02;

public class Spock extends Hand {

    @Override
    public Hand playAgainst(Hand other) {
        return other.playAgainstSpock(this);
    }

    @Override
    public Hand playAgainstPaper(Paper paper) {
        return paper;
    }

    @Override
    public Hand playAgainstRock(Rock rock) {
        return this;
    }

    @Override
    public Hand playAgainstScissors(Scissors scissors) {
        return this;
    }

    @Override
    public Hand playAgainstSpock(Spock spock) {
        return null;
    }

    @Override
    public Hand playAgainstLizard(Lizard lizard) {
        return lizard;
    }

}
