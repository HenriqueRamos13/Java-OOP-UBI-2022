package Teacher;

import Course.Course;
import Subject.Subject;
import User.User;

public class Teacher extends User {
  private Course course;
  private Subject[] subjects = {};

  public Teacher() {
    super();
  }

  public Teacher(String name, Course course, String registration) {
    super(name);
    this.course = course;
  }

  public Course getCourse() {
    return this.course;
  }

  public Subject[] getSubjects() {
    return this.subjects;
  }

  public void setSubjects(Subject[] subjects) {
    this.subjects = subjects;
  }
}
