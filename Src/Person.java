public class Person {
    String name;
    String surname;
    String city;
    String phone;
    public void personInfo(String name, String surname, String city, String phone){
    }
        public static void personInfoStatic(String name, String surname, String city, String phone){
        System.out.println("Зателефонувати громадянинові "+ name + surname + "з міста"+ city + "можна за номером" +  phone);
    }
}