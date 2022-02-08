public abstract class Move {
    public abstract String getName();
    public abstract void attack(Rock r);
    public abstract void attack(Paper p);
    public abstract void attack(Scissors sc);
    public abstract void attack(Lizard l);
    public abstract void attack(Spock sp);
    public abstract void attack(Move m);
}
