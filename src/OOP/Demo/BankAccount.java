package OOP.Demo;

import java.time.Instant;

public class BankAccount {

    public double balance;
    protected Instant contributionDay;//день вклада
    protected Instant witdrawalDay;//день вывода средств


    public double getAmount() {// получить количеств
        return balance;

        //TODO: реализуйте метод и удалите todo
        // верните значение количества денег не счету

    }

    public void put(double amountToPut) {// класть сумму которую нужно положить
        if (amountToPut > 0) {
            balance += amountToPut;
        }


        //TODO: реализуйте метод и удалите todo
        // метод зачисляет деньги на счет
    }


    public void take(double amountToTake) {// снять сумма котрую нужно снять
        if (amountToTake <= balance && amountToTake > 0) {
            balance -= amountToTake;
        }


        //TODO: реализуйте метод и удалите todo
        // метод списывает деньги со счета
    }
}
