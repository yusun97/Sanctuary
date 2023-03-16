package model;

/**
 * This class represent monkeys which has a name, a species designation, a sex, a size, a weight, an
 * approximate age, a favorite food and the health status
 */
public class Monkey implements Comparable<Monkey> {

  private String name;
  private Species species;
  private Sex sex;
  private Size size;
  private double weight;
  private int age;
  private Food food;
  private boolean health;

  /**
   * Construct a monkey given a name, a species designation, a sex,a size,
   * a weight, an approximate age, a favorite food, and the health status
   * the housed sanctuary is used to check duplicate name
   *
   * @param name      the name of the monkey
   * @param species   the species of the monkey
   * @param sex       the sex of the monkey
   * @param size      the size of the monkey
   * @param weight    the weight of the monkey
   * @param age       the age of the monkey
   * @param food      the food of the monkey
   * @param health    the health status of the monkey
   * @exception IllegalArgumentException if monkey's weight and age is negative
   */
  public Monkey(String name, Species species, Sex sex, Size size, double weight, int age, Food food,
      boolean health) {
    if(weight <0 || age <= 0) {
      throw new IllegalArgumentException("Monkey's weight and age cannot be negative");
    }
    this.name = name;
    this.species = species;
    this.sex = sex;
    this.size = size;
    this.weight = weight;
    this.age = age;
    this.food = food;
    this.health = health;
  }

  /**
   * Return the species of this monkey
   *
   * @return the species of this monkey
   */
  public Species getSpecies() {
    return this.species;
  }

  /**
   * Return the name of this monkey
   *
   * @return the name of this monkey
   */
  public String getName() {
    return this.name;
  }

  /**
   * Return the health status of this monkey
   *
   * @return the health status of this monkey
   */
  public boolean isHealth() {
    return this.health;
  }

  /**
   * Change the health status of this monkey
   * @param health the health status of this monkey
   */
  public void setHealth(boolean health) {
    this.health = health;
  }

  @Override
  public String toString() {
    return "name: " + name + ", sex: " + sex + ", food: " + food;
  }

  @Override
  public int compareTo(Monkey o) {
    return this.getName().compareTo(o.getName());
  }
}
