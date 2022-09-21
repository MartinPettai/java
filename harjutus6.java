//Martin Pettai
//IT21
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class harjutus6 {

	private static final Integer Integer = null;

    /**
	 * @param args
	 */
	public static void main(String[] args) {
        ArrayList<Integer> numbrid = new ArrayList<Integer>();
        int loop=1;
        while (loop==1){
            Scanner scanner = new Scanner (System.in);
            System.out.print("Sisesta t4isarv: ");
            String taisarv=scanner.nextLine();
            if (taisarv== ""){
                break;
            }
            int arv=java.lang.Integer.parseInt(taisarv);
            numbrid.add(arv);

            int kokku=numbrid.size();
            int kogusumma=numbrid.stream().mapToInt(java.lang.Integer::intValue).sum();
            int kesk=kogusumma/kokku;

       
       

        


       File minuFail=new File("numbrid.txt");
       
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(minuFail));
            bw.write("koik arvud: "+kokku);
            bw.write("kogusumma: "+kogusumma);
            bw.write("keskmine: "+kesk);
            bw.close();
            System.out.println("faili lisatud!");
            } catch (IOException e) {
            e.printStackTrace();
            }



    


    


        }

        
    }
}


