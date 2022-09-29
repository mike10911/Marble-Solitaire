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

  public String toString(){
    return "";
  }


}
