public abstract class Template {
    protected Tema tema;

    public Template(Tema tema) {
        this.tema = tema;
    }

    public abstract String getTemplate();
}
