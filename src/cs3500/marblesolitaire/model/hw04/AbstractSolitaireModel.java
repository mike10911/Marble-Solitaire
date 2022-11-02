package cs3500.marblesolitaire.model.hw04;

import java.util.ArrayList;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;


/**
 * abstract class for all models of marble solitaire
 */
public class AbstractSolitaireModel implements MarbleSolitaireModel {


  protected int armThickness;
  protected int emptyRow;
  protected int emptyCol;
  protected ArrayList<ArrayList<MarbleSolitaireModelState.SlotState>> gameBoard =
          new ArrayList<ArrayList<MarbleSolitaireModelState.SlotState>>();

  /**
   * Move a single marble from a given position to another given position.
   * A move is valid only if the from and to positions are valid. Specific
   * implementations may place additional constraints on the validity of a move.
   *
   * @param fromRow the row number of the position to be moved from
   *                (starts at 0)
   * @param fromCol the column number of the position to be moved from
   *                (starts at 0)
   * @param toRow   the row number of the position to be moved to
   *                (starts at 0)
   * @param toCol   the column number of the position to be moved to
   *                (starts at 0)
   * @throws IllegalArgumentException if the move is not possible
   */

  public void move(int fromRow, int fromCol, int toRow, int toCol) throws IllegalArgumentException {

    int centerRow = (fromRow + toRow) / 2;
    int centerCol = (fromCol + toCol) / 2;

    if ((!(this.validMoveHelper(fromRow, fromCol, toRow, toCol)))
            ||
            gameBoard.get(toRow).get(toCol) != MarbleSolitaireModelState.SlotState.Empty) {
      throw new IllegalArgumentException("Invalid Move Input");
    } else {
      gameBoard.get(fromRow).set(fromCol, MarbleSolitaireModelState.SlotState.Empty);
      gameBoard.get(centerRow).set(centerCol, MarbleSolitaireModelState.SlotState.Empty);
      gameBoard.get(toRow).set(toCol, MarbleSolitaireModelState.SlotState.Marble);
    }

  }

  protected boolean validMoveHelper(int fromRow, int fromCol, int toRow, int toCol) {

    int centerRow = (fromRow + toRow) / 2;
    int centerCol = (fromCol + toCol) / 2;
    int gameBoardSize = this.getBoardSize();

    return ((fromRow >= 0 && fromRow < gameBoardSize) && (toRow >= 0 && toRow < gameBoardSize)
            && (fromCol >= 0 && fromCol < gameBoardSize) && (toCol >= 0 && toCol < gameBoardSize)
            && (gameBoard.get(fromRow).get(fromCol) == MarbleSolitaireModelState.SlotState.Marble)
            && (((Math.abs(fromRow - toRow)) == 2 && (Math.abs(fromCol - toCol)) == 0)
            || ((Math.abs(fromCol - toCol)) == 2 && (Math.abs(fromRow - toRow)) == 0))
            && (gameBoard.get(centerRow).get(centerCol) ==
            MarbleSolitaireModelState.SlotState.Marble)
            && (gameBoard.get(toRow).get(toCol) == MarbleSolitaireModelState.SlotState.Empty)
            && (gameBoard.get(toRow).get(toCol) != MarbleSolitaireModelState.SlotState.Invalid));
  }


  /**
   * Determine and return if the game is over or not. A game is over if no
   * more moves can be made.
   *
   * @return true if the game is over, false otherwise
   */

  public boolean isGameOver() {

    int gameBoardSize = this.getBoardSize();

    for (int i = 0; i < gameBoardSize; i++) {
      for (int j = 0; j < gameBoardSize; j++) {
        if ((this.anyMovesLeft(i, j))
                && gameBoard.get(i).get(j).equals(MarbleSolitaireModelState.SlotState.Marble)) {
          return false;
        }
      }
    }
    return true;
  }

  protected boolean anyMovesLeft(int row, int col) {
    int gameBoardSize = this.getBoardSize();

    return ((row > 1 && this.validMoveHelper(row, col, row - 2, col))
            || (col > 1 && this.validMoveHelper(row, col, row, col - 2))
            ||
            (row < (gameBoardSize - 1) && this.validMoveHelper(row, col, row + 2, col))
            || (col < (gameBoardSize - 1) && this.validMoveHelper(row, col, row, col + 2)));
  }


  /**
   * Return the size of this board. The size is roughly the longest dimension of a board
   *
   * @return the size as an integer
   */

  public int getBoardSize() {
    return (this.armThickness * 3) - 2;
  }

  /**
   * Get the state of the slot at a given position on the board.
   *
   * @param row the row of the position sought, starting at 0
   * @param col the column of the position sought, starting at 0
   * @return the state of the slot at the given row and column
   * @throws IllegalArgumentException if the row or the column are beyond
   *                                  the dimensions of the board
   */

  public MarbleSolitaireModelState.SlotState getSlotAt(int row, int col)
          throws IllegalArgumentException {
    if (row < 0 || col < 0 || row > getBoardSize() || col > getBoardSize()) {
      throw new IllegalArgumentException("There is not a valid slot state at (" + row + col + ")");
    } else {
      return gameBoard.get(row).get(col);
    }
  }

  /**
   * Return the number of marbles currently on the board.
   *
   * @return the number of marbles currently on the board
   */
  public int getScore() {

    int gameBoardSize = this.getBoardSize();
    int score = 0;

    for (int i = 0; i < gameBoardSize; i++) {
      for (int j = 0; j < gameBoardSize; j++) {
        if ((gameBoard.get(i).get(j)) == MarbleSolitaireModelState.SlotState.Marble) {
          score++;
        }
      }
    }
    return score;
  }
}


