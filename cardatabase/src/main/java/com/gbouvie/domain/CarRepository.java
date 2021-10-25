package com.gbouvie.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public class CarRepository implements CrudRepository<Car, Long> {

	@Override
	public <S extends Car> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Car> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Car> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Car> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Car> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Car entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Car> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
