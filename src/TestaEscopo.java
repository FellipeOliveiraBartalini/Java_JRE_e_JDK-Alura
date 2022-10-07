public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("\nTestando condicionais...");

        int idade = 19;
        int quantidadePessoas = 1;

        boolean acompanhado = quantidadePessoas >= 2;

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar!");
        }
    }
}
