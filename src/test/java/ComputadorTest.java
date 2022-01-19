import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ComputadorTest {
    @Test
    void deveRetornarTemplateComputadorTemaEscuro() {
        Template template = new Computador(new Escuro());
        assertEquals("O tema do template do computador é escuro", template.getTemplate());
    }

    @Test
    void deveRetornarTemplateCelularTemaClaro() {
        Template template = new Computador(new Claro());
        assertEquals("O tema do template do computador é claro", template.getTemplate());
    }

}