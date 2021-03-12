package util;
/**
 *
 * @author junior, igor
 */
public class Horoscopo {
    private String signo;
    private String imagem;
    private String previsao;
    //private String date;

    public Horoscopo(String signo, String imagem, String previsao) {
        this.signo = signo;
        this.imagem = imagem;
        this.previsao = previsao;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getPrevisao() {
        return previsao;
    }

    public void setPrevisao(String previsao) {
        this.previsao = previsao;
    }
    
}
