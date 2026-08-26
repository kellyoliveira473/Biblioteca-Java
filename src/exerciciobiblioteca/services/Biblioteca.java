package exerciciobiblioteca.services;

import exerciciobiblioteca.contratos.config;
import exerciciobiblioteca.modelo.ItemAcervo;
import exerciciobiblioteca.modelo.Usuario;

public class Biblioteca {
    private final String nome;
    private final ItemAcervo[] acervo;
    private int totaldeItens;
    private final Usuario[] usuario;
    private  int totaldeUsuario;


    public Biblioteca(String nome) {
        this.nome = nome;
        this.acervo = new ItemAcervo[config.Capacidade_acervo];
        this.usuario = new Usuario[config.Capacidade_usuarios];
        this.totaldeItens =0;
        this.totaldeUsuario= 0;
        }
     public void Cadastrar(ItemAcervo item){
        acervo[totaldeItens++] =item;
     }


    }

