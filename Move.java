public abstract class Move {
    public abstract String getName();
    public abstract int attack(Rock r);
    public abstract int attack(Paper p);
    public abstract int attack(Scissors sc);
    public abstract int attack(Lizard l);
    public abstract int attack(Spock sp);
    public abstract int attack(Move m);
    /* attack returns
    1  -> player won
    0  -> player lost
    -1 -> draw/match
     */
}
