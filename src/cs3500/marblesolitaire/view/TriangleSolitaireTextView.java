package cs3500.marblesolitaire.view;

import java.io.IOException;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;

/**
 *  represents the visual output of the triangle board.
 */
public class TriangleSolitaireTextView implements MarbleSolitaireView {

  private MarbleSolitaireModelState model;
  public Appendable app;


  /**
   * model only constructor
   * @param model - model of triangle board
   */
  public TriangleSolitaireTextView(MarbleSolitaireModelState model) {
    if (model == null) {
      throw new IllegalArgumentException("model null");
    } else {
      this.model = model;
      this.app = System.out;
    }
  }

  /**
   * model and appendable  constructor
   * @param model - model of triangle board
   * @param app - appendable of the triangle board
   */
  public TriangleSolitaireTextView(MarbleSolitaireModelState model, Appendable app) {
    if (model == null || app == null ) {
      throw new IllegalArgumentException("model or appendable null");
    } else {
      this.model = model;
      this.app = app;
    }
  }

  @Override
  public String toString() {
    StringBuilder blankBoard = new StringBuilder();
    int size = model.getBoardSize();

    for (int i = 0; i < size; i++) {
      for (int j = 1; j < size - i; j++) {
        blankBoard.append(" ");
      }
      for (int j = 0; j <= i; j++) {
        if (model.getSlotAt(i, j) == MarbleSolitaireModelState.SlotState.Marble) {
          blankBoard.append("O");
        } else {
          blankBoard.append("_");
        }
        if (j != i) {
          blankBoard.append(" ");
        }
      }

      if (i + 1 < size) {
        blankBoard.append("\n");
      }
    }
    return blankBoard.toString();
  }


  @Override
  public void renderBoard() throws IOException {
    try {
      app.append(this.toString());
    } catch (IOException e) {
      throw new IOException("Couldn't append");
    }
  }

  @Override
  public void renderMessage(String message) throws IOException {
    try {
      app.append(message);
    } catch (IOException e) {
      throw new IOException("Couldn't append");
    }
  }
}