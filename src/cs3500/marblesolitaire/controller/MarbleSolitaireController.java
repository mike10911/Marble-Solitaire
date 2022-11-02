package cs3500.marblesolitaire.controller;

/**
 * Interface of the Marble. Solitaire game Controller.
 */
public interface MarbleSolitaireController {

  /**
   * This method plays. a new game of Marble Solitaire.
   * The nature of input/output will be an implementation detail.
   *
   * @throws IllegalStateException - When the controller is unable to
   *                                 successfully read input or transmit output
   */
  void playGame();
}
