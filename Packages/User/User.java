package User;

import java.util.ArrayList;
import java.util.Scanner;

import Database.Database;

public class User {
  protected int id;
  protected String name;

  public User() {
  }

  public User(String name) {
    this.id = Database.USER.size();
    this.name = name;
  }

  public User(String name, int id) {
    this.id = id;
    this.name = name;
  }

  /**
   * @param fieldName
   * @param fieldValue
   */
  public void setField(String fieldName, String fieldValue) {
    switch (fieldName) {
      case "name":
        this.name = fieldValue;
        break;
      case "id":
        this.id = Integer.parseInt(fieldValue);
        break;
    }
  }

  /**
   * @return String
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return int
   */
  public int getId() {
    return this.id;
  }

  /**
   * @param id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return String
   */
  @Override
  public String toString() {
    return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + "}";
  }
}
