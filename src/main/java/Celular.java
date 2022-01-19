public class Celular extends Template{
    public Celular(Tema tema) {
        super(tema);
    }

    public String getTemplate() {
        return "O tema do template do celular é " + this.tema.getTema();
    }
}
