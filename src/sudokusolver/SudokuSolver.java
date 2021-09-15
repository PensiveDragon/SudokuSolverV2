/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

/**
 * @author Matthew
 */
public class SudokuSolver {

    public static void main(String[] args) {

        // set up grid
        Gamestate gamestate1 = new Gamestate();
        
        // ### ENABLE ONE OF THE BELOW CHALLENGES AND CLICK RUN ###
        
        gamestate1.setStartingState(StartingNumbers.CHALLENGE_ONE());
        //gamestate1.setStartingState(StartingNumbers.CHALLENGE_TWO());
        //gamestate1.setStartingState(StartingNumbers.CHALLENGE_THREE());
        //gamestate1.setStartingState(StartingNumbers.INVALID_CHALLENGE()); // - CORRECTLY CALLS INVALID
                

        // display grid
        gamestate1.displayCellArray();
        //gamestate1.displayLockedCellArray();

        // Check starting grid is valid?
        Checker checker1 = new Checker();
        Boolean validBoard = checker1.checkValidBoard(gamestate1);

        // deploy methods
        Methods methods1 = new Methods();
        if (validBoard == true) {
            // solve board
            methods1.iterateGrid(gamestate1);
            
            // check if game is complete
            //System.out.println("Full Board Check: " + checker1.checkFullBoard(gamestate1));
            //System.out.println("Sum Value Check: " + checker1.checkSumValue(gamestate1));
            System.out.println("Game complete: " + checker1.checkGameIsComplete(gamestate1));
            
        } else {
            System.out.println("Starting board is invalid.");
        }
    }
}
