package dev.stephenpearson.seed_start.dashboard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dev.stephenpearson.seed_start.task.Task;

@Controller
public class DashboardFragmentsController {
	
	List<Task> tempTasks = new ArrayList<>();
	
	@GetMapping("/tasksToday")
	public String getTasks( Model model) {
		
		
		
		tempTasks.add(new Task("2342", "Sow cauliflower seeds."));
		tempTasks.add(new Task("7463", "Clean greenhouse windows."));
		tempTasks.add(new Task("3746", "Harvest ripe tomatoes."));
		tempTasks.add(new Task("3746", "Feed the melons."));
				
				
			
		model.addAttribute("tasks", tempTasks);
		
		return "fragments/tasksToday";
	}
	

}
