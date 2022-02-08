public class Paper extends Move{

    Paper(){}

    public String getName(){ return "paper"; }

    public void attack(Rock r){ System.out.println("Rock is covered by paper"); }
    public void attack(Paper p){ System.out.println("Paper matches paper"); }
    public void attack(Scissors sc){ System.out.println("Scissors cut paper"); }
    public void attack(Lizard l){ System.out.println("Lizard eats paper"); }
    public void attack(Spock sp){ System.out.println("Spock is disproved by paper"); }

    public void attack(Move m){
        m.attack(this);
    }
}
