public class Lizard extends Move{

    Lizard(){}

    public String getName(){ return "lizard"; }

    public void attack(Rock r){ System.out.println("Rock crushes lizard"); }
    public void attack(Paper p){ System.out.println("Paper is eaten by lizard"); }
    public void attack(Scissors sc){ System.out.println("Scissors injure lizard"); }
    public void attack(Lizard l){ System.out.println("Lizard matches lizard"); }
    public void attack(Spock sp){ System.out.println("Spock is poisoned by lizard"); }

    public void attack(Move m){
        m.attack(this);
    }
}
