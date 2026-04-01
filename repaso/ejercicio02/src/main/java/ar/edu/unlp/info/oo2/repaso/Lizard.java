package ar.edu.unlp.info.oo2.repaso;

public class Lizard extends Hand {

    @Override
    public Hand playAgainst(Hand other) {
        return other.playAgainstLizard(this);
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
        return scissors;
    }

    @Override
    public Hand playAgainstSpock(Spock spock) {
        return this;
    }

    @Override
    public Hand playAgainstLizard(Lizard lizard) {
        return null;
    }

}
