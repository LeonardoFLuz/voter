package br.edu.ulbra.election.voter.repository;

import br.edu.ulbra.election.voter.model.Voter;
import org.springframework.data.repository.CrudRepository;

public interface VoterRepository extends CrudRepository<Voter, Long> {
	@Query("select e from #{#entityName} e where e.year = ?1")
	List<Election> findByYear(Integer year);
    Voter findByEmail(String email);
	Voter findByName(String votername);
}
