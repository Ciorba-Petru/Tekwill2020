public class Visit extends BaseEntity {

    protected User user;
    protected WebSite site;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getVersion() {

        return version;
    }

    @Override
    public void setVersion(long version) {
        this.version = version;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }

    public WebSite getSite() {

        return site;
    }

    public void setSite(WebSite site) {

        this.site = site;
    }
}
