package controller;

/**
 * This interface represents feathers of this program
 */
public interface Feathers {

  /**
   * Create new monkeys based on information entered by users
   */
  void createMonkey();

  /**
   * add the specific monkey to the isolation
   */
  void addIsolation();

  /**
   * add the specific monkey to the enclosure
   */
  void addEnclosure();

  /**
   * Treat the specific monkey
   */
  void treatMonkey();

  /**
   * Print the list of all monkeys in the Sanctuary
   */
  void printSanctuaryList();

  /**
   * Print the list of all monkeys in the given enclosure
   */
  void printEnclosureList();

}
