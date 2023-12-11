package hospedagem;

import java.util.List;

//Camada de Controle (Fachada)
public class HotelService {
 private RepositorioQuarto repositorioQuarto;

 public HotelService(int quantidadeQuartos) {
     this.repositorioQuarto = new RepositorioQuarto(quantidadeQuartos);
 }

 public List<Quarto> consultarQuartosDisponiveis() {
     return repositorioQuarto.getQuartosDisponiveis();
 }

 public void reservarQuarto(Quarto quarto) {
     repositorioQuarto.reservarQuarto(quarto);
 }
}
