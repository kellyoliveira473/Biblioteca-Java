package exerciciobiblioteca.contratos;

public interface Reservavel {
    void reservar(Usuario usuario);
    boolean temReserva();
    String getReservante();



}
