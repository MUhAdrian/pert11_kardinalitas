import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Order {
private Date tanggal;
private String status;
private List<Item> items;

public Order(){
    items = new ArrayList<>();
}

public void calcSubTotal(){};

public void calcTax(){};

public void calcTotal(){};

public void calcTotalWeight(){};

}
