package hospedagem;

import java.util.List;

//Classe ConsultaQuarto representa o caso de uso para consultar quartos disponíveis
public class ConsultaQuarto {
 public static void main(String[] args) {
     // Criar a camada de controle (Fachada)
     HotelService hotelService = new HotelService(10);

     // Consultar quartos disponíveis
     List<Quarto> quartosDisponiveis = hotelService.consultarQuartosDisponiveis();

     if (!quartosDisponiveis.isEmpty()) {
         System.out.println("Quartos disponíveis encontrados:");
         for (Quarto quarto : quartosDisponiveis) {
             System.out.println(" - Quarto #" + quarto.getNumero());
         }

         // Reservar o primeiro quarto disponível
         Quarto quartoAReservar = quartosDisponiveis.get(0);
         hotelService.reservarQuarto(quartoAReservar);
     } else {
         System.out.println("Nenhum quarto disponível encontrado.");
     }
 }
}
