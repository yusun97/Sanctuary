package controller;

import model.Monkey;
import model.SanctuaryImpl;
import model.Species;
import view.ViewImpl;

/**
 * This class presents the controller of this program
 */
public class ControllerImpl implements Feathers {

  private SanctuaryImpl model;
  private ViewImpl view;

  /**
   * Construct the controller with given model and view
   * @param model the model of this program
   * @param view the view of this program
   */
  public ControllerImpl(SanctuaryImpl model, ViewImpl view) {
    this.model = model;
    this.view = view;
    view.addFeather(this);
  }

  @Override
  public void createMonkey() {
    try {
      Monkey newMonkey = model.createMonkey(view.getCreateName(), view.getSpeciesCreate(),
          view.getSexField(), view.getSizeField(), view.getWeight(), view.getAge(),
          view.getFoodField(), view.getHealthField());
      model.addMonkeyFirstIsolation(newMonkey);
      view.updateMonkey(model.allMonkey());
      view.successMessage("New monkey has been created!");
    } catch (Exception e) {
      view.showErrorMessage(e.getMessage());
    }
    view.reSetCreate();
  }

  @Override
  public void addIsolation() {
    try {
      Monkey monkey = model.searchName(view.getMoveName());
      model.addMonkeyBackIsolation(monkey);
      view.successMessage("This monkey has been moved to the isolation!");
    } catch (Exception e) {
      view.showErrorMessage(e.getMessage());
    }
    view.reSetMove();
  }

  @Override
  public void addEnclosure() {
    try {
      Monkey monkey = model.searchName(view.getMoveName());
      model.addMonkeyEnclosures(monkey);
      view.successMessage("This monkey has been moved to the specific enclosure!");
    } catch (Exception e) {
      view.showErrorMessage(e.getMessage());
    }
    view.reSetMove();
  }

  @Override
  public void treatMonkey() {
    try {
      Monkey monkey = model.searchName(view.getMoveName());
      model.treatMonkey(monkey);
      view.successMessage("Now this monkey is healthy!");
    } catch (Exception e) {
      view.showErrorMessage(e.getMessage());
    }
  }

  @Override
  public void printSanctuaryList() {
    try {
      String list = model.sanctuaryList();
      view.printList(list);
    } catch (Exception e) {
      view.showErrorMessage(e.getMessage());
    }
  }

  @Override
  public void printEnclosureList() {
    try {
      Species species = view.getSpeciesPrint();
      String list = model.singleEnclosureList(species);
      view.printList(list);
    } catch (Exception e) {
      view.showErrorMessage(e.getMessage());
    }
    view.reSetPrint();
  }
}

