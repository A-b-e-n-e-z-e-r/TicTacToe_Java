package trialclass;

import java.util.*;


public class TicTacToe3 {

    public static ArrayList<Integer> AIPosition = new ArrayList<>();
    public static ArrayList<Integer> UserPosition = new ArrayList<>();

    public static void main(String[] args) {

        char X;
        char O;

        System.out.println("LETS PLAY SOME XO!");

        char[][] TicTacToe = {
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' }
        };

        while (true) {
            while (true) {
                Scanner in = new Scanner(System.in);

                System.out.println("Enter your placement (1-9)");
                int userposition = in.nextInt();
                while (UserPosition.contains(userposition) || AIPosition.contains(userposition)) {
                    System.out.println("Pick again, Place is taken");
                    userposition = in.nextInt();
                }

                Placing(TicTacToe, userposition, "Player");

                String EpicWinner = ChickenDinner();
                if (EpicWinner.length() > 0) {
                    System.out.println(EpicWinner);
                    break;

                }
                Random r = new Random();
                int AIposition = r.nextInt(9) + 1;
                while (UserPosition.contains(AIposition) || AIPosition.contains(AIposition)) {
                    AIposition = r.nextInt(9) + 1;
                }
                Placing(TicTacToe, AIposition, "AI");

                TicTacToeboard(TicTacToe);

                EpicWinner = ChickenDinner();
                if (EpicWinner.length() > 0) {

                }
                System.out.println(EpicWinner);
                break;
            }
        }
    }

    public static char[][] TicTacToeboard(char[][] TicTacToe) {

        
            for (int r = 0; r < TicTacToe.length; r++) {
                for (int c = 0; c < TicTacToe[r].length; c++) {
                    System.out.print(TicTacToe[r][c] + "  ");
                }
                System.out.println();
            }
            return TicTacToe;
        }
    

    public static void Placing(char[][] TicTacToe, int position, String userInput) {

        char symbol = ' ';

        if (userInput.equals("Player")) {
            symbol = 'X';
            UserPosition.add(position);
        } else if (userInput.equals("AI")) {
            symbol = 'O';
            AIPosition.add(position);

        }

        if (position == 1) {
            System.out.println(TicTacToe[0][0] = symbol);
        } else if (position == 2) {
            System.out.println(TicTacToe[0][2] = symbol);
        } else if (position == 3) {
            System.out.println(TicTacToe[0][4] = symbol);
        } else if (position == 4) {
            System.out.println(TicTacToe[2][0] = symbol);
        } else if (position == 5) {
            System.out.println(TicTacToe[2][2] = symbol);
        } else if (position == 6) {
            System.out.println(TicTacToe[2][4] = symbol);
        } else if (position == 7) {
            System.out.println(TicTacToe[4][0] = symbol);
        } else if (position == 8) {
            System.out.println(TicTacToe[4][2] = symbol);
        } else if (position == 9) {
            System.out.println(TicTacToe[4][4] = symbol);
        }

    }

    // ArrayLists of Lists (Winner Conditions),
    public static String ChickenDinner() {

        List Rowup = Arrays.asList(1, 2, 3);
        List RowCenter = Arrays.asList(4, 5, 6);
        List RowDown = Arrays.asList(7, 8, 9);
        List leftcolumn = Arrays.asList(1, 4, 7);
        List CenterColumn = Arrays.asList(2, 5, 8);
        List rightcolumn = Arrays.asList(3, 6, 9);
        List diag1 = Arrays.asList(1, 5, 9);
        List diag2 = Arrays.asList(7, 5, 3);

        List<List> W = new ArrayList<>();
        W.add(Rowup);
        W.add(RowCenter);
        W.add(RowDown);
        W.add(leftcolumn);
        W.add(CenterColumn);
        W.add(rightcolumn);
        W.add(diag1);
        W.add(diag2);

        for (List l : W) {
            if (UserPosition.containsAll(l)) {
                return "Congrats You've Won!";
            } else if (AIPosition.containsAll(l)) {
                return "Nice Try Maybe Next Time!";
            } else if (UserPosition.size() + AIPosition.size() == 9) {
                return "STALEMATE";
            }
        }
        return "";

    }

}
