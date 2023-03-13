public class Carro {
    public String cor;
    public String marca;
    public String modelo;
    public int ano;
    public boolean automatico;
    public float velocidade = 0f;
    private boolean ligado = false;

    public Carro(String cor, String marca, String modelo, int ano, boolean automatico) {
        this.cor = cor;
        this. marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.automatico = automatico;
    }

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
