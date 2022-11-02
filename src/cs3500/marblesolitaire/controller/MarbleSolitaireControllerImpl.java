package cs3500.marblesolitaire.controller;

import java.io.IOException;
import java.util.Scanner;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireView;

/**
 * Allows for a user to control. a game of marble solitaire.
 */
public class MarbleSolitaireControllerImpl implements MarbleSolitaireController {


  private final MarbleSolitaireModel model;
  private final MarbleSolitaireView view;
  private final Readable input;

  /**
   * The first constructor of the Marble Solitaire controller. that takes in three parameters.
   *
   * @param model - (MarbleSolitaireModel) - model of a given game of Marble Solitaire
   * @param view  - (MarbleSolitaireView) - view of a given game of Marble Solitaire
   * @param input - (Readable) - input from the user
   * @throws IllegalArgumentException - When model, view, or input is null
   */
  public MarbleSolitaireControllerImpl(MarbleSolitaireModel model, MarbleSolitaireView view,
                                       Readable input) {
    if (model == null || view == null || input == null) {
      throw new IllegalArgumentException("model, view, or input must not be null");

    } else {

      this.model = model;
      this.view = view;
      this.input = input;

    }
  }

  /**
   * This method plays. a new game of Marble Solitaire.
   * The nature of input/output will be an implementation detail.
   *
   * @throws IllegalStateException    - When the controller is unable to
   *                                    successfully read input or transmit output
   * @throws IllegalArgumentException - When move is given use usable values
   */
  @Override
  public void playGame() {

    Scanner scanner = new Scanner(this.input);

    int inputValues = 0;

    // array of fromRow, fromCol, toRow, toCol
    int[] inputValuesArray = new int[4];

    boolean quitGame = false;

    renderHelper();
    try {
      view.renderMessage("\nScore: " + model.getScore());
    } catch (IOException e) {
      throw new IllegalStateException("Cannot transmit output");
    }

    while (!model.isGameOver() && !quitGame) {
      while (inputValues < 4) {

        if (scanner.hasNext()) {

          String scannerNext = scanner.next();

          if (scannerNext.equals("q") || scannerNext.equals("Q")) {
            quitGame = true;
            messageHelper("\nGame quit!\n" + "State of game when quit:\n");
            break;
          }
          try {
            inputValuesArray[inputValues] = Integer.parseInt(scannerNext);
            inputValues++;
          } catch (Exception e) {
            //catches input vales that are non-integers
          }
        } else {
          throw new IllegalStateException("No values.");
        }
      }

      if (!quitGame) {
        try {
          model.move(inputValuesArray[0] - 1, inputValuesArray[1] - 1, inputValuesArray[2] - 1,
                  inputValuesArray[3] - 1);
        } catch (IllegalArgumentException e) {
          messageHelper("Move Unsuccessful. Play again");
        }
      }
      inputValues = 0;
      if (!model.isGameOver()) {
        messageHelper(view.toString() + "\nScore: " + model.getScore() + "\n");
      }
    }
    if (!quitGame) {
      messageHelper("Game over!\n" + view.toString() + "\nScore: " + model.getScore() + "\n");
    }
  }

  private void renderHelper() {
    try {
      view.renderBoard();
    } catch (IOException e) {
      throw new IllegalStateException("Cannot transmit output");
    }
  }

  private void messageHelper(String message) {
    try {
      view.renderMessage(message);
    } catch (IOException e) {
      throw new IllegalStateException("Cannot transmit output");
    }
  }

}


