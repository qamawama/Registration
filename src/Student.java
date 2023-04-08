import java.util.Formatter;

public class Student {
    private Name name;
    private String id;
    private String email;
    private String gender;
    private String className;

    public Student(String id, String email, String className){
        this.id = id;
        this.email = email;
        this.className = className;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

}
