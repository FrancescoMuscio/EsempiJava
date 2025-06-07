package Iterator;

public class StudentCollection implements Aggregate { // Implementa una collezione concreta di studenti (ConcreteAggregate)
	private String[] students;
    private int count = 0;

    public StudentCollection(int size) {
        students = new String[size];
    }

    public void addStudent(String student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Collection is full!");
        }
    }

    @Override
    public Iterator createIterator() {
        return new StudentIterator(students);
    }
}
