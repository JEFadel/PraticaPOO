import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class exercicioJava {

    public static ArrayList<Integer> lista_aleatoria (int length) {
        ArrayList <Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            lista.add(random.nextInt(100));
        }

        System.out.println("-----------RESULTADO-----------");

        for (Integer num: lista) {
            if (num % 3 == 0) {
                System.out.println(num + " - o numero e multiplo de tres.");
            }
            else if (num % 2 == 0) {
                System.out.println(num + " - o numero e par.");
            }
            else {
                System.out.println(num + " - o numero e impar.");
            }
        }
        return lista;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um tamanho para a lista: ");
        int numInput = scanner.nextInt();
        lista_aleatoria(numInput);
    }
}
