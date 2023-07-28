package pro.sky.hwexceptions;

public class User {
    private String login;
    private String password;
    private String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
        return "Login = " + login + " Password";
    }
}
