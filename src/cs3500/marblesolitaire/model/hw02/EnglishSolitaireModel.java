package cs3500.marblesolitaire.model.hw02;


/**
 * Represents the model of a game of English Solitaire game board. Four ways of initiating the model and 5 methods.
 */
public class EnglishSolitaireModel implements MarbleSolitaireModel {

  int armThickness;

  int sRow;

  int sCol;

  int emptyRow;

  int emptyCol;

  /**
   * The first constructor of the English Solitaire game board that takes in no parameters.
   * Constructs a game board with arm thickness of three and a centered empty slot at [3,3].
   */
  public EnglishSolitaireModel() {
    this.armThickness = 3;
    this.emptyRow = armThickness;
    this.emptyCol = armThickness;
  }

  /**
   * The second constructor of the English Solitaire game board that takes in two parameters.
   * Constructs a game board with arm thickness of three and the empty slot at the given [row,column].
   *
   * @param sRow - (int) given row placement of the empty slot on the game board
   * @param sCol - (int) given column placement of the empty slot on the game board
   * @throws IllegalArgumentException - When the specified position is an empty cell (invalid)
   */
  public EnglishSolitaireModel(int sRow, int sCol) {
    if ((sRow < 2 && sCol < 2) || (sRow > 4 && sCol > 4)
            || (sRow < 2 && sCol > 4) || (sRow > 4 && sCol < 2)) {
      throw new IllegalArgumentException("Invalid empty cell position (" + sRow + "," + sCol + ")");
    }
    this.armThickness = 3;
    this.emptyRow = sRow;
    this.emptyCol = sCol;
  }


  /**
   * The third constructor of the English Solitaire game board that takes in 1 parameter.
   * Constructs a game board with the given arm thickness and the centered empty slot at [armThickness, armThickness].
   *
   * @param armThickness - (int) given arm thickness of the game board
   * @throws IllegalArgumentException - When the given armThickness is a not a positive odd integer
   */
  public EnglishSolitaireModel(int armThickness) {
    if ((armThickness % 2 == 0) || (armThickness < 0)) {
      throw new IllegalArgumentException("The arm thickness must be a positive and odd number");
    }
    this.armThickness = armThickness;
    this.emptyRow = this.armThickness;
    this.emptyCol = this.armThickness;
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
    if ((sRow < (armThickness - 1) && sCol < (armThickness - 1)) || (sRow > (armThickness + 1) && sCol > (armThickness + 1))
            || (sRow < (armThickness - 1) && sCol > (armThickness + 1)) || (sRow > (armThickness + 1) && sCol < (armThickness - 1))) {
      throw new IllegalArgumentException("Invalid empty cell position (" + sRow + "," + sCol + ")");
    }

    if ((armThickness % 2 == 0) || (armThickness < 0)) {
      throw new IllegalArgumentException("The arm thickness must be a positive and odd number");
    }

    this.armThickness = armThickness;
    this.emptyRow = sRow;
    this.emptyCol = sCol;

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
    return 0;
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
