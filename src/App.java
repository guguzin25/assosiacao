public class App {
    public static void main(String[] args) throws Exception {


        Motor motor = new Motor(150.0, "Gasolina");
        Roda roda = new Roda(16, 5);
        Porta porta = new Porta("Esquerda");

        Veiculo veiculo = new Veiculo("ABC-1234", "Vermelho", motor, roda, porta);

        System.out.println(veiculo);


    }
}
