package hangman.game.model;

public class HangmanChar {

    public static void exibir(int erros) {
        String[] forca = new String[]{
                "+---+\n    |\n    |\n    |\n   ===",
                "+---+\n O  |\n    |\n    |\n   ===",
                "+---+\n O  |\n |  |\n    |\n   ===",
                "+---+\n O  |\n/|  |\n    |\n   ===",
                "+---+\n O  |\n/|\\ |\n    |\n   ===",
                "+---+\n O  |\n/|\\ |\n/   |\n   ===",
                "+---+\n O  |\n/|\\ |\n/ \\ |\n   ==="
        };
        System.out.println(forca[erros]);
    }
}
