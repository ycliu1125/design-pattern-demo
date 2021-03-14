package creational.builder;

public abstract class AbstractWebApplicationBuilder {

    protected WebApplication webApplication;

    AbstractWebApplicationBuilder() {
        webApplication = new WebApplication();
    }

    abstract AbstractWebApplicationBuilder setType(String type);

    abstract AbstractWebApplicationBuilder buildServer(String server);

    abstract AbstractWebApplicationBuilder buildDataBase(String database);

    WebApplication build() {
        return webApplication;
    }

}
/*
    注意到這裡的順序
 */
