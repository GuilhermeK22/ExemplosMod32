package java;

import java.dao.IMatriculaDAO;
import java.dao.MatriculaDAO;
import java.domain.Matricula;
import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest {
    private IMatriculaDAO matriculaDAO;

    public MatriculaTest() {
        matriculaDAO = new MatriculaDAO();
    }

    public void cadastrar() {
        Matricula mat = new Matricula();
        mat.setCodigo("A1");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(2000d);
        mat = matriculaDAO.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());
    }
}
