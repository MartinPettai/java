import java.util.Scanner;
//Martin Pettai
//IT21

public class harjutus7 {

/**	
	 * @param args
*/	 
	public static void main(String[] args) {
        int i=0;
        while (i==0) {

try{
		Scanner scanner = new Scanner (System.in);
		System.out.print("Sisesta arv 1: ");
		int numero1 = scanner.nextInt();
        System.out.print("Sisesta arv 2: ");
		int numero2 = scanner.nextInt();
        int vastus=numero1+numero2;
        System.out.println("Teie tehte vastus on: "+vastus+"!");
        i=1;
        }
        catch (Exception e) {
            System.out.println("sisestus on vale");
        }
        
        

        
        

        
    }
}
}

    
    
	
	
	
	









