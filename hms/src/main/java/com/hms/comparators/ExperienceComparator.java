package com.hms.comparators;

import java.util.Comparator;

import com.hms.entities.Interviewer;

public class ExperienceComparator implements Comparator<Interviewer> {

	@Override
	public int compare(Interviewer o1, Interviewer o2) {
		return o2.getExp() - o1.getExp();
	}

}
