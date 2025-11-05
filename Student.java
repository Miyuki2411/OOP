// Lớp Student
class Student extends Person {
    private String ID;

    public Student(String fullname, String ID, String email) {
        super(fullname, email);
        this.ID = ID;
    }

    public String getID() { return ID; }

    @Override
    public String toString() {
        return fullname + " (ID: " + ID + ")";
    }
}