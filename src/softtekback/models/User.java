package softtekback.models;

import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private static final AtomicInteger idCounter = new AtomicInteger(0);

    private final int cdUser = idCounter.incrementAndGet();
    private String name;
    private String password;
    private String email;
    private Role role = Role.DEFAULT;

    public User(String name, String email, String password, Role role) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRoleName(int code) {
        if (code == 1) return Role.ADMIN;
        else return Role.DEFAULT;
    }

    @Override
    public String toString() {
        return "User {" +
                "cdUser=" + cdUser +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}

