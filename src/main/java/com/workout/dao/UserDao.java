package com.workout.dao;

import java.util.Date;
import java.util.List;

import com.workout.model.WorkoutCategory;
import com.workout.model.WorkoutCollection;



public interface UserDao {

	public void addWorkout(WorkoutCollection workoutCollection);
	public void editWorkout(int workoutId);
	public void deleteWorkout(int workoutId);
	public List<WorkoutCollection> viewWorkout(int userId);
	public void addCategory(WorkoutCategory workoutCategory);
	public void editCategory(int categoryId);
	public void deleteCategory(int categoryId);
	public List<WorkoutCategory> viewCategory(int userId);
	public void startWorkout(int workoutId,int userId);
	public void endWorkout(int workoutId,int userId);
	public void generateReport(Date startDate,Date endDate);
}
