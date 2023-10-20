package br.com.ramon.controller.form;

import br.com.ramon.model.Topico;
import br.com.ramon.repository.TopicoRepository;
import com.sun.istack.NotNull;

public class AtualizacaoTopicoForm {
    @NotNull
    private String titulo;
    @NotNull
    private String mensagem;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getOne(id);
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;
    }
}
