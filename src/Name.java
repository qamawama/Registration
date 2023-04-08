public class Name {
    private String firstName;
    private String midName;
    private String lastName;

    public Name(String firstName, String midName, String lastName){
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidName() {
        return midName;
    }

    public String getLastName() {
        return lastName;
    }
}
