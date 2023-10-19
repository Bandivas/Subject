
public class SubjectControl extends SubjectMethods {
	MainMenu menu = new MainMenu();
	private String[] wordCommand;
	private String command;

	public void setCommand(String command) {
		this.command = command;
		wordCommand = this.command.split(",");
		wordCommand[0].toUpperCase();
		try {
			commandProcess(wordCommand[0]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("\nInvalid Format, Please Try Again\n");
		} catch (NumberFormatException e) {
			System.out.println("\nInvalid Format, Please Try Again\n");
		}

	}

	void commandProcess(String method) {

		method = method.toUpperCase();
		String  subjectCode;
		String subjectName;
		switch (method) {
		case "ADD":

			subjectCode = wordCommand[1];
			subjectName = wordCommand[2];
			this.setSubject(subjectCode, subjectName);

			this.addSubject();

			break;
		case "UPDATE":
			subjectCode= wordCommand[1];
			subjectName = wordCommand[2];
			this.updateSub(wordCommand[1], wordCommand[2]);

			break;
		case "DELETE":
			subjectCode = wordCommand[1];
			this.deleteSub(wordCommand[1]);

			break;
		case "SEARCH":
			subjectCode = wordCommand[1];
			this.search(wordCommand[1]);

			break;
		case "ALL":
			this.displayAll();
			break;
		case "EXIT":

			MainMenu.mainMenu();

		default:
			System.out.println("Invalid Format, Please Try Again");
		}

	}

	

}
