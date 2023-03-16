package model;

import java.util.ArrayList;

/**
 * This class is the interface for Sanctuary.
 */
public interface Sanctuary {

  /**
   * Create a new monkey with the given name, species, sex, size, weight, age, food and healthy status
   * @param name the name of the monkey
   * @param species the species of the monkey
   * @param sex the sex of the monkey
   * @param size the size of the monkey
   * @param weight the weight of the monkey
   * @param age the age of the monkey
   * @param food the favorite food of the monkey
   * @param health the healthy status of the monkey
   * @return the created new monkey
   */
  Monkey createMonkey(String name, Species species, Sex sex, Size size, double weight, int age, Food food,
      boolean health);

  /**
   * Add monkey to the isolation: first added
   * @param monkey the added monkey
   * @exception IllegalArgumentException if there is already a monkey who has the same name
   */
  void addMonkeyFirstIsolation(Monkey monkey);

  /**
   * Add monkey to the isolation: removed from the enclosure
   * @param monkey the added monkey
   * @exception IllegalArgumentException if this monkey is already in isolation
   */
  void addMonkeyBackIsolation(Monkey monkey);

  /**
   * Add monkey which comes from isolation to enclosures
   * @param monkey the added monkey
   * @exception IllegalArgumentException if this monkey is unhealthy or this monkey is already in enclosure
   */
  void addMonkeyEnclosures(Monkey monkey);

  /**
   * Produce a list for a given enclosure that shows each individual monkey that is currently housed there
   * For each individual monkey, the list includes their name, sex, and favourite food
   * @param species the species that needs to show the specific enclosure
   * @return a list for a given enclosure that shows each individual monkey that is currently housed there
   */
  String singleEnclosureList(Species species);

  /**
   * All monkeys in the Sanctuary
   * @return All monkeys in the Sanctuary
   */
  ArrayList<Monkey> allMonkey();

  /**
   * Search Monkey in the Sanctuary according to its name
   * @param name the monkey's name
   * @return if exists, return the monkey
   * @exception IllegalArgumentException if there is no such a monkey
   */
  Monkey searchName(String name);

  /**
   * Produce an alphabetical list (by name) of all of the monkeys housed in the Sanctuary
   * @return an alphabetical list (by name) of all of the monkeys housed in the Sanctuary
   * @exception IllegalArgumentException if no monkeys in the sanctuary
   */
  String sanctuaryList();

  /**
   *  Treat a unhealthy monkey so that it can be healthy
   *  @exception IllegalArgumentException if this monkey is already healthy!
   */
  void treatMonkey(Monkey monkey);

}
