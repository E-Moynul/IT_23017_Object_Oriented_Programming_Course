class InvalidAmountException extends IllegalArgumentException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class CodesCpp {
    private double balance;

    public Wallet() {
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void addFunds(double amount) {
        if (amount < 0) {
            throw new InvalidAmountException("Amount cannot be negative.");
        }
        this.balance += amount;
    }

    public void spend(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new InvalidAmountException("Amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        this.balance -= amount;
    }

    public static void main(String[] args) {
        Wallet myWallet = new Wallet();

        try {
            myWallet.addFunds(100);
            System.out.println("Current balance: " + myWallet.getBalance());

            myWallet.spend(50);
            System.out.println("Current balance: " + myWallet.getBalance());

            myWallet.spend(70);//since fund is less than 70 , we will show InsufficientFundsException

        } catch (InvalidAmountException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("END");
        }


        try {
          myWallet.addFunds(-20); //amount is negative , so we will show InvalidAmountException
        } catch (InvalidAmountException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
