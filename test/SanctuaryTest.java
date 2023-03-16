import static org.junit.Assert.*;

import model.Food;
import model.Monkey;
import model.Sanctuary;
import model.SanctuaryImpl;
import model.Sex;
import model.Size;
import model.Species;
import org.junit.Test;

/**
 * This class tests various methods of SanctuaryImpl
 */
public class SanctuaryTest {
  Sanctuary sanctuary;
  Monkey monkey1;
  Monkey monkey2;
  Monkey monkey3;
  Monkey monkey4;
  Monkey monkey5;
  Monkey monkey6;

  @org.junit.Before
  public void setUp() throws Exception {
    sanctuary = new SanctuaryImpl();
    monkey1 = new Monkey("Anna", Species.MANGABEY, Sex.FEMALE,
        Size.LARGE,23.0,5, Food.NUTS,true);
    sanctuary.addMonkeyFirstIsolation(monkey1);

    monkey2 = new Monkey("Cindy",Species.HOWLER,Sex.FEMALE,
        Size.MEDIUM,32.0,9,Food.EGGS,true);
    sanctuary.addMonkeyFirstIsolation(monkey2);

    monkey3 = new Monkey("Bell",Species.DRILL,Sex.MALE,
        Size.SMALL,10.0,9,Food.LEAVES,true);
    sanctuary.addMonkeyFirstIsolation(monkey3);

    monkey4 = new Monkey("Dollar",Species.SAKI,Sex.MALE,
        Size.SMALL,8.0,5,Food.TREESAP,true);
    sanctuary.addMonkeyFirstIsolation(monkey4);

    monkey5 = new Monkey("Queen",Species.DRILL,Sex.FEMALE,
        Size.MEDIUM,25.0,3,Food.INSECTS,true);
    sanctuary.addMonkeyFirstIsolation(monkey5);

    monkey6 = new Monkey("Prince",Species.GUEREZA,Sex.FEMALE,
        Size.MEDIUM,21.0,11,Food.FRUITS,true);
    sanctuary.addMonkeyFirstIsolation(monkey6);

    sanctuary.addMonkeyEnclosures(monkey1);
    sanctuary.addMonkeyEnclosures(monkey2);
    sanctuary.addMonkeyEnclosures(monkey3);
    sanctuary.addMonkeyEnclosures(monkey4);
    sanctuary.addMonkeyEnclosures(monkey5);
    sanctuary.addMonkeyEnclosures(monkey6);

  }

  /**
   * Tests that monkeys are created correctly
   */
  @Test
  public void createMonkey(){
    Monkey monkey1 = new Monkey("Bill",Species.DRILL,Sex.MALE,
        Size.SMALL,6.0,4,Food.LEAVES,true);
    Monkey monkey2 = new Monkey("Delta",Species.SQUIRREL,
        Sex.FEMALE,Size.LARGE,67.0,7,Food.SEEDS,true);
  }

  /**
   * Tests that an exception is thrown if creating an invalid monkey is attempted
   */
  @Test(expected = IllegalArgumentException.class)
  public void InvalidMonkey(){
    //there is already a monkey who has the same name in the sanctuary
    Monkey monkey = new Monkey("Anna",Species.SPIDER,Sex.MALE,
        Size.LARGE,32.0,8,Food.SEEDS,true);
    sanctuary.addMonkeyFirstIsolation(monkey);
  }

  /**
   * Tests that a monkey can be added to isolation successfully
   */
  public void addIsolation(){
    Monkey monkey = new Monkey("Minne",Species.TAMARIN,Sex.FEMALE,
        Size.SMALL,1.0,2,Food.INSECTS,true);
    sanctuary.addMonkeyFirstIsolation(monkey);
  }

  /**
   * Tests that monkey cannot be added to isolation if it is already full
   */
  @Test(expected = IllegalArgumentException.class)
  public void isolationFull(){
    for (int i = 0; i < 21; i++) {
      sanctuary.addMonkeyFirstIsolation(new Monkey(("Tom" + i),Species.SAKI,Sex.MALE,
          Size.SMALL,1.0,1,Food.NUTS,true));
    }
  }

  /**
   * Tests that a unhealthy monkey cannot be added to an enclosure
   */
  @Test(expected = IllegalArgumentException.class)
  public void unhealthyMonkey(){
    Monkey monkey = new Monkey("Flag",Species.SAKI,Sex.MALE,
        Size.LARGE,41.0,10,Food.FRUITS,false);
    sanctuary.addMonkeyFirstIsolation(monkey);
    sanctuary.addMonkeyEnclosures(monkey);
  }

  /**
   * Tests that a monkey can be moved from isolation to an enclosure
   */
  @Test
  public void addEnclosure(){
    Monkey monkey = new Monkey("Gigi",Species.SAKI,Sex.FEMALE,
        Size.LARGE,23.0,5,Food.NUTS,true);
    sanctuary.addMonkeyFirstIsolation(monkey);
    sanctuary.addMonkeyEnclosures(monkey);
  }

  /**
   * Tests that report of species that are currently being housed in the sanctuary is correct
   */
  @Test
  public void verifySpecies(){
    //DRILL, GUEREZA, howler, mangabey, SAKI, SPIDER, SQUIRREL,TAMARIN
    assertEquals("name: Bell, sex: MALE, food: LEAVES\n"
            + "name: Queen, sex: FEMALE, food: INSECTS\n",
        sanctuary.singleEnclosureList(Species.DRILL));
    assertEquals("name: Prince, sex: FEMALE, food: FRUITS\n",
        sanctuary.singleEnclosureList(Species.GUEREZA));
    assertEquals("name: Cindy, sex: FEMALE, food: EGGS\n",
        sanctuary.singleEnclosureList(Species.HOWLER));
    assertEquals("name: Anna, sex: FEMALE, food: NUTS\n",
        sanctuary.singleEnclosureList(Species.MANGABEY));
    assertEquals("name: Dollar, sex: MALE, food: TREESAP\n",
        sanctuary.singleEnclosureList(Species.SAKI));
  }

  /**
   * Tests the list for a given enclosure
   */
  @Test
  public void enclosureList(){
    assertEquals("name: Bell, sex: MALE, food: LEAVES\n"
            + "name: Queen, sex: FEMALE, food: INSECTS\n",
        sanctuary.singleEnclosureList(Species.DRILL));
  }

  /**
   * the list of all monkeys housed in the Sanctuary is ordered by name
   */
  @Test
  public void sanctuaryList(){
    assertEquals(sanctuary.sanctuaryList(),"Anna Bell Cindy Dollar Prince Queen ");
  }

}