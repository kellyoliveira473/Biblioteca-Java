package exerciciobiblioteca.modelo;

import exerciciobiblioteca.contratos.Emprestavel;

public  abstract class itemEmprestado extends ItemAcervo implements Emprestavel {
   private  Usuario  usuarioAtual;



    protected itemEmprestado(String codigo, String titulo, int ano) {
        super(codigo,titulo,ano);
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
