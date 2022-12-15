package Menu;

import java.util.Scanner;

import Course.Course;
import Database.Database;

public class Menu {
  private Scanner sc = new Scanner(System.in);

  final static String[] menu = {
      "1 - Cursos",
      "2 - Professores",
      "3 - Alunos",
      "4 - Matérias",
      "5 - Usuários",
      "6 - Sair"
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
      "4 - Voltar"
  };

  final static String[] menuTeacher = {
      "1 - Listar",
      "2 - Adicionar",
      "3 - Remover",
      "4 - Voltar"
  };

  final static String[] menuUser = {
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

        case 5:
          userMenu();
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

          break;

        case 3:

          break;

        default:
          if (choice == menu.length) {
            System.out.println("Voltando...");
          } else {
            System.out.println("Opção inválida!");
          }
          break;
      }

    } while (choice != menu.length);

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

          break;

        case 3:

          break;

        default:
          if (choice == menu.length) {
            System.out.println("Voltando...");
          } else {
            System.out.println("Opção inválida!");
          }
          break;
      }

    } while (choice != menu.length);

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

            System.out.println("Digite o ID do curso:");
            int id = Integer.parseInt(sc.nextLine());
            course.setId(id);

            Database.COURSE.add(course);
          } catch (Exception e) {

          }
          break;

        case 3:

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

          break;

        case 3:

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

  private void userMenu() {
    int choice;

    do {

      printMenus(menuUser, false);

      try {
        choice = this.sc.nextInt();
      } catch (Exception e) {
        choice = -1;
      }

      switch (choice) {
        case 1:
          System.out.println(Database.USER.toString());
          pressEnterToContinue();
          break;

        case 2:

          break;

        case 3:

          break;

        default:
          if (choice == menuUser.length) {
            System.out.println("Voltando...");
          } else {
            System.out.println("Opção inválida!");
          }
          break;
      }

    } while (choice != menuUser.length);

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
