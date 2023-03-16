package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class represent a Sanctuary which has two areas, enclosures and isolation
 */
public class SanctuaryImpl implements Sanctuary {

  private final Enclosures enclosures;
  private final Isolation isolation;

  /**
   * Construct a sanctuary with new enclosures and isolation
   */
  public SanctuaryImpl() {
    enclosures = new Enclosures();
    isolation = new Isolation();
  }

  @Override
  public Monkey createMonkey(String name, Species species, Sex sex, Size size, double weight,
      int age, Food food, boolean health) {
    return new Monkey(name, species, sex, size, weight, age, food, health);
  }

  @Override
  public void addMonkeyFirstIsolation(Monkey monkey) {
    if(sanctuaryList().contains(monkey.getName())){
      throw new IllegalArgumentException("There is already a monkey who has the same name!");
    }
    isolation.addMonkey(monkey);
  }

  @Override
  public void addMonkeyBackIsolation(Monkey monkey) {
    if(isolation.returnMonkey().contains(monkey)){
      throw new IllegalArgumentException("This monkey is already in isolation");
    }
    monkey.setHealth(false);
    enclosures.removeMonkey(monkey);
    isolation.addMonkey(monkey);
  }

  @Override
  public void addMonkeyEnclosures(Monkey monkey) {
    //unhealthy monkey
    if (!monkey.isHealth()) {
      throw new IllegalArgumentException("The unhealthy monkey cannot be moved to enclosures");
    }
    if(enclosures.returnMonkey().contains((monkey))){
      throw new IllegalArgumentException("This monkey is already in enclosure");
    }
    isolation.removeMonkey(monkey);
    enclosures.addMonkey(monkey);
  }

  @Override
  public String singleEnclosureList(Species species) {
    return enclosures.singleEnclosureList(species);
  }

  @Override
  public ArrayList<Monkey> allMonkey(){
    ArrayList<Monkey> allMonkey = new ArrayList();
    allMonkey.addAll(isolation.returnMonkey());
    allMonkey.addAll(enclosures.returnMonkey());
    //sort name of monkeys alphabetically
    Collections.sort(allMonkey);
    return allMonkey;
  }

  @Override
  public Monkey searchName(String name){
    for(Monkey monkey: allMonkey()){
      if(monkey.getName().equals(name)){
        return monkey;
      }
    }
    throw new IllegalArgumentException("There is no such a monkey");
  }

  @Override
  public String sanctuaryList() {
    if(allMonkey() == null){
      throw new IllegalArgumentException("No monkeys in the sanctuary");
    }

    String result = "";
    for (Monkey monkey : allMonkey()) {
      result += monkey.getName() + " ";
    }
    return result;
  }
 
  @Override
  public void treatMonkey(Monkey monkey) {
    if(monkey.isHealth()){
      throw new IllegalArgumentException("This monkey is already healthy!");
    }
    monkey.setHealth(true);
  }
}
