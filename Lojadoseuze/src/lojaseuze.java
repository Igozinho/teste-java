public class lojaseuze{
    public static void main(String[] args) {
        // Criando um objeto da classe Estoque
        Estoque estoque = new Estoque();

        // Exibindo a mensagem de boas-vindas
        estoque.Jol();

        // Atribuindo valores aos atributos
        estoque.atribuir("Maçã", "Banana", 50, 30, 2.50, 1.80);

        // Exibindo os nomes das frutas
        estoque.Nome();

        // Exibindo as quantidades das frutas
        estoque.quantidades();

        // Exibindo os preços das frutas
        estoque.valor();

        // Realizando uma compra da fruta 1 (Maçã)
        System.out.println("\n--- Realizando uma compra de Maçã ---");
        estoque.comprarFruta1(10); // Compra de 10 maçãs

        // Realizando uma compra da fruta 2 (Banana)
        System.out.println("\n--- Realizando uma compra de Banana ---");
        estoque.comprarFruta2(5); // Compra de 5 bananas

        // Exibindo as quantidades atualizadas após as compras
        System.out.println("\n--- Quantidades de reposição atualizadas ---");
        estoque.quantidades();
    }
}