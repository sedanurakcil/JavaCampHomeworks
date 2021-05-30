package kodlamaio.hrmss.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmss.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer>{

}
