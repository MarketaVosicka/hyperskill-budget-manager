package budget.item;

import budget.util.NumberUtils;
import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class ItemList {

    @Expose
    private final ItemCategory category;
    @Expose
    private final List<Item> list;
    private double sum;

    public ItemList(ItemCategory category) {
        this.category = category;
        this.list = new ArrayList<>();
    }

    public String getCategoryName() {
        return category.name;
    }

    public List<Item> getList() {
        return list;
    }

    public double getSum() {
        return sum;
    }

    public void add(Item item) {
        list.add(item);
        sum += item.getValue();
    }

    public void recalculateSum() {
        sum = 0;
        for(Item i : list) {
            sum += i.getValue();
        }
    }

    public void print() {
        System.out.println(category + ":");
        if (list.size() > 0)
            for (Item item : list)
                item.print();
        else System.out.println("Purchase list is empty!");
    }

    public void printSum() {
        System.out.println("Total sum: " + NumberUtils.formatAmount(sum));
    }
}
