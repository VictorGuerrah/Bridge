public class Computador extends Template{
    public Computador(Tema tema) {
        super(tema);
    }

    public String getTemplate() {
        return "O tema do template do computador é " + this.tema.getTema();
    }
}
