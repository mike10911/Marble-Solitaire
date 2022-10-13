import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;


/**
 * Marble Solitaire .test class
 */
public class MarbleSolitaireTest {
  EnglishSolitaireModel marble1;
  EnglishSolitaireModel marble2;
  EnglishSolitaireModel marble3;
  EnglishSolitaireModel marble4;
  EnglishSolitaireModel marble5;
  EnglishSolitaireModel marble6;
  EnglishSolitaireModel marble7;
  EnglishSolitaireModel marble8;
  EnglishSolitaireModel marble9;
  EnglishSolitaireModel marble10;
  EnglishSolitaireModel marble11;

  MarbleSolitaireTextView tv1;
  MarbleSolitaireTextView tv2;
  MarbleSolitaireTextView tv3;
  MarbleSolitaireTextView tv4;
  MarbleSolitaireTextView tv5;
  MarbleSolitaireTextView tv6;
  MarbleSolitaireTextView tv7;
  MarbleSolitaireTextView tv8;
  MarbleSolitaireTextView tv9;
  MarbleSolitaireTextView tv10;
  MarbleSolitaireTextView tv11;

  @Before
  public void init() {
    this.marble1 = new EnglishSolitaireModel(3, 3, 3);
    this.marble2 = new EnglishSolitaireModel();
    this.marble3 = new EnglishSolitaireModel(3, 0, 2);
    this.marble5 = new EnglishSolitaireModel(5, 6, 6);
    this.marble6 = new EnglishSolitaireModel(7, 17, 12);
    this.marble7 = new EnglishSolitaireModel(15, 17, 17);
    this.marble9 = new EnglishSolitaireModel(3);
    this.marble10 = new EnglishSolitaireModel(3, 3);
    this.marble11 = new EnglishSolitaireModel(3);


    this.tv1 = new MarbleSolitaireTextView(marble1);
    this.tv2 = new MarbleSolitaireTextView(marble2);
    this.tv3 = new MarbleSolitaireTextView(marble3);
    this.tv5 = new MarbleSolitaireTextView(marble5);
    this.tv6 = new MarbleSolitaireTextView(marble6);
    this.tv7 = new MarbleSolitaireTextView(marble7);
    this.tv9 = new MarbleSolitaireTextView(marble9);
    this.tv10 = new MarbleSolitaireTextView(marble10);
    this.tv11 = new MarbleSolitaireTextView(marble11);

  }

  @Test
  public void testToString() {
    init();


    assertEquals("    O O O\n" +
            "    O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "    O O O\n" +
            "    O O O", tv1.toString());
    assertEquals("    O O O\n" +
            "    O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "    O O O\n" +
            "    O O O", tv11.toString());


    assertEquals("    O O O\n" +
            "    O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "    O O O\n" +
            "    O O O", tv9.toString());

    assertEquals("    O O O\n" +
            "    O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "    O O O\n" +
            "    O O O", tv2.toString());
    assertEquals("    O O O\n" +
            "    O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "    O O O\n" +
            "    O O O", tv10.toString());

    assertEquals("    _ O O\n" +
            "    O O O\n" +
            "O O O O O O O\n" +
            "O O O O O O O\n" +
            "O O O O O O O\n" +
            "    O O O\n" +
            "    O O O", tv3.toString());
    assertEquals("        O O O O O\n" +
            "        O O O O O\n" +
            "        O O O O O\n" +
            "        O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "O O O O O O _ O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "        O O O O O\n" +
            "        O O O O O\n" +
            "        O O O O O\n" +
            "        O O O O O", tv5.toString());
    assertEquals("            O O O O O O O\n" +
            "            O O O O O O O\n" +
            "            O O O O O O O\n" +
            "            O O O O O O O\n" +
            "            O O O O O O O\n" +
            "            O O O O O O O\n" +
            "O O O O O O O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O O O O O O O\n" +
            "            O O O O O O O\n" +
            "            O O O O O O O\n" +
            "            O O O O O O O\n" +
            "            O O O O O O O\n" +
            "            O O O O O O _\n" +
            "            O O O O O O O", tv6.toString());
    assertEquals("                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O _ O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O O" +
            " O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O\n" +
            "                            O O O O O O O O O O O O O O O", tv7.toString());


    System.out.print(tv2.toString());

    System.out.print(tv5.toString());

    System.out.print(tv3.toString());

  }

  @Test
  public void testValidMove() {
    init();
    marble2.move(5, 3, 3, 3);
    marble2.toString();

    marble2.move(2, 5, 2, 3);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, marble2.getSlotAt(2, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, marble2.getSlotAt(2, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, marble2.getSlotAt(2, 5));

    marble2.move(3, 1, 3, 3);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, marble2.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, marble2.getSlotAt(3, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, marble2.getSlotAt(3, 2));

    assertEquals(MarbleSolitaireModelState.SlotState.Marble, marble2.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, marble2.getSlotAt(4, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, marble2.getSlotAt(5, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, marble2.getSlotAt(0, 0));

    marble2.move(2, 3, 4, 3);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, marble2.getSlotAt(4, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, marble2.getSlotAt(2, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, marble2.getSlotAt(3, 3));

  }

  @Test
  public void testInvalidMove() {
    init();

    try {
      marble6.move(0, 4, -1, 10);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      marble2.move(3, 3, -1, 3);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      marble5.move(6, 11, 6, 13);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      marble2.move(3, 3, 5, 3);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      marble2.move(2, 3, 3, 3);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      marble2.move(0, 0, 3, 3);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
  }


  @Test
  public void testValidGetSlotAt() {
    init();
    assertEquals(MarbleSolitaireModelState.SlotState.Empty,
            marble3.getSlotAt(0, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid,
            marble2.getSlotAt(0, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble,
            marble2.getSlotAt(4, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty,
            marble2.getSlotAt(3, 3));
  }

  @Test
  public void testInValidGetSlotAt() {
    init();

    try {
      marble2.getSlotAt(8, 8);
      fail("IllegalArgumentException should be thrown");
    } catch (IllegalArgumentException e) {
      // no catch
    }

    try {
      marble2.getSlotAt(-1, -1);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }

  }

  @Test
  public void testGetScore() {
    init();
    assertEquals(32, marble2.getScore());
    marble2.move(5, 3, 3, 3);
    assertEquals(31, marble2.getScore());
    marble2.move(2, 3, 4, 3);
    assertEquals(30, marble2.getScore());
  }

  @Test
  public void testIsGameOver() {
    init();

    marble2.move(6, 4, 4, 4);
    marble2.move(2, 2, 4, 2);
    marble2.move(0, 2, 2, 2);
    marble2.move(1, 4, 3, 4);
    marble2.move(3, 4, 5, 4);
    marble2.move(5, 4, 5, 2);
    marble2.move(5, 2, 3, 2);
    marble2.move(3, 2, 1, 2);
    marble2.move(2, 0, 4, 0);
    marble2.move(4, 0, 4, 2);
    marble2.move(4, 2, 4, 4);
    marble2.move(2, 6, 2, 4);
    marble2.move(2, 3, 2, 5);
    marble2.move(4, 6, 2, 6);
    marble2.move(2, 6, 2, 4);
    marble2.move(0, 4, 0, 2);
    marble2.move(0, 2, 2, 2);
    marble2.move(2, 1, 2, 3);
    marble2.move(2, 3, 2, 5);
    marble2.move(2, 5, 4, 5);
    marble2.move(4, 5, 4, 3);
    marble2.move(4, 3, 2, 3);
    marble2.move(1, 3, 3, 3);
    assertTrue(marble2.isGameOver());

    marble2.move(3, 1, 3, 3);
    marble2.toString();
    marble2.move(5, 2, 3, 2);
    marble2.move(4, 0, 4, 2);
    marble2.move(4, 3, 4, 1);
    marble2.move(4, 5, 4, 3);
    marble2.move(6, 4, 4, 4);
    marble2.move(3, 4, 5, 4);
    marble2.move(6, 2, 6, 4);
    assertFalse(marble2.isGameOver());


  }

  @Test
  public void testInvalidInitialization() {
    try {
      this.marble4 = new EnglishSolitaireModel(3, 0, 5);
      this.tv4 = new MarbleSolitaireTextView(marble1);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.marble2 = new EnglishSolitaireModel(3, 0, 0);
      this.tv2 = new MarbleSolitaireTextView(marble2);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.marble6 = new EnglishSolitaireModel(7, -1, 4);
      this.tv6 = new MarbleSolitaireTextView(marble6);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.marble8 = new EnglishSolitaireModel(5, 4, -3);
      this.tv8 = new MarbleSolitaireTextView(marble8);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.marble1 = new EnglishSolitaireModel(-2, 3, 3);
      this.tv1 = new MarbleSolitaireTextView(marble1);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.marble1 = new EnglishSolitaireModel(2);
      this.tv1 = new MarbleSolitaireTextView(marble1);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.marble10 = new EnglishSolitaireModel(8, 8);
      this.tv10 = new MarbleSolitaireTextView(marble10);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.marble10 = new EnglishSolitaireModel(4);
      this.tv10 = new MarbleSolitaireTextView(marble10);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.marble10 = new EnglishSolitaireModel(4, 3, 3);
      this.tv10 = new MarbleSolitaireTextView(marble10);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }

  }


  @Test
  public void testInvalidModelView() {
    try {
      this.marble4 = null;
      this.tv4 = new MarbleSolitaireTextView(marble4);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
  }

}