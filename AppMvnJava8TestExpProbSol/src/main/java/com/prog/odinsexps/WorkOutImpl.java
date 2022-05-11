package com.prog.odinsexps;

public class WorkOutImpl implements IWorkOut {

	private WorkOut[] workoutObjRef;

	public WorkOutImpl(int inputOfIndex) {
		super();
		this.workoutObjRef = new WorkOut[inputOfIndex];
	}

	@Override
	public void addWorkout(WorkOut workOutObjValue, int indexPosition) {
		workoutObjRef[indexPosition] = workOutObjValue;
	}

	@Override
	public WorkOut[] displayMyWorkouts() {
		return workoutObjRef;
	}

}