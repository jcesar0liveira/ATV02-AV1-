public class Main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Percy Jackson", "Rick Riordan", 2005);
        Livro livro2 = new Livro("Harry Potter", "J.K. Rowling", 1997);
        Livro livro3 = new Livro("Naruto", "Masashi kishimoto", 1999);

        
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        livro3.exibirInformacoes();

        
        livro1.emprestar();
        
        livro1.exibirInformacoes();
        livro1.emprestar();
        livro1.devolver();
        
        livro1.exibirInformacoes();

        
        livro1.devolver();
    }
}
