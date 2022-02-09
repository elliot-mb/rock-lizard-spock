public class Lizard extends Move{

    Lizard(){}

    public String getName(){ return "lizard"; }

    public int attack(Rock r){ System.out.println("Rock crushes lizard"); return 1; }
    public int attack(Paper p){ System.out.println("Paper is eaten by lizard"); return 0; }
    public int attack(Scissors sc){ System.out.println("Scissors injure lizard"); return 1; }
    public int attack(Lizard l){ System.out.println("Lizard matches lizard"); return -1; }
    public int attack(Spock sp){ System.out.println("Spock is poisoned by lizard"); return 0; }

    public int attack(Move m){
        return m.attack(this);
    }
}
