package br.dev.tiagogomes.eventoapp.repository;

import br.dev.tiagogomes.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, String> {
    Evento findByCodigo(long codigo);
}