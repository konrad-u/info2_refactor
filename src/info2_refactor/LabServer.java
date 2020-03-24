package info2_refactor;

public class LabServer {
	
	String labTitle;
	String labDescription;

	public String getLabTitle() {
		return labTitle;
	}
	
	public void setLabTitle(String labTitle) {
		this.labTitle = labTitle;
	}
	
	public String getlabDescription() {
		return labDescription;
	}
	
	public void setLabDescription(String labDescription) {
		this.labDescription = labDescription;
	}
	
	public static void printLabTitle(String labTitle) {
		System.out.println("The title of this lab is '" + labTitle + "'.");
	};
	
	public static void printLabDescription(String labDescription) {
		System.out.println("The title of this lab is '" + labDescription + "'.");
	};
}
