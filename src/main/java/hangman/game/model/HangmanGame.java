package hangman.game.model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import hangman.game.exception.GameIsFinishedException;
import hangman.game.exception.LetterIsAlreadyInputtedException;

public class HangmanGame {
    private static final String[] PALAVRAS = {"java", "computador", "programacao", "teclado", "desafio"};
    private static final int MAX_TENTATIVAS = 6;

    private final String palavraSecreta;
    private final Set<Character> letrasCorretas = new HashSet<>();
    private final Set<Character> letrasErradas = new HashSet<>();

    public HangmanGame() {
        this.palavraSecreta = PALAVRAS[new Random().nextInt(PALAVRAS.length)];
    }

    public void tentar(char letra) {
        if (jogoEncerrado()) {
            throw new GameIsFinishedException();
        }

        if (letrasCorretas.contains(letra) || letrasErradas.contains(letra)) {
            throw new LetterIsAlreadyInputtedException(letra);
        }

        if (palavraSecreta.indexOf(letra) >= 0) {
            letrasCorretas.add(letra);
            System.out.println("Boa! A letra está na palavra.");
        } else {
            letrasErradas.add(letra);
            System.out.println("Ops! Essa letra não está na palavra.");
        }

        exibirStatus();
    }


    public void exibirStatus() {
        System.out.print("Palavra: ");
        for (char c : palavraSecreta.toCharArray()) {
            if (letrasCorretas.contains(c)) {
                System.out.print(c + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println("\nErros: " + letrasErradas);
        System.out.println("Tentativas restantes: " + (MAX_TENTATIVAS - letrasErradas.size()));
        HangmanChar.exibir(letrasErradas.size());
    }

    public boolean jogoEncerrado() {
        return letrasErradas.size() >= MAX_TENTATIVAS || venceu();
    }

    public void exibirResultadoFinal() {
        if (venceu()) {
            System.out.println("Parabéns! Você venceu!");
        } else {
            System.out.println("Você perdeu. A palavra era: " + palavraSecreta);
        }
    }

    private boolean venceu() {
        for (char c : palavraSecreta.toCharArray()) {
            if (!letrasCorretas.contains(c)) {
                return false;
            }
        }
        return true;
    }
}

