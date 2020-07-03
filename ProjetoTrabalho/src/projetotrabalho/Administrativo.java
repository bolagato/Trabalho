package projetotrabalho;

public class Administrativo extends Assistente{
    public String turno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
   
    @Override
    public void exibedados(){
         System.out.println("DADOS DO ASSISTENTE\n" + "Nome: " + getNome() + 
                "\nIdade: " + getIdade() +
                "\nSalario: " + getSalario() +
                "\nNúmero da Matricula: " + getNum_matricula() + 
                "\nSetor: Administrativo" + 
                 "\nTurno: " + turno);
    }
    
}
