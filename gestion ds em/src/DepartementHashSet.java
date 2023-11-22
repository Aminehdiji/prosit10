import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> departementSet = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        departementSet.add(departement);


    }

    @Override
    public boolean rechercherDepartement(String nom) {
        boolean etat = false;
        for (Departement departement :departementSet) {
            if (departement.getNom().equals(nom)) {
                etat = true;
            }

        }
        return etat;

    }

    @Override
    public boolean rechercherDepartement(Departement departement) {

        return departementSet.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departementSet.remove(departement);

    }

    @Override
    public void displayDepartement() {
        System.out.println("afficher la Set"+departementSet);

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {

        return (TreeSet<Departement>) departementSet;
    }
}
