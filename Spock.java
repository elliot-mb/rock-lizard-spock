public class Spock extends Move{

    Spock(){}

    public String getName(){ return "spock"; }

    public int attack(Rock r){ System.out.println("Rock is vapourised by Spock"); return 0; }
    public int attack(Paper p){ System.out.println("Paper disproves Spock"); return 1; }
    public int attack(Scissors sc){ System.out.println("Scissors are smashed by Spock"); return 0; }
    public int attack(Lizard l){ System.out.println("Lizard poisons Spock"); return 1; }
    public int attack(Spock sp){ System.out.println("Spock matches Spock"); return -1; }

    public int attack(Move m){ return m.attack(this); }
}
