package model;

import java.util.ArrayList;

/**
 * This class is the interface for two kinds of housing: Enclosure and isolation
 */
public interface Housing {

  /**
   * Add the monkey to the certain kind of housing
   * @param monkey the monkey that needed to be added
   */
  void addMonkey(Monkey monkey);

  /**
   * Remove the monkey from the certain kind of housing
   * @param monkey the monkey the that needed to be removed
   */
  void removeMonkey(Monkey monkey);

  /**
   * Return all monkeys in the certain kind of housing
   * @return all monkeys in the certain kind of housing
   */
  ArrayList<Monkey> returnMonkey();

}
