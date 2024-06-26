package com.jaita120.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comune")
public class Comune {

	//Dichiarazione elementi entità
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Comune;
	
	@Column(nullable = false)
	private String Nome_Comune;

	//****------------------------------METODI--------------------------------------------------**
	public Integer getId() {
		return id_Comune;
	}

	public void setId(Integer id) {
		this.id_Comune = id;
	}

	public String getNome_Comune() {
		return Nome_Comune;
	}

	public void setNome_Comune(String nome_Comune) {
		Nome_Comune = nome_Comune;
	}
	
	
}
