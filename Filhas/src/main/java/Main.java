import Filha.Filhas;
import Filhas.Filha_1;
import Filhas.Filha_2;
import Filhas.Filha_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List <Filhas> filhas_1 = new ArrayList<>();
        List <String> nomes = new ArrayList<>();

        Scanner defineNome;
        defineNome = new Scanner(System.in);
        String nome;


        System.out.println("Entre com o nome da filha 1: ");
        nome = defineNome.nextLine();
        Filha_1 filha1 = new Filha_1(nome,new Random().nextDouble()*100);
        nomes.add(nome);

        System.out.println("Entre com o nome da filha 2: ");
        nome = defineNome.nextLine();
        Filha_2 filha12 = new Filha_2(nome,new Random().nextDouble()*100);
        nomes.add(nome);

        System.out.println("Entre com o nome da filha 3: ");
        nome = defineNome.nextLine();
        Filha_3 filha123 = new Filha_3(nome,new Random().nextDouble()*100);
        nomes.add(nome);

        System.out.println("Entre com o nome da filha 4: ");
        nome = defineNome.nextLine();
        Filha_1 filha1234 = new Filha_1(nome,new Random().nextDouble()*100);
        nomes.add(nome);

        System.out.println("Entre com o nome da filha 5: ");
        nome = defineNome.nextLine();
        Filha_2 filha12345 = new Filha_2(nome,new Random().nextDouble()*100);
        nomes.add(nome);

        System.out.println("Entre com o nome da filha 6: ");
        nome = defineNome.nextLine();
        Filha_3 filha123456 = new Filha_3(nome,new Random().nextDouble()*100);
        nomes.add(nome);

        filhas_1.add(filha1);
        filhas_1.add(filha12);
        filhas_1.add(filha123);
        filhas_1.add(filha1234);
        filhas_1.add(filha12345);
        filhas_1.add(filha123456);


        System.out.println("\n Antes da ordenação: \n");

        for (Filhas elemento: filhas_1){
            System.out.println(elemento.getIdade());
        }

        System.out.println("\n Depois da ordenação: \n");

        Collections.sort(filhas_1, Collections.reverseOrder());

        for (Filhas elemento: filhas_1){
            System.out.println(elemento.getIdade());
        }


    }
}
