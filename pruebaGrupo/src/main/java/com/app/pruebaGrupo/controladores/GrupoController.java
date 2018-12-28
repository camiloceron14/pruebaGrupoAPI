package com.app.pruebaGrupo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pruebaGrupo.modelos.Grupo;
import com.app.pruebaGrupo.modelos.GrupoDao;

@RestController
public class GrupoController {
	@Autowired
	private GrupoDao grupoDao;
	
	@CrossOrigin
	@GetMapping(value="/api/grupos/get-by-codPadre",produces=MediaType.APPLICATION_JSON_VALUE)	  
	public List<Grupo> getByCodPadre(Long codPadre) {
		List<Grupo> lst = null;
	    try {
	    	if (codPadre != null){
	    		lst = grupoDao.findByCodPadre(codPadre);
	    	}
	    	else
	    		lst = grupoDao.findByCodPadre(null);
	    }
	    catch (Exception ex) {
	      return null;
	    }
	    return lst;
	 }
	 
	 @CrossOrigin 
	 @GetMapping(value="/api/grupos/get-all",produces=MediaType.APPLICATION_JSON_VALUE)
	 public List<Grupo> getAll() {
		 List<Grupo> lst = null;
	    try {
	    	lst = grupoDao.findAll();
	    }
	    catch (Exception ex) {
	      return null;
	    }
	    return lst;
	 }

}
