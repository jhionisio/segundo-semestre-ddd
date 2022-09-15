package Ex11;

public abstract class Tecs {

    private int id;
    private String lingua;
    private String framework;
    private String especificoLingua;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLingua() {
        return this.lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public String getFramework() {
        return this.framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getEspecificoLingua() {
        return this.especificoLingua;
    }

    public void setEspecificoLingua(String especificoLingua) {
        this.especificoLingua = especificoLingua;
    }

    public Tecs(int id, String lingua, String framework, String especificoLingua) {
        this.id = id;
        this.lingua = lingua;
        this.framework = framework;
        this.especificoLingua = especificoLingua;
    }

    public Tecs() {
    }

}
