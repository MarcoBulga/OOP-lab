class Student {

    // È buona pratica mettere i campi in testa alla classe
    String name;
    String surname;
    int id;
    int matriculationYear;

    void build(String n, String s, int id, int mY) {
        /*
         * Completare il corpo del metodo
         */
            this.name = n;
            this.surname = s;
            this.id = id;
            this.matriculationYear = mY;
    }

    void printStudentInfo() {
        /*
         * Completare il corpo del metodo
         */
        System.out.println("Student:");
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("ID: " + this.id);
        System.out.println("Matriculation year: " + this.matriculationYear);
    }
}
