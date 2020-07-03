package projetotrabalho;

public class Assistente extends Fucionario{ //eu escrevi funcionario errado 
    
    public void exibedados(){
        System.out.println("DADOS DO ASSISTENTE\n" + "Nome: " + getNome() + 
                "\nIdade: " + getIdade() +
                "\nSalario: " + getSalario() +
                "\nNúmero da Matricula: " + getNum_matricula());
    }
}
