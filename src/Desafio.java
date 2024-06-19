import java.util.Scanner;
import java.util.Locale;

public class Desafio {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new
        Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor bruto do seu salário: ");
        float salarioBruto = scanner.nextFloat();
        System.out.println("Digite o valor total dos beneficios: ");
        float valorBeneficios = scanner.nextFloat();

        float porcentualImposto = 0;
        //porcentual referente ao salario:
        if(salarioBruto > 0 && salarioBruto <= 1100.00){
            porcentualImposto = salarioBruto*5;
            porcentualImposto = porcentualImposto/100;
            System.out.println("Seu imposto é de: " + porcentualImposto);

        }else if(salarioBruto >= 1100.01 && salarioBruto <= 2500.00){
            porcentualImposto = salarioBruto*10;
            porcentualImposto = porcentualImposto/100;
            System.out.println("Seu imposto é de: " + porcentualImposto);

        }else if(salarioBruto >= 2500.01){
            porcentualImposto = salarioBruto*15;
            porcentualImposto = porcentualImposto/100;
            System.out.println("Seu imposto é de: " + porcentualImposto);

        }
        float valorLiquido = salarioBruto - porcentualImposto + valorBeneficios;
        System.out.println("Seu salário liquido é: " + valorLiquido);

    }
}
