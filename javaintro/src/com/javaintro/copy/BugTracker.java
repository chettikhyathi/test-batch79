package com.javaintro.copy;

public class BugTracker {
	int bugid;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	void getBugId() {
		System.out.println("The Bug ID is:"+bugid);
	}
	void getApplicationName() {
		System.out.println("The application name is:"+applicationName);
	}
	void getBugTitle() {
		System.out.println("The Bug Title is:"+bugTitle);
	}
	void getSeverity() {
		System.out.println("The severity is:"+severity);
	}
	void getPriority() {
		System.out.println("The priority is:"+priority);
	}
	void getStatus() {
		System.out.println("The Status is:"+status);
	}
	void getAssignedDeveloper() {
		System.out.println("The assigned developer is:"+assignedDeveloper);
	}
	void getUpdateAssignedDeveloper(int bugid1,String newDeveloper) {
		bugid=bugid1;
		assignedDeveloper=newDeveloper;
	}
	void getUpdateStatus(int bugid2,String newStatus) {
		bugid=bugid2;
		status=newStatus;
	}
	public static void main(String[] args) {
		BugTracker b =new BugTracker();
		b.bugid=12;
		b.applicationName="EmployeePortal";
		b.bugTitle="Edit Button is not working";
		b.severity="Critical";
		b.priority="High";
		b.status="In Process";
		b.assignedDeveloper="Khyathi";
		b.getBugId();
		b.getApplicationName();
		b.getBugTitle();
		b.getSeverity();
		b.getPriority();
		b.getStatus();
		b.getAssignedDeveloper();
		b.getUpdateAssignedDeveloper(12,"UshaSri");
		b.getAssignedDeveloper();
		b.getUpdateStatus(12,"Developed");
		b.getStatus();
	}
	

}
