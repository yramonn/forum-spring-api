package br.com.ramon;

import br.com.ramon.model.Curso;
import br.com.ramon.repository.CursoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")

public class CursoRepositoryTest {

    @Autowired
    private CursoRepository repository;

    @Test
    public void deveriaCarregarUmCursoAoBuscarPeloSeuNome() {
        String nomeCurso = "HTML 5";
        Curso curso = repository.findByNome(nomeCurso);
        Assert.assertNotNull(curso);
        Assert.assertEquals(nomeCurso,curso.getNome());

    }





}
