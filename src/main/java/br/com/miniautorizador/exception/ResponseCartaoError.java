package br.com.miniautorizador.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseCartaoError {

    private String senha;
    private String numeroCartao;

    public ResponseCartaoError(String senha, String numeroCartao) {
        this.senha = senha;
        this.numeroCartao = numeroCartao;
    }

}
