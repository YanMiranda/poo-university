public class Ponto {

    private int x;
    private int y;
    private String descricao;

    // Construtor padrão
    public Ponto() {
    }

    // Construtor com parâmetros
    public Ponto(int x, int y, String descricao) {
        this.x = x;
        this.y = y;
        this.descricao = descricao;
    }


    public void incrementarCoordenadas(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }

    public void imprimirCoordenadas() {
        // imprime as coordenadas x e y
        System.out.println(" (x, y)=(" + x + "," + y + ")");
    }


    public void zerarCoordenadas() {
        x = 0;
        y = 0;
    }

    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setAtributos(int x, int y) {
        this.x = x;
        this.y = y;
//        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
