package com.sheryians.majormodel;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id")
	private int id;
	private String name;
}
