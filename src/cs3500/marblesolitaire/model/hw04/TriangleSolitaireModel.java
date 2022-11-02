package cs3500.marblesolitaire.model.hw04;

import java.util.ArrayList;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;

/**
 * Represents the model of a game of Triangle Solitaire game board.
 * Four ways of initiating the model.
 */
public class TriangleSolitaireModel extends AbstractSolitaireModel {
  private final int dimensions;

  /**
   * The first constructor of the Triangle Solitaire game board that takes in no parameters.
   * Constructs a game board with dimensions of three and a centered empty slot at [3,3].
   */
  public TriangleSolitaireModel() {
    this(5, 0, 0);
  }

  /**
   * The second constructor of the Triangle Solitaire game board
   * with the given dimensions and sRow, sCol
   * initialized according to the armThickness.
   *
   * @param dimensions the given dimensions.
   */
  public TriangleSolitaireModel(int dimensions) {
    this(dimensions, 0, 0);
  }


  /**
   * The third constructor of the Triangle Solitaire game board that takes in two parameters.
   * Constructs a game board with dimension  of 5 and the empty slot at the
   * given [row,column].
   *
   * @param sRow - (int) given row placement of the empty slot on the game board
   * @param sCol - (int) given column placement of the empty slot on the game board
   */
  public TriangleSolitaireModel(int sRow, int sCol) {
    this(5, sRow, sCol);
  }

  /**
   * The fourth constructor of the Triangle Solitaire game board that takes in 3 parameters.
   * Constructs a game board with the given dimensions and the empty slot at the
   * given [row,column].
   *
   * @param dimensions - (int) given dimensions of the game board fj
   * @param sRow       - (int) given row placement of the empty slot on the game board
   * @param sCol       - (int) given column placement of the empty slot on the game board
   * @throws IllegalArgumentException - When the given armThickness is a not a positive odd integer
   * @throws IllegalArgumentException - When the specified position is an empty cell (invalid)
   */
  public TriangleSolitaireModel(int dimensions, int sRow, int sCol) {
    if (dimensions <= 0) {
      throw new IllegalArgumentException("The specified dimension is invalid (non-positive)");
    } else if (emptyRow < 0 || emptyRow > dimensions || emptyCol < 0
            || emptyCol > dimensions || emptyRow < emptyCol) {
      throw new IllegalArgumentException("Position is invalid");
    } else {
      this.emptyRow = sRow;
      this.emptyCol = sCol;
      this.dimensions = dimensions;
      this.gameBoard = this.drawBoard();
    }
  }

  private ArrayList<ArrayList<SlotState>> drawBoard() {
    for (int i = 0; i < this.getBoardSize(); i++) {
      ArrayList<SlotState> row = new ArrayList<SlotState>();
      for (int j = 0; j < this.getBoardSize(); j++) {
        if (i < 0 || i > dimensions || j < 0 || j > dimensions || i < j) {
          row.add(MarbleSolitaireModelState.SlotState.Invalid);
        } else if (i == emptyRow && j == emptyCol) {
          row.add(MarbleSolitaireModelState.SlotState.Empty);
        } else {
          row.add(MarbleSolitaireModelState.SlotState.Marble);
        }
      }
      gameBoard.add(row);
    }
    return gameBoard;
  }

  @Override
  protected boolean validMoveHelper(int fromRow, int fromCol, int toRow, int toCol) {
    int centerRow = (fromRow + toRow) / 2;
    int centerCol = (fromCol + toCol) / 2;
    int size = this.getBoardSize();

    return ((fromRow >= 0 && fromCol >= 0 && fromRow < size && fromCol <= fromRow) &&
            (toRow >= 0 && toCol >= 0 && toRow < size && toCol <= toRow) &&
            (gameBoard.get(fromRow).get(fromCol) == MarbleSolitaireModelState.SlotState.Marble) &&
            (((Math.abs(fromRow - toRow)) == 2 && (Math.abs(fromCol - toCol)) == 0) ||
                    ((Math.abs(fromCol - toCol)) == 2 && (Math.abs(fromRow - toRow)) == 0) ||
                    ((Math.abs(fromRow - toRow)) == 2 && (Math.abs(fromCol - toCol)) == 2)) &&
            (gameBoard.get(centerRow).get(centerCol) ==
                    MarbleSolitaireModelState.SlotState.Marble) &&
            (gameBoard.get(toRow).get(toCol) == MarbleSolitaireModelState.SlotState.Empty) &&
            (gameBoard.get(toRow).get(toCol) != MarbleSolitaireModelState.SlotState.Invalid));

  }

  @Override
  protected boolean anyMovesLeft(int row, int col) {
    return (this.validMoveHelper(row, col, row, col + 2) ||
            this.validMoveHelper(row, col, row, col - 2) ||
            this.validMoveHelper(row, col, row + 2, col + 2) ||
            this.validMoveHelper(row, col, row - 2, col - 2) ||
            this.validMoveHelper(row, col, row + 2, col) ||
            this.validMoveHelper(row, col, row - 2, col));
  }

  /**
   * Overrides the abstract method and
   * returns the size of this gameBoard. The size is roughly the longest dimension of a gameBoard.
   *
   * @return the size as an integer
   */
  @Override
  public int getBoardSize() {
    return dimensions;
  }


}