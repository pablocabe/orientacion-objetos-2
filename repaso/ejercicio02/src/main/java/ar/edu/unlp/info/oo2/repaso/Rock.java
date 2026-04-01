package ar.edu.unlp.info.oo2.repaso;

public class Rock extends Hand {

    @Override
    public Hand playAgainst(Hand other) {
        return other.playAgainstRock(this);
    }

    @Override
    public Hand playAgainstPaper(Paper paper) {
        return paper;
    }

    @Override
    public Hand playAgainstRock(Rock rock) {
        return null;
    }

    @Override
    public Hand playAgainstScissors(Scissors scissors) {
        return this;
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
