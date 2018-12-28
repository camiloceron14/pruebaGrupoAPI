package com.app.pruebaGrupo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.pruebaGrupo.modelos.Grupo;
import com.app.pruebaGrupo.modelos.GrupoDao;

@Controller
public class GrupoController {
	@Autowired
	private GrupoDao grupoDao;
	
	 @RequestMapping("/api/grupos/get-by-codPadre")
	  @ResponseBody
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
	 
	 @RequestMapping("/api/grupos/get-all")
	  @ResponseBody
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
