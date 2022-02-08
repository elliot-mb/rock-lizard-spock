public class Scissors extends Move{

    Scissors(){}

    public String getName(){ return "scissors"; } //use single dispatch

    public void attack(Rock r){ System.out.println("Rock smashes scissors"); }
    public void attack(Paper p){ System.out.println("Paper is cut by scissors"); }
    public void attack(Scissors sc){ System.out.println("Scissors match scissors"); }
    public void attack(Lizard l){ System.out.println("Lizard is injured by scissors"); }
    public void attack(Spock sp){ System.out.println("Spock smashes scissors"); }

    public void attack(Move m){
        m.attack(this);
    }
}
