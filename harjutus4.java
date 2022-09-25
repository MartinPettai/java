import java.util.Scanner;

public class harjutus4 
{

    public static void main(String[] args) 
    {  

         
        Scanner scanner = new Scanner (System.in); //kasutaja sisestus
        System.out.print("Sisesta tekst: "); 
        String tekst = scanner.nextLine(); //lisab sisestuse sõne muutujasse
        int s6nad = 1;
		 
            for (int i=0;i<tekst.length()-1;i++)
            {
                if ((tekst.charAt(i)==' ')&&(tekst.charAt(i+1)!=' '))
                {
                    s6nad++;
                }
            }
        
        System.out.println("S6nade arv sinu lasuses: " + s6nad);
        System.out.println("ALL CAPS: "+tekst.toUpperCase());
        System.out.println("M4rkide arv: "+tekst.length());
        System.out.println("Tere Mario, ma ei oskanud seda s% asja teha, siirad vabandused");
    }
}

