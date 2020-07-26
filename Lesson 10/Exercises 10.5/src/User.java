class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }

    public String getFullName() {
        if(this.firstName == this.lastName) {
            return "Unknown";
        } else if (this.firstName != null && this.lastName !=null) {
            return firstName + " " + lastName;
        } else if (this.lastName == null) {
            return firstName;
        } else {
            return lastName;

        }
    }
}