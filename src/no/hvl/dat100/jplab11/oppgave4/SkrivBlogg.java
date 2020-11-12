package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

			boolean skrevet = true;
			// 1) Åpner filen for skriving
			
			PrintWriter skriver;
			try {
				skriver = new PrintWriter(mappe + filnavn);
				
				// 2) Skriv til fil
				
				skriver.println(samling.toString());
				
				// 3) Lukker filen
				skriver.close(); 
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				skrevet = false;
			}
			
			return skrevet;
		}
	}

