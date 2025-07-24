package hangman.game;

import hangman.game.exception.LetterIsAlreadyInputtedException;
import hangman.game.model.HangmanGame;
import java.util.Scanner;
import hangman.game.exception.LetterIsAlreadyInputtedException;
import hangman.game.exception.GameIsFinishedException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangmanGame hangmanGame = new HangmanGame();

        System.out.println("Bem-vindo ao Jogo da Forca! Boa sorte!");

        while (true) {
            System.out.println("\nSelecione uma das opções:");
            System.out.println("1 - Informar uma letra");
            System.out.println("2 - Verificar status do jogo");
            System.out.println("3 - Sair do jogo");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Digite uma letra: ");
                    String letra = scanner.nextLine().toLowerCase();
                    if (letra.length() == 1) {
                        try {
                            hangmanGame.tentar(letra.charAt(0));
                        } catch (GameIsFinishedException | LetterIsAlreadyInputtedException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Digite apenas uma letra!");
                    }
                    break;

                case "2":
                    hangmanGame.exibirStatus();
                    break;
                case "3":
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }

            if (hangmanGame.jogoEncerrado()) {
                hangmanGame.exibirResultadoFinal();
                break;
            }
        }

        scanner.close();
    }
}
