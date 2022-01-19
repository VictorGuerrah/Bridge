import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CelularTest {
    @Test
    void deveRetornarTemplateCelularTemaEscuro() {
        Template template = new Celular(new Escuro());
        assertEquals("O tema do template do celular é escuro", template.getTemplate());
    }

    @Test
    void deveRetornarTemplateCelularTemaClaro() {
        Template template = new Celular(new Claro());
        assertEquals("O tema do template do celular é claro", template.getTemplate());
    }

}