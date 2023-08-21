public class HW14 {
    public static void main(String[] args) {
        Person person = new Person();
        person.personInfo("Will", "Smith", "New York", " 2936729462846 ");
         Person.personInfoStatic(" Will ", " Smith ", " New York ", " 2936729462846 ");
         person.personInfo(" Jackie ", " Chan ", " Shanghai ", " 1231241241 ");
         Person.personInfoStatic(" Jackie", " Chan ", " Shanghai ", " 1231241241 ");
         person.personInfo("Sherlock", " Holmes", "London", "37742123513");
         Person.personInfoStatic(" Sherlock ", " Holmes ", " London ", " 37742123513 ");

    }

}