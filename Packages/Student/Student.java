package Student;

import java.io.Serializable;
import java.util.Arrays;

import Course.Course;
import Subject.Subject;
import User.User;

public class Student extends User implements Serializable {
  private int id;
  private Course course;
  private Subject[] subjects = {};

  public Student() {
    super();
  }

  public Student(String name, Course course) {
    super(name);
    this.course = course;
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
   * @return Subject[]
   */
  public Subject[] getSubjects() {
    return this.subjects;
  }

  /**
   * @param subjects
   */
  public void setSubjects(Subject[] subjects) {
    this.subjects = subjects;
  }

  /**
   * @return String
   */
  @Override
  public String toString() {
    return "{" + "id='" + getId() + "'" + ", name='" + getName() + "'" + ", course='" + getCourse() + "'"
        + ", subjects='"
        + Arrays.toString(getSubjects()) + "'" + "}";
  }
}
