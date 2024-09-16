public class Member {
    private String name;
    private String address;
    private float deposit;


    Member(String name, String adress) {
        this.name = name;
        this.address = address;
        this.deposit = 0;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for address
    public void setAddress(String address) {
     this.address = address;
    }

    // Getter for name
    public String getName () {
     return name;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Getter for deposit
    public float getDeposit() {
        return deposit;
    }

    // Method to deposit money
    public void deposit(float amount) {
    if (amount > 0) {
         this.deposit += amount;
    }
    }

    // Method to withdraw money (loan)
    public void loan(float amount) {
        if (amount > 0 && this.deposit >= amount) {
         this.deposit -= amount;
           }
         }
    }