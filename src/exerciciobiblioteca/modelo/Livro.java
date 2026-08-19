package exerciciobiblioteca.modelo;

import exerciciobiblioteca.contratos.Reservavel;

public class Livro extends itemEmprestado implements Reservavel {
    private final String autor;
    private final String isbn;
    private int renovaocaoUltilizada;
    private String nomeRenovacao;
    private static final int Maximo_Renovacao = 2;

    public Livro(String codigo, String titulo.int ano, String autor, String isbn) {
        super(codigo, titulo, ano);
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("Autor inválido");
        }
        this.autor = autor;
        this.isbn = isbn;
        this.nomeRenovacao = null;
        this.renovaocaoUltilizada = 0;
    }

    @Override
    public int get_PrazoEmprestimoDias() {
        return 14;
    }

    @Override
    public double getMultaPorDia() {
        return 0.50;
    }

    @Override
    public boolean permitirRenovacao() {
        return renovaocaoUltilizada < Maximo_Renovacao;
    }

    @Override
    public void reservar(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("Usuario inválido");
        }
        if (isDisponivel()) {
            this.nomeRenovacao = usuario.getNome();
        }
    }
    @Override
    public boolean temReserva(){
        return nomeRenovacao != null;
    }
    @Override
    public String getReservante(){
        return nomeRenovacao == null ? "-":this.nomeRenovacao;

    }
    @Override
    public  String Categoria(){
        return "Livro";
    }
    @Override
    public  String getDescricao(){
     return "Autor "+ this.autor +"ISBN"+ this.isbn;
    }

    public boolean renovar(){
        if (!permitirRenovacao()){
            return false;
        }
        renovaocaoUltilizada ++;
        return true;
    }
    public  String getAutor(){
   return  this.autor;
    }
    public int getRenovaocaoUltilizada(){
        return this.renovaocaoUltilizada;
    }



}
