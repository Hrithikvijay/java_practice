package db;

//abstraction
abstract class UserTabs {
    public abstract void tabcontent();

    public void returntohome() {
        System.out.println("Returned to home page");
    }
}

class Newsfeed extends UserTabs implements Quickbuttons {
    public void tabcontent() {
        System.out.println("Newsfeed - View the newsfeed...");
    }

    public void stories() {
        System.out.println("\t\tDisplay stories....");
    }

    public void games() {
        System.out.println("\t\tPlay games....");
    }

    public void camera() {
        System.out.println("\t\tTake pictures....");
    }
}

class SearchBar extends UserTabs {
    public void tabcontent() {
        System.out.println("SearchBar - Search for the pages you need...");
    }
}

class Inbox extends UserTabs {
    public void tabcontent() {
        System.out.println("Inbox - View the Messages...");
    }
}
