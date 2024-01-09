package bankApp.model;

/**
 * The {@link jointAccount} class represents a bank account
 * with two holders (with overdraft abilities).
 *
 * @author panagiotispapadopoulos
 */
public class jointAccount {
    private String iban;
    private overdraftAccount holder1;
    private overdraftAccount holder2;

    /**
     * Initializes the joint account with the given IBAN and creates holders.
     *
     * @param iban The IBAN of the joint account
     */
    public jointAccount(String iban) {
        this.iban = iban;
    }

    /**
     * Adds the first holder to the joint account.
     *
     * @param holder The first holder to be added
     */
    public void addFirstHolder(overdraftAccount holder) {
        this.holder1 = holder;
    }

    /**
     * Adds the second holder to the joint account.
     *
     * @param holder The second holder to be added
     */
    public void addSecondHolder(overdraftAccount holder) {
        this.holder2 = holder;
    }

    // Getters and Setters

    /**
     * Gets the IBAN of the joint account.
     *
     * @return The IBAN of the joint account
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the IBAN of the joint account.
     *
     * @param iban The IBAN to be set
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * Gets the first holder in the joint account.
     *
     * @return The first holder
     */
    public overdraftAccount getFirstHolder() {
        return holder1;
    }

    /**
     * Gets the second holder in the joint account.
     *
     * @return The second holder
     */
    public overdraftAccount getSecondHolder() {
        return holder2;
    }

}

