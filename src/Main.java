public class Main {
    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();


        Login login = new Login(idandPasswords.getLoginInfo());


    }
}