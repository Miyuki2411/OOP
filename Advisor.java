// Lớp Advisor (không có ID)
class Advisor extends Person {
    private String organization;

    public Advisor(String fullname, String email, String organization) {
        super(fullname, email);
        this.organization = organization;
    }

    public String getOrganization() { return organization; }

    @Override
    public String toString() {
        return fullname + " - " + organization;
    }
}