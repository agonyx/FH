package weitereAufgaben;

import java.time.Month;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Eine Klasse zur Berechnung von Daten
 *
 * @author Tom
 *
 */
public class Datum {
	/**
	 *
	 * @param tag   des Datums
	 * @param monat des Datums
	 * @param jahr  des Datums
	 */
	public int tag;
	public int monat;
	public int jahr;

	public Datum(int tag, int monat, int jahr) {
		if (validesDatum(tag, monat, jahr)) {
			this.tag = tag;
			this.monat = monat;
			this.jahr = jahr;
		} else {
			throw new IllegalArgumentException("das ist kein richtiges Datum!");
			// Exceptions kommen noch. Hier wird das Datum nicht erstellt, stattdessen wird
			// auf der Konsole ausgegeben, dass das Datum fehlerbehaftet ist.
		}
	}

	/**
	 * testet ob das eingegebene Datum ein valides ist ein falsches wäre: -23.22.1914
	 * ein richtiges: 23.12.1914
	 *
	 * @param tag   zu testender Tag
	 * @param monat zu testender Monat
	 * @param jahr  zu testendes Jahr
	 * @return @code true wenn es sich um ein richtiges Datum handelt, sonst @code
	 *         false.
	 */
	private boolean validesDatum(int tag, int monat, int jahr) {
		if((tag > 0 && tag < 32)&&(monat>0&&monat<13)&&(jahr>0)){
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Berechnet, ob es sich bei diesem Datum um ein Datum in einem Schaltjahr
	 * handelt. folgende Regeln gelten für ein Schaltjahr:
	 * -Es ist durch 4 teilbar,
	 * aber NICHT durch 100, Tipp: Modulo Operation.
	 * -Ist es durch 100 teilbar, aber NICHT durch 400 = KEIN Schaltjahr
	 * -ist das Jahr durch 400 teilbar, ist es ein Schaltjahr.
	 *
	 * @return @code true, wenn sich bei diesem Jahr von diesem Datum um ein
	 *         Schaltjahr handelt, sonst false
	 */
	public boolean schaltJahr() {
		if (((this.jahr % 4 == 0)&&(this.jahr % 100 != 0)) || ((this.jahr % 100 == 0)&&(this.jahr%400 == 0)) ){
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Berechnet den Abstand zwischen diesem Datum und einem weiteren
	 *
	 * @param d das zweite Datum
	 * @return den Abstand in Tagen
	 */
	public int abstandZweierDaten(Datum d) {
		Date dateone = new Date(this.jahr,this.monat,this.tag);
		Date datetwo = new Date(d.jahr,d.monat,d.tag);
		long diffmili = Math.abs(dateone.getTime() - datetwo.getTime());
		return (int) TimeUnit.DAYS.convert(diffmili, TimeUnit.MILLISECONDS);
	}

	/**
	 * Erstellt aus den Zahlen einen String in folgendem Stil: 3. Oktober 1990 und
	 * gibt es als String zurück.
	 *
	 * @return das Datum als String.
	 */
	public String toString() {
		return this.tag +". "+ Month.of(this.monat-1) +" " +this.jahr;
	}
}
