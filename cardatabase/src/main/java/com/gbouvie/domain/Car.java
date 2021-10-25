package com.gbouvie.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@EqualsAndHashCode.Include
	private long id;
	
	private String brand, model, color, registerNumber;
	private int year, price;
}
