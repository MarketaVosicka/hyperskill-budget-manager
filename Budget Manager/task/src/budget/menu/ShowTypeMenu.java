package budget.menu;

public class ShowTypeMenu extends Menu {

    public ShowTypeMenu(MenuListener listener) {
        super(listener);
    }

    @Override
    public void show() {
        System.out.println("Choose the type of purchase\n" +
                "1) Food\n" +
                "2) Clothes\n" +
                "3) Entertainment\n" +
                "4) Other");
    }
}
