package Composite;

/**
 * Prodotto svolge il ruole di Component per il design pattern Composite. 
 * 
 * I metodi add() e remove() in Prodotto forniscono trasparenza nell'uso di
 * Leaf o Composite, tuttavia non si ha sicurezza, in quanto queste operazioni potrebbero essere chiamate su leaf.
 */

public interface Prodotto {
	public void print();

	public float getPrezzo();

	public int getPeso();

	public void add(Prodotto p);

	public void remove(Prodotto p);
}