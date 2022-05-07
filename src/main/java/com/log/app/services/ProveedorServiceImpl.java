package com.log.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.log.app.daos.IProveedorDao;
import com.log.app.entidades.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	private IProveedorDao proveedorDao;
	
	@Override
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return (List<Proveedor>) proveedorDao.findAll();
	}

	@Override
	public Proveedor save(Proveedor proveedor) {
		return proveedorDao.save(proveedor);
		
	}

	@Override
	public Proveedor findOne(Long idProv) {
		// TODO Auto-generated method stub
		return proveedorDao.findById(idProv).orElse(null);
	}

	@Override
	public void delete(Long idProv) {

		proveedorDao.deleteById(idProv);
	}

}