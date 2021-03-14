package creational.builder;

/*
    這裡方便練習，屬性就以String 代替各類別
 */
public class WebApplication {

    private String type;

    private String server;

    private String database;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Override
    public String toString() {
        return "WebApplication{" +
            "type='" + type + '\'' +
            ", server='" + server + '\'' +
            ", database='" + database + '\'' +
            '}';
    }
}
