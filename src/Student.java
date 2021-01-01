public class Student {
    private static int nextId = 01;
    private String id;
    private String fullName;
    private String address;
    private float precedence;

    public Student() {
    }

    public Student(String id) {
        if (id == null) setId();
        else this.id = id;
    }

    public Student(String id, String fullName, String address, float precedence) {
        this(id);
        this.fullName = fullName;
        this.address = address;
        this.precedence = precedence;
    }

    public void setId() {
        this.id = "SBD" + nextId;
        nextId++;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public float getPrecedence() {
        return precedence;
    }
}
