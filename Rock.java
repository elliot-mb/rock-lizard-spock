public class Rock extends Move{

    Rock(){}

    public String getName(){ return "rock"; }

    public void attack(Rock r){ System.out.println("Rock matches rock"); }
    public void attack(Paper p){ System.out.println("Paper covers rock"); }
    public void attack(Scissors sc){ System.out.println("Scissors are smashed by rock"); }
    public void attack(Lizard l){ System.out.println("Lizard is crushed by rock"); }
    public void attack(Spock sp){ System.out.println("Spock vapourises rock"); }

    public void attack(Move m){
        m.attack(this);
    }
}
