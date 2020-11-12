package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg [] innleggtabell;
	private int nesteledig;

	public Blogg() {
	
	innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		
		int verdi = -1;
		for(int i = 0; i < nesteledig; i++) {
			if(innleggtabell[i].erLik(innlegg) == true) {
				verdi = innleggtabell[i].getId();
				break;
			}
			}return verdi;
		}
	

	public boolean finnes(Innlegg innlegg) {
		int a = innlegg.getId();
		boolean finnes = false;
		for(int i = 0; i < nesteledig; i++) {
			int b = innleggtabell[i].getId();
			if(a == b) {
				finnes = true;
			}
		}return finnes;
	}

	public boolean ledigPlass() {
			
		boolean ledig = false;
			if(nesteledig < innleggtabell.length) {
				ledig = true;
			}return ledig;
		}

	
	
	public boolean leggTil(Innlegg innlegg) {

		boolean lagtTil = false;
		boolean fins = finnes(innlegg);
		if(nesteledig < innleggtabell.length) {
			if(fins == false) {
				innleggtabell[nesteledig] = innlegg;
				lagtTil = true;
				nesteledig++;
			}
		}return lagtTil;
		
		
	}
	
	public String toString(){
		    String a = nesteledig + "\n";
		    for (int i = 0; i < nesteledig; i++) {
		        a += innleggtabell[i].toString();
		    }
		    return a;
		    }
	

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}