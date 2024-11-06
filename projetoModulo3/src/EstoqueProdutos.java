import java.util.*;

class Produto {
  String nome;
  String codigo;
  int quantidade;
  double preco;

  
  public Produto(String nome, String codigo, int quantidade, double preco) {
    this.nome       = nome;
    this.codigo     = codigo;
    this.quantidade = quantidade;
    this.preco      = preco;
  }

}



public class EstoqueProdutos {
  private ArrayList<Produto> produtos = new ArrayList<>();
  private Scanner sc = new Scanner(System.in);

  String nome;
  String codigo;
  int quantidade;
  double preco;

  public void cadastrarProduto() {
    System.out.print("Nome do produto: ");
    nome       = sc.nextLine();
    System.out.print("Código do produto: ");
    codigo     = sc.nextLine();
    System.out.print("Quantidade: ");
    quantidade = sc.nextInt();
    System.out.print("Preço: R$");
    preco      = sc.nextDouble();
    sc.nextLine();

    produtos.add(new Produto(nome, codigo, quantidade, preco));
    System.out.println("Produto cadastrado com sucesso!");
  }

  public void removerProduto() {
    System.out.print("Código do produto a ser removido: ");
    codigo = sc.nextLine();

    for (int i = 0; i < produtos.size(); i++) {
      if (produtos.get(i).codigo.equals(codigo)) {
        produtos.remove(i);
        System.out.println("Produto removido com sucesso!");
        return;
      }
    }
    System.out.println("Produto não encontrado.");
  }

  public void atualizarProduto() {
    System.out.print("Código do produto a ser atualizado: ");
    codigo = sc.nextLine();

    for (Produto produto : produtos) {
      if(produto.codigo.equals(codigo)) {
        System.out.print("Novo nome:");
        produto.nome  = sc.nextLine();
        System.out.print("Nova quantidade: ");
        produto.quantidade = sc.nextInt();
        System.out.print("Novo preço: R$");
        produto.preco = sc.nextDouble();
        sc.nextLine();
        System.out.println("Produto atualizado com sucesso!");
        return;
      }
    }
    System.out.println("Produto não encontrado.");
  }

  public void exibirProdutos() {
    if (produtos.isEmpty()){
      System.out.println("Nenhum produto cadastrado.");
      return;
    }
    System.out.printf("%-10s %-20s %-10s %-10s%n", "Código", "Nome", "Quantidade", "Preço");
    for (Produto produto : produtos) {
      System.out.printf("%-10s %-20s %-10d %-10.2f%n", produto.codigo, produto.nome, produto.quantidade, produto.preco);
    }
  }

  public void gerarRelatorio() {
    int totalQuantidade = 0;
    double valorTotal = 0.0;

    for (Produto produto : produtos) {
      totalQuantidade += produto.quantidade;
      valorTotal += produto.quantidade * produto.preco;
    }

    System.out.printf("Quantidade total de produtos: %d%n", totalQuantidade);
    System.out.printf("Valor total de estoques: R$%.2f%n", valorTotal);
  }

  public void menu() {
    while (true) {
      System.out.println("\nMenu:");
      System.out.println("1. Cadastrar Produto");
      System.out.println("2. Remover Produto");
      System.out.println("3. Atualizar Produto");
      System.out.println("4. Exibir Produtos");
      System.out.println("5. Gerar Relatório de Estoque");
      System.out.println("6. Sair");
      System.out.print("Escolha uma opção: ");

      int opcao = sc.nextInt();
      sc.nextLine();

      switch (opcao) {
        case 1:
          cadastrarProduto();
          break;
        case 2:
          removerProduto();
          break;
        case 3:
          atualizarProduto();
          break;
        case 4:
          exibirProdutos();
          break;
        case 5:
          gerarRelatorio();
          break;
        case 6:
          System.out.println("Saindo...");
          return;
        default:
          System.out.println("Opção inválida.");
      }
    }
  }

  public static void main(String[] args) {
    EstoqueProdutos sistema = new EstoqueProdutos();
    sistema.menu();
  }
}
