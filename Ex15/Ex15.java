package Ex15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ex15 {

    public static void main(String args[]) {

        String arr = "./list.txt";
        Scanner scan = new Scanner(System.in);
        String[] car = new String[6];
        int opc = 0;

        while (opc != 3) {

            try {
                System.out.printf("CADASTRO DE COMPRA\n\n" +
                        "1 - Cadastrar produto\n" +
                        "2 - Ver tudo\n" +
                        "3 - Sair \n\n" +
                        "Selecione sua opc: ");
                opc = scan.nextInt();

                if (opc == 1) {
                    for (int i = 0; i < 6; i++) {
                        System.out.printf(
                                "Digite nome, preço e quantidade do item: ",
                                i);
                        car[i] = scan.next();

                    }
                    System.out.printf("Pronto mais um item cadastrado.");
                    opc = 2;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
            if (opc == 2) {

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(arr))) {
                    bw.write("LISTA");
                    for (String itemLinha : car) {

                        System.out.printf(itemLinha + ",");
                        bw.write(itemLinha);
                        bw.newLine();
                    }
                    bw.newLine();
                } catch (IOException e) {
                    System.out.println("Erro: " + e.getMessage());
                    e.printStackTrace();
                }
                try (BufferedReader br = new BufferedReader(new FileReader(arr))) {

                    String li = br.readLine();

                    while (li != null) {

                        System.out.println(li);
                        li = br.readLine();

                    }
                } catch (FileNotFoundException e) {
                    System.out.printf("Erro: ", e.getMessage());
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
