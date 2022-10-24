package Student;

import Course.Course;
import Subject.Subject;
import User.User;

public class Student extends User {
  private Course course;
  private Subject[] subjects = {};

  public Student() {
    super();
  }

  public Student(String name, Course course, String registration) {
    super(name);
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

  public Course getCourse() {
    return this.course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public Subject[] getSubjects() {
    return this.subjects;
  }

  public void setSubjects(Subject[] subjects) {
    this.subjects = subjects;
  }
}
