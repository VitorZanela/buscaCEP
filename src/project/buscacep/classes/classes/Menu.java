package project.buscacep.classes.classes;

import java.util.Scanner;

public class Menu {
    Scanner entrada = new Scanner(System.in);


    public int escolherOpc(){
        System.out.println("1 - Busca por CEP / 2 - Busca por Endereço: ");
        int opc = entrada.nextInt();
        entrada.nextLine();
        return opc;
    }

    public String lerCep(){
        System.out.println("Digite o CEP (Somente números)");
        return entrada.nextLine();
    }

    public String[] buscaEndereco(){
        System.out.println("Digite o Estado (Ex: SP, MG, BA...)");
        String estado = entrada.nextLine();
        System.out.println("Digite a Cidade (Ex: São Paulo, Porto Seguro, Rio de Janeiro...)");
        String cidade = entrada.nextLine();
        System.out.println("Digite o nome da Rua (Rua, Avenida, Estrada...)");
        String rua = entrada.nextLine();

        return new String[]{estado, cidade, rua};
    }

    public boolean desejaContinuar(){
        while (true){
            System.out.println("Deseja continuar? (S/N)");
            String resp = entrada.nextLine();
            if (resp.equalsIgnoreCase("s"))
                return true;
            if (resp.equalsIgnoreCase("n"))
                return false;
            System.out.println("Reposta Incorreta! Tente novamente!");
        }

    }
}
