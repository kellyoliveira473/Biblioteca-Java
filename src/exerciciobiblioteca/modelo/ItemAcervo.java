package exerciciobiblioteca.modelo;

import exerciciobiblioteca.contratos.config;

public  abstract class ItemAcervo {
    private final String codigo;
    private  final String titulo;
    private final int ano;
    private boolean disponivel;
    private static  int itensTotalCriados= 0;


    protected ItemAcervo(String codigo, String titulo, int ano) {
        if (codigo== null || codigo.isBlank()){
            throw  new IllegalArgumentException("Codigo inválido");
        }
        if (titulo == null || titulo.isBlank()){
            throw  new IllegalArgumentException("Titulo inválido");
        }
        if (ano <= config.Ano_publicacao || ano > config.Ano_maximo){
            throw  new IllegalArgumentException("Ano inválido");

        }
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.disponivel=true;
    }

    public  abstract String Categoria();
  public  abstract String getDescricao();

  public String getCodigo(){
      return codigo;
  }
  public  String getTitulo(){
      return titulo;
  }
  public int getAno(){
      return ano;
  }
  public boolean isDisponivel(){
      return disponivel;
  }
  protected void marcarEmprestado(){
      this.disponivel = false;
  }
  protected void maracrDisponivel(){
      this.disponivel= true;
  }
  public static int getTotalItensCriados(){
      return itensTotalCriados;
  }


    public abstract String getLocalizacaoEstante();
}
