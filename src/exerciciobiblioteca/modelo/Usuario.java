package exerciciobiblioteca.modelo;

public  abstract class Usuario {
    private final  String matricula;
    private final String nome;
    private final String email;
    private final ItemAcervo[] itemEmprestado ;
    private int quantidade;
    private double multa;
    private static  int totaldeUsuarioCriados;

    protected Usuario(String matricula, String nome, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.itemEmprestado =  new ItemAcervo[0];
        this.multa=0;
        totaldeUsuarioCriados++;
    }
}
