package cs3500.marblesolitaire.view;

import java.io.IOException;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;

/**
 * Represent to printed text view of a model of the marble solitaire game board.
 * One way of initiating and one method
 */
public class MarbleSolitaireTextView implements MarbleSolitaireView {

  private final MarbleSolitaireModelState model;

  private final Appendable app;

  /**
   * Query the model. Print the board.
   *
   * @param model - model of the game board
   * @throws IllegalArgumentException - When the given model is null
   */
  public MarbleSolitaireTextView(MarbleSolitaireModelState model) {

    if (model == null) {
      throw new IllegalArgumentException("Model state must not be null");
    }
    this.model = model;
    this.app = System.out;
  }

  /**
   * Second constructor that allow .the board to be added to an appendable.
   *
   * @param model - given model
   * @param app   - given appendable
   */
  public MarbleSolitaireTextView(MarbleSolitaireModelState model, Appendable app) {

    if (model == null || app == null) {
      throw new IllegalArgumentException("Model state or Appendable must not be null");
    }
    this.model = model;
    this.app = app;
  }


  /**
   * Returns a string rep .of the Marble Solitaire Model.
   *
   * @return - String of the Marble Solitaire Model
   */
  @Override
  public String toString() {

    StringBuilder blankBoard = new StringBuilder();
    int size = model.getBoardSize();

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {

        if (model.getSlotAt(i, j) == MarbleSolitaireModelState.SlotState.Invalid) {
          blankBoard.append("  ");
        }

        if (model.getSlotAt(i, j) == MarbleSolitaireModelState.SlotState.Empty) {
          blankBoard.append("_ ");
        }

        if (model.getSlotAt(i, j) == MarbleSolitaireModelState.SlotState.Marble) {
          blankBoard.append("O ");
        }
      }
      while (blankBoard.charAt(blankBoard.length() - 1) == ' ') {
        blankBoard.deleteCharAt(blankBoard.length() - 1);
      }
      blankBoard.append("\n");
    }
    blankBoard.deleteCharAt(blankBoard.length() - 1);
    return blankBoard.toString();
  }

  /**
   * Render the board to the provided data destination. The board should be rendered exactly
   * in the format produced by the toString method above
   *
   * @throws IOException if transmission of the board to the provided data destination fails
   */
  @Override
  public void renderBoard() throws IOException {
    app.append(this.toString());


  }

  /**
   * Render a specific message to the provided data destination.
   *
   * @param message the message to be transmitted
   * @throws IOException if transmission of the board to the provided data destination fails
   */
  @Override
  public void renderMessage(String message) throws IOException {
    app.append(message);

  }
}
