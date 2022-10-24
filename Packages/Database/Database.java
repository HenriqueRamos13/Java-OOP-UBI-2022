package Database;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Course.Course;
import Student.Student;
import Teacher.Teacher;
import User.User;
import Subject.Subject;

public class Database {
  public static List<User> USER = new ArrayList<User>();
  public static List<Student> STUDENT = new ArrayList<Student>();
  public static List<Teacher> TEACHER = new ArrayList<Teacher>();
  public static List<Subject> SUBJECT = new ArrayList<Subject>();
  public static List<Course> COURSE = new ArrayList<Course>();
  Scanner sc;

  public Database() {
    this.populateCourse();
    this.populateUser();
    this.populateSubject();
    this.populateStudent();
    this.populateTeacher();
  }

  private void populateStudent() {
    File file = new File("../Database/Student.txt");

    try {
      sc = new Scanner(file);
    } catch (Exception e) {
      System.out.println("Erro ao abrir o arquivo");
      return;
    }
    String line = sc.nextLine();
    String[] fields = line.split(":");

    while (sc.hasNextLine()) {
      line = sc.nextLine();
      String[] values = line.split(":");

      Student student = new Student();

      for (int i = 0; i < fields.length; i++) {
        String[] field = fields[i].split(";");
        String fieldName = field[0];
        String fieldType = field[1];
        String fieldClass = "";
        if (field.length > 2) {
          fieldClass = field[2];
        }
        String fieldValue = values[i];

        if (fieldType.equals("String")) {
          student.setField(fieldName, fieldValue);
        } else if (fieldType.equals("Integer")) {
          student.setField(fieldName, fieldValue);
        } else if (fieldType.equals("Class")) {
          if (fieldClass.equals("User")) {
            User user = USER.get(Integer.parseInt(fieldValue));
            student.setId(user.getId());
            student.setName(user.getName());
          } else if (fieldClass.equals("Course")) {
            Course course = COURSE.get(Integer.parseInt(fieldValue));
            student.setCourse(course);
          }
        }
      }

      STUDENT.add(student);
    }
  }

  private void populateCourse() {
    File file = new File("../Database/Course.txt");

    try {
      sc = new Scanner(file);
    } catch (Exception e) {
      System.out.println("Erro ao abrir o arquivo");
      return;
    }
    String line = sc.nextLine();
    String[] fields = line.split(":");

    while (sc.hasNextLine()) {
      line = sc.nextLine();
      String[] values = line.split(":");

      Course course = new Course();

      for (int i = 0; i < fields.length; i++) {
        String[] field = fields[i].split(";");
        String fieldName = field[0];
        String fieldType = field[1];
        String fieldClass = "";
        if (field.length > 2) {
          fieldClass = field[2];
        }
        String fieldValue = values[i];

        if (fieldType.equals("String")) {
          course.setField(fieldName, fieldValue);
        } else if (fieldType.equals("Integer")) {
          course.setField(fieldName, fieldValue);
        }
      }

      COURSE.add(course);
    }
  }

  private void populateUser() {
    File file = new File("../Database/User.txt");

    try {
      sc = new Scanner(file);
    } catch (Exception e) {
      System.out.println("Erro ao abrir o arquivo");
      return;
    }
    String line = sc.nextLine();
    String[] fields = line.split(":");

    while (sc.hasNextLine()) {
      line = sc.nextLine();
      String[] values = line.split(":");

      User user = new User();

      for (int i = 0; i < fields.length; i++) {
        String[] field = fields[i].split(";");

        String fieldName = field[0];
        String fieldType = field[1];
        String fieldClass = "";
        if (field.length > 2) {
          fieldClass = field[2];
        }
        String fieldValue = values[i];

        if (fieldType.equals("String")) {

          user.setField(fieldName, fieldValue);
        } else if (fieldType.equals("Integer")) {
          user.setField(fieldName, fieldValue);
        }
      }

      USER.add(user);
    }
  }

  private void populateSubject() {
    File file = new File("../Database/Subject.txt");

    try {
      sc = new Scanner(file);
    } catch (Exception e) {
      System.out.println("Erro ao abrir o arquivo");
      return;
    }
    String line = sc.nextLine();
    String[] fields = line.split(":");

    while (sc.hasNextLine()) {
      line = sc.nextLine();
      String[] values = line.split(":");

      Subject subject = new Subject();

      for (int i = 0; i < fields.length; i++) {
        String[] field = fields[i].split(";");
        String fieldName = field[0];
        String fieldType = field[1];
        String fieldClass = "";
        if (field.length > 2) {
          fieldClass = field[2];
        }
        String fieldValue = values[i];

        if (fieldType.equals("String")) {
          subject.setField(fieldName, fieldValue);
        } else if (fieldType.equals("Integer")) {
          subject.setField(fieldName, fieldValue);
        } else if (fieldType.equals("Class")) {
          if (fieldClass.equals("Course")) {
            Course course = COURSE.get(Integer.parseInt(fieldValue));
            subject.setCourse(course);
          }
        }
      }

      SUBJECT.add(subject);
    }
  }

  private void populateTeacher() {
    File file = new File("../Database/Teacher.txt");

    try {
      sc = new Scanner(file);
    } catch (Exception e) {
      System.out.println("Erro ao abrir o arquivo");
      return;
    }
    String line = sc.nextLine();
    String[] fields = line.split(":");

    while (sc.hasNextLine()) {
      line = sc.nextLine();
      String[] values = line.split(":");

      Teacher teacher = new Teacher();

      for (int i = 0; i < fields.length; i++) {
        String[] field = fields[i].split(";");
        String fieldName = field[0];
        String fieldType = field[1];
        String fieldClass = "";
        if (field.length > 2) {
          fieldClass = field[2];
        }
        String fieldValue = values[i];

        if (fieldType.equals("String")) {
          teacher.setField(fieldName, fieldValue);
        } else if (fieldType.equals("Integer")) {
          teacher.setField(fieldName, fieldValue);
        } else if (fieldType.equals("Class")) {

          if (fieldClass.equals("User")) {
            User user = USER.get(Integer.parseInt(fieldValue));
            teacher.setId(user.getId());
            teacher.setName(user.getName());
          }
        }
      }

      TEACHER.add(teacher);
    }
  }

}
