package projetotrabalho;

public class Tecnico extends Assistente{
    public double aumento;
    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }
   
    public double bonus(){
        this.salario = salario + aumento;
        return salario;
    }
    @Override
    public void exibedados(){
        System.out.println("DADOS DO ASSISTENTE\n" + "Nome: " + getNome() + 
                "\nIdade: " + getIdade() +
                "\nSalario: " + salario +
                "\nNúmero da Matricula: " + getNum_matricula() + 
                "\nSetor: Técnico");
    }
}
