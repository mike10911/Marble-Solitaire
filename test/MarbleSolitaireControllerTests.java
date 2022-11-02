
import cs3500.marblesolitaire.controller.MarbleSolitaireController;
import cs3500.marblesolitaire.controller.MarbleSolitaireControllerImpl;
import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;
import cs3500.marblesolitaire.view.MarbleSolitaireView;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.Reader;
import java.io.StringReader;

/**
 * Tests for the controller functionality of marble solitaire.
 */
public class MarbleSolitaireControllerTests {

  private MarbleSolitaireModel model;
  private Appendable out;
  private MarbleSolitaireView view;

  @Before
  public void setUp() {

    model = new EnglishSolitaireModel();
    out = new StringBuilder();
    view = new MarbleSolitaireTextView(model, out);
  }


  String gameBoard = "    O O O" +
          "\n    O O O" +
          "\nO O O O O O O" +
          "\nO O O _ O O O" +
          "\nO O O O O O O" +
          "\n    O O O" +
          "\n    O O O\nScore: 32";
  String gameBoard4244 = "    O O O" +
          "\n    O O O" +
          "\nO O O O O O O" +
          "\nO _ _ O O O O" +
          "\nO O O O O O O" +
          "\n    O O O" +
          "\n    O O O\nScore: 31\n";
  String quitBoard4244 = "\nGame quit!\n" + "State of game when quit:\n" +
          "    O O O" +
          "\n    O O O" +
          "\nO O O O O O O" +
          "\nO _ _ O O O O" +
          "\nO O O O O O O" +
          "\n    O O O" +
          "\n    O O O\nScore: 31\n";
  String quitBoardDefault = "\nGame quit!\n" + "State of game when quit:\n" +
          "    O O O" +
          "\n    O O O" +
          "\nO O O O O O O" +
          "\nO O O _ O O O" +
          "\nO O O O O O O" +
          "\n    O O O" +
          "\n    O O O\nScore: 32\n";

  @Test
  public void nullModel() {
    try {
      Reader input = new StringReader("4 2 4 4 q");
      MarbleSolitaireController test = new MarbleSolitaireControllerImpl(null, view,
              input);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
  }

  @Test

  public void nullView() {
    try {
      Reader input = new StringReader("4 2 4 4 q");
      MarbleSolitaireController test = new MarbleSolitaireControllerImpl(model, null,
              input);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      //no catch
    }
  }

  @Test

  public void nullReadable() {
    try {
      MarbleSolitaireController test = new MarbleSolitaireControllerImpl(model, view, null);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      //no catch
    }
  }

  @Test
  public void testGameCompletelyOver() {

    Reader input = new StringReader("4 2 4 4 4 5 4 3 4 7 4 5 2 4 4 4 5 4 3 4 7 4 5 4 q");

    MarbleSolitaireController test = new MarbleSolitaireControllerImpl(model, view,
            input);
    test.playGame();
    String gameOver = "Game over!\n" +
            "    O O O" +
            "\n    O _ O" +
            "\nO O O O O O O" +
            "\nO _ O _ O _ _" +
            "\nO O O O O O O" +
            "\n    O _ O" +
            "\n    O _ O\nScore: 26\n";

    assertTrue(out.toString().contains(gameOver));
  }

  @Test
  public void insufficientValues() {
    try {
      Reader input = new StringReader("4 2 4 5 3 5 6 7 6 3 4 5 6 7");
      MarbleSolitaireController test = new MarbleSolitaireControllerImpl(model, view,
              input);
    } catch (IllegalStateException e) {
      assertEquals("No values.", e.getMessage());
    }
  }

  @Test
  public void invalidMoveTest() {
    try {
      Reader input = new StringReader("4 2 5 3 q");
      MarbleSolitaireController test = new MarbleSolitaireControllerImpl(model, view, input);
    } catch (IllegalStateException e) {
      assertEquals("Move Unsuccessful. Play again", e.getMessage());
    }
  }

  @Test
  public void unableTransmitOutput() {
    try {
      Reader input = new StringReader("4 2 4 4 q");
      MarbleSolitaireModel wrong = new EnglishSolitaireModel(1);
      MarbleSolitaireView oneView = new MarbleSolitaireTextView(wrong, out);
    } catch (IllegalStateException e) {
      assertEquals("Cannot transmit output", e.getMessage());
    }
  }

  @Test
  public void invalidInputAfterValidInput() {
    Reader input = new StringReader("4 2 4 j 4 q");
    MarbleSolitaireController test = new MarbleSolitaireControllerImpl(model, view,
            input);

    test.playGame();

    String oneInvalid = gameBoard + gameBoard4244 + quitBoard4244;

    assertEquals(oneInvalid, out.toString());
  }

  @Test
  public void quitInFromCol() {
    Reader input = new StringReader("4 q 2 4 q");
    MarbleSolitaireController test = new MarbleSolitaireControllerImpl(model, view,
            input);

    test.playGame();

    String oneInvalid = gameBoard + quitBoardDefault;

    assertEquals(oneInvalid, out.toString());
  }

  @Test
  public void quitTestInFromRow() {
    Reader input = new StringReader("q 4 2 4 q");
    MarbleSolitaireController test = new MarbleSolitaireControllerImpl(model, view,
            input);

    test.playGame();

    String oneInvalid = gameBoard + quitBoardDefault;

    assertEquals(oneInvalid, out.toString());
  }

  @Test
  public void quitTestInToRow() {
    Reader input = new StringReader("4 2 q 4 q");
    MarbleSolitaireController test = new MarbleSolitaireControllerImpl(model, view,
            input);

    test.playGame();

    String oneInvalid = gameBoard + quitBoardDefault;

    assertEquals(oneInvalid, out.toString());
  }

  @Test
  public void quitTestInToCol() {
    Reader input = new StringReader("4 2 4 q q");
    MarbleSolitaireController test = new MarbleSolitaireControllerImpl(model, view,
            input);

    test.playGame();

    String oneInvalid = gameBoard + quitBoardDefault;

    assertEquals(oneInvalid, out.toString());
  }

  @Test
  public void testMoveOneMarble() {
    Reader input = new StringReader("4 2 4 4 q");
    MarbleSolitaireController test = new MarbleSolitaireControllerImpl(model, view,
            input);

    test.playGame();

    String oneInvalid = gameBoard + gameBoard4244 + quitBoard4244;

    assertEquals(oneInvalid, out.toString());
  }
}
