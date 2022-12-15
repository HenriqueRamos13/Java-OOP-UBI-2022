package Database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Course.Course;
import Student.Student;
import Teacher.Teacher;
import User.User;
import Subject.Subject;

public class Database {
  public static ArrayList<Student> STUDENT;
  public static ArrayList<Teacher> TEACHER;
  public static ArrayList<Subject> SUBJECT;
  public static ArrayList<Course> COURSE;
  Scanner sc;

  public Database() {
    this.populateCourse();
    this.populateSubject();
    this.populateStudent();
    this.populateTeacher();
  }

  private void populateStudent() {
    File file = new File("../Database/DAT/Student.dat");

    try {
      FileInputStream fis = new FileInputStream(file);
      ObjectInputStream ois = new ObjectInputStream(fis);

      Object obj = ois.readObject();

      if (obj instanceof ArrayList) {

        STUDENT = (ArrayList<Student>) obj;

      } else {
        STUDENT = new ArrayList<Student>();
      }

      ois.close();
    } catch (Exception e) {
      System.out.println("Erro ao abrir o arquivo de estudantes");
      return;
    }
  }

  private void populateCourse() {
    File file = new File("../Database/DAT/Course.dat");

    try {
      FileInputStream fis = new FileInputStream(file);
      ObjectInputStream ois = new ObjectInputStream(fis);

      Object obj = ois.readObject();

      if (obj instanceof ArrayList) {

        COURSE = (ArrayList<Course>) obj;

      } else {
        COURSE = new ArrayList<Course>();
      }

      ois.close();
    } catch (Exception e) {
      System.out.println("Erro ao abrir o arquivo de cursos");
      return;
    }
  }

  private void populateSubject() {
    File file = new File("../Database/DAT/Subject.dat");

    try {
      FileInputStream fis = new FileInputStream(file);
      ObjectInputStream ois = new ObjectInputStream(fis);

      Object obj = ois.readObject();

      if (obj instanceof ArrayList) {

        SUBJECT = (ArrayList<Subject>) obj;

      } else {
        SUBJECT = new ArrayList<Subject>();
      }

      ois.close();
    } catch (Exception e) {
      System.out.println("Erro ao abrir o arquivo de disciplinas");
      return;
    }
  }

  private void populateTeacher() {
    File file = new File("../Database/DAT/Teacher.dat");

    try {
      FileInputStream fis = new FileInputStream(file);
      ObjectInputStream ois = new ObjectInputStream(fis);

      Object obj = ois.readObject();

      if (obj instanceof ArrayList) {

        TEACHER = (ArrayList<Teacher>) obj;

      } else {
        TEACHER = new ArrayList<Teacher>();
      }

      ois.close();
    } catch (Exception e) {
      System.out.println("Erro ao abrir o arquivo de professores");
      return;
    }
  }

  private static void saveStudent() {
    File file = new File("../Database/DAT/Student.dat");

    try {
      FileOutputStream fos = new FileOutputStream(file);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      oos.writeObject(STUDENT);

      oos.close();
    } catch (Exception e) {
      System.out.println("Erro ao salvar o arquivo de estudantes");
      return;
    }
  }

  private static void saveCourse() {
    File file = new File("../Database/DAT/Course.dat");

    try {
      FileOutputStream fos = new FileOutputStream(file);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      oos.writeObject(COURSE);

      oos.close();
    } catch (Exception e) {
      System.out.println("Erro ao salvar o arquivo de cursos");
      e.printStackTrace();
      System.out.println(e);
      System.out.println(e.getMessage());
      return;
    }
  }

  private static void saveSubject() {
    File file = new File("../Database/DAT/Subject.dat");

    try {
      FileOutputStream fos = new FileOutputStream(file);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      oos.writeObject(SUBJECT);

      oos.close();
    } catch (Exception e) {
      System.out.println("Erro ao salvar o arquivo de disciplinas");
      return;
    }
  }

  private static void saveTeacher() {
    File file = new File("../Database/DAT/Teacher.dat");

    try {
      FileOutputStream fos = new FileOutputStream(file);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      oos.writeObject(TEACHER);

      oos.close();
    } catch (Exception e) {
      System.out.println("Erro ao salvar o arquivo de professores");
      return;
    }
  }

  public static void saveAllDatabase() {
    saveCourse();
    saveStudent();
    saveSubject();
    saveTeacher();
  }
}
