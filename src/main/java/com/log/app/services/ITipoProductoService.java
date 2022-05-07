package com.log.app.services;

import java.util.List;

import com.log.app.entidades.TipoProducto;

public interface ITipoProductoService {

	public List<TipoProducto> findAll();

	public void save(TipoProducto idTipoProd);
	
	public TipoProducto findOne(Long idTipoProd);
	
	public void delete(Long idTipoProd);
}