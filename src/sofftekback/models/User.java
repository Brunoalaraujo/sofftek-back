package sofftekback.models;

public class User {
    private int cdUser;
    private String name;
    private String password;
    private String email;
    private Role role;

    public User(int cdUser, String name, String email, String password, Role role) {
        this.cdUser = cdUser;
        this.name = name;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public User() {

    }

    public int getCdUser() {
        return cdUser;
    }

    public User setCdUser(int cdUser) {
        this.cdUser = cdUser;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public User setRole(Role role) {
        this.role = role;
        return this;
    }

    public User getUser() {
        System.out.println("Código do Usuário: " + cdUser);
        System.out.println("Nome do Usuário: " + name);
        System.out.println("Email do Usuário: " + email);
        System.out.println("Senha do Usuário: " + password);
        System.out.println("Tipo do Usuário: " + role);
        System.out.println(" ");
        return this;
    }

}
