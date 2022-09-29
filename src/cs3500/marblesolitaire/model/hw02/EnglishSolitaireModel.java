package cs3500.marblesolitaire.model.hw02;

import java.util.ArrayList;

/**
 * Represents the model of a game of English Solitaire game board. Four ways of initiating the model and 5 methods.
 */
public class EnglishSolitaireModel implements MarbleSolitaireModel {

  protected int armThickness;
  protected int emptyRow;
  protected int emptyCol;

  protected ArrayList<ArrayList<SlotState>> gameBoard = new ArrayList<ArrayList<SlotState>>();

  /**
   * The first constructor of the English Solitaire game board that takes in no parameters.
   * Constructs a game board with arm thickness of three and a centered empty slot at [3,3].
   */
  public EnglishSolitaireModel() {
    this(3, 3, 3);
  }

  /**
   * The second constructor of the English Solitaire game board that takes in two parameters.
   * Constructs a game board with arm thickness of three and the empty slot at the given [row,column].
   *
   * @param sRow - (int) given row placement of the empty slot on the game board
   * @param sCol - (int) given column placement of the empty slot on the game board
   */
  public EnglishSolitaireModel(int sRow, int sCol) {
    this(3, sRow, sCol);
  }


  /**
   * The third constructor of the English Solitaire game board that takes in 1 parameter.
   * Constructs a game board with the given arm thickness and the centered empty slot at [armThickness, armThickness].
   *
   * @param armThickness - (int) given arm thickness of the game board
   */
  public EnglishSolitaireModel(int armThickness) {
    this(armThickness, ((armThickness + (2 * armThickness - 1)) - 1) / 2,
            ((armThickness + ((2 * armThickness) - 1)) - 1) / 2);
  }

  /**
   * The fourth constructor of the English Solitaire game board that takes in 3 parameters.
   * Constructs a game board with the given arm thickness and the empty slot at the given [row,column].
   *
   * @param armThickness - (int) given arm thickness of the game board fj
   * @param sRow         - (int) given row placement of the empty slot on the game board
   * @param sCol         - (int) given column placement of the empty slot on the game board
   * @throws IllegalArgumentException - When the given armThickness is a not a positive odd integer
   * @throws IllegalArgumentException - When the specified position is an empty cell (invalid)
   */
  public EnglishSolitaireModel(int armThickness, int sRow, int sCol) {
    if ((sRow < armThickness - 1 && sCol < armThickness - 1) ||
            (sRow < armThickness - 1 && sCol > ((2 * armThickness) - 2)) ||
            (sRow > ((armThickness * 2) - 2) && sCol < armThickness - 1) ||
            (sRow > ((armThickness * 2) - 2) && sCol > ((2 * armThickness) - 2)) ||
            (sRow < 0 || sRow > ((armThickness * 3) - 2) || sCol > ((armThickness * 3) - 2) || sCol < 0)) {
      throw new IllegalArgumentException("Invalid empty cell position (" + sRow + "," + sCol + ")");
    } else if ((armThickness % 2 == 0) || (armThickness < 0)) {
      throw new IllegalArgumentException("The arm thickness must be a positive and odd number");
    }

    this.armThickness = armThickness;
    this.emptyRow = sRow;
    this.emptyCol = sCol;
    this.gameBoard = generateGameBoard();
  }

  public ArrayList<ArrayList<SlotState>> generateGameBoard() {
    for (int i = 0; i < this.getBoardSize(); i++) {
      ArrayList<SlotState> row = new ArrayList<SlotState>();
      for (int j = 0; j < this.getBoardSize(); i++) {
        if ((i <= (armThickness - 2) && j <= (armThickness - 2)) ||
                (i <= (armThickness - 2) && j >= (this.getBoardSize() - (armThickness - 1))) ||
                (i >= (this.getBoardSize() - (armThickness - 1)) &&
                        j <= (armThickness - 2)) ||
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
  @Override
  public void move(int fromRow, int fromCol, int toRow, int toCol) throws IllegalArgumentException {

    int centerRow = (fromRow + toRow) / 2;
    int centerCol = (fromCol + toCol) / 2;

    if ((!(this.validMoveHelper(fromRow, fromCol, toRow, toCol))) ||
            gameBoard.get(toRow).get(toCol) != SlotState.Empty) {
      throw new IllegalArgumentException("Invalid Move Input");
    } else {
      gameBoard.get(fromRow).set(fromCol, SlotState.Empty);
      gameBoard.get(centerRow).set(centerCol, SlotState.Empty);
      gameBoard.get(toRow).set(toCol, SlotState.Marble);
    }

  }

  protected boolean validMoveHelper(int fromRow, int fromCol, int toRow, int toCol) {

    int centerRow = (fromRow + toRow) / 2;
    int centerCol = (fromCol + toCol) / 2;
    int gameBoardSize = this.getBoardSize();

    return ((fromRow >= 0 && fromRow < gameBoardSize) && (toRow >= 0 && toRow < gameBoardSize) &&
            (fromCol >= 0 && fromCol < gameBoardSize) && (toCol >= 0 && toCol < gameBoardSize) &&
            (gameBoard.get(fromRow).get(fromCol) == SlotState.Marble) &&
            (((Math.abs(fromRow - toRow)) == 2 && (Math.abs(fromCol - toCol)) == 0) ||
                    ((Math.abs(fromCol - toCol)) == 2 && (Math.abs(fromRow - toRow)) == 0)) &&
            (gameBoard.get(centerRow).get(centerCol) == SlotState.Marble) &&
            (gameBoard.get(toRow).get(toCol) == SlotState.Empty) &&
            (gameBoard.get(toRow).get(toCol) != SlotState.Invalid));
  }


  /**
   * Determine and return if the game is over or not. A game is over if no
   * more moves can be made.
   *
   * @return true if the game is over, false otherwise
   */
  @Override
  public boolean isGameOver() {
    return false;
  }

  /**
   * Return the size of this board. The size is roughly the longest dimension of a board
   *
   * @return the size as an integer
   */
  @Override
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
  @Override
  public SlotState getSlotAt(int row, int col) throws IllegalArgumentException {
    return null;
  }

  /**
   * Return the number of marbles currently on the board.
   *
   * @return the number of marbles currently on the board
   */
  @Override
  public int getScore() {
    return 0;
  }
}
