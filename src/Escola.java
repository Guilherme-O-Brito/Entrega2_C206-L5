public class Escola {

    String nome;
    String email;
    String numTelefone;
    String endereco;
    Estudante []estudantes = new Estudante[300];

    // Constructor
    public Escola(String nome, String email, String numTelefone, String endereco){

        this.nome = nome;
        this.email = email;
        this.numTelefone = numTelefone;
        this.endereco = endereco;

    }

    // Metodos
    public void addEstudante(Estudante estudante){

        for(int i=0;i<estudantes.length;i++)
            if(estudantes[i] == null){

                estudantes[i] = new Estudante(estudante.nome, estudante.idade, estudante.ano);
                break;
            
            }
                
    }

    public void qtdEstudanteAno(){

        int primeiro = 0, segundo = 0, terceiro = 0; // Variaveis auxiliares para contagem de alunos em cada ano

        for(int i=0;i<estudantes.length;i++){

            if(estudantes[i] == null)
                break;
            
            switch(estudantes[i].ano){

                case 1 -> primeiro++;
                case 2 -> segundo++;
                case 3 -> terceiro++;

            }    

        }

        System.out.println("Quantidade de alunos no primeiro ano: "+primeiro);
        System.out.println("Quantidade de alunos no segundo ano: "+segundo);
        System.out.println("Quantidade de alunos no terceiro ano: "+terceiro);

    }

    public void mostrarInfos(){

        System.out.println("Nome: "+nome);
        System.out.println("Email: "+email);
        System.out.println("Numero de telefone: "+numTelefone);
        System.out.println("Endereco: "+endereco);

    }

}
