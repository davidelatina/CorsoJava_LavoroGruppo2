class Libro extends Risorsa {
private String autore;
// costruttore
public Libro(String titolo, int annoPubblicazione, String codice, String autore) {
super(titolo, annoPubblicazione, codice);
this.autore = autore;

}

// getter e setter 

public String getAutore() {
    return autore;
}

public void setAutore(String autore) {
    this.autore = autore;
}



@Override  // implemento metodo astratto della classe classe Risorsa

                 

 public void visualizzaDettagli() {
        System.out.println("Titolo: " + getTitolo());
        System.out.println("Anno: " + getAnnoPubblicazione());
        System.out.println("Codice: " + getCodice());
        System.out.println("Autore: " + getAutore());
    }
}                // chiudo classe risorsa 

class Rivista extends Risorsa {
private int numeroRivista; 
// costruttore
public Rivista(String titolo, int annoPubblicazione, String codice, int numeroRivista) {
super(titolo, annoPubblicazione, codice);
this.numeroRivista = numeroRivista;

}  // chiudo costruttore
public int getNumeroRivista() {
    return numeroRivista;
}
public void setNumeroRivista(int numeroRivista) {
    this.numeroRivista = numeroRivista;
}

// metodo 
@Override 
public void visualizzaDettagli() {
       System.out.println("Titolo: " + getTitolo());
        System.out.println("Anno: " + getAnnoPubblicazione());
        System.out.println("Codice: " + getCodice());
        System.out.println("Numero rivista:" + getNumeroRivista());
    }


         

} // chiudo classe rivista 
 

class Ebook extends Risorsa {

private String formato; 

// costruttore
public Ebook(String titolo, int annoPubblicazione, String codice, String formato) {
super(titolo, annoPubblicazione, codice);
this.formato = formato;

}

// gettere e setter

public String getFormato() {
    return formato;
}
public void setFormato(String formato) {
    this.formato = formato;
}

@Override 
public void visualizzaDettagli() {
       System.out.println("Titolo: " + getTitolo());
        System.out.println("Anno: " + getAnnoPubblicazione());
        System.out.println("Codice: " + getCodice());
        System.out.println("Formato:" + getFormato());
    }

}




public class Sottoclassi {
    
}
