package model;

import java.util.ArrayList;

/**
 * This class represent the isolation, which has some cages and houses some monkeys
 */
public class Isolation implements Housing{

  private ArrayList<Monkey> cages;
  private final int cageNumber;

  /**
   * Construct the isolation with 20 new cages and the number of monkey is zero
   */
  public Isolation() {
    cages = new ArrayList<>();
    cageNumber = 20;
  }

  @Override
  public void addMonkey(Monkey monkey){
    if(checkFull())
      throw new IllegalArgumentException("Monkeys cannot be added since cages are full!");
    cages.add(monkey);
  }

  /**
   * Check whether the cages are full or not
   * @return if yes, return true. If not, return false
   */
  private boolean checkFull(){
    return cages.size() >= cageNumber;
  }

  @Override
  public void removeMonkey(Monkey monkey){
    cages.remove(monkey);
  }

  @Override
  public ArrayList<Monkey> returnMonkey(){
    return cages;
  }

}
