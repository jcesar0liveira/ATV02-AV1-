public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private boolean disponivel;


    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.disponivel = true; // Por padrão, o livro está disponível
    }


    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("Desculpe, o livro '" + titulo + "' já está emprestado.");
        }
    }


    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("O livro '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("O livro '" + titulo + "' já está disponível.");
        }
    }


    public void exibirInformacoes() {
        String status = disponivel ? "Disponível" : "Emprestado";
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoDePublicacao);
        System.out.println("Status: " + status);
        System.out.println();
    }
}
