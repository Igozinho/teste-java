public class Estoque {
    // Atributos da classe
    public String fruta1;
    public String fruta2;
    public int Qrt1;
    public int Qrt2;
    public double prç1;
    public double prç2;

    // Método para exibir a mensagem de boas-vindas
    public void Jol() {
        System.out.println("Seja bem-vindo à loja do seu Zé!");
    }

    // Método para atribuir valores aos atributos
    public void atribuir(String fruta1, String fruta2, int Qrt1, int Qrt2, double prç1, double prç2) {
        this.fruta1 = fruta1;
        this.fruta2 = fruta2;
        this.Qrt1 = Qrt1;
        this.Qrt2 = Qrt2;
        this.prç1 = prç1;
        this.prç2 = prç2;
    }

    // Método para exibir os nomes das frutas
    public void Nome() {
        System.out.println("As frutas disponíveis são: " + this.fruta1 + " e " + this.fruta2);
    }

    // Método para exibir as quantidades das frutas
    public void quantidades() {
        System.out.println("A fruta " + this.fruta1 + " tem a seguinte quantidade: " + this.Qrt1);
        System.out.println("A fruta " + this.fruta2 + " tem a seguinte quantidade: " + this.Qrt2);
    }

    // Método para exibir os preços das frutas
    public void valor() {
        System.out.println("O valor da fruta " + this.fruta1 + " é: R$ " + this.prç1);
        System.out.println("O valor da fruta " + this.fruta2 + " é: R$ " + this.prç2);
    }

    // Método para realizar a compra da fruta 1 e aumentar o estoque
    public void comprarFruta1(int quantidadeRetirada) {
        double precoFinal = quantidadeRetirada * this.prç1;
        System.out.println("Compra realizada:");
        System.out.println("Fruta: " + this.fruta1);
        System.out.println("Quantidade retirada: " + quantidadeRetirada);
        System.out.println("Valor unitário: R$ " + this.prç1);
        System.out.println("Preço final: R$ " + precoFinal);
        this.Qrt1 += quantidadeRetirada; // Aumenta o estoque (adição)
    }

    // Método para realizar a compra da fruta 2 e aumentar o estoque
    public void comprarFruta2(int quantidadeRetirada) {
        double precoFinal = quantidadeRetirada * this.prç2;
        System.out.println("Compra realizada:");
        System.out.println("Fruta: " + this.fruta2);
        System.out.println("Quantidade retirada: " + quantidadeRetirada);
        System.out.println("Valor unitário: R$ " + this.prç2);
        System.out.println("Preço final: R$ " + precoFinal);
        this.Qrt2 += quantidadeRetirada; // Aumenta o estoque (adição)
    }
}