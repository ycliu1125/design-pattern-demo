package creational.builder;

public class WebApplicationBuilder extends AbstractWebApplicationBuilder {

    @Override
    AbstractWebApplicationBuilder setType(String type) {
        webApplication.setType(type);
        return this;
    }

    @Override
    AbstractWebApplicationBuilder buildServer(String server) {
        webApplication.setServer(server);
        return this;
    }

    @Override
    AbstractWebApplicationBuilder buildDataBase(String database) {
        webApplication.setDatabase(database);
        return this;
    }
}
