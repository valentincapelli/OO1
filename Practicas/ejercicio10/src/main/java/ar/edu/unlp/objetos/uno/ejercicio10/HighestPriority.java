package ar.edu.unlp.objetos.uno.ejercicio10;

import java.util.List;

public class HighestPriority implements Strategy{

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
		if (!jobs.isEmpty()) {
			nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                    .orElse(null);
		}
		return nextJob;
	}

}