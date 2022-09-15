package Ex11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Front> arrFront = new ArrayList<>();
        ArrayList<Back> arrBack = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        int confirm;
        String ans;
        int id;
        String lingua;
        String framework;
        String especificoLingua;
        Front front;
        boolean web;
        boolean mobile;
        Back back;
        boolean cont;

        while (opc != 4) {

            System.out.printf("CADASTRO DE TECNOLOGIAS \n" +
                    "Qual tec quer registrar: \n\n" +
                    "1) Front\n" +
                    "2) Back\n" +
                    "3) Listar\n" +
                    "4) Sair\n\n");

            System.out.printf("Digite uma opc: ");
            opc = scan.nextInt();

            if (opc == 1) {

                try {

                    front = new Front();

                    id = arrFront.size() + 1;
                    front.setId(id);

                    System.out.printf("Digite o nome da linguagem: ");
                    lingua = scan.next();
                    front.setLingua(lingua);

                    System.out.printf("Digite o nome do Framework: ");
                    framework = scan.next();
                    front.setFramework(framework);

                    System.out.printf("Digite a descrição da linguagem: ");
                    especificoLingua = scan.next();
                    front.setEspecificoLingua(especificoLingua);

                    System.out.printf("Serve para Web? S - sim N - nao: ");
                    ans = scan.next();

                    if (ans == "N" || ans == "n") {
                        front.setCompatibilidadeWeb(false);
                    } else {
                        front.setCompatibilidadeWeb(true);
                    }

                    System.out.printf("Serve para Mobile? S - sim N - nao: ");
                    ans = scan.next();

                    if (ans == "N" || ans == "n") {
                        front.setCompatibilidadeWeb(false);
                    } else {
                        front.setCompatibilidadeWeb(true);
                    }

                    System.out.printf("Esta certo?\n\n" +
                            "0 - faz de novo\n" +
                            "1 - não precisa\n\n");
                    System.out.printf("Responda: ");

                    confirm = scan.nextInt();

                    if (confirm == 1) {
                        arrFront.add(front);
                    }

                    System.in.read();

                    if (arrFront.size() >= 1) {

                        for (int i = 0; i < arrFront.size(); i++) {
                            System.out.printf("Tecs: \n\n" + "Nome - %s ", front.getFramework());
                        }

                    }

                } catch (Exception e) {
                    System.out.printf("Olha de novo oq vc fez");
                }

                System.out.printf("Boa, foi. Aperta 4 ai");

            } else if (opc == 2) {

                try {

                    back = new Back();

                    id = arrFront.size() + 1;
                    back.setId(id);

                    System.out.printf("Digite o nome da linguagem: ");
                    lingua = scan.next();
                    back.setLingua(lingua);

                    System.out.printf("Digite o nome do Framework: ");
                    framework = scan.next();
                    back.setFramework(framework);

                    System.out.printf("Digite a descrição da linguagem: ");
                    especificoLingua = scan.next();
                    back.setEspecificoLingua(especificoLingua);

                    System.out.printf("Ta certo?\n\n" +
                            "0 - faz de novo ai\n" +
                            "1 - oo ta bom ja foi\n\n");
                    System.out.printf("Escolhe uma opção: ");

                    confirm = scan.nextInt();

                    if (confirm == 1) {
                        arrBack.add(back);
                    }

                    System.in.read();

                    if (arrFront.size() >= 1) {

                        for (int i = 0; i < arrFront.size(); i++) {
                            System.out.printf("Tecs: \n\n" + "Nome - %s ", back.getFramework());
                        }

                    }

                } catch (Exception e) {
                    System.out.printf("Da uma olhada noq escreveu", e.getMessage());
                }

                System.out.printf("Oo boa foi, digite 4. ");

            } else if (opc == 3) {

                System.out.printf("Escolha qual listar \n\n" +
                        "1 - frente\n" +
                        "2 - trás");
                confirm = scan.nextInt();

                if (confirm == 1) {

                    try {

                        if (arrFront.size() >= 1) {

                            for (Front f : arrFront) {
                                System.out.printf(
                                        "\nOPCS\n Id: %d - framework: %s \n - Linguagem: %s",
                                        f.getId(), f.getFramework(), f.getLingua());
                            }

                        }

                    } catch (Exception e) {
                        System.out.printf("Informa mais a gente antes de perguntar<3", e);
                    }

                } else {

                    try {

                        if (arrFront.size() >= 1) {

                            for (Back b : arrBack) {
                                System.out.printf(
                                        "\nOPCS\n Id: %d - framework: %s \n - Linguagem: %s",
                                        b.getId(), b.getFramework(), b.getLingua());
                            }

                        }

                    } catch (Exception e) {
                        System.out.printf("Informa mais a gente antes de perguntar<3", e);
                    }
                }

            }

        }
        ;

        scan.close();
    }

}
