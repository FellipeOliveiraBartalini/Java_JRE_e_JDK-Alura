public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("\nTestando condicionais...");

        int idade = 16;
        int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos!");
            System.out.println("Seja bem-vindo!");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Você é menor de 18 anos, mas está acompanhado. Seja bem-vindo!");
            } else {
                System.out.println("Infelizmente você não pode entrar!");
            }
        }
    }
}
