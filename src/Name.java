public class Name {
    String patronymic;
    String firstname;
    String surname;

    public Name(String firstName){
        this.surname = "";
        this.firstname = firstName;
        this.patronymic = "";
    }

    public Name(String surname,String firstname){
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = "";
    }

    public Name(String surname, String firstname, String patronymic){
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
    }

    @Override
    public String toString(){
        StringBuilder fullName = new StringBuilder();
        if(!surname.isEmpty()) {
            fullName.append(surname);
            fullName.append(" ");
        }
        fullName.append(firstname);
        if(!patronymic.isEmpty()) {
            fullName.append(" ");
            fullName.append(patronymic);
        }
        return fullName.toString();
    }
}
