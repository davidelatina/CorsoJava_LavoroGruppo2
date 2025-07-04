public abstract class Risorsa {

  private String titolo;
  private int annoPubblicazione;
  private String codice;

  public Risorsa(String titolo, int annoPubblicazione, String codice) {
      this.titolo = titolo;
      this.annoPubblicazione = annoPubblicazione;
      this.codice = codice;
  }

  //----------------------------GETTER & SETTER---------------------------------------
  public String getTitolo() {
      return titolo;
  }

  public int getAnnoPubblicazione() {
      return annoPubblicazione;
  }

  public String getCodice() {
      return codice;
  }

  public void setTitolo(String titolo) {
      this.titolo = titolo;
  }

  public void setAnnoPubblicazione(int annoPubblicazione) {
      this.annoPubblicazione = annoPubblicazione;
  }

  public void setCodice(String codice) {
      this.codice = codice;
  }

  // Metodo astratto da overridare nelle sottoclassi
  public abstract void visualizzaDettagli();
}