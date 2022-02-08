public class Spock extends Move{

    Spock(){}

    public String getName(){ return "spock"; }

    public void attack(Rock r){ System.out.println("Rock is vapourised by Spock"); }
    public void attack(Paper p){ System.out.println("Paper disproves Spock"); }
    public void attack(Scissors sc){ System.out.println("Scissors are smashed by Spock"); }
    public void attack(Lizard l){ System.out.println("Lizard poisons Spock"); }
    public void attack(Spock sp){ System.out.println("Spock matches Spock"); }

    public void attack(Move m){
        m.attack(this);
    }
}
