public class Main {
    public static void main(String[] args) {
        // Carro da professora Marina
        Carro hb20 = new Carro(); // Criando uma instância de carro
        hb20.cor = "Cinza";
        hb20.marca = "Hyundai";
        hb20.modelo = "Hb20";
        hb20.ano = 2021;
        hb20.automatico = false;

        System.out.println("Olá, este modelo é o " + hb20.modelo);
        System.out.println("A marca do carro é " + hb20.marca + " e o seu ano é " + hb20.ano);
        System.out.println("A cor do carro é " + hb20.cor);

        hb20.cor = "Preto";
        System.out.println("A nova cor do carro é: " + hb20.cor);

        hb20.Ligar();
        System.out.println(hb20.Buzinar());
        hb20.Acelerar();
        hb20.Acelerar();
        hb20.Frear();
    }
}
