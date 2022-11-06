package Course;

public class Course {
  private String name;
  private int id;

  public Course() {
  }

  public Course(String name, int id) {
    this.name = name;
    this.id = id;
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
    return "{" + " name='" + getName() + "'" + ", id='" + getId() + "'" + "}";
  }
}
