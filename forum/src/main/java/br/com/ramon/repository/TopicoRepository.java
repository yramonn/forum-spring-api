package br.com.ramon.repository;

import br.com.ramon.model.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico,Long> {

    Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);

    void deleteAllById(Long id);
}
