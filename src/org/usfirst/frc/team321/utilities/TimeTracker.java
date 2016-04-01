package org.usfirst.frc.team321.utilities;

public class TimeTracker {
	
	private long initialTime;
	private long endTime;

	public TimeTracker(long endTime){
		this.initialTime = System.currentTimeMillis();
		this.endTime = initialTime + endTime;
	}
	
	public boolean hasEnded(){
		if(System.currentTimeMillis() - initialTime < endTime){
			return false;
		}
		return true;
	}
}
