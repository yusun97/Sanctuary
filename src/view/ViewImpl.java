package view;

import controller.Feathers;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;
import model.Food;
import model.Monkey;
import model.Sex;
import model.Size;
import model.Species;

/**
 * This class is the view of this program
 */
public class ViewImpl extends JFrame implements IView {
  private JButton addIsolation, addEnclosure, treat, printEnclosure, printSanctuary, createMonkey;
  private JTextField createName, weight, age;
  private JComboBox<Species> speciesFieldCreate;
  private JComboBox<Species> speciesFieldPrint;
  private JComboBox<Sex> sexField;
  private JComboBox<Size> sizeField;
  private JComboBox<Food> foodField;
  private JComboBox<Boolean> healthField;
  private JComboBox<String> moveName2;


  /**
   * Construct the view
   * @param title the title of the view
   */
  public ViewImpl(String title) {
    //set the title of the view
    super(title);

    //create tabs
    JTabbedPane tabbedPane = new JTabbedPane();
    this.add(tabbedPane);

    //add different panel to different tabs
    JPanel createPanel = new JPanel();
    tabbedPane.add("Create Monkeys",createPanel);

    JPanel movePanel = new JPanel();
    tabbedPane.add("Move Monkeys",movePanel);

    JPanel printPanel = new JPanel();
    tabbedPane.add("Print Monkeys",printPanel);

    //move panel: ask user to enter monkey's name
    JLabel moveNotice = new JLabel("Please enter Monkey's name");
    moveNotice.setFont(new Font("",Font.BOLD,14));
    movePanel.add(moveNotice);

    //add moveName to movePanel
    moveName2 = new JComboBox<>();
    movePanel.add(moveName2);

    //add button to movePanel
    addIsolation = new JButton("Add Isolation");
    movePanel.add(addIsolation);

    addEnclosure = new JButton("Add enclosure");
    movePanel.add(addEnclosure);

    treat = new JButton("Treat Monkey");
    movePanel.add(treat);

    //add species list to printPanel
    speciesFieldPrint = new JComboBox<>();
    printPanel.add(speciesFieldPrint);
    for(Species species: Species.values()){
      speciesFieldPrint.addItem(species);
    }

    //add button to printPanel
    printEnclosure = new JButton("monkeys in the given enclosure");
    printPanel.add(printEnclosure);

    printSanctuary = new JButton("all monkeys in the sanctuary");
    printPanel.add(printSanctuary);

    //add notice text field to creatPanel
    JLabel notice = new JLabel("Please enter a name, a species designation, a sex, a size, "
        + "a weight, an approximate age, a favorite food and the health status one by one");
    notice.setFont(new Font("",Font.BOLD,14));
    createPanel.add(notice);

    //add name to creatPanel
    createName = new JTextField(5);
    createPanel.add(createName);

    //add species list to creatPanel
    speciesFieldCreate = new JComboBox<>();
    createPanel.add(speciesFieldCreate);
    for(Species species: Species.values()){
      speciesFieldCreate.addItem(species);
    }

    //add Sex list to creatPanel
    sexField = new JComboBox<>();
    createPanel.add(sexField);
    for(Sex sex: Sex.values()){
      sexField.addItem(sex);
    }

    //add Size list to creatPanel
    sizeField = new JComboBox<>();
    createPanel.add(sizeField);
    for(Size size: Size.values()){
      sizeField.addItem(size);
    }

    //add weight text field to creatPanel
    weight = new JTextField(5);
    createPanel.add(weight);

    //add age text field to creatPanel
    age = new JTextField(5);
    createPanel.add(age);

    //add Food list to creatPanel
    foodField = new JComboBox<>();
    createPanel.add(foodField);
    for(Food food: Food.values()){
      foodField.addItem(food);
    }

    //add health list to creatPanel
    healthField = new JComboBox<>();
    createPanel.add(healthField);
    healthField.addItem(true);
    healthField.addItem(false);

    createMonkey = new JButton("Create");
    createPanel.add(createMonkey);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1010,400);
    this.setVisible(true);
  }

  @Override
  public void addFeather(Feathers feathers){
    createMonkey.addActionListener(evt -> feathers.createMonkey());
    addIsolation.addActionListener(evt -> feathers.addIsolation());
    addEnclosure.addActionListener(evt -> feathers.addEnclosure());
    treat.addActionListener(evt -> feathers.treatMonkey());
    printEnclosure.addActionListener(e -> feathers.printEnclosureList());
    printSanctuary.addActionListener(e -> feathers.printSanctuaryList());
  }

  @Override
  public void successMessage(String s){
    JOptionPane.showMessageDialog(this,s);
  }

  @Override
  public void printList(String list){
    JOptionPane.showMessageDialog(this,list);
  }

  @Override
  public String getMoveName(){
//    return moveName.getText();
    return (String)moveName2.getSelectedItem();
  }

  @Override
  public String getCreateName(){
    return createName.getText();
  }

  @Override
  public double getWeight() {
    return Double.parseDouble(weight.getText());
  }

  @Override
  public int getAge() {
    return Integer.parseInt(age.getText());
  }

  @Override
  public Species getSpeciesCreate() {
    return (Species) speciesFieldCreate.getSelectedItem();
  }

  @Override
  public Species getSpeciesPrint() {
    return (Species) speciesFieldPrint.getSelectedItem();
  }

  @Override
  public Sex getSexField() {
    return (Sex)sexField.getSelectedItem();
  }

  @Override
  public Size getSizeField() {
    return (Size) sizeField.getSelectedItem();
  }

  @Override
  public Food getFoodField() {
    return (Food)foodField.getSelectedItem();
  }

  @Override
  public boolean getHealthField() {
    return (boolean) healthField.getSelectedItem();
  }

  @Override
  public void showErrorMessage(String error) {
    JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
  }

  @Override
  public void reSetCreate(){
    createName.setText("");
    weight.setText("");
    age.setText("");
    speciesFieldCreate.setSelectedIndex(0);
    sexField.setSelectedIndex(0);
    sizeField.setSelectedIndex(0);
    foodField.setSelectedIndex(0);
    healthField.setSelectedIndex(0);
  }

  @Override
  public void reSetMove(){
    moveName2.setSelectedItem(null);
  }

  @Override
  public void reSetPrint(){
    speciesFieldPrint.setSelectedIndex(0);
  }

  @Override
  public void updateMonkey(ArrayList<Monkey> monkeys){
    moveName2.removeAllItems();
    for(Monkey monkey : monkeys){
      moveName2.addItem((monkey.getName()));
    }
  }

}
