package cn.guolf.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.ExecutionListener;
import org.activiti.engine.delegate.TaskListener;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class EndTaskListener implements ExecutionListener {


	public void notify(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("execution delegateTask.getEventName() = " + execution.getEventName());
		
	}
}
