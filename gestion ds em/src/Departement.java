import java.util.Objects;

public class Departement implements Comparable<Departement>{
    private int id;
    private String nom;
    private int nb;

    public Departement(int id, String nom, int nb) {
        this.id = id;
        this.nom = nom;
        this.nb = nb;
    }

    public Departement() {
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

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nb=" + nb +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return this.id -o.id;
    }
}
