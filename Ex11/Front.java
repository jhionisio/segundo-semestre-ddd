package Ex11;

public class Front extends Tecs implements Tec {

    private boolean compatibilidadeWeb;
    private boolean compatibilidadeMobile;

    public boolean isCompatibilidadeWeb() {
        return this.compatibilidadeWeb;
    }

    public boolean getCompatibilidadeWeb() {
        return this.compatibilidadeWeb;
    }

    public void setCompatibilidadeWeb(boolean compatibilidadeWeb) {
        this.compatibilidadeWeb = compatibilidadeWeb;
    }

    public boolean isCompatibilidadeMobile() {
        return this.compatibilidadeMobile;
    }

    public boolean getCompatibilidadeMobile() {
        return this.compatibilidadeMobile;
    }

    public void setCompatibilidadeMobile(boolean compatibilidadeMobile) {
        this.compatibilidadeMobile = compatibilidadeMobile;
    }

    public Front(boolean compatibilidadeWeb, boolean compatibilidadeMobile) {
        this.compatibilidadeWeb = compatibilidadeWeb;
        this.compatibilidadeMobile = compatibilidadeMobile;
    }

    public Front() {
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
