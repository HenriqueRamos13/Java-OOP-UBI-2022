package Subject;

import Course.Course;

public class Subject {
  private String name;
  private int id;
  private Course course;

  public Subject() {
  }

  public Subject(String name, int id, Course course) {
    this.name = name;
    this.id = id;
    this.course = course;
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

  public Course getCourse() {
    return this.course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }
}
