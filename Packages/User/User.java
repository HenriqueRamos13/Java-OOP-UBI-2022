package User;

import java.util.ArrayList;
import java.util.Scanner;

import Database.Database;

public class User {
  protected int id;
  protected String name;
  // private Scanner sc = new Scanner(System.in);

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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + "}";
  }
}
