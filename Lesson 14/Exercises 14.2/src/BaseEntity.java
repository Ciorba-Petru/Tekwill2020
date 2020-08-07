abstract class BaseEntity {
    protected long id;
    protected long version;

    public abstract long getId();

    public abstract void setId(long id);

    public abstract long getVersion();

    public abstract void setVersion(long version);
}
