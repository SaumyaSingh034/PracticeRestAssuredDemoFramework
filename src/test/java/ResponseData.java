import java.util.List;

public class ResponseData {
    public List<User> accounting;
    public List<User> sales;

    public List<User> getAccounting() {
        return accounting;
    }

    public void setAccounting(List<User> accounting) {
        this.accounting = accounting;
    }

    public List<User> getSales() {
        return sales;
    }

    public void setSales(List<User> sales) {
        this.sales = sales;
    }
}
