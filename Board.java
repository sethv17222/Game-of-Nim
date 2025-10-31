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
                minusPieces = sc.nextInt;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter another integer(must be half or less than total)");
                sc.next();
            }
        }

        System.out.println("You entered " + minusPieces);
        sc.close();
    }
}

