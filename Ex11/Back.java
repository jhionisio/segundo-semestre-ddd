package Ex11;

public class Back extends Tecs implements Tec {

    private boolean conteinerizacao;

    public boolean isConteinerizacao() {
        return this.conteinerizacao;
    }

    public boolean getConteinerizacao() {
        return this.conteinerizacao;
    }

    public void setConteinerizacao(boolean conteinerizacao) {
        this.conteinerizacao = conteinerizacao;
    }

    public Back(boolean conteinerizacao) {
        this.conteinerizacao = conteinerizacao;
    }

    public Back() {
    }

    @Override
    public String especificoLingua(String nome) {
        return null;
    }

    @Override
    public String especificoFramework(String nome) {
        return null;
    }

}