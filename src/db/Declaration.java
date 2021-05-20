package db;
//immutable class

public final class Declaration {
    private final String name;
    private final String mobile;
    private final Boolean declare;

    public Declaration(String name, String mobile, boolean declare) {
        this.name = name;
        this.mobile = mobile;
        this.declare = declare;
    }

    public Boolean getDeclare() {
        return declare;
    }
}
