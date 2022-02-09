import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Move[] moves = {
            new Rock(),
            new Paper(),
            new Scissors(),
            new Lizard(),
            new Spock()
    };
    private Move move; // the move the player takes on current turn
    private int scorePlayer; // out of 3+ for the player
    private int scoreGame;
    private int rounds;

    Game(int _rounds){
        scorePlayer = 0;
        scoreGame = 0;
        rounds = _rounds > 3 ? _rounds : 3; //best of rounds (less than 3 doesn't work)
    }

    public boolean gameEnds(){ //has player won
        int half = (Math.floorDiv(rounds, 2));
        return (scorePlayer > half || scoreGame > half);
    }

    public boolean playerWon(){
        return scorePlayer > scoreGame;
    }

    public boolean take(String input){ //take your turn (classifies move from input string)
        String check = input.toLowerCase().trim();
        //System.out.println("Your move was '" + check + "'");
        for(Move m : moves){
            if((m.getName()).equals(check)) { // single dispatch to find name
                //System.out.println("You chose " + m.getName());
                move = m;
                return true; //exits the loop on first match with move name
            }
        }
        return false;
    }

    private void score(int outcome){
        if(outcome != -1){ //not a tiebreaker
            scorePlayer += outcome;
            scoreGame += outcome == 1 ? 0 : 1;
            System.out.print("Best of " + rounds + " rounds: the score is ");
            if(scorePlayer > scoreGame) { System.out.print(scorePlayer + ", " + scoreGame + " to you\n"); }
            else if(scorePlayer < scoreGame) { System.out.print(scorePlayer + ", " + scoreGame + " to the game\n"); }
            else { System.out.print(scorePlayer + " all!\n"); }
        }
    }

    public void play(){ //
        int index = ThreadLocalRandom.current().nextInt(0, 5); // stack overflow (upper bound is exclusive)
        Move choice = moves[index];
        System.out.println("Game chose " + choice.getName());
        int outcome = move.attack(choice); //double dispatch to retrieve outcome
        this.score(outcome);
    }

}
