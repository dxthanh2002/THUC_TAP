public class Account {
    private String number;
    private double balance;
    private String CustomerName;
    private String customerEmail;
    private String customerPhone;

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void tienGui(double tienGui) {
    balance += tienGui;
        System.out.println("Tien gui la: $"+ tienGui+ "New balance = " + this.balance);

    }
    public void tienRut(double tienRut) {
        if (balance - tienRut < 0) {
            System.out.println("Khong du tien rut");
        }else{
            balance -= tienRut;
            System.out.println("Tien rut la: $"+ tienRut+ "New balance = " + this.balance);
        }

    }

}
