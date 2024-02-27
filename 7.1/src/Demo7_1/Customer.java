package Demo7_1;

public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer(String name, String memberType) {
        this.name = name;
        setMemberType(memberType);
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
        this.member = !memberType.equals("None");
    }
}
