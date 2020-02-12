import java.util.List;

public class Ticket {

    private String waitressName;
    private List<Item> itemList;

    public Ticket(String waitressName, List<Item> itemList) {
        this.waitressName = waitressName;
        this.itemList = itemList;
    }

    public String getWaitressName() {
        return waitressName;
    }

    public void setWaitressName(String waitressName) {
        this.waitressName = waitressName;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
