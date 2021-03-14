package creational.builder;

/*
    這就是服務生的腳色
 */
public class WebProgrammer {

    private AbstractWebApplicationBuilder webBuilder;

    WebProgrammer(AbstractWebApplicationBuilder webBuilder) {
        this.webBuilder = webBuilder;
    }


    public WebApplication createShoppingWebSite() {
        return webBuilder.setType("購物網站")
            .buildServer("tomcat8")
            .buildDataBase("Oracle")
            .build();
    }


    public WebApplication createBlogWebSite() {
        return webBuilder.setType("部落格")
            .buildServer("GlassFish")
            .buildDataBase("Postgres")
            .build();
    }

}
