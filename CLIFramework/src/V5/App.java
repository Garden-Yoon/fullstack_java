package CLIFramework.src.V5;

public abstract class App {
    Menu menu;

    public App() {
    }

    public void init(int menuSize) {
        menu = new Menu(menuSize);
        createMenu(menu);
    }

    public void createMenu(Menu menu) {
    }


    public void run() {
        while(true){
            menu.printMenu();
            Command command = menu.getSelect();
            command.execute();
        }
    }
}
