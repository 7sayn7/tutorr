package OOP.Demo;

public class CardAccount extends BankAccount {


    @Override
    public void take(double amountToTake) {
        amountToTake += amountToTake * 0.01;
        super.take(amountToTake);
    }
}

// не забывайте, обращаться к методам и конструкторам родителя
// необходимо используя super, например, super.put(10D);