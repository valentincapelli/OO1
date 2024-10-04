package ar.edu.unlp.objetos.uno.ejercicio10;

import java.util.List;

public class Lifo implements Strategy{

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
		if (!jobs.isEmpty()) {
			nextJob = jobs.get(jobs.size()-1);
		}
		return nextJob;
	}

}
