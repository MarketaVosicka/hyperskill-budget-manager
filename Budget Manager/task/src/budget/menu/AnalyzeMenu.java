package budget.menu;

public class AnalyzeMenu extends Menu {

    public AnalyzeMenu(MenuListener listener) {
        super(listener);
    }

    @Override
    public void show() {
        System.out.println("\nHow do you want to sort?\n" +
                "1) Sort all purchases\n" +
                "2) Sort by type\n" +
                "3) Sort certain type\n" +
                "4) Back");
    }
}
