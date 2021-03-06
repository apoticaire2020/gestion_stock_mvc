package com.stock.mvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeFournisseur {
	
	@Id
	@GeneratedValue
	private Long idligneCmFrs;

	
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idcommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;

	public Long getIdligneCmFrs() {
		return idligneCmFrs;
	}

	public void setIdligneCmFrs(Long idligneCmFrs) {
		this.idligneCmFrs = idligneCmFrs;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	

}
