package fvs.edu.br.topicos.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import fvs.edu.br.topicos.enums.TipoCliente;

@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private String cpfOuCnpj;
	private TipoCliente tipo;
	
	@OneToMany
	private List<Endereco> endereco = new ArrayList<>();
	
	@ElementCollection
	@CollectionTable(name="TELEFONE")
	private Set<String> telefones = new HashSet<>();
	
public Cliente() {
	
	
}

public List<Endereco> getEndereco() {
	return endereco;
}

public void setEndereco(List<Endereco> endereco) {
	this.endereco = endereco;
}

public Set<String> getTelefones() {
	return telefones;
}

public void setTelefones(Set<String> telefones) {
	this.telefones = telefones;
}

public Cliente(Integer id, String name, String email, String cpfOuCnpj, TipoCliente tipo) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.cpfOuCnpj = cpfOuCnpj;
	this.tipo = tipo;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCpfOuCnpj() {
	return cpfOuCnpj;
}

public void setCpfOuCnpj(String cpfOuCnpj) {
	this.cpfOuCnpj = cpfOuCnpj;
}

public TipoCliente getTipo() {
	return tipo;
}

public void setTipo(TipoCliente tipo) {
	this.tipo = tipo;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cliente other = (Cliente) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

}

