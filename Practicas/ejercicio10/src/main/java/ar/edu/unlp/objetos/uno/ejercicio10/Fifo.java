package ar.edu.unlp.objetos.uno.ejercicio10;

import java.util.List;

public class Fifo implements Strategy{

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
        if (!jobs.isEmpty()) {
        	nextJob = jobs.get(0);
        }
        return nextJob;
	}
	
}
