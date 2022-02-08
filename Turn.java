import java.util.concurrent.ThreadLocalRandom;

public class Turn {

    private String input;
    private Move[] moves = {
            new Rock(),
            new Paper(),
            new Scissors(),
            new Lizard(),
            new Spock()
    };
    private Move move; // the move the player takes on this turn

    Turn(String _input){
        input = _input;
    }

    public boolean take(){ //take your turn (classifies move from input string)
        String check = input.toLowerCase().trim();
        //System.out.println("Your move was '" + check + "'");
        for(Move m : moves){
            if((m.getName()).equals(check)) { // single dispatch to find name
                move = m;
                return true; //exits the loop on first match with move name
            }
        }
        return false;
    }

    public void play(){
        int index = ThreadLocalRandom.current().nextInt(0, 5); // stack overflow (upper bound is exclusive)
        Move choice = moves[index];
        move.attack(choice); //double dispatch to retrieve outcome
    }

}
