package br.com.miniautorizador.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartaoExistenteException extends RuntimeException {

    private String numeroCartao;
    private String senha;

    public CartaoExistenteException(String numeroCartao, String senha) {
        this.numeroCartao = numeroCartao;
        this.senha = senha;
    }
}
