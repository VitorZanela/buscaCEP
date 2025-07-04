    package project.buscacep.classes.main;
    
    import project.buscacep.classes.classes.BuscaCep;
    import project.buscacep.classes.classes.Menu;
    import project.buscacep.classes.classes.ServiceBuscaCep;
    import project.buscacep.classes.classes.ServiceBuscaEnd;
    
    import java.io.IOException;
    
    public class Main {
        public static void main(String[] args) throws IOException, InterruptedException {
            ServiceBuscaCep cepService = new ServiceBuscaCep();
            ServiceBuscaEnd endService = new ServiceBuscaEnd();
            Menu menu = new Menu();
    
            System.out.println("---- BUSCA DE ENDEREÇO ----");
            while (true) {
                int opc = menu.escolherOpc();
                if (opc == 1) {
                    String buscaCep = menu.lerCep();
                    if (buscaCep.length() != 8) {
                        System.out.println("Verifique o CEP e tente novamente!");
                        continue;
                    }
                    BuscaCep resultado = cepService.buscar(buscaCep);
                    if (resultado == null) {
                        System.out.println("CEP não encontrado ou inválido.");
                    } else {
                        System.out.println(resultado);
                        System.out.println("--------");
                    }
    
                } else if (opc == 2) {
                    String[] dados = menu.buscaEndereco();
                    BuscaCep[] json = endService.buscar(dados[0], dados[1], dados[2]);
    
                    if (json == null){
                        System.out.println("Endereço não localizado ou inválido.");
                    } else {
                        for (BuscaCep resul : json) {
                            System.out.println(resul);
                            System.out.println("--------");
                        }
                    }
                } else {
                    System.out.println("Opção invalida!! Tente novamente");
                }
                if(!menu.desejaContinuar()) break;
            }
        }
    }
