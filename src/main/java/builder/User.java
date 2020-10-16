package builder;

public class User {
    private int id;
    private String name;
    private String city;

    public UserFactory getFactory() {
        return this.new UserFactory();
    }

    public class UserFactory {

        public UserFactory id(int id) {
            User.this.id = id;
            return this;
        }

        public UserFactory name(String name) {
            User.this.name = name;
            return this;
        }

        public UserFactory city(String city) {
            User.this.city = city;
            return this;
        }

        public User createUser() {
            return User.this;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    //         User user = new User().getFactory().id(2).name("vasya").city("Kiev").city("Kharkiv").createUser();
    //        System.out.println(user.toString());
}
