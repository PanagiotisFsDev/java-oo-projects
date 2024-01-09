package bankApp.model;

/**
 * The {@link overdraftAccount} is a class that represents
 * a basic bank account model but also allows withdrawals greater
 * than the account balance.
 *
 * @author panagiotispapadopoulos
 */
public class overdraftAccount {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;
    private double overdraftLimit;

    /**
     *  Initializes the account's information
     * @param id        The id of the account
     * @param iban      The iban of the account
     * @param firstname The First Name of account's holder
     * @param lastname  The Last Name of account's holder
     * @param ssn       The ssn for the completion of transactions
     * @param balance   Account's balance
     * @param overdraftLimit    A limit to withdraw amounts greater than balance
     */
    public overdraftAccount(int id, String iban, String firstname, String lastname, String ssn, double balance, double overdraftLimit) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Gets the id of the account
     *
     * @return  The value of {@link overdraftAccount#id}
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the {@link overdraftAccount#id} of the holder
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the Iban of the account
     *
     * @return  The value of {@link overdraftAccount#iban}
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the {@link overdraftAccount#iban} of the account
     *
     * @param iban
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * Gets the First Name of the holder
     *
     * @return  The {@link overdraftAccount#firstname} of the holder
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the {@link overdraftAccount#firstname} of the holder
     *
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets the Last Name of the holder
     *
     * @return  The {@link overdraftAccount#lastname} of the holder
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the {@link overdraftAccount#lastname} of the holder
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Gets the ssn for the transactions
     *
     * @return  The {@link overdraftAccount#ssn} for the transactions
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the {@link overdraftAccount#ssn} for the transactions
     *
     * @param ssn
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * Gets the balance of the account
     *
     * @return  The value of {@link overdraftAccount#balance}
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the {@link overdraftAccount#balance} of the account
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Gets the limit for withdraws greater than the balance
     *
     * @return  The value of {@link overdraftAccount#overdraftLimit}
     */
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    /**
     * Sets the {@link overdraftAccount#overdraftLimit} for withdraws greater than the balance
     *
     * @param overdraftLimit
     */
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /*
     * Public API
     */

    /**
     * Deposits a certain amount of money in
     * the Account.
     *
     * @param amount
     *      the amount to be deposited.
     * @throws Exception
     *      if the amount of money is negative.
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Negative amount error");
            }
            balance += amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws even if the amount of money is greater than the balance and sets new balance.
     *
     * @param amount
     * @return
     */
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }

    /**
     * Checks if {@link overdraftAccount#ssn} is valid
     *
     * @param ssn   The given ssn
     * @return      True or False
     */
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

    /**
     * Returns account's balance.
     *
     * @return
     */
    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * A simple convert to String Method
     *
     * @return
     */
    public String accountToString() {
        return "("+ id + "\t" + iban + "\t" + firstname + "\t" + lastname + "\t" + ssn + "\t" + balance + ")";
    }
}
