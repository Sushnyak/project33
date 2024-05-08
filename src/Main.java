//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        System.out.println();
        System.out.println("При сумме кредита 1.000.000 на 1 год");
        int a = service.calculate(1_000_000, 1);
        System.out.println("Ежемесячный платеж = " + a);

        System.out.println();
        System.out.println("При сумме кредита 1.000.000 на 2 год");
        int b = service.calculate(1_000_000, 2);
        System.out.println("Ежемесячный платеж = " + b);

        System.out.println();
        System.out.println("При сумме кредита 1.000.000 на 3 год");
        int c = service.calculate(1_000_000, 3);
        System.out.println("Ежемесячный платеж = " + c);

    }
}