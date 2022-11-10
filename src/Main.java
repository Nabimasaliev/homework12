import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    University university= new University("IAU-(International university Ala-Too)","In top 3 university of KR",1996);
    university.setName("IAU-(International university Ala-Too)");
    university.setRating("In top 3 university of KR");
    university.setYearOpening(1996);


        University university1= new University("AUCA-(American University of Central Asia)","In top 3 university of KR",1993);
        university1.setName("AUCA-(American University of Central Asia)");
        university1.setRating("In top 3 university of KR");
        university1.setYearOpening(1993);


        University university2= new University("Kyrgyz-Turkish Manas University","In top 3 university of KR",1995);
        university2.setName("Kyrgyz-Turkish Manas University");
        university2.setRating("In top 3 university of KR");
        university2.setYearOpening(1995);


        University [] universities;
        universities = new University[]{university,university1,university2};

        System.out.println("\nUNIVERSITY\n---------------------------------");


        for (University uni:universities) {
            System.out.println("Name: "+uni.getName());
            System.out.println("Rating: "+uni.getRating());
            System.out.println("Year opening: "+uni.getYearOpening()+"\n");
        }


        School school=new School("Y.Gagarin", "Osh", 1965);
        school.setName("Y.Gagarin");
        school.setCity("Osh");
        school.setYearOpening(1965);

        School school1=new School("K.Turmamatov", "Batken", 1984);
        school1.setName("K.Turmamatov");
        school1.setCity("Batken");
        school1.setYearOpening(1965);

        School school2=new School("Number 72", "Bishkek", 1945);
        school2.setName("Number 72");
        school2.setCity("Bishkek");
        school2.setYearOpening(1945);

      School[] schools;
      schools= new School[]{school,school1,school2};
        System.out.println("\nSCHOOL\n---------------------------------");

        for (School schooll:schools) {
            System.out.println("Name: "+schooll.getName());
            System.out.println("City: "+schooll.getCity());
            System.out.println("Year: "+schooll.getYearOpening()+"\n");
        }

        Person person = new Person();
        person.setName("Nabi");
        person.setSurname("Masaliev");
        person.setAge(19);

        Person person1 = new Person();
        person1.setName("Mirlan");
        person1.setSurname("Maatov");
        person1.setAge(19);

        Person person2 = new Person();
        person2.setName("Nurbek");
        person2.setSurname("Zholmatov");
        person2.setAge(18);

        Person[] people;
        people = new Person[]{person,person1,person2};

        System.out.println("\nPERSON\n---------------------------------");

        for (Person persons:people) {
            System.out.println("Name: "+persons.getName());
            System.out.println("Surname: "+persons.getSurname());
            System.out.println("Age: "+persons.getAge()+"\n");
        }

        Car car = new Car();
        car.setCompany("Mercedes-Benz");
        car.setModel("Mercedes- Benz W 210");
        car.setYear(2000);

        Car car1 = new Car();
        car1.setCompany("Toyota");
        car1.setModel("Toyota Camry 75 lx");
        car1.setYear(2021);

        Car car2 = new Car();
        car2.setCompany("Lexus");
        car2.setModel("Lexus 600 lx");
        car2.setYear(2022);

        System.out.println("\nCAR\n---------------------------------");

        Car[] cars;
        cars= new Car[]{car,car1,car2};
        
        for (Car carr:cars) {
              System.out.println("Company: "+carr.getCompany());
              System.out.println("Model: "+carr.getModel());
              System.out.println("Year: "+carr.getYear()+"\n");
          }

    }
}