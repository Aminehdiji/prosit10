// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Employee e = new Employee(1,"BEN SALAH","ADEM","info",22);
        Employee e1 = new Employee(3,"saidane","ABDALLAH","sc",444);
        Employee e2 = new Employee(2,"CHEERNi","Louay","tic",33);
        Departement departement = new Departement(1,"aa",33);




        SocieteArrayList so =new SocieteArrayList();
        so.ajouterEmploye(e);
        so.ajouterEmploye(e1);
        so.ajouterEmploye(e2);
        so.displayEmploye();
        so.trierEmployeParId();
        so.displayEmploye();
    }
}