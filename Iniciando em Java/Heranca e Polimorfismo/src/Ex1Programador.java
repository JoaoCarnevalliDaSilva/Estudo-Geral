public class Ex1Programador extends Ex1Funcionario{
    private String linguagemPreferida;

    public Ex1Programador(String novoNome, double novoSalario, String lingua) {
        super(novoNome, novoSalario);
        this.linguagemPreferida = lingua;
    }

    public String getLinguagemPreferida(){return this.linguagemPreferida;}
    public void setLinguagemPreferida(String lingua) {this.linguagemPreferida=lingua;}

    public void codar() {
        System.out.println("O programador "+getNome()+" esta codando na linguagem: "+this.getLinguagemPreferida());
    }
}
