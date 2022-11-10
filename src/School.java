public class School {

  private   String name;
  private   String city;
  private   int yearOpening;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOpening() {
        return yearOpening;
    }

    public void setYearOpening(int yearOpening) {
        this.yearOpening = yearOpening;
    }

    public School(String name, String city, int yearOpening) {
        this.name = name;
        this.city = city;
        this.yearOpening = yearOpening;
    }
}
