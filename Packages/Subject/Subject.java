package Subject;

import Course.Course;

public class Subject {
  private String name;
  private int id;
  private Course course;
  private int ects;

  public Subject() {
  }

  public Subject(String name, int id, Course course, int ects) {
    this.name = name;
    this.id = id;
    this.course = course;
    this.ects = ects;
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
      case "ects":
        this.ects = Integer.parseInt(fieldValue);
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
   * @return int
   */
  public int getEcts() {
    return this.ects;
  }

  /**
   * @param ects
   */
  public void setEcts(int ects) {
    this.ects = ects;
  }

  /**
   * @return Course
   */
  public Course getCourse() {
    return this.course;
  }

  /**
   * @param course
   */
  public void setCourse(Course course) {
    this.course = course;
  }

  /**
   * @return String
   */
  @Override
  public String toString() {
    return "{" + " name='" + getName() + "'" + ", id='" + getId() + "'" + ", ects='" + getEcts() + "'" + ", course='"
        + getCourse() + "'" + "}";
  }
}
