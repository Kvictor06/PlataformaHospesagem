package hospedagem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioQuarto {
    private List<Quarto> quartos;

    public RepositorioQuarto(int quantidadeQuartos) {
        quartos = new ArrayList<>();
        for (int i = 1; i <= quantidadeQuartos; i++) {
            quartos.add(new Quarto(i));
        }
    }

    public List<Quarto> getQuartosDisponiveis() {
        return quartos.stream().filter(Quarto::estaDisponivel).collect(Collectors.toList());
    }

    public void reservarQuarto(Quarto quarto) {
        quarto.reservar();
    }
}
