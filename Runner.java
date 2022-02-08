import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String args[]){
        Move r  = new Rock();
        Move p  = new Paper();
        Move sc = new Scissors();
        Move l  = new Lizard();
        Move sp = new Spock();

        /*
        attack has 6 implementations in all moves, but dynamic dispatch
        chooses the only one which takes abstract type move; it matches
        the generic ref type (Move), rather than any specific move which
        would simply print a prompt (and wouldn't work for 4/5 moves).
        * */
        /*
        r.attack(p);
        sc.attack(l);
        sp.attack(sc);
        */
        for(int i = 0; i < 3; i++){

            // -- code copied from GeeksForGeeks --
            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            String move = "";
            System.out.println("Enter your move");
            // Reading data using readLine
            try {
                move = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // -- end code copied from GeeksForGeeks --

            Turn turn = new Turn(move);
            if(turn.take()){ //if valid...
                turn.play(); ///...play the move
            }
            else{ System.out.println("Illegal move"); }
        }

    }
}
