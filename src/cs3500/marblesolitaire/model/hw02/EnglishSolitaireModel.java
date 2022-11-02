package cs3500.marblesolitaire.model.hw02;

import java.util.ArrayList;

import cs3500.marblesolitaire.model.hw04.AbstractSolitaireModel;

/**
 * Represents the model of a game of English Solitaire game board.
 * Four ways of initiating the model and 5 methods.
 */
public class EnglishSolitaireModel extends AbstractSolitaireModel {

  /**
   * The first constructor of the English Solitaire game board that takes in no parameters.
   * Constructs a game board with arm thickness of three and a centered empty slot at [3,3].
   */
  public EnglishSolitaireModel() {
    this(3, 3, 3);
  }

  /**
   * The second constructor of the English Solitaire game board that takes in two parameters.
   * Constructs a game board with arm thickness of three and the empty slot at the
   * given [row,column].
   *
   * @param sRow - (int) given row placement of the empty slot on the game board
   * @param sCol - (int) given column placement of the empty slot on the game board
   */
  public EnglishSolitaireModel(int sRow, int sCol) {
    this(3, sRow, sCol);
  }


  /**
   * The third constructor of the English Solitaire game board that takes in 1 parameter.
   * Constructs a game board with the given arm thickness and the centered empty slot
   * at [armThickness, armThickness].
   *
   * @param armThickness - (int) given arm thickness of the game board
   */
  public EnglishSolitaireModel(int armThickness) {
    this(armThickness, ((armThickness + (2 * armThickness - 1)) - 1) / 2,
            ((armThickness + ((2 * armThickness) - 1)) - 1) / 2);
  }

  /**
   * The fourth constructor of the English Solitaire game board that takes in 3 parameters.
   * Constructs a game board with the given arm thickness and the empty slot at the
   * given [row,column].
   *
   * @param armThickness - (int) given arm thickness of the game board fj
   * @param sRow         - (int) given row placement of the empty slot on the game board
   * @param sCol         - (int) given column placement of the empty slot on the game board
   * @throws IllegalArgumentException - When the given armThickness is a not a positive odd integer
   * @throws IllegalArgumentException - When the specified position is an empty cell (invalid)
   */
  public EnglishSolitaireModel(int armThickness, int sRow, int sCol) {
    if ((sRow < armThickness - 1 && sCol < armThickness - 1)
            ||
            (sRow < armThickness - 1 && sCol > ((2 * armThickness) - 2))
            ||
            (sRow > ((armThickness * 2) - 2) && sCol < armThickness - 1)
            ||
            (sRow > ((armThickness * 2) - 2) && sCol > ((2 * armThickness) - 2))
            ||
            (sRow < 0 || sRow > ((armThickness * 3) - 2)
                    || sCol > ((armThickness * 3) - 2) || sCol < 0)) {
      throw new IllegalArgumentException("Invalid empty cell at (" + sRow + "," + sCol + ")");
    } else if ((armThickness % 2 == 0) || (armThickness < 0)) {
      throw new IllegalArgumentException("The arm thickness must be a positive and odd number");
    } else {
      this.armThickness = armThickness;
      this.emptyRow = sRow;
      this.emptyCol = sCol;
      this.gameBoard = this.generateGameBoard();
    }
  }

  private ArrayList<ArrayList<SlotState>> generateGameBoard() {
    for (int i = 0; i < this.getBoardSize(); i++) {
      ArrayList<SlotState> row = new ArrayList<SlotState>();
      for (int j = 0; j < this.getBoardSize(); j++) {
        if ((i <= (armThickness - 2) && j <= (armThickness - 2))
                ||
                (i <= (armThickness - 2) && j >= (this.getBoardSize() - (armThickness - 1)))
                ||
                (i >= (this.getBoardSize() - (armThickness - 1)) &&
                        j <= (armThickness - 2))
                ||
                (i >= (this.getBoardSize() - (armThickness - 1)) &&
                        j >= (this.getBoardSize() - (armThickness - 1)))) {
          row.add(SlotState.Invalid);
        } else if (i == emptyRow && j == emptyCol) {
          row.add(SlotState.Empty);
        } else {
          row.add(SlotState.Marble);
        }
      }
      gameBoard.add(row);
    }
    return gameBoard;
  }
}