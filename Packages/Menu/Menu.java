package Menu;

import java.util.Scanner;

import Course.Course;
import Student.Student;
import Teacher.Teacher;
import Subject.Subject;

import Database.Database;

public class Menu {
  private Scanner sc = new Scanner(System.in);

  final static String[] menu = {
      "1 - Cursos",
      "2 - Professores",
      "3 - Alunos",
      "4 - Matérias",
      "5 - Sair"
  };

  final static String[] menuCourse = {
      "1 - Listar",
      "2 - Adicionar",
      "3 - Remover",
      "4 - Voltar"
  };

  final static String[] menuSubject = {
      "1 - Listar",
      "2 - Adicionar",
      "3 - Remover",
      "4 - Voltar"
  };

  final static String[] menuStudent = {
      "1 - Listar",
      "2 - Adicionar",
      "3 - Remover",
      "4 - Matricular usuário em uma matéria",
      "5 - Voltar"
  };

  final static String[] menuTeacher = {
      "1 - Listar",
      "2 - Adicionar",
      "3 - Remover",
      "4 - Voltar"
  };

  public Menu() {
    int choice;

    do {

      printMenus(menu, false);

      try {
        choice = this.sc.nextInt();
      } catch (Exception e) {
        choice = -1;
      }

      switch (choice) {
        case 1:
          courseMenu();
          break;

        case 2:
          teacherMenu();
          break;

        case 3:
          studentMenu();
          break;

        case 4:
          subjectMenu();
          break;

        default:
          if (choice == menu.length) {
            System.out.println("Saindo...");
          } else {
            System.out.println("Opção inválida!");
          }

          Database.saveAllDatabase();
          break;
      }

    } while (choice != menu.length);

  }

  private void studentMenu() {
    int choice;

    do {

      printMenus(menuStudent, false);

      try {
        choice = this.sc.nextInt();
      } catch (Exception e) {
        choice = -1;
      }

      switch (choice) {
        case 1:
          System.out.println(Database.STUDENT.toString());
          pressEnterToContinue();
          break;

        case 2:

          try {
            Scanner sc = new Scanner(System.in);

            Student student = new Student();

            System.out.println("Digite o nome do estudante:");
            String name = sc.nextLine();
            student.setName(name);

            System.out.println("Digite o ID do curso do estudante:");
            int id = Integer.parseInt(sc.nextLine());

            Course course = Database.COURSE.get(id);

            student.setCourse(course);

            Database.STUDENT.add(student);

            System.out.println("Usuário adicionado com sucesso!");
            pressEnterToContinue();
          } catch (Exception e) {
            System.out.println("Erro ao adicionar usuário!");
            pressEnterToContinue();
          }

          break;

        case 3:

          try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o ID do estudante:");
            int id = Integer.parseInt(sc.nextLine());

            Database.STUDENT.remove(id);

            System.out.println("Estudante removido com sucesso!");
            pressEnterToContinue();
          } catch (Exception e) {
            System.out.println("Erro ao remover estudante!");
            pressEnterToContinue();
          }

          break;

        case 4:

          try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o ID do estudante:");
            int id = Integer.parseInt(sc.nextLine());

            Student student = Database.STUDENT.get(id);

            System.out.println("Digite o ID da matéria:");
            id = Integer.parseInt(sc.nextLine());

            Subject subject = Database.SUBJECT.get(id);

            Subject[] subjects = student.getSubjects();

            if (subjects.length == 7) {
              throw new Exception("O estudante não pode ter mais de 7 matérias!");
            }

            int sum = 0;

            for (int i = 0; i < subjects.length; i++) {
              sum += subjects[i].getEcts();
            }

            sum += subject.getEcts();

            if (sum > 30) {
              throw new Exception("O estudante não pode ter mais de 30 ECTS!");
            }

            for (int i = 0; i < subjects.length; i++) {
              if (subjects[i].getId() == subject.getId()) {
                throw new Exception("O estudante já está matriculado nessa matéria!");
              }
            }

            Subject[] newSubjects = new Subject[subjects.length + 1];

            for (int i = 0; i < subjects.length; i++) {
              newSubjects[i] = subjects[i];
            }

            newSubjects[subjects.length] = subject;

            student.setSubjects(newSubjects);

            System.out.println("Estudante matriculado com sucesso!");
            pressEnterToContinue();
          } catch (Exception e) {
            System.out.println(e.getMessage());
            pressEnterToContinue();
          }

          break;

        default:
          if (choice == menuStudent.length) {
            System.out.println("Voltando...");
          } else {
            System.out.println("Opção inválida!");
          }
          break;
      }

    } while (choice != menuStudent.length);

  }

  private void teacherMenu() {
    int choice;

    do {

      printMenus(menuTeacher, false);

      try {
        choice = this.sc.nextInt();
      } catch (Exception e) {
        choice = -1;
      }

      switch (choice) {
        case 1:
          System.out.println(Database.TEACHER.toString());
          pressEnterToContinue();
          break;

        case 2:

          try {
            Scanner sc = new Scanner(System.in);

            Teacher teacher = new Teacher();

            System.out.println("Digite o nome do professor:");
            String name = sc.nextLine();
            teacher.setName(name);

            System.out.println("Digite o ID do curso do professor:");
            int id = Integer.parseInt(sc.nextLine());

            Course course = Database.COURSE.get(id);

            teacher.setCourse(course);

            Database.TEACHER.add(teacher);

            System.out.println("Professor adicionado com sucesso!");
            pressEnterToContinue();
          } catch (Exception e) {
            System.out.println("Erro ao adicionar professor!");
            pressEnterToContinue();
          }

          break;

        case 3:

          try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o ID do professor:");
            int id = Integer.parseInt(sc.nextLine());

            Database.TEACHER.remove(id);

            System.out.println("Professor removido com sucesso!");
            pressEnterToContinue();
          } catch (Exception e) {
            System.out.println("Erro ao remover professor!");
            pressEnterToContinue();
          }

          break;

        default:
          if (choice == menuTeacher.length) {
            System.out.println("Voltando...");
          } else {
            System.out.println("Opção inválida!");
          }
          break;
      }

    } while (choice != menuTeacher.length);

  }

  private void courseMenu() {
    int choice;

    do {

      printMenus(menuCourse, false);

      try {
        choice = this.sc.nextInt();
      } catch (Exception e) {
        choice = -1;
      }

      switch (choice) {
        case 1:
          System.out.println(Database.COURSE.toString());
          pressEnterToContinue();
          break;

        case 2:
          try {
            Scanner sc = new Scanner(System.in);

            Course course = new Course();

            System.out.println("Digite o nome do curso:");
            String name = sc.nextLine();
            course.setName(name);

            Database.COURSE.add(course);

            System.out.println("Curso adicionado com sucesso!");
            pressEnterToContinue();
          } catch (Exception e) {

          }
          break;

        case 3:

          try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o ID do curso:");
            int id = Integer.parseInt(sc.nextLine());

            Database.COURSE.remove(id);

            System.out.println("Curso removido com sucesso!");
            pressEnterToContinue();
          } catch (Exception e) {
            System.out.println("Erro ao remover curso!");
            pressEnterToContinue();
          }

          break;

        default:
          if (choice == menuCourse.length) {
            System.out.println("Voltando...");
          } else {
            System.out.println("Opção inválida!");
          }
          break;
      }

    } while (choice != menuCourse.length);

  }

  private void subjectMenu() {
    int choice;

    do {

      printMenus(menuSubject, false);

      try {
        choice = this.sc.nextInt();
      } catch (Exception e) {
        choice = -1;
      }

      switch (choice) {
        case 1:
          System.out.println(Database.SUBJECT.toString());
          pressEnterToContinue();
          break;

        case 2:

          try {
            Scanner sc = new Scanner(System.in);

            Subject subject = new Subject();

            System.out.println("Digite o nome da matéria:");
            String name = sc.nextLine();
            subject.setName(name);

            System.out.println("Digite o ID do curso da matéria:");
            int id = Integer.parseInt(sc.nextLine());

            Course course = Database.COURSE.get(id);

            subject.setCourse(course);

            System.out.println("Digite a quantidade de ECTS que essa materia vai ter:");
            int ects = Integer.parseInt(sc.nextLine());

            subject.setEcts(ects);

            Database.SUBJECT.add(subject);

            System.out.println("Matéria adicionada com sucesso!");
            pressEnterToContinue();
          } catch (Exception e) {
            System.out.println("Erro ao adicionar matéria!");
            pressEnterToContinue();
          }

          break;

        case 3:

          try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o ID da matéria:");
            int id = Integer.parseInt(sc.nextLine());

            Database.SUBJECT.remove(id);

            System.out.println("Matéria removida com sucesso!");
            pressEnterToContinue();
          } catch (Exception e) {
            System.out.println("Erro ao remover matéria!");
            pressEnterToContinue();
          }

          break;

        default:
          if (choice == menuSubject.length) {
            System.out.println("Voltando...");
          } else {
            System.out.println("Opção inválida!");
          }
          break;
      }

    } while (choice != menuSubject.length);

  }

  private void pressEnterToContinue() {
    System.out.println("\n\nPressione ENTER para continuar...");
    try {
      System.in.read();
    } catch (Exception e) {
    }
  }

  /**
   * @param menus
   * @param flush
   */
  public static void printMenus(String[] menus, Boolean flush) {
    if (flush) {
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }

    System.out.println("\n\n\n");

    for (String item : menus) {
      System.out.println(item);
    }
  }
}
