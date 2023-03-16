package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class represent various kinds of enclosures.
 */
public class Enclosures implements Housing {

  private HashMap<Species, ArrayList<Monkey>> enclosuresList;

  /**
   * Construct enclosures to house different kinds of monkeys
   */
  public Enclosures() {
    enclosuresList = new HashMap<>();
  }

  @Override
  public void addMonkey(Monkey monkey){
    //get the species of this monkey
    Species species = monkey.getSpecies();
    if(enclosuresList.containsKey(species)){
      enclosuresList.get(species).add(monkey);
    }else {
      //create a new ArrayList
      ArrayList<Monkey> enclosure = new ArrayList<>();
      //add the monkey to the ArrayList
      enclosure.add(monkey);
      //add the ArrayList to the hashmap
      enclosuresList.put(species,enclosure);
    }
  }

  @Override
  public void removeMonkey(Monkey monkey){
    Species species = monkey.getSpecies();
    ArrayList enclosure = enclosuresList.get(species);
    enclosure.remove(monkey);
  }

  @Override
  public ArrayList<Monkey> returnMonkey(){
    ArrayList<Monkey> monkeyIsolation = new ArrayList<>();
    for (ArrayList<Monkey> enclosure : enclosuresList.values()) {
      monkeyIsolation.addAll(enclosure);
    }
    return monkeyIsolation;
  }

  /**
   * Produce a list for a given enclosure
   * @param species the species that passed by user
   * @return a list for a given enclosure
   */
  public String singleEnclosureList(Species species) {
    ArrayList<Monkey> enclosure = enclosuresList.get(species);
    if(enclosure == null){
        throw new IllegalArgumentException("No monkeys in this enclosure");
    }
    String result = "";
    for (Monkey monkey : enclosure) {
      result += monkey.toString() + "\n";
    }
    return result;
  }

}
