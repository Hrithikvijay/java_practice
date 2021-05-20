package db;

public class Showdemo {
    public Showdemo() {
        System.out.println("!!!--Showing  DEMO for the contents in the user tabs--!!!");
        Newsfeed newsfeed = new Newsfeed();
        newsfeed.tabcontent();
        System.out.println("\tActions by the quick buttons in the newsfeed");
        newsfeed.stories();
        newsfeed.camera();
        newsfeed.games();
        Inbox inbox = new Inbox();
        inbox.tabcontent();
        SearchBar searchBar = new SearchBar();
        searchBar.tabcontent();
    }
}
