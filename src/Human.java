import java.util.Objects;

public class Human {
    int yearOfBirth = 0;
    String name = null;
    String town = null;
    String jobTitle = null;

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null || name == "") {
            this.name = "Значение не указано";
        } else {
            this.name = name;
        }
        if (town == null || town == "") {
            this.town = "Значение не указано";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = "Значение не указано";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public String getTown() {
        return this.town;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && Objects.equals(name, human.name) && Objects.equals(town, human.town) && Objects.equals(jobTitle, human.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name, town, jobTitle);
    }
}
