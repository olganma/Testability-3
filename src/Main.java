public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int payment1 = service.calculate(1_000_000, 1, 9.99);
        System.out.println("сумма кредита - 1 000 000 руб., срок кредита - 1 года, годовая ставка - 9,99%");
        System.out.println("Ежемесячный платеж - " + payment1 + " руб.");
        System.out.println();

        int payment2 = service.calculate(1_000_000, 2, 9.99);
        System.out.println("сумма кредита - 1 000 000 руб., срок кредита - 2 года, годовая ставка - 9,99%");
        System.out.println("Ежемесячный платеж - " + payment2 + " руб.");
        System.out.println();

        int payment3 = service.calculate(1_000_000, 3, 9.99);
        System.out.println("сумма кредита - 1 000 000 руб., срок кредита - 3 года, годовая ставка - 9,99%");
        System.out.println("Ежемесячный платеж - " + payment3 + " руб.");

    }
}