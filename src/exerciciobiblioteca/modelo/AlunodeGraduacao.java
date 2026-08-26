package exerciciobiblioteca.modelo;

public class AlunodeGraduacao extends Usuario{
    private final String curso;
    private final int perdiodo;

    protected AlunodeGraduacao(String matricula, String nome, String email,String curso,int periodo) {
        super(matricula, nome, email);
        this.curso=curso;
        this.perdiodo=periodo;
    }


    @Override
    public int getLimiteEmprestimo() {
        return 0;
    }

    @Override
    public double getPercentualDesconto() {
        return 0;
    }

    @Override
    public String getCategoria() {
        return "";
    }
}
