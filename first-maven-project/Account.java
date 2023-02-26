import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Account {

    String login;
    String password;
    HashMap<String, String> loginPass = new HashMap<>();

    void checkLogin(String login) throws WrongLoginException{
        try {
            if (login == null || login.length()<5 || login.length()>20){
                System.out.println("Логин не может быть пустым или иметь длину меньше 5 и больше 20");
                throw new WrongLoginException();
            }
            this.login = login;

        }
        catch (WrongLoginException ex){

            System.out.println("Исключение:" + ex);
        }

    }
    void  checkPassword(String password, String confirmPassword){
        try {
            if (password == null || password.length()<8 || password.length()>20 || !password.equals(confirmPassword) ){
                System.out.println("Ошибка ввода пароля");
                throw new WrongPasswordException();
            }
            this.password = password;
            //System.out.println(password);
        }
        catch (WrongPasswordException ex){

            System.out.println("Исключение:" + ex);
        }
    }

    void checkLoginAndPassword(String login, String password) {
        loginPass.put("qwert","123qwerty");
        loginPass.put("mylogin","mypassword");
        loginPass.put("Geralt","Yennefer");

        try{
            if (!(password.equals(loginPass.get(login)))){
                System.out.println("Пароля и логина нет в системе!");
                throw new WrongLoginOrPasswordException();
            }
            System.out.println("Вы успешно вошли в аккаунт!");
        }
        catch (WrongLoginOrPasswordException ex){
            System.out.println("Исключение:" + ex);
        }

    }

    public static void main(String[] args) throws WrongLoginException {
        Scanner input =new Scanner(System.in);
        Account account = new Account();

        System.out.println("Введите логин: ");
        String login = input.nextLine();
        account.checkLogin(login);

        System.out.println("Введите пароль: ");
        String password = input.nextLine();
        System.out.println("Подтвердите пароль: ");
        String confirmPassword = input.nextLine();
        account.checkPassword(password, confirmPassword);
        account.checkLoginAndPassword(login,password);

    }
}
