import java.util.*;
abstract class Stock {
protected int quantity;
public Stock(int quantity) {
    this.quantity = quantity; 
    }
abstract void process(int amount);
}
class Purchase extends Stock {
public Purchase(int quantity) {
super(quantity);
    }
    public void addStock(int amount) {
        quantity += amount;
    }
    void process(int amount) {
        addStock(amount);
        System.out.println("Purchased: " + amount);
        displayStock();
    }
     public void displayStock() {
        System.out.println("Current Stock: " + quantity);
    }
}
class Sales extends Stock {
    public Sales(int quantity) {
        super(quantity);
    }
    public void reduceStock(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        } else {
            System.out.println("Not enough stock!");
        }
    }
  
    void process(int amount) {
        reduceStock(amount);
        System.out.println("Sold: " + amount);
        displayStock();
    }
      public void displayStock() {
        System.out.println("Current Stock: " + quantity);
    }
}
class StockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               int stock = sc.nextInt();
                int choice = sc.nextInt();
                int amt;
        switch(choice) {
            case 1:
           amt = sc.nextInt();
            Purchase p = new Purchase(stock);
            p.process(amt);
            break;
            case 2: 
             amt = sc.nextInt();
            Sales s = new Sales(stock);
            s.process(amt);
            break;
         default:
            System.out.println("Invalid choice");
        }
        }
    }
