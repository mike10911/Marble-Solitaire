import org.junit.Before;
import org.junit.Test;

import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;

import cs3500.marblesolitaire.view.MarbleSolitaireTextView;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Represents the test class.
 */
public class MarbleSolitaireTest {
  EnglishSolitaireModel m1;
  EnglishSolitaireModel m2;
  EnglishSolitaireModel m3;
  EnglishSolitaireModel m4;
  EnglishSolitaireModel m5;
  EnglishSolitaireModel m6;
  EnglishSolitaireModel m7;
  EnglishSolitaireModel m8;
  EnglishSolitaireModel m9;
  EnglishSolitaireModel m10;
  EnglishSolitaireModel m11;

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
    this.m1 = new EnglishSolitaireModel(3, 3, 3);
    this.m2 = new EnglishSolitaireModel();
    this.m3 = new EnglishSolitaireModel(3, 0, 2);
    this.m5 = new EnglishSolitaireModel(5, 6, 6);
    this.m6 = new EnglishSolitaireModel(7, 17, 12);
    this.m7 = new EnglishSolitaireModel(15, 17, 17);
    this.m9 = new EnglishSolitaireModel(3);
    this.m10 = new EnglishSolitaireModel(3, 3);
    this.m11 = new EnglishSolitaireModel(3);


    this.tv1 = new MarbleSolitaireTextView(m1);
    this.tv2 = new MarbleSolitaireTextView(m2);
    this.tv3 = new MarbleSolitaireTextView(m3);
    this.tv5 = new MarbleSolitaireTextView(m5);
    this.tv6 = new MarbleSolitaireTextView(m6);
    this.tv7 = new MarbleSolitaireTextView(m7);
    this.tv9 = new MarbleSolitaireTextView(m9);
    this.tv10 = new MarbleSolitaireTextView(m10);
    this.tv11 = new MarbleSolitaireTextView(m11);

  }


  @Test
  public void testInvalidInitialization() {
    try {
      this.m4 = new EnglishSolitaireModel(3, 0, 5);
      this.tv4 = new MarbleSolitaireTextView(m1);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.m2 = new EnglishSolitaireModel(3, 0, 0);
      this.tv2 = new MarbleSolitaireTextView(m2);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.m6 = new EnglishSolitaireModel(7, -1, 4);
      this.tv6 = new MarbleSolitaireTextView(m6);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.m8 = new EnglishSolitaireModel(5, 4, -3);
      this.tv8 = new MarbleSolitaireTextView(m8);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.m1 = new EnglishSolitaireModel(-2, 3, 3);
      this.tv1 = new MarbleSolitaireTextView(m1);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.m1 = new EnglishSolitaireModel(2);
      this.tv1 = new MarbleSolitaireTextView(m1);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.m10 = new EnglishSolitaireModel(8, 8);
      this.tv10 = new MarbleSolitaireTextView(m10);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.m10 = new EnglishSolitaireModel(4);
      this.tv10 = new MarbleSolitaireTextView(m10);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      this.m10 = new EnglishSolitaireModel(4, 3, 3);
      this.tv10 = new MarbleSolitaireTextView(m10);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }

  }


  @Test
  public void testInvalidModelView() {
    try {
      this.m4 = null;
      this.tv4 = new MarbleSolitaireTextView(m4);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
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
    m2.move(5, 3, 3, 3);
    m2.toString();

    m2.move(2, 5, 2, 3);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, m2.getSlotAt(2, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, m2.getSlotAt(2, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, m2.getSlotAt(2, 5));

    m2.move(3, 1, 3, 3);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, m2.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, m2.getSlotAt(3, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, m2.getSlotAt(3, 2));

    assertEquals(MarbleSolitaireModelState.SlotState.Marble, m2.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, m2.getSlotAt(4, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, m2.getSlotAt(5, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, m2.getSlotAt(0, 0));

    m2.move(2, 3, 4, 3);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, m2.getSlotAt(4, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, m2.getSlotAt(2, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, m2.getSlotAt(3, 3));

  }

  @Test
  public void testInvalidMove() {
    init();

    try {
      m6.move(0, 4, -1, 10);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      m2.move(3, 3, -1, 3);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      m5.move(6, 11, 6, 13);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      m2.move(3, 3, 5, 3);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      m2.move(2, 3, 3, 3);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
    try {
      m2.move(0, 0, 3, 3);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }
  }


  @Test
  public void testValidGetSlotAt() {
    init();
    assertEquals(MarbleSolitaireModelState.SlotState.Empty,
            m3.getSlotAt(0, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid,
            m2.getSlotAt(0, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble,
            m2.getSlotAt(4, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty,
            m2.getSlotAt(3, 3));
  }

  @Test
  public void testInValidGetSlotAt() {
    init();

    try {
      m2.getSlotAt(8, 8);
      fail("IllegalArgumentException should be thrown");
    } catch (IllegalArgumentException e) {
      // no catch
    }

    try {
      m2.getSlotAt(-1, -1);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }

  }

  @Test
  public void testGetScore() {
    init();
    assertEquals(32, m2.getScore());
    m2.move(5, 3, 3, 3);
    assertEquals(31, m2.getScore());
    m2.move(2, 3, 4, 3);
    assertEquals(30, m2.getScore());
  }

  @Test
  public void testIsGameOver() {
    init();

    m2.move(6, 4, 4, 4);
    m2.move(2, 2, 4, 2);
    m2.move(0, 2, 2, 2);
    m2.move(1, 4, 3, 4);
    m2.move(3, 4, 5, 4);
    m2.move(5, 4, 5, 2);
    m2.move(5, 2, 3, 2);
    m2.move(3, 2, 1, 2);
    m2.move(2, 0, 4, 0);
    m2.move(4, 0, 4, 2);
    m2.move(4, 2, 4, 4);
    m2.move(2, 6, 2, 4);
    m2.move(2, 3, 2, 5);
    m2.move(4, 6, 2, 6);
    m2.move(2, 6, 2, 4);
    m2.move(0, 4, 0, 2);
    m2.move(0, 2, 2, 2);
    m2.move(2, 1, 2, 3);
    m2.move(2, 3, 2, 5);
    m2.move(2, 5, 4, 5);
    m2.move(4, 5, 4, 3);
    m2.move(4, 3, 2, 3);
    m2.move(1, 3, 3, 3);
    assertTrue(m2.isGameOver());

    m2.move(3, 1, 3, 3);
    m2.toString();
    m2.move(5, 2, 3, 2);
    m2.move(4, 0, 4, 2);
    m2.move(4, 3, 4, 1);
    m2.move(4, 5, 4, 3);
    m2.move(6, 4, 4, 4);
    m2.move(3, 4, 5, 4);
    m2.move(6, 2, 6, 4);
    assertFalse(m2.isGameOver());


  }

}