package Menu;

import java.util.Scanner;

import User.User;

public class Menu {
  private Scanner sc = new Scanner(System.in);

  final static String[] menu = {
      "1 - Listar funcionários",
      "2 - Cadastrar funcionário",
      "3 - Editar funcionário",
      "4 - Listar materiais",
      "5 - Cadastrar material",
      "6 - Editar material",
      "7 - Listar obras",
      "8 - Cadastrar obra",
      "9 - Editar obra",
      "10 - Ganhos",
      "11 - Lucro total",
      "12 - Listar compras feitas",
      "13 - Sair"
  };

  // public Menu() {
  // int choice;

  // do {

  // printMenus(menu, false);

  // try {
  // choice = this.sc.nextInt();
  // } catch (Exception e) {
  // choice = -1;
  // }

  // switch (choice) {
  // case 1:
  // User workers = new User();
  // workers.list();
  // break;

  // case 2:
  // User newWorker = new User();
  // newWorker.create();
  // break;

  // case 3:
  // User editWorker = new User();
  // editWorker.edit();
  // break;

  // case 4:

  // break;

  // case 5:

  // break;

  // case 6:

  // break;

  // case 7:

  // break;

  // case 8:

  // break;

  // case 9:

  // break;

  // case 10:

  // break;

  // case 11:

  // break;

  // case 12:

  // break;

  // default:
  // if (choice == menu.length) {
  // System.out.println("Saindo...");
  // } else {
  // System.out.println("Opção inválida!");
  // }
  // break;
  // }

  // } while (choice != menu.length);

  // }

  // public static void printMenus(String[] menus, Boolean flush) {
  // if (flush) {
  // System.out.print("\033[H\033[2J");
  // System.out.flush();
  // }

  // System.out.println("\n\n\n");

  // for (String item : menus) {
  // System.out.println(item);
  // }
  // }
}
