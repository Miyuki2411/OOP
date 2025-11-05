// Lớp Teacher
class Teacher extends Person {
    private String ID;
    private String title;

    public Teacher(String fullname, String ID, String email, String title) {
        super(fullname, email);
        this.ID = ID;
        this.title = title;
    }

    public String getID() { return ID; }
    public String getTitle() { return title; }

    @Override
    public String toString() {
        return title + " " + fullname;
    }
}