package exerciciobiblioteca.modelo;

import exerciciobiblioteca.contratos.Emprestavel;

public  abstract class itemEmprestado extends ItemAcervo implements Emprestavel {
   private  Usuario  usuarioAtual;



    protected itemEmprestado(String codigo, String titulo, int ano, String codigo1, String titulo1, int ano1) {
        super(codigo, titulo, ano, codigo1, titulo1, ano1);
    }
    @Override
    public boolean emprestar(Usuario usuario){
        if (usuario == null){
            throw  new IllegalArgumentException("Usuario não pode ser nulo ");
        }
        if (!isDisponivel()){
            System.out.println("Item indisponivel");
        }
        marcarEmprestado();
        return  true;
    }

}
