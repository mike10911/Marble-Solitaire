package cs3500.marblesolitaire.model.hw04;

import java.util.ArrayList;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;


/**
 * Represents the model of a game of European Solitaire game board.
 * Four ways of initiating the model.
 */
public class EuropeanSolitaireModel extends AbstractSolitaireModel {


  /**
   * The first constructor of the European Solitaire game board that takes in no parameters.
   * Constructs a game board with arm thickness of three and a centered empty slot at [3,3].
   */
  public EuropeanSolitaireModel() {
    this(3, 3, 3);
  }

  /**
   * The second constructor of the European Solitaire game board
   * with the given armThickness and sRow, sCol
   * initialized according to the armThickness.
   *
   * @param armThickness the given armThickness.
   */
  public EuropeanSolitaireModel(int armThickness) {
    this(armThickness, 3 * armThickness / 2 - 1, 3 * armThickness / 2 - 1);
  }

  /**
   * The third constructor of the European Solitaire game board that takes in two parameters.
   * Constructs a game board with arm thickness of three and the empty slot at the
   * given [row,column].
   *
   * @param sRow - (int) given row placement of the empty slot on the game board
   * @param sCol - (int) given column placement of the empty slot on the game board
   */
  public EuropeanSolitaireModel(int sRow, int sCol) {
    this(3, sRow, sCol);
  }


  /**
   * The fourth constructor of the European Solitaire game board that takes in 3 parameters.
   * Constructs a game board with the given arm thickness and the empty slot at the
   * given [row,column].
   *
   * @param armThickness - (int) given arm thickness of the game board fj
   * @param sRow         - (int) given row placement of the empty slot on the game board
   * @param sCol         - (int) given column placement of the empty slot on the game board
   * @throws IllegalArgumentException - When the given armThickness is a not a positive odd integer
   * @throws IllegalArgumentException - When the specified position is an empty cell (invalid)
   */
  public EuropeanSolitaireModel(int armThickness, int sRow, int sCol) {
    if ((armThickness < 0) || (armThickness % 2 == 0)) {
      throw new IllegalArgumentException("arm thickness is not a positive odd number");
    }
    this.armThickness = armThickness;
    if (sRow < 0 || sCol < 0 || sRow >= this.getBoardSize() || sCol >= this.getBoardSize() ||
            (sRow + sCol < armThickness - 1) || (sRow > sCol + 2 * armThickness - 2) ||
            (sRow + sCol >= 5 * armThickness - 4) || (sCol > sRow + 2 * armThickness - 2)) {
      throw new IllegalArgumentException("Invalid empty cell position (" + sRow + " , " + sCol
              + ")");
    } else {
      this.emptyRow = sRow;
      this.emptyCol = sCol;
      this.gameBoard = this.generateBoard();
    }
  }

  private ArrayList<ArrayList<SlotState>> generateBoard() {
    for (int i = 0; i < this.getBoardSize(); i++) {
      ArrayList<MarbleSolitaireModelState.SlotState> boardRow =
              new ArrayList<MarbleSolitaireModelState.SlotState>();
      for (int j = 0; j < this.getBoardSize(); j++) {
        if (i < 0 || j < 0 || i >= (this.armThickness * 3) - 2 || j >=
                (this.armThickness * 3 - 2) ||
                (i + j < armThickness - 1) || (i > j + 2 * armThickness - 2) ||
                (i + j >= 5 * armThickness - 4) || (j > i + 2 * armThickness - 2)) {
          boardRow.add(MarbleSolitaireModelState.SlotState.Invalid);
        } else if (i == emptyRow && j == emptyCol) {
          boardRow.add(MarbleSolitaireModelState.SlotState.Empty);
        } else {
          boardRow.add(MarbleSolitaireModelState.SlotState.Marble);
        }
      }
      gameBoard.add(boardRow);
    }
    return gameBoard;
  }


}

