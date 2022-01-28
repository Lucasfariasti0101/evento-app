package com.eventoapp.repository;

import com.eventoapp.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long>{
  Evento findById(long id);
}
