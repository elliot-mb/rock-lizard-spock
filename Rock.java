public class Rock extends Move{

    Rock(){}

    public String getName(){ return "rock"; }

    public int attack(Rock r){ System.out.println("Rock matches rock"); return -1; }
    public int attack(Paper p){ System.out.println("Paper covers rock"); return 1; }
    public int attack(Scissors sc){ System.out.println("Scissors are smashed by rock"); return 0; }
    public int attack(Lizard l){ System.out.println("Lizard is crushed by rock"); return 0; }
    public int attack(Spock sp){ System.out.println("Spock vapourises rock"); return 1; }

    public int attack(Move m){
        return m.attack(this);
    }

}
