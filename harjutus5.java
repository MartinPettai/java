

import java.util.Scanner;
12
//Martin Pettai
//IT21
public class harjutus5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
for(int i=0;i<3; i++){
		int nr1, nr2, jagamine;
    
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisesta number mida tahad jagada: "); 
		nr1 = scanner.nextInt();
		System.out.println("Sisesta number millega tahad jagada12: ");
		nr2 = scanner.nextInt();

		if (nr1 <=0) {
			System.out.println("Sisestage mõlemad positiivsed arvud.");
		}

		jagamine=nr1/nr2;
		System.out.println("jagamistehte vastus: "+jagamine);
		

	}
}

}
