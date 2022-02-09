public class Paper extends Move{

    Paper(){}

    public String getName(){ return "paper"; }

    public int attack(Rock r){ System.out.println("Rock is covered by paper"); return 0; }
    public int attack(Paper p){ System.out.println("Paper matches paper"); return -1; }
    public int attack(Scissors sc){ System.out.println("Scissors cut paper"); return 1; }
    public int attack(Lizard l){ System.out.println("Lizard eats paper"); return 1; }
    public int attack(Spock sp){ System.out.println("Spock is disproved by paper"); return 0; }

    public int attack(Move m){
        return m.attack(this);
    }
}
