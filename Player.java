public class Player
{
    private String name = "";
    private int score;
    private boolean autoPlay;

    public Player(String name, boolean autoPlay)
    {
        this.name = name;
        this.autoPlay = autoPlay;
        System.out.println("Welcome " + name);
    }

    public int takeTurn()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    public String getName()
    {
        return name;
    }

    public void incrScore()
    {
        score += 1;
    }
}
