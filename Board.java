public class Board
{
    private static int pieces;
    private static int random;

    public static void populate()
    {
        pieces = 10 + (int)(Math.random() * ((50 - 10) + 1));
    }

    public static void pickPlayer()
    {
        random = 1 + (int)(Math.random() * ((2 - 1) + 1));
    }

    public static int getNumPieces()
    {
        System.out.println(pieces);
        return pieces;
    }

    public static void setNumPieces(int newPieces)
    {
        pieces = newPieces;
    }
    public static int getRandomPlayer()
    {
        System.out.println("Player " + random + " goes first");
        return random;
    }

    public static void removePieces(int takePieces)
    {
        Scanner sc = new Scanner(System.in);
        int minusPieces;

        while (true) {
            System.out.println("Enter how many pieces you would like to take (no more than half): ");
            try {
                minusPieces = sc.nextInt();

                if (minusPieces > 0 && minusPieces <= Board.getNumPieces() / 2) {
                    Board.setNumPieces(Board.getNumPieces() - minusPieces);
                    System.out.println("You removed " + minusPieces + " pieces.");
                    break;
                } else {
                    System.out.println("Invalid number. You must take at least 1 and no more than half of the remaining pieces.");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter another integer.");
                sc.next();
            }
        }
    }
}


