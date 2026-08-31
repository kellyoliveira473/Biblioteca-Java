package exerciciobiblioteca.modelo;

import exerciciobiblioteca.contratos.Emprestavel;
import exerciciobiblioteca.contratos.config;

public  class Revista extends ItemAcervo implements Emprestavel {
    private String numeroEdicao;
    private int anoEdicao;
    private String Editora;

    protected Revista(String codigo, String titulo, int ano) {
        super(codigo, titulo, ano);
    }
    public void setAnoEdicaot(int anoEdicao){
        if(anoEdicao < config.Ano_publicacao){
            throw  new IllegalArgumentException("Revista não esta disponivel");
        }
        this.anoEdicao= anoEdicao;
    }
    public String setEditora(String Editora){
        if (Editora == null || Editora.isBlank()){
            throw new IllegalArgumentException("O nome da Editora não pode está vazio ou nulo ");
        }
        return Editora;
    }


    @Override
    public int get_PrazoEmprestimoDias() {
        return 0;
    }

    @Override
    public double getMultaPorDia() {
        return 0;
    }

    @Override
    public boolean emprestar(Usuario usuario) {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }

    @Override
    public String Categoria() {
        return "";
    }

    @Override
    public String getDescricao() {
        return "";
    }

    @Override
    public String getLocalizacaoEstante() {
        return "";
    }
}