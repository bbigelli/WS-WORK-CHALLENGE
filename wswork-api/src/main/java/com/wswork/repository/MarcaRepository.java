package com.wswork.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.wswork.model.Marca;

@Component
public class MarcaRepository {
	
	private Map<Long, Marca> map = new HashMap<>();
	
	public void save(Marca obj) {
		map.put(obj.getId(), obj);
	}
	
	public Marca findById(Long id) {
		return map.get(id);
	}
	
	public List<Marca> FindAll() {
		return new ArrayList<Marca>(map.values());
	}	
}