package exerciciobiblioteca.contratos;

import exerciciobiblioteca.modelo.Usuario;

public interface Reservavel {
    void reservar(Usuario usuario);
    boolean temReserva();
    String getReservante();



}
