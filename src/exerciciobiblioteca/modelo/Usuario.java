package exerciciobiblioteca.modelo;

public  abstract class Usuario {
    private final  String matricula;
    private final String nome;
    private final String email;
    private final ItemAcervo[] itemEmprestado ;
    public String getNome;
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
    public abstract int getLimiteEmprestimo();
    public  abstract double getPercentualDesconto();
    public  abstract String getCategoria();
    public double aplicarDesconto(double multa){
        if (multa > 0){
            throw  new IllegalArgumentException("A multa nao pode ser maior que 0 ");
        }
        return multa * getPercentualDesconto();
    }
      void registrarEmpretismo(ItemAcervo item){
       itemEmprestado[quantidade]= item;
       quantidade++;
    }
      boolean registraDevolucao(ItemAcervo item){
        for ( int i =0; i < quantidade; i++){
            if (itemEmprestado [1].equals(item)){
                for (int j =i; j< quantidade -1; j++){
                    itemEmprestado[j]=itemEmprestado[j+1];
                }
                itemEmprestado[quantidade -1]=null;
                quantidade++;
                return true;
            }
          }
        return false;
      }

}
