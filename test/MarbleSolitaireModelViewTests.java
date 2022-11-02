import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;
import cs3500.marblesolitaire.model.hw04.EuropeanSolitaireModel;
import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;
import cs3500.marblesolitaire.view.TriangleSolitaireTextView;


/**
 * Marble Solitaire .test class
 */
public class MarbleSolitaireModelViewTests {
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

  TriangleSolitaireModel t1;
  TriangleSolitaireModel t2;
  TriangleSolitaireModel t3;
  TriangleSolitaireModel t4;
  TriangleSolitaireModel t5;
  TriangleSolitaireModel t6;
  TriangleSolitaireTextView vt1;
  TriangleSolitaireTextView vt2;
  TriangleSolitaireTextView vt3;
  TriangleSolitaireTextView vt4;
  TriangleSolitaireTextView vt5;
  TriangleSolitaireTextView vt6;

  EuropeanSolitaireModel e1;
  EuropeanSolitaireModel e2;
  EuropeanSolitaireModel e3;
  EuropeanSolitaireModel e4;
  EuropeanSolitaireModel e5;
  MarbleSolitaireTextView ve1;
  MarbleSolitaireTextView ve2;
  MarbleSolitaireTextView ve3;
  MarbleSolitaireTextView ve4;
  MarbleSolitaireTextView ve5;

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

    this.t1 = new TriangleSolitaireModel(5, 0, 0);
    this.vt1 = new TriangleSolitaireTextView(t1);

    this.t2 = new TriangleSolitaireModel();
    this.vt2 = new TriangleSolitaireTextView(t2);

    this.t3 = new TriangleSolitaireModel(5);
    this.vt3 = new TriangleSolitaireTextView(t3);

    this.t4 = new TriangleSolitaireModel(0, 0);
    this.vt4 = new TriangleSolitaireTextView(t4);

    this.t5 = new TriangleSolitaireModel(3, 1);
    this.vt5 = new TriangleSolitaireTextView(t5);

    this.t6 = new TriangleSolitaireModel(7, 2, 2);
    this.vt6 = new TriangleSolitaireTextView(t6);



    this.e1 = new EuropeanSolitaireModel(3, 3, 3);
    this.ve1 = new MarbleSolitaireTextView(e1);

    this.e2 = new EuropeanSolitaireModel();
    this.ve2 = new MarbleSolitaireTextView(e2);

    this.e3 = new EuropeanSolitaireModel(3);
    this.ve3 = new MarbleSolitaireTextView(e3);

    this.e4 = new EuropeanSolitaireModel(3, 3);
    this.ve4 = new MarbleSolitaireTextView(e4);

    this.e5 = new EuropeanSolitaireModel(3, 6, 2);
    this.ve5 = new MarbleSolitaireTextView(e5);

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
  public void testToStringTriangle() {
    init();

    assertEquals("    _\n" +
            "   O O\n" +
            "  O O O\n" +
            " O O O O\n" +
            "O O O O O", vt1.toString());
    assertEquals("    _\n" +
            "   O O\n" +
            "  O O O\n" +
            " O O O O\n" +
            "O O O O O", vt2.toString());
    assertEquals("    _\n" +
            "   O O\n" +
            "  O O O\n" +
            " O O O O\n" +
            "O O O O O", vt3.toString());
    assertEquals("    _\n" +
            "   O O\n" +
            "  O O O\n" +
            " O O O O\n" +
            "O O O O O", vt4.toString());
    assertEquals("    O\n" +
            "   O O\n" +
            "  O O O\n" +
            " O _ O O\n" +
            "O O O O O", vt5.toString());
    assertEquals("      O\n" +
            "     O O\n" +
            "    O O _\n" +
            "   O O O O\n" +
            "  O O O O O\n" +
            " O O O O O O\n" +
            "O O O O O O O", vt6.toString());
  }

  @Test
  public void testToStringEuropean() {
    init();

    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", ve1.toString());
    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", ve2.toString());
    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", ve3.toString());
    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", ve4.toString());
    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O O O O O O O\n" +
            "O O O O O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    _ O O", ve5.toString());
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
  public void testValidEuroMove() {
    init();
    e1.move(1, 3, 3, 3);
    e1.toString();
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, e1.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, e1.getSlotAt(1, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, e1.getSlotAt(2, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, e1.getSlotAt(0, 1));

    e1.move(2, 1, 2, 3);
    e1.toString();
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, e1.getSlotAt(2, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, e1.getSlotAt(2, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, e1.getSlotAt(2, 2));

    e1.move(0, 2, 2, 2);
    e1.toString();
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, e1.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, e1.getSlotAt(0, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, e1.getSlotAt(1, 2));

    e1.move(3, 2, 1, 2);
    e1.toString();
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, e1.getSlotAt(1, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, e1.getSlotAt(3, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, e1.getSlotAt(2, 2));

    e1.move(2, 4, 2, 2);
    e1.toString();
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, e1.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, e1.getSlotAt(2, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, e1.getSlotAt(2, 3));
  }

  @Test
  public void testValidTriangleMove() {
    init();
    t1.move(2, 0, 0, 0);
    t1.toString();
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, t1.getSlotAt(0, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(2, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(1, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, t1.getSlotAt(0, 1));

    t1.move(2,2,2,0);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, t1.getSlotAt(2, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(2, 1));

    t1.move(4,4,2,2);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, t1.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(4, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(3, 3));


    t1.move(1,1,3,3);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, t1.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(1, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(2, 2));


    t1.move(4,2,2,2);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, t1.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(4, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(3, 2));


    t1.move(4,0,4,2);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, t1.getSlotAt(4, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(4, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(4, 1));


    t1.move(4,3,4,1);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, t1.getSlotAt(4, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(4, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(4, 2));


    t1.move(4,1,2,1);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, t1.getSlotAt(2, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(4, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, t1.getSlotAt(3, 1));

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
  public void testInvalidEuroMove() {
    try {
      e1.move(3, 3, 5, 3);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      e1.move(2, 3, 3, 3);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      e1.move(0, 0, 3, 3);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      e1.move(0, 4, -1, 10);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      e1.move(3, 3, -1, 3);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      e1.move(6,11,6,13);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
  }

  @Test
  public void testInvalidTriangleMove() {
    init();
    try {
      t1.move(0, 0, 0, 0);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      t1.move(1, 0, 1, 2);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      t1.move(3, 0, 3, 3);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      t1.move(3, 0, 2, 2);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
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
    assertEquals(MarbleSolitaireModelState.SlotState.Marble,
            e1.getSlotAt(4, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty,
            e1.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty,
            e5.getSlotAt(6, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid,
            e1.getSlotAt(0, 1));
  }

  @Test
  public void testTriangleValidGetSlotAt() {
    init();
    assertEquals(MarbleSolitaireModelState.SlotState.Marble,
            t1.getSlotAt(2, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty,
            t1.getSlotAt(0, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty,
            t6.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid,
            t1.getSlotAt(0, 1));
  }

  @Test
  public void testInValidGetSlotAt() {
    init();

    try {
      marble2.getSlotAt(8, 8);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }

    try {
      marble2.getSlotAt(-1, -1);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // no catch
    }

    try {
      e1.getSlotAt(-1, -1);
      fail("llegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      e1.getSlotAt(8, 8);
      fail("IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
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

    assertEquals(14, t1.getScore());
    t1.move(2, 0, 0, 0);
    assertEquals(13, t1.getScore());

    assertEquals(36, e1.getScore());
    e1.move(1, 3, 3, 3);
    assertEquals(35, e1.getScore());
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
  public void testEuropeanIsGameOver() {
    init();

    e1.move(1, 3, 3, 3);
    e1.move(2,1,2,3);
    e1.move(0, 2, 2, 2);
    e1.move(3, 2, 1, 2);
    e1.move(2, 4, 2, 2);
    e1.move(5, 2, 3, 2);
    e1.move(4, 0, 4, 2);
    e1.move(4, 3, 4, 1);
    e1.move(2, 6, 2, 4);
    e1.move(2, 0, 4, 0);
    e1.move(4, 0, 4, 2);
    e1.move(4, 5, 4, 3);
    e1.move(4, 3, 4, 1);
    e1.move(4, 1, 2, 1);
    e1.move(2, 1, 2, 3);
    e1.move(2, 3, 2, 5);
    e1.move(6, 4, 4, 4);
    e1.move(3, 4, 5, 4);
    e1.move(4, 6, 2, 6);
    assertFalse(e1.isGameOver());
    e1.move(2, 6, 2, 4);
    e1.move(6, 2, 6, 4);
    e1.move(6, 4, 4, 4);
    e1.move(0, 4, 0, 2);
    e1.move(0, 2, 2, 2);
    e1.move(2, 2, 4, 2);
    e1.move(1, 4, 3, 4);
    e1.move(3, 4, 5, 4);
    e1.move(5, 4, 5, 2);
    e1.move(5, 2, 3, 2);
    e1.move(3, 2, 3, 4);
    e1.move(3, 5, 3, 3);
    assertTrue(e1.isGameOver());

  }

  @Test
  public void isTriangleGameOver() {
    init();

    t1.move(2, 0, 0,0);
    t1.move(2,2,2,0);
    t1.move(4,4,2,2);
    t1.move(1,1,3,3);
    t1.move(4,2,2,2);
    t1.move(4,0,4,2);
    t1.move(4,3,4,1);
    t1.move(4,1,2,1);
    t1.move(3,3,1,1);
    assertFalse(t1.isGameOver());
    t1.move(3,0,1,0);
    t1.move(0,0,2,0);
    t1.move(2,0,2,2);
    t1.move(2,2,0,0);
    assertTrue(t1.isGameOver());
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
  public void testInvalidTriangleInitialization() {
    try {
      this.t1 = new TriangleSolitaireModel(5, 0, 1);
      this.vt1 = new TriangleSolitaireTextView(t1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.t1 = new TriangleSolitaireModel(5, 4, 5);
      this.vt1 = new TriangleSolitaireTextView(t1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.t1 = new TriangleSolitaireModel(5, 4, 7);
      this.vt1 = new TriangleSolitaireTextView(t1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.t3 = new TriangleSolitaireModel(-1);
      this.vt3 = new TriangleSolitaireTextView(t3);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.t4 = new TriangleSolitaireModel(0, 5);
      this.vt4 = new TriangleSolitaireTextView(t4);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }

  }


  @Test
  public void testInvalidEuroInitialization() {
    try {
      this.e1 = new EuropeanSolitaireModel(3, 0, 1);
      this.ve1 = new MarbleSolitaireTextView(e1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.e1 = new EuropeanSolitaireModel(3, 1, 6);
      this.ve1 = new MarbleSolitaireTextView(e1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.e1 = new EuropeanSolitaireModel(3, 5, 0);
      this.ve1 = new MarbleSolitaireTextView(e1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.e1 = new EuropeanSolitaireModel(3, 5, 6);
      this.ve1 = new MarbleSolitaireTextView(e1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.e1 = new EuropeanSolitaireModel(3, -1, 1);
      this.ve1 = new MarbleSolitaireTextView(e1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.e1 = new EuropeanSolitaireModel(3, 0, 8);
      this.ve1 = new MarbleSolitaireTextView(e1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.e1 = new EuropeanSolitaireModel(-3);
      this.ve1 = new MarbleSolitaireTextView(e1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.e1 = new EuropeanSolitaireModel(6);
      this.ve1 = new MarbleSolitaireTextView(e1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
    try {
      this.e1 = new EuropeanSolitaireModel(0, 5);
      this.ve1 = new MarbleSolitaireTextView(e1);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
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

    try {
      this.e4 = null;
      this.ve4 = new MarbleSolitaireTextView(e4);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }

  }

  @Test
  public void testInvalidTriangleModelView() {
    try {
      this.t4 = null;
      this.vt4 = new TriangleSolitaireTextView(t4);
      fail("Should have thrown an IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // do nothing
    }
  }

}