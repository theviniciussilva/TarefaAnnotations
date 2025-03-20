public class Tabela {
    @AnnotationTabela(value = "getNome")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
