package Iterator;

public class MainIterator {

	public static void main(String[] args) {
		// Creazione della collezione di studenti
        StudentCollection studentCollection = new StudentCollection(3);
        studentCollection.addStudent("Alice");
        studentCollection.addStudent("Bob");
        studentCollection.addStudent("Charlie");

        // Creazione dell'iteratore
        Iterator iterator = studentCollection.createIterator();

        // Uso dell'iteratore per attraversare la collezione
        while (iterator.hasNext()) {
            String student = (String) iterator.next();
            System.out.println("Student: " + student);
        }
	}

}
