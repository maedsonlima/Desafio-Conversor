import com.google.gson.annotations.SerializedName;

public class Moeda {
    private int opcaoEscolhida;
    private String opcaoConvertida;
    private String usd;
    private String ars;
    private String brl;
    private String cop;


    public String getArs() {
        return ars;
    }

    public void setArs(String ars) {
        this.ars = ars;
    }

    public String getBrl() {
        return brl;
    }

    public void setBrl(String brl) {
        this.brl = brl;
    }

    public String getCop() {
        return cop;
    }

    public void setCop(String cop) {
        this.cop = cop;
    }

    public String getUsd() {
        return usd;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public void setOpcaoConvertida(String opcaoConvertida) {
        this.opcaoConvertida = opcaoConvertida;
    }

    public int getOpcaoEscolhida() {
        return opcaoEscolhida;
    }

    public void setOpcaoEscolhida(int opcaoEscolhida) {
        this.opcaoEscolhida = opcaoEscolhida;
    }

    public String getOpcaoConvertida() {
        return opcaoConvertida;
    }


}

