package day13;

public class Test01 {
    public static void main(String[] args) {
    User u1 =new User("张三",new Address("北京","大兴","003500"));
    User u2 =new User("张三",new Address("北京","大兴","003500"));
    User u3 =new User("张三",new Address("天津","西青","065300"));
    System.out.println(u1.name);
    System.out.println(u1.equals(u2));
    System.out.println(u1.equals(u3));
    }
}
class User
{
    String name;
    Address addr;

    public User() {
    }
    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }
    public boolean equals(Object obj)
    {
        if (obj==null||!(obj instanceof  User)) return false;
        if (this==obj) return  true;
        User u = (User ) obj;
        if (this.name.equals(u.name)&&this.addr.equals(u.addr))
        {
            return true;
        }
        return false;
    }
}
class Address
{
    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
    public boolean equals(Object obj)
    {
        if (obj==null||!(obj instanceof  Address)) return false;
        if (this==obj) return  true;
        Address u = (Address ) obj;
        if (this.city.equals(u.city)&&this.street.equals(u.street)&&this.zipcode.equals(u.zipcode))
        {
            return true;
        }
        return false;
    }
}