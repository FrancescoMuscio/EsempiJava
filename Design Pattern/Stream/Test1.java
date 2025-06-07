package Stream;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; //Per le varie operazioni con gli stream, filter() ecc...
import java.util.stream.Stream; //Per usare Stream<String>
import java.util.function.Predicate;
import java.lang.Integer;
import java.util.function.BinaryOperator;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Test1{
	public static void main(String[] args){

	List<String> nomi = List.of("Mario", "Nino", "Benedetta", "Elvia", "Pappa");
	Stream<String> s1 = nomi.stream();
	Stream<String> s2 = s1.filter(s -> s.length() == 5);
	long c = s2.count();
	System.out.println("In totale i nomi con 5 lettere sono: " +c); 

	Predicate<Integer> positive = x -> x >= 0;
	Stream<Integer> result = Stream.of(2, 5, -10, 0, -1, 102).filter(positive);
	long b = result.count();
	System.out.println("I numeri positivi sono: " +b);

	BinaryOperator<Integer> somma = (x,y) -> x + y;
	int num1 = 5;
	int num2 = 10;
	int res = somma.apply(num1, num2);
	System.out.println("La somma tra " +num1+ " e " +num2+ " e': " +res);

	List<Float> importi = new ArrayList<>();
	float risultato = 0f;
	importi.add(5f); //per aggiungere i valori ad un vettore Float serve aggiungere "f" dopo il valore
	importi.add(0f);
	importi.add(28f);
	importi.add(7f);
	//risultato = importi.stream().reduce(0f, Float::sum); //qua usiamo l'exp lambda con il metodo di Float
	risultato = importi.stream().reduce(0f, (accumulatore, v) -> accumulatore + v); //qua usiamo l'exp lambda con due variabili
	System.out.println("La somma dei valori dell'array e': " +risultato);

	List<Integer> Vmap = List.of(2,3,4,5);
	Stream<Integer> s3 = Vmap.stream().map(x -> x * 2);
	System.out.print("I valori raddoppiati del vettore Vmap sono: ");
	//s3.forEach(System.out::print);
	s3.forEach(num -> System.out.print(num + " ")); //la stessa cosa di prima, ma con l'exp lambda

	List<Integer> Vcoll = List.of(5, 6, 7, 8);
	List<Integer> s4 = Vcoll.stream().map(x -> x - 2).collect(Collectors.toList()); //usando collect() possiamo raggruppare i nostri risultati, ritornando una List<> invece di uno Stream<>, infatti prima abbiamo dovuto utilizzare il forEach() perchè map ritorna uno Stream<>
	System.out.println("\nI valori diminuiti di due del vettore Vcoll sono: " + s4);

	List<String> team = List.of("Aurora", "Davide", "Alberto", "Zorro", "Alberto", "Lorenzo", "Aurora");
	System.out.print("I nomi del team una volta ordinati sono: ");
	team.stream().distinct().sorted(Comparator.comparing(String::toString).reversed()).forEach(p -> System.out.print(p + " ")); //In questo modo saranno stampati i nomi dalla Z alla A. Se leviamo il reverse() li stamperà dalla A alla Z
																																//Con distinct() leviamo i duplicati
	System.out.print("\nI numeri creati da iterate() sono: ");
	Stream.iterate(5, n -> n*2).limit(5).forEach(n -> System.out.print(n + " ")); //iterate() parte da un valore "seme"

	System.out.print("\nI numeri creati da generate() sono: ");
	Stream.generate(() -> Math.round(Math.random() * 11)).limit(5).forEach(n -> System.out.print(n + " ")); //generate() parte dal nulla o da una variabile passata da una funzione detta "Supplier". Rcorda che random() da numeri tra 0 e 1(escluso)

	System.out.print("\nI quadrati dell'IntStream sono: ");
	IntStream.rangeClosed(5,8).map(x -> x*x).forEach(n -> System.out.print(n + " "));

	int sommaInt = Stream.of("calcio", "basket", "pallavolo", "rugby").mapToInt(x -> x.length()).sum();
	System.out.println("\nLa somma delle lunghezze delle parole dentro lo stream equivale a: " +sommaInt);
	
	Function <String,Integer> lunghezza = x -> x.length();
	int sommalunghezze = Stream.of("ciao", "giorno", "serata", "pianoforte", "panino").map(lunghezza).reduce(0, Integer::sum);
	System.out.println("La somma delle lunghezze delle parole equivale a: " +sommalunghezze);

	Supplier<String> sup = () -> "Sono stata presa col metodo get() dell'interfaccia Supplier";
	String sup_string = sup.get();
	System.out.println("Stringa presa: " +sup_string);

    }
}