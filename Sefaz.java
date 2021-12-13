import java.util.Scanner;
import java.util.Arrays;

public class Sefaz {
	static void variables(){
		String name, email, password, phone, type, user, ddd, id;
		int i;
    	//long ddd, id;

    	//definindo as variáveis
	}

  	static void login(){
  		boolean loginCheck = false;
  		while (loginCheck == false) {
  			Scanner credentials = new Scanner (System.in);
  			System.out.println("Digite o usuario:");
  			String user = credentials.nextLine();
  			System.out.println("Digite a senha:");
  			String password = credentials.nextLine();

  			if (user.equals("admin") && password.equals("admin")){
				System.out.println("Usuario autenticado");
				loginCheck = true;
  			}
  			else {
  				System.out.println("Usuario ou senha incorreto, tente novamente!");
  			}
  		}
  	}

  	static String menu(){
  		Scanner menuOption = new Scanner (System.in);
  		System.out.println("OPCOES DO MENU");
  		System.out.println(" 1) Consultar Usuarios. \n 2) Incluir Usuario. \n 3) Alterar Usuario. \n 4) Remover Usuario.\n 5) Sair.");
  		System.out.println("Selecione a opcao:");
  		String option = menuOption.nextLine();
  		while (option.equals("1") && option.equals("2") && option.equals("3") && option.equals("4") && option.equals("5")) {
			System.out.println("Opcao Invalida, digite novamente");
  			option = menuOption.nextLine();
  		}
  			return option;
  	}

  	static String[][] dbPopulate(){
  		String[][] database = {
  			{"0","admin","admin@sefaz.com.br","admin","01","0000-0000","Residencial"},
  			{"1","Sarah Haddassa","sarah.hada@gmail.com","fred","12","99999-9999","Celular"},
  			{"2","Alberto Beto","betin@hotmail.com","oceano","19","91881-2351","Celular"},
  			{"3","Fulano da Silva","fu.lano@aol.com","fulanin","61","3607-8554","Residencial"},
  			{"4","Ciclano de Moura","ciclanom@hotmail.com","ciclano91","41","98259-9898","Celular"}
  		};
  		return database;
  	}

  	static void menuConsult(){
  		int i = 0;

  	}

  	static String[][] menuInclude(String[][] phoneList){
  		int rows = phoneList.length; 
  		int i = rows+1;
  		String name, email, password, phone, type, user, ddd, id;

		id = String.valueOf(i);
	  	Scanner include = new Scanner (System.in);
		System.out.println("Digite o nome:");
		name = include.nextLine();
		System.out.println("Digite a e-mail:");
		email = include.nextLine();
		System.out.println("Digite a senha:");
		password = include.nextLine();
		System.out.println("Digite o ddd:");
		ddd = include.nextLine();
		System.out.println("Digite o telefone:");
		phone = include.nextLine();
		System.out.println("Digite o tipo (Residencial ou Celular):");
		type = include.nextLine();
  		
		String[][] phoneListNew = {phoneList, {id, name, email, password, ddd, phone, type}};

  		System.out.println(phoneListNew[5][2]);
		return phoneListNew;
  	}

  	static void menuEdit(){
  		int i = 0;
  	}

  	static void menuRemove(){
  		int i = 0;
  	}

  	public static void main(String[] args) {
		variables();
		String[][] phoneList = dbPopulate();
	    login();
		
    	String optionSelected = menu();
    	if (optionSelected.equals("1")){
    		menuConsult();
    	}
    	if (optionSelected.equals("2")){
    		menuInclude(phoneList);
    	}
    	if (optionSelected.equals("3")){
    		menuEdit();
    	}
    	if (optionSelected.equals("4")){
    		menuRemove();
    	}if (optionSelected.equals("5")) {
    		System.out.println("Logoff realizado com sucesso!");
    	}

    	//System.out.println(phoneList[4][2]);
  	}

}