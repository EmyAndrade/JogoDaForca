package hangman.game.exception;

public class GameIsFinishedException extends RuntimeException {
    public GameIsFinishedException() {
        super("O jogo já foi encerrado!");
    }
}
