package com.app.pruebaGrupo.modelos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface GrupoDao extends JpaRepository<Grupo, Long>{
	public List<Grupo> findByCodPadre(Long codPadre);
	public List<Grupo> findAll();
}
