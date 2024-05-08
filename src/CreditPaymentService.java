public class CreditPaymentService {

    public int calculate(int sum, int creditTermYear) {

        int creditTermMount = creditTermYear * 12;
        double monthlyInterestRate = 9.99 / (100 * 12);
        double monthlyPayment = sum * (monthlyInterestRate / (1 - (Math.pow(1 + monthlyInterestRate, -creditTermMount))));
        return (int) monthlyPayment;

    }

}
