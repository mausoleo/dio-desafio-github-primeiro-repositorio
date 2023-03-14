import java.util.Locale;
import java.util.Scanner;

public class programaCalculadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa Calculadora!");
		int escolha = 1;
		
		while (escolha != 0) {
			int operacao;
			double numero1, numero2;
			double resultado = 0;
			
			System.out.println("Qual operação você quer fazer?");
			System.out.println("[1] Adição");
			System.out.println("[2] Subtração");
			System.out.println("[3] Multiplicação");
			System.out.println("[4] Divisão");
			
			System.out.print("RESPOSTA: ");
			operacao = sc.nextInt();
			
			while (operacao < 1 || operacao > 4) {
				System.out.println("Opção incorreta, digite novamente!");
				System.out.print("RESPOSTA: ");
				operacao = sc.nextInt();
			}
			
			System.out.print("Digite o primeiro número: ");
			numero1 = sc.nextDouble();
			System.out.print("Digite o segundo número: ");
			numero2 = sc.nextDouble();
			
			
			if (operacao == 1) {
				resultado = numero1 + numero2;
			} else if (operacao == 2) {
				resultado = numero1 - numero2;
			} else if (operacao == 3) {
				resultado = numero1 * numero2;
			} else if (operacao == 4) {
				resultado = numero1 / numero2;
			}
			
			System.out.printf("O resultado é: %.2f%n", resultado);
			System.out.println("Quer fazer mais uma conta?");
			System.out.println("[1] Sim!");
			System.out.println("[0] Não!");
			System.out.print("RESPOSTA: ");
			escolha = sc.nextInt();
		}
		System.out.println("Até a próxima!");
		
		sc.close();
	}

}
