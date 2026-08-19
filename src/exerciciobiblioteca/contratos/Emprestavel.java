package exerciciobiblioteca.contratos;

public interface Emprestavel {
    int get_PrazoEmprestimoDias();
    double getMultaPorDia();
    boolean emprestar(Usuario usuario);
    boolean devolver();

    default boolean permitirRenovacao(){
        return  false;
    }
    default  double calcularMulta(int dias_atrasados){
        if(dias_atrasados <=0 ){
            return 0;
        }
        return dias_atrasados + getMultaPorDia();
    }

}
