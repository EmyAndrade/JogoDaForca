package hangman.game.exception;

public class LetterIsAlreadyInputtedException extends RuntimeException {
    public LetterIsAlreadyInputtedException(char letra) {
        super("A letra '" + letra + "' já foi informada.");
    }
}
