package Stream;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ernesto {

	public static void main(String[] args) {

		List<Persona> l = List.of(new Persona("Kent", 29, "CTO"),
                new Persona("Luigi", 25, "Programmer"),
                new Persona("Andrea", 26, "GrLeader"),
                new Persona("Sofia", 26, "Programmer"),
                new Persona("Alfio", 63, "Programmer"));
		
				//Data una lista di persone, trovare i nomi dei programmatori con età minore di 30 anni.
				List<String> prova1 = l.stream().filter(a -> a.age() < 30).filter(p -> p.role().equals("Programmer")).map(Persona::name).collect(Collectors.toList());
				System.out.println("I programmatori che hanno meno di 30 anni sono: " +prova1);
				
				//Data una lista di istanze di Persona trovare i diversi ruoli.
				List<String> prova2 = l.stream().map(Persona::role).distinct().collect(Collectors.toList());
				System.out.println("I diversi ruoli sono: " +prova2);
				
				//Data una lista di stringhe, produrre una lista che contiene solo le stringhe che cominciano con un certo prefisso noto.
				List<String> esercizio3 = List.of("author", "auto", "autocorrect", "begin", "big", "bigger", "biggish");
				List<String> prova3 = esercizio3.stream().filter(s -> s.substring(0, 2).equals("au")).collect(Collectors.toList());
				//List<String> prova3 = esercizio3.stream().filter(o -> o.startsWith("au")).collect(Collectors.toList());
				System.out.println("Le stringhe che iniziano per 'au' sono: " +prova3);
				
				//Data una lista di stringhe, produrre una stringa contenente le iniziali di ciascuna stringa della lista.
				List<String> esercizio4 = List.of("to", "speak", "the", "truth", "and", "pay", "your", "debts");
				List<String> prova4 = esercizio4.stream().map(s -> s.substring(0,1)).collect(Collectors.toList());
				System.out.println("Le iniziali delle stringhe contenute nella lista sono: " +prova4);
				
				//Data una lista di prodotti, restituire il costo totale dei prodotti che hanno un prezzo maggiore di 10.
				List<Prodotto> p = List.of(new Prodotto("p1", 5.0), new Prodotto("p2", 10.0), new Prodotto("p3", 15.0), new Prodotto("p4", 20.0));
				Double prova5 = p.stream().filter(i -> i.prezzo() > 10.0).map(Prodotto::prezzo).reduce(0d, Double::sum);
				//Double prova5 = p.stream().filter(i -> i.prezzo() > 10.0).map(Prodotto::prezzo).reduce(0d, (accumulatore, v) -> accumulatore + v);
				System.out.println("La somma totale dei costri dei prodotti  che hanno costo maggiore di 10 è: " +prova5);
				
				//Produrre una lista contenente i primi n multipli di 7.
				int n = 10;
				List<Integer> prova6 = Stream.iterate(0, h -> h + 7).limit(n).collect(Collectors.toList());
				System.out.println("I primi 10 multipli di 7 sono: " +prova6);
				
				//Data una lista di utenti, restituire tutti i loro commenti ordinati per data.
				List<Utente> utenti = List.of( new Utente("u1", List.of(new Commento("c2", LocalDate.of(2021, 1, 2)),
				                        new Commento("c1", LocalDate.of(2021, 1, 1)),
				                        new Commento("c5", LocalDate.of(2021, 1, 5)))),
				        new Utente("u2",
				                List.of(new Commento("c4", LocalDate.of(2021, 1, 4)),
				                        new Commento("c3", LocalDate.of(2021, 1, 3)))));
				
				//utenti.stream().flatMap(u -> u.commenti().stream()).sorted((c1, c2) -> c1.data().compareTo(c2.data())).forEach(System.out::println);
				List<Commento> prova7 = utenti.stream().flatMap(u -> u.commenti().stream()).sorted(Comparator.comparing(Commento::data)).collect(Collectors.toList());
				System.out.println("I commenti ordinati per data sono: " + prova7);
				
				//Restituire gli utenti che hanno pubblicato almeno un commento prima di una certa data.
				LocalDate date = LocalDate.of(2021, 1, 3);
				List<String> prova8 = utenti.stream().filter(u -> u.commenti().stream().filter(c -> c.data().isBefore(date)).findAny().isPresent()).map(Utente::nome).collect(Collectors.toList());
				System.out.println("Gli utenti che hanno fatto almeno un commento prima del 2021/01/03 sono: " +prova8);
				
				//Restituire l'utente che ha pubblicato il commento più recente.
				Optional<String> prova9 = utenti.stream().max(Comparator.comparing(u -> u.commenti().stream().map(Commento::data).max(LocalDate::compareTo).orElse(LocalDate.MIN))).map(Utente::nome);
			    System.out.print("L'utente che ha scritto il commento più recente è: ");
			    prova9.ifPresent(System.out::println);
			      
			    //Restituire il prodotto più economico.
			    List<Prodotto> prodotti = List.of(new Prodotto("p1", 80), new Prodotto("p2", 50), new Prodotto("p3", 10), new Prodotto("p4", 20));
				Optional<String> prova10 = prodotti.stream().min(Comparator.comparing(Prodotto::prezzo)).map(Prodotto::nome);
				System.out.print("Il prodotto più economico è: ");
				prova10.ifPresent(System.out::println);
				
				//Restituire la somma totale dei costi dei 2 prodotti meno cari.
				List<Prodotto> prodotti2 = List.of(new Prodotto("p1", 80), new Prodotto("p2", 40), new Prodotto("p3", 10), new Prodotto("p4", 90));
				Double prova11 = prodotti2.stream().map(Prodotto::prezzo).sorted().limit(2).reduce(0d, Double::sum);
				System.out.println("La somma totale dei costi dei 2 prodotti meno cari è: " +prova11);
				
				//Creare un metodo che prende in ingresso due parametri, min e max, e restituisce una lista di istanze di persona costituita da elementi di gente che hanno età compresa fra min e max.
				Ernesto prova12 = new Ernesto();
				List<Tizio> lista = prova12.metodo1(9, 25);
				System.out.println("Le persone che hanno età compresa tra min e max sono: " + lista);
				
				//Calcolare la somma delle età di tutte le persone nella lista.
				List<Tizio> t = List.of(new Tizio("p1", 10, "n1"),
		                new Tizio("p2", 20, "n1"),
		                new Tizio("p3", 30, "n2"),
		                new Tizio("p4", 40, "n3"),
		                new Tizio("p5", 50, "n3"));
				
				Integer prova13 = t.stream().map(Tizio::eta).reduce(0, Integer::sum);
				System.out.println("La somma totale delle persone è: "+ prova13);
				
				//Restituire la lista di nazioni senza ripetizioni presenti in una lista di gente.
				List<String> prova14 = t.stream().map(Tizio::nazione).distinct().collect(Collectors.toList());
				System.out.println("Le nazioni distinte della lista sono: " + prova14);
				
				//Restituire una mappa contenente le coppie (nome persone - nazione).
				Map<String, String> coppie = t.stream().collect(Collectors.toMap(Tizio::nome, Tizio::nazione));
				System.out.println("Le coppie persone-nazione sono: " +coppie);
				
				List<Messaggio> listaMessaggi = List.of(new Messaggio("Ciao, come stai", new Persone("Giorgio", 3200809)), 
						new Messaggio("Ciao, ciao suchi", new Persone("Claudio", 37578400)),
						new Messaggio("Ola chicos", new Persone("Claudio", 5757577)));
				
				//Restituire di quanti caratteri sono formati i messaggi con destinatario Giorgio
				int risultato = listaMessaggi.stream().filter(x-> x.destinatario().nome().equals("Giorgio")).mapToInt(z -> z.testo().replace(" ", "").length()).sum();
				System.out.println("I messaggi con destinatario Giorgio hanno: " + risultato + " caratteri");
				
				//Restituire quante volte compare la parola "ciao" nei messaggi
				int conteggio = listaMessaggi.stream().mapToInt(m -> m.testo().toLowerCase().split("\\bciao\\b").length - 1).sum();
				System.out.println("La parola ''ciao'' compare: " + conteggio + " volte");
	}
	
				private List<Tizio> metodo1(int min, int max) {
					List<Tizio> l = List.of(new Tizio("p1", 10, "n1"),
							new Tizio("p2", 20, "n1"),
							new Tizio("p3", 30, "n2"),
							new Tizio("p4", 40, "n3"),
							new Tizio("p5", 50, "n3"));

					return l.stream().filter(p -> p.eta() >= min).filter(o -> o.eta() <= max).collect(Collectors.toList());
	}
}


		