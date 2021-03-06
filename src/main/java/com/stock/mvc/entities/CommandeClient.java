package com.stock.mvc.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CommandeClient {
	
	@Id
	@GeneratedValue
	private Long idcommandeClient;
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "idclient")
	private Client client;
	
	@OneToMany(mappedBy = "commandeClient")
	private List<LigneCommandeClient> ligneCommandeClient;

	public Long getIdcommandeClient() {
		return idcommandeClient;
	}

	public void setIdcommandeClient(Long idcommandeClient) {
		this.idcommandeClient = idcommandeClient;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<LigneCommandeClient> getLigneCommandeClient() {
		return ligneCommandeClient;
	}

	public void setLigneCommandeClient(List<LigneCommandeClient> ligneCommandeClient) {
		this.ligneCommandeClient = ligneCommandeClient;
	}
	
	
	
	

}
