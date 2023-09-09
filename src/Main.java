import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException{
        
        Scanner input = new Scanner(System.in);
        // Criando a escola
        Escola escola = new Escola("Escolinha do gugu", "Secretaria@gugu.com", "4002-8922", "Rua Sao Jao numero 9");
        // Estudante auxiliar para cadastro
        Estudante estudante = new Estudante();
        int option; // Opcao de entrada do usuario
        String pausa; // Apenas para pausar o programa

        do{
            
            clearScreen();
            escola.mostrarInfos();
            System.out.println("1 - Cadastrar Estudantes");
            System.out.println("2 - Mostrar informacoes dos estudantes");
            System.out.println("3 - Mostrar quantidade de alunos em cada ano");
            System.out.print("Entre com sua opcao (deigite 0 caso queira sair): ");
            option = input.nextInt();
            
            switch(option){

                case 1:

                    clearScreen();
                    input.nextLine(); // Limpando buffer
                    System.out.print("Insira o nome do estudante: ");
                    estudante.nome = input.nextLine();
                    System.out.print("Insira a idade do estudante: ");
                    estudante.idade = input.nextInt();
                    System.out.print("Insira o ano do estudante: ");
                    estudante.ano = input.nextInt();
                    escola.addEstudante(estudante);
                    input.nextLine(); // Limpando buffer
                    System.out.println("Digite qualquer coisa para continuar.");
                    pausa = input.nextLine();
                    break;
                
                case 2: 

                    clearScreen();
                    for(int i=0;i<escola.estudantes.length;i++){

                        if(escola.estudantes[i] == null)
                            break;
                        
                        escola.estudantes[i].mostrarInfos();    

                    }
                    input.nextLine(); // Limpando buffer
                    System.out.println("Digite qualquer coisa para continuar.");
                    pausa = input.nextLine();
                    break;
                
                case 3:
                    clearScreen();
                    escola.qtdEstudanteAno();
                    input.nextLine(); // Limpando buffer
                    System.out.println("Digite qualquer coisa para continuar.");
                    pausa = input.nextLine();
                    break;
                    
            }

        }while(option != 0);

        input.close();

    }

    /**
     * Limpa tela do terminal seja ele executado em windows, linux ou mac
     * @throws IOException
     * @throws InterruptedException
     */
    public static void clearScreen() throws IOException, InterruptedException {

        final String os = System.getProperty("os.name");
        
        if (os.contains("Windows"))
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else
        {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }

    } 

}
