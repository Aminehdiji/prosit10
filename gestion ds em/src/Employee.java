import java.util.Objects;

public class Employee implements Comparable<Employee> {
private int id;
private String nom;
private String prenom;
private String nomdepartement;
private int grade;

    public Employee() {
    }

    public Employee(int id, String nom, String prenom, String nomdepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomdepartement = nomdepartement;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomdepartement() {
        return nomdepartement;
    }

    public void setNomdepartement(String nomdepartement) {
        this.nomdepartement = nomdepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(nom, employee.nom);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomdepartement='" + nomdepartement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id -o.id;
    }
}
