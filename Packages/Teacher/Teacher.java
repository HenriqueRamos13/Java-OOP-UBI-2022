package Teacher;

import java.io.Serializable;
import java.util.Arrays;

import Course.Course;
import Subject.Subject;
import User.User;

public class Teacher extends User implements Serializable {
  private Course course;
  private Subject[] subjects = {};

  public Teacher() {
    super();
  }

  public Teacher(String name, Course course, String registration) {
    super(name);
    this.course = course;
  }

  /**
   * @return Course
   */
  public Course getCourse() {
    return this.course;
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
    return "{" + " name='" + getName() + "'" + ", course='" + getCourse() + "'" + ", subjects='"
        + Arrays.toString(getSubjects()) + "'" + "}";
  }
}
