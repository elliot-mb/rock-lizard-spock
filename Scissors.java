public class Scissors extends Move{

    Scissors(){}

    public String getName(){ return "scissors"; } //use single dispatch

    public int attack(Rock r){ System.out.println("Rock smashes scissors"); return 1; }
    public int attack(Paper p){ System.out.println("Paper is cut by scissors"); return 0; }
    public int attack(Scissors sc){ System.out.println("Scissors match scissors"); return -1; }
    public int attack(Lizard l){ System.out.println("Lizard is injured by scissors"); return 0; }
    public int attack(Spock sp){ System.out.println("Spock smashes scissors"); return 1; }

    public int attack(Move m){
        return m.attack(this);
    }
}
