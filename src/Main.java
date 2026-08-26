import exerciciobiblioteca.modelo.Livro;
import exerciciobiblioteca.modelo.Usuario;
import exerciciobiblioteca.services.Biblioteca;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Casa do Livro");
        Livro livro = new Livro("068364", "A casa de Jorge", 2023, "Faria lima", "7415445");
        System.out.println("===== DADOS DO LIVRO =====");
        System.out.println("Código: " + livro.getCodigo());
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Ano: " + livro.getAno());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Categoria: " + livro.Categoria());
        System.out.println("Descrição: " + livro.getDescricao());
        System.out.println("Disponível: " + livro.isDisponivel());


    }
}



