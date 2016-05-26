package br.ufc.stub;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import br.ufc.model.Pessoa;

@Entity(name="filme")
public class Filme {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToMany(/* TODO */)
	private List<Pessoa> pessoas;
}
