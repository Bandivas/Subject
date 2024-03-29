import java.util.ArrayList;

public class SubjectMethods extends Subject{
	ArrayList<String> subjectCodes = new ArrayList<>();
	ArrayList<String> subjectNames = new ArrayList<>();

	int index, len;
	    void addSubject() {
	    	subjectCodes.add(this.subjectCode);
		    subjectNames.add(this. subjectName);
		    System.out.println("Successfully Added");
		
	}
	void updateSub(String subjectCode, String newsubjectName) {
		
		index = subjectCodes.indexOf(subjectCode);
		subjectNames.set(index, newsubjectName);
		System.out.println("Successfully Updated");
		
	}
	void deleteSub(String subjectCode) {
		//index = subjectCodes.indexOf(subjectCode);
		subjectCodes.remove(subjectCode);
		subjectNames.remove(subjectCode);
		System.out.println("Successfully Removed");
	}
	void search(String wordCommand) {
		
		index = subjectCodes.indexOf(subjectCode);
		if(subjectCodes  ==  null) {
			System.out.println("Student ID not Found, Please Try Again");
		}else {
		String format = "";
		System.out.println("============================Result================================");
		System.out.println("------------------------------------------------------------------");
		System.out.printf("Subject Code%-16sSubject Name%-16s\n",format,format);
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%-28s%-23s\n",subjectCodes.get(index),subjectNames.get(index));
		//System.out.println(studentId.get(index) + "\t" + studentNames.get(index) + "\t"
		//		+ studentAddress.get(index) + "\t" + studentAge.get(index));
		System.out.println("\n\n=========================End of Result============================\n\n");
		}
	}
	void displayAll() {
		len = subjectCodes.size();
		if(len == 0) {
			System.out.println("\nThere are no Subjects added yet");
		}else {
		String format = "";		
		System.out.println("\n\n==========================Subject List============================");
		System.out.println("------------------------------------------------------------------");
		System.out.printf("Subject Code%-16sSubject Name%-16s\n",format,format);
		System.out.println("------------------------------------------------------------------");
							
		for(int i = 0; i < len;i++) {
			System.out.printf("%-28s%-20s\n",subjectCodes.get(i),subjectNames.get(i));
			
			//System.out.println(studentId.get(i) + "\t" + studentNames.get(i) + "\t"
			//		+ studentAddress.get(i) + "\t" + studentAge.get(i));
		
		}
		System.out.println("\n\n========================End of the List===========================");
		
		}
	}
}
