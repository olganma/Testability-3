public class CreditPaymentService {
    public int calculate(int creditSum, int yearNumber, double yearRate) {

        //Определяем ежемесячный платеж по платежу: P=S* (i+i/((1+i)^n- 1))
        //P – ежемесячный платеж
        //S – сумма кредита
        //i – ежемесячная процентная ставка
        //n – срок кредита (месяцев)

        double monthRate = yearRate / 12 / 100;
        int monthNumber = yearNumber * 12;
        double creditPayment = creditSum * (monthRate + (monthRate / ((Math.pow((1 + monthRate), monthNumber)) - 1)));
        int creditPayment1 = (int) Math.round(creditPayment);
        return creditPayment1;
    }
}
