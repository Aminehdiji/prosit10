import java.util.*;

public class SocieteArrayList implements IGestion<Employee>{
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employee employee) {
        employeeList.add(employee);

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        boolean etat=false;
        for (Employee e:employeeList) {
            if (e.getNom().equals(nom)) {
                etat = true;
            }

        }
        return etat;
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
        return employeeList.contains(employee);
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        employeeList.remove(employee);

    }

    @Override
    public void displayEmploye() {
        System.out.println("Afficher la liste des employees"+employeeList);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employeeList);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employee> nomComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                    return o1.getNomdepartement().compareTo(o2.getNomdepartement());
                }
        };

        Comparator<Employee> gradeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getGrade() -o2.getGrade();
            }

        };



        Collections.sort(employeeList,nomComparator.thenComparing(gradeeComparator));

    }
}
