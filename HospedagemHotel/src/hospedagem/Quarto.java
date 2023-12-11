package hospedagem;

//Classe Quarto representa os quartos do hotel
public class Quarto {
 private int numero;
 private boolean disponivel;

 public Quarto(int numero) {
     this.numero = numero;
     this.disponivel = true;
 }

 public int getNumero() {
     return numero;
 }

 public boolean estaDisponivel() {
     return disponivel;
 }

 public void reservar() {
     disponivel = false;
     System.out.println("Quarto #" + numero + " reservado.");
 }
}
