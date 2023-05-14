package OOP.Demo;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    public void take(double amountToTake) {
        if (lastIncome.isBefore(LocalDate.now().minusMonths(1))) {
            super.take(amountToTake);
        }
    }
}
