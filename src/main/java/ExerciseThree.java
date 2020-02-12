//Create a list of tickets (name of waitress, list of items)

// Create object Item  (name, quantity, price)

// get the total billing

// Get the waitress best selling item


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseThree {

    List<Ticket> ticketList;

    public ExerciseThree() {
        this.ticketList = new ArrayList<>();
        addTicketsAndItems();
    }

    public int getTotalBilling() {

        List<Item> itemLists = ticketList.stream().map(Ticket::getItemList).flatMap(List::stream).collect(Collectors.toList());

        return itemLists.stream().mapToInt(Item::getPrice).sum();
    }


    public Item getBestSellingItemFrom(String waitressName) {

        List<Ticket> ticketsByName = ticketList.stream()
                .filter(x -> x.getWaitressName().equals(waitressName))
                .collect(Collectors.toList());

        Comparator<Item> comparator = Comparator.comparing(Item::getQuantity);
        return ticketsByName.get(0).getItemList().stream().max(comparator).get();

    }

    private void addTicketsAndItems() {

        List<Item> itemList1 = new ArrayList<>();

        itemList1.add(new Item("Coke", 3, 2));
        itemList1.add(new Item("Beer", 2, 3));
        itemList1.add(new Item("Vodka", 1, 5));
        itemList1.add(new Item("Whiskey", 2, 6));
        itemList1.add(new Item("Tonic", 5, 2));
        itemList1.add(new Item("Water", 6, 1));

        List<Item> itemList2 = new ArrayList<>();

        itemList2.add(new Item("Coke", 1, 2));
        itemList2.add(new Item("Beer", 3, 3));
        itemList2.add(new Item("Vodka", 4, 5));
        itemList2.add(new Item("Whiskey", 5, 6));
        itemList2.add(new Item("Tonic", 2, 2));
        itemList2.add(new Item("Water", 1, 1));

        List<Item> itemList3 = new ArrayList<>();

        itemList3.add(new Item("Coke", 2, 2));
        itemList3.add(new Item("Beer", 3, 3));
        itemList3.add(new Item("Vodka", 2, 5));
        itemList3.add(new Item("Whiskey", 3, 6));
        itemList3.add(new Item("Tonic", 4, 2));
        itemList3.add(new Item("Water", 6, 1));


        ticketList.add(new Ticket("Pepe", itemList1));
        ticketList.add(new Ticket("Juan", itemList2));
        ticketList.add(new Ticket("Manolo", itemList3));

    }
}
