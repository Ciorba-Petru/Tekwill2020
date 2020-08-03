public class DataAnalyst extends Employee {
    boolean phd;
    String [] methods;
    DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }
    public boolean getIsPhd(){
return phd;
    }
    public String[] getMethods(){
return methods;
    }
}
