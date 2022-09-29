package cs3500.marblesolitaire.view;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;

/**
 * Represent to printed text view of a model of the marble solitaire game board.
 * One way of initiating and one method
 */
public class MarbleSolitaireTextView implements MarbleSolitaireView {

  MarbleSolitaireModelState model;

  /**
   * Query the model. Print the board.
   * @param model - model of the game board
   * @throws IllegalArgumentException - When the given model is null
   */
  public MarbleSolitaireTextView(MarbleSolitaireModelState model){

    if (model == null){
      throw new IllegalArgumentException("Model state must not be null");
    }
    this.model = model;
  }

  /**
   *
   * @return - String of the Marble Solitaire Model
   */
  @Override
  public String toString(){

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
}
