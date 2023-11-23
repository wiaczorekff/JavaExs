import java.util.Scanner;

public class CalculadoraComConversorDeTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples com Conversor de Temperatura");
        System.out.println("Escolha a opção:");
        System.out.println("1. Calculadora");
        System.out.println("2. Conversor de Temperatura");

        int escolhaPrincipal = scanner.nextInt();

        if (escolhaPrincipal == 1) {
            // Código da Calculadora
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");

            int escolha = scanner.nextInt();

            double resultado = 0;

            switch (escolha) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.exit(0);
            }

            System.out.println("Resultado: " + resultado);

        } else if (escolhaPrincipal == 2) {
            // Código do Conversor de Temperatura
            System.out.println("Escolha a escala de temperatura:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Celsius para Kelvin");
            System.out.println("4. Kelvin para Celsius");
            System.out.println("5. Fahrenheit para Kelvin");
            System.out.println("6. Kelvin para Fahrenheit");

            int escolhaConversor = scanner.nextInt();

            System.out.print("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();
            double resultadoTemperatura = 0;

            switch (escolhaConversor) {
                case 1:
                    resultadoTemperatura = celsiusParaFahrenheit(temperatura);
                    break;
                case 2:
                    resultadoTemperatura = fahrenheitParaCelsius(temperatura);
                    break;
                case 3:
                    resultadoTemperatura = celsiusParaKelvin(temperatura);
                    break;
                case 4:
                    resultadoTemperatura = kelvinParaCelsius(temperatura);
                    break;
                case 5:
                    resultadoTemperatura = fahrenheitParaKelvin(temperatura);
                    break;
                case 6:
                    resultadoTemperatura = kelvinParaFahrenheit(temperatura);
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.exit(0);
            }

            System.out.println("Resultado: " + resultadoTemperatura);

        } else {
            System.out.println("Opção inválida");
        }
    }

    // Métodos para conversão de temperatura
    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double fahrenheitParaKelvin(double fahrenheit) {
        return celsiusParaKelvin(fahrenheitParaCelsius(fahrenheit));
    }

    private static double kelvinParaFahrenheit(double kelvin) {
        return celsiusParaFahrenheit(kelvinParaCelsius(kelvin));
    }
}
