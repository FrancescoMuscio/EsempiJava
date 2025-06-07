package Iterator;

public class StudentIterator implements Iterator { // Implementa l'iterazione per una specifica collezione (ConcreteIterator)
	private String[] students; // Array di studenti
    private int position = 0;  // Posizione attuale nell'array

    public StudentIterator(String[] students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return position < students.length && students[position] != null;
    }

    @Override
    public Object next() {
    	return students[position++];
    }
}
