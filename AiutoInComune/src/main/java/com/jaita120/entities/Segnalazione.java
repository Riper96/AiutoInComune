package com.jaita120.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "segnalazioni")
public class Segnalazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_segnalazione; 
	
	@Column(nullable = false)
	private String cod_fisc_criptato;
	
	@Column(nullable = false)
	private String indirizzo;
	
	@Column(nullable = false)
	private Double latitudine;
	
	@Column(nullable = false)
	private Double longitudine;
	
	@Column(nullable = false)
	private Date data;
	
	@Column(nullable = false)
	private String foto;
	
	@Column(nullable = false)
	private String categoria;
	//E un enum da vedere come fare la dichiarazione se usare un array oppure un altro metodo da ricercare
	
	@Column(nullable = false)
	private String descrizione;
	
	@Column(nullable = false)
	private String priorita;
	//E un enum da vedere come fare la dichiarazione se usare un array oppure un altro metodo da ricercare
	
	@ManyToOne(fetch = FetchType.EAGER)//per gli 1 a N
	@JoinColumn(name = "id_comune", referencedColumnName = "id_Comune")
	private Comune comune;
	
	@Column(nullable = false)
	private String stato_segnalzione;
	//E un enum da vedere come fare la dichiarazione se usare un array oppure un altro metodo da ricercare 
}
