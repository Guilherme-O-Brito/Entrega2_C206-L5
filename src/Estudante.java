public class Estudante {
    
    String nome;
    int idade;
    int ano;

    // Constructor
    public Estudante(String nome, int idade, int ano){

        this.nome = nome;
        this.idade = idade;
        this.ano = ano;

    }

    public Estudante(){
        
    }

    // Metodos
    public void mostrarInfos(){

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Ano: "+ano);

    }



}
