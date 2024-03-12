import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Método imprimir coordenadas pré-setado.\n" +
                "2 - Método Teste de setCoordenadas e imprimirCoordenadas.\n" +
                "3 - Método Teste p3 e p4 Questão 3.19.\n" +
                "4 - Método Teste p5 e p6 Questão 3.21.\n" +
                "5 - Método Teste JOptionPane único.\n" +
                "6 - Método Teste JOptionPane múltiplo.\n" +
                "7 - Método Teste ArrayList.\n" +
                "8 - Método Teste Conjunto.\n"
        ));
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    new Main().inprimeCoordenadasPreSetadas();
                    break;
                case 2:
                    new Main().setCoordenadasEImprimirCoordenadas();
                    break;
                case 3:
                    new Main().testeP3eP4Questao319();
                    break;
                case 4:
                    new Main().testeP5eP6Questao321();
                    break;
                case 5:
                    new Main().testeJOptionPaneUnico();
                    break;
                case 6:
                    new Main().testeJOptionPaneMultiplo();
                    break;
                case 7:
                    new Main().testeArrayList();
                    break;
                case 8:
                    new Main().testConjunto();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

        public void inprimeCoordenadasPreSetadas() {
            Ponto p1 = new Ponto();

            p1.imprimirCoordenadas();
            p1.incrementarCoordenadas(5, 2);
            p1.zerarCoordenadas();
            p1.imprimirCoordenadas();
            p1.incrementarCoordenadas(5, 2);
            p1.zerarCoordenadas();
            p1.imprimirCoordenadas();

            Ponto p2 = new Ponto();
            p2.imprimirCoordenadas();
            p2.incrementarCoordenadas(6, 9);
            p2.imprimirCoordenadas();
            p2.incrementarCoordenadas(5, 2);
            p2.imprimirCoordenadas();
            p2.zerarCoordenadas();
            main(null);
        }

        public void setCoordenadasEImprimirCoordenadas() {
            System.out.println("\n Teste de setCoordenadas e imprimirCoordenadas: Questão 3.18");
            Ponto ponto = new Ponto();
            ponto.setCoordenadas(10, 20);
            ponto.imprimirCoordenadas();
            ponto.incrementarCoordenadas(5, 2);
            ponto.imprimirCoordenadas();
            ponto.zerarCoordenadas();
            main(null);
        }

        public void testeP3eP4Questao319() {
            System.out.println("\n Teste p3 e p4 Questão 3.19");
            Ponto p3 = new Ponto(2, 6, "ponto 3");
            p3.imprimirCoordenadas();
            p3.incrementarCoordenadas(6, 9);
            p3.imprimirCoordenadas();
            p3.incrementarCoordenadas(5, 2);
            p3.imprimirCoordenadas();
            p3.zerarCoordenadas();
            Ponto p4 = new Ponto();
            p4.imprimirCoordenadas();
            p4.incrementarCoordenadas(6, 9);
            p4.imprimirCoordenadas();
            p4.incrementarCoordenadas(5, 2);
            p4.imprimirCoordenadas();
            p4.zerarCoordenadas();
            main(null);
        }

        public void testeP5eP6Questao321() {
            System.out.println("\n Teste p5 e p6 Questão 3.21");
            Ponto p5 = new Ponto();
            p5.setAtributos(10, 20);
            p5.imprimirCoordenadas();
            p5.incrementarCoordenadas(2,3);
            p5.imprimirCoordenadas();
            p5.zerarCoordenadas();

            Ponto p6 = new Ponto();
            p6.setAtributos(5, 8);
            p6.imprimirCoordenadas();
            p6.incrementarCoordenadas(2,3);
            p6.imprimirCoordenadas();
            p6.zerarCoordenadas();
            main(null);
        }

        public void testeJOptionPaneUnico() {
            // Solicita a entrada de dados do usuário utilizando JOptionPane
            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite a coordenada x:"));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Digite a coordenada y:"));
            String descricao = JOptionPane.showInputDialog("Digite a descrição:");

            // Instancia o objeto Ponto com os dados fornecidos pelo usuário
            Ponto ponto1 = new Ponto(x, y, descricao);

            // Exibe o resultado do método toString() em uma janela do tipo JOptionPane
            JOptionPane.showMessageDialog(null, ponto1.toString());
            main(null);
        }


    public void testeJOptionPaneMultiplo() {
        StringBuilder resultado = new StringBuilder();
        // Loop para permitir que o usuário crie objetos até informar coordenadas negativas
        while (true) {
            // Solicita a entrada de dados do usuário utilizando JOptionPane
            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite a coordenada x (ou negativo para sair):"));
            // Verifica se o usuário deseja encerrar o programa
            if (x < 0) {
                break;
            }
            int y = Integer.parseInt(JOptionPane.showInputDialog("Digite a coordenada y (ou negativo para sair):"));
            // Verifica se o usuário deseja encerrar o programa
            if (y < 0) {
                break;
            }
            String descricao = JOptionPane.showInputDialog("Digite a descrição:");
            // Instancia o objeto Ponto com os dados fornecidos pelo usuário
            Ponto ponto = new Ponto(x, y, descricao);
            // Adiciona a representação do objeto ao resultado
            resultado.append(ponto.toString()).append("\n");
        }
        // Exibe os resultados dos objetos instanciados
        JOptionPane.showMessageDialog(null, resultado.toString());
        main(null);
    }

    public void testeArrayList() {
         ArrayList<Ponto> pontos = new ArrayList<>();

        // Loop para permitir que o usuário crie objetos até informar coordenadas negativas
        while (true) {
            // Solicita a entrada de dados do usuário utilizando JOptionPane
            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite a coordenada x (ou negativo para sair):"));

            // Verifica se o usuário deseja encerrar o programa
            if (x < 0) {
                break;
            }

            int y = Integer.parseInt(JOptionPane.showInputDialog("Digite a coordenada y (ou negativo para sair):"));

            // Verifica se o usuário deseja encerrar o programa
            if (y < 0) {
                break;
            }

            String descricao = JOptionPane.showInputDialog("Digite a descrição:");

            // Instancia o objeto Ponto com os dados fornecidos pelo usuário
            Ponto ponto = new Ponto(x, y, descricao);

            // Adiciona o objeto ao ArrayList
            pontos.add(ponto);
        }

        // Exibe o total de objetos instanciados
        JOptionPane.showMessageDialog(null, "Total de objetos instanciados: " + pontos.size());

        // Exibe o resultado do método toString() de cada objeto instanciado
        for (Ponto ponto : pontos) {
            JOptionPane.showMessageDialog(null, ponto.toString());
        }
        main(null);
    }

    public void testConjunto() {
        System.out.println("Início da tarefa de testes do Conjunto.");

        Ponto p1 = new Ponto();
        Conjunto c1 = new Conjunto(1, "c1");

        p1.imprimirCoordenadas();
        p1.incrementarCoordenadas(5, 2);

        c1.adicionarPonto(p1);
        p1.imprimirCoordenadas();
        p1.incrementarCoordenadas(5, 2);
        p1.zerarCoordenadas();
        p1.imprimirCoordenadas();

        Ponto p2 = new Ponto();
        p2.imprimirCoordenadas();
        p2.incrementarCoordenadas(6, 9);

        p2.imprimirCoordenadas();
        p2.incrementarCoordenadas(5, 2);
        p2.imprimirCoordenadas();
        p2.zerarCoordenadas();

        c1.adicionarPonto(p1);
        c1.listarPontos();
        c1.excluirPonto(p2);
        c1.listarPontos();
        System.out.println("Fim da tarefa de testes do Conjunto.");
        main(null);
    }
}