package bridge.example1;

public class Account {
    private String login;
    private String password;
    private String email;

    public Registrar getRegistrar() {
        return this.new Registrar();
    }

    public class Registrar {

        public Registrar login(String login) {
            System.out.println("Login: " + login);
            Account.this.login = login;
            return this;
        }
        public Registrar password(String password) {
            System.out.println("Password: " + password);
            Account.this.password = password;
            return this;
        }
        public Registrar email(String email) {
            System.out.println("Email: " + email);
            Account.this.email = email;
            return this;
        }

        public Account createAccount() {
            return Account.this;
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    public String getEmail() {
        return email;
    }

    /*Account account = new Account()
            .getRegistrar()
            .login("vasya")
            .password("sanya")
            .email("asd@mail.ru")
            .createAccount();
        System.out.println(account.getEmail());
        System.out.println(account.getLogin());
        System.out.println(account.getPassword());
        */
}
