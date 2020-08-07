public class WebSite extends BaseEntity {
    protected String url;

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

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {

        this.url = url;
    }
}