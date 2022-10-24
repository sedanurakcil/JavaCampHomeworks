package kodlamaio.hrmss.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmss.business.abstracts.JobService;
import kodlamaio.hrmss.dataAccess.abstracts.JobDao;
import kodlamaio.hrmss.entities.concretes.Job;

@Service
public class JobManager implements JobService {
	
	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public List<Job> getAll() {
		
		return this.jobDao.findAll();
	} 

}
