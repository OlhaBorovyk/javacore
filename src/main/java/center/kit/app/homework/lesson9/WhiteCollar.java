package center.kit.app.homework.lesson9;

public class WhiteCollar extends Human {

    String companyName;

    public WhiteCollar(int age, String name, String companyName) {
        super(age, name);
        setCompany(companyName);
    }

    public void setCompany(String string) {
        if (string.matches("[\\-*a-zA-Z\\,\\s]*")) {
            this.companyName = string;
            System.out.println(string);
        } else {
            System.out.println("Company name is invalid");
        }
    }
}
