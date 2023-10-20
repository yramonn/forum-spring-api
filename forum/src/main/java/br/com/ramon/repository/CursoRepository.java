package br.com.ramon.repository;

import br.com.ramon.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,Long> {
    Curso findByNome(String nomeCurso);
}
