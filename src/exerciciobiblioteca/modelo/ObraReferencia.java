package exerciciobiblioteca.modelo;

public class ObraReferencia extends ItemAcervo {
    private final String tipoObra;
    private final String localizacaoEstante;

    public ObraReferencia(String codigo, String titulo, int ano,
                          String tipoObra, String localizacaoEstante) {
        super(codigo, titulo, ano);

        this.tipoObra = tipoObra;
        this.localizacaoEstante = localizacaoEstante;
    }


    public void consultar(Usuario usuario){
         System.out.println("Obra de referencia consultada" + usuario.getNome);
         System.out.println("Localização de referencia "+localizacaoEstante);
     }
     @Override
    public String Categoria(){
     return "Referencia";
     }
    @Override
    public String getDescricao(){
        return "Tipo da obra " +tipoObra;
    }
    @Override
    public String getLocalizacaoEstante(){
        return this.localizacaoEstante;
    }



 }
