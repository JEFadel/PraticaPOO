public class Carro {
    String cor;
    String marca;
    String modelo;
    int ano;
    boolean automatico;
    float velocidade = 0f;
    boolean ligado = false;

    public void Ligar() {
        ligado = true;
        System.out.println("O carro está ligado!");
    }

    public void Desligar() {
        ligado = false;
        System.out.println("O carro está desligado!");
    }

    public String Buzinar() {
        return "BIIIIIIIII";
    }

    public void Acelerar() {
        velocidade += 20;
        System.out.println("A velocidade atual é: " + velocidade);
    }

    public void Frear() {
        velocidade -= 10;
        System.out.println("A velocidade atual é: " + velocidade);
    }

}
