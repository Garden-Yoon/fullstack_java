package CLIFramework.src.V4;

public class MenuItem {
    String title;
    Command command;

    public MenuItem(String title, Command command) {
        this.title = title;
        this.command = command;
    }

    public String getTitle() {
        return title;
    }

    public Command getCommand() {
        return command;
    }
}
