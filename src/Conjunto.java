import java.util.ArrayList;

public class Conjunto {

    private int codigo;
    private String descricao;
    private ArrayList<Ponto> pontos;

    public Conjunto(int codigo, String c1) {
        this.codigo = codigo;
        this.descricao = c1;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Ponto> getPontos() {
        return pontos;
    }

    public void setPontos(ArrayList<Ponto> pontos) {
        this.pontos = pontos;
    }

    public String toString() {
        return "Conjunto [codigo=" + codigo + ", descricao=" + descricao + ", pontos=" + pontos + "]";
    }

    public void adicionarPonto(Ponto ponto) {
        if (pontos == null) {
            pontos = new ArrayList<>();
        }
        pontos.add(ponto);
        System.out.println("Número de objetos adicionados ao ArrayList: " + pontos.size());
    }

    public void excluirPonto(Ponto ponto){
        for (Ponto p : pontos) {
            if (p.equals(ponto)) {
                pontos.remove(p);
                break;
            }
        }
        System.out.println("Número de objetos adicionados ao ArrayList: " + pontos.size());
    }
    public void listarPontos() {
        System.out.println("ArrayList de pontos: " + pontos);
    }

}
