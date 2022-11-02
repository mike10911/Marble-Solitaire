
package cs3500.marblesolitaire;

import cs3500.marblesolitaire.controller.MarbleSolitaireControllerImpl;
import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw04.EuropeanSolitaireModel;
import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;
import cs3500.marblesolitaire.view.MarbleSolitaireView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Main class for the user to choose what marble solitaire game they want.
 */
public final class MarbleSolitaire {

  /**
   * main method of the MarbleSolitaire class.
   * @param args
   */
  public static void main(String[] args) {

    MarbleSolitaireModel model;
    MarbleSolitaireView view;
    MarbleSolitaireControllerImpl controller;


    int base = 3;
    int sRow = 3;
    int sCol = 3;

    String gameModel = "";


    for (int i = 0; i < args.length; i++) {
      switch (args[i]) {
        case "english":
          gameModel = "english";
          break;
        case "european":
          gameModel = "european";
          break;
        case "triangular":
          gameModel = "triangular";
          break;
        case "-size":
          base = (Integer.parseInt(args[i + 1]));
          sRow = 3 * base / 2 - 1;
          sCol = 3 * base / 2 - 1;
          break;
        case "-hole":
          sRow = (Integer.parseInt(args[i + 1])) - 1;
          sCol = (Integer.parseInt(args[i + 2])) - 1;
          break;
        default:
          // none
          break;
      }
    }

    switch (gameModel) {
      case "english":
        model = new EnglishSolitaireModel(base, sRow, sCol);
        view = new MarbleSolitaireTextView(model, new PrintStream(System.out));
        break;
      case "european":
        model = new EuropeanSolitaireModel(base, sRow, sCol);
        view = new MarbleSolitaireTextView(model, new PrintStream(System.out));
        break;
      case "triangular":
        base = 5;
        model = new TriangleSolitaireModel(base, sRow, sCol);
        view = new MarbleSolitaireTextView(model, new PrintStream(System.out));
        break;
      default:
        throw new IllegalArgumentException("Invalid model");

    }

    controller = new MarbleSolitaireControllerImpl(model, view,
                    new BufferedReader(new InputStreamReader(System.in)));
    controller.playGame();
  }

}

