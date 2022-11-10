public class University {
   private String name;
  private   String rating;
    private int yearOpening;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getYearOpening() {
        return yearOpening;
    }

    public void setYearOpening(int yearOpening) {
        this.yearOpening = yearOpening;
    }

    public University(String name, String rating, int yearOpening) {
        this.name = name;
        this.rating = rating;
        this.yearOpening = yearOpening;
    }
}
