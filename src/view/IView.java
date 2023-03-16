package view;

import controller.Feathers;
import java.util.ArrayList;
import model.Food;
import model.Monkey;
import model.Sex;
import model.Size;
import model.Species;

/**
 * This interface is for the view of this program
 */
public interface IView {

  /**
   * Add feathers to this view
   * @param feathers feathers of this program
   */
  void addFeather(Feathers feathers);

  /**
   * show the success message in the dialog window
   * @param s the success message that needs to be showed
   */
  void successMessage(String s);

  /**
   * show the list in the dialog window
   * @param list the list that needs to be showed
   */
  void printList(String list);

  /**
   * return moved monkey's name that entered by user
   * @return moved monkey's name that entered by user
   */
  String getMoveName();

  /**
   * return created monkey's name that entered by user
   * @return created monkey's name that entered by user
   */
  String getCreateName();

  /**
   * return created monkey's weight that entered by user
   * @return created monkey's weight that entered by user
   */
  double getWeight();

  /**
   * return created monkey's age that entered by user
   * @return created monkey's age that entered by user
   */
  int getAge();

  /**
   * return created monkey's species that entered by user
   * @return created monkey's species that entered by user
   */
  Species getSpeciesCreate();

  /**
   * return printed monkey's species that entered by user
   * @return printed monkey's species that entered by user
   */
  Species getSpeciesPrint();

  /**
   * return created monkey's sex that entered by user
   * @return created monkey's sex that entered by user
   */
  Sex getSexField();

  /**
   * return created monkey's size that entered by user
   * @return created monkey's size that entered by user
   */
  Size getSizeField();

  /**
   * return created monkey's favorite food that entered by user
   * @return created monkey's favorite food that entered by user
   */
  Food getFoodField();

  /**
   * return created monkey's healthy status that entered by user
   * @return created monkey's healthy status that entered by user
   */
  boolean getHealthField();

  /**
   * show the error message in the dialog window
   * @param error the error message that needs to be showed
   */
  void showErrorMessage(String error);

  /**
   * reset the create monkeys tab
   */
  void reSetCreate();

  /**
   * reset the move monkeys tab
   */
  void reSetMove();

  /**
   * reset the print monkeys tab
   */
  void reSetPrint();

  /**
   * Update the monkeys in the sanctuary
   */
  void updateMonkey(ArrayList<Monkey> monkeys);
}
