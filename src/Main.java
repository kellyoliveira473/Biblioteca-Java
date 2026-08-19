public class Main {

    public static void main(String[] args) {
       Pessoa b1 = new Pessoa();
       b1.nome= "Kelly";
       b1.idade = 29;

       Pessoa b2 = new Pessoa();
       b2.nome= "Carla";
       b2.idade= 29;
       double  numeroTeste = 10.0;
       double resul= b1.calcalular(numeroTeste,10.0);
        System.out.println(numeroTeste);
        System.out.println(resul);
    }
}