package projetotrabalho;
public class ProjetoTrabalho {
    
    public static void main(String[] args) {
       Tecnico tec = new Tecnico();
       Administrativo adm = new Administrativo();
       
       tec.setNome("Carlinhos");
       tec.setIdade(32);
       tec.setNum_matricula(1);
       tec.setSalario(1000.50);
       tec.setAumento(800.00);
       tec.bonus();
       tec.exibedados(); 
       
       adm.setNome("Maria");
       adm.setIdade(27);
       adm.setNum_matricula(2);
       adm.setSalario(1000.50);
       adm.setTurno("Noite");
       adm.exibedados(); 
    }
    
}
