public class User extends BaseEntity {
    protected String name;

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

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String toString() {
        return name + "," + id + "," + version;
    }
}

