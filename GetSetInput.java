import java.util.Scanner;
import javax.swing.*;

public class GetSetInput {
	Scanner scan = new Scanner(System.in);
	private static int rowInput;
	private static int colInput;
	private static String outputFilePath;
	private static String menu;
	private static String searchString;
	private static int rowEdit;
	private static int colEdit;
	private static String editOption;
	private static String editValue;
	private static String editKeyString;
	private static String editKey;
	private static String editValueString;
	private static String sortOrder;

	// ========= INPUT DIMENSIONS ========
	// row input
	public void setRowInput() {
		System.out.print("\nEnter number of rows: ");
		this.rowInput = scan.nextInt();
	}
	public int getRowInput() {
		return rowInput;
	}
	// col input
	public void setColInput() {
		System.out.print("Enter number of columns: "); 
		this.colInput = scan.nextInt();
	}
	public int getColInput() {
		return colInput;
	}

	// ======== MENU ========
	// menu
	public void setMenu() {
		System.out.print("\n\nMenu:\nSearch\nEdit\nPrint\nAdd Row\nSort\nReset\nExit\n\n");
		System.out.print("Choose an option: ");
		scan.nextLine();
		this.menu = scan.nextLine().toLowerCase();
	}
	public String getMenu() {
		return menu;
	}

	// ======== FILE PATH ========
	// file path
	public void setFilePath() {
		System.out.print("Select file location and input file name: ");
		JFileChooser f = new JFileChooser(".");
        f.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); 
        f.showSaveDialog(null);

        System.out.println(f.getCurrentDirectory());
        this.outputFilePath = f.getSelectedFile().getAbsolutePath();
	}
	public String getFilePath() {
		return outputFilePath;
	}

	// ======== SEARCH ========
	// search string
	public void setSearchString() {
		System.out.print("Input search character/s: ");
		this.searchString = scan.nextLine();
		if (searchString.isEmpty()) nullInput();
	}
	public String getSearchString() {
		return searchString;
	}

	// choose to edit either key or value
	public void setEditOption() {
		System.out.print("Edit key or value?: ");
		scan.nextLine();
		this.editOption = scan.nextLine().toLowerCase();
		if (editOption.isEmpty()) nullInput();
	}
	public String getEditOption() {
		return editOption;
	}

	// edit row index
	public void setRowEdit() {
		do {
		System.out.printf("Specify row index (0:%d) to update: ", rowInput-1);
		this.rowEdit = scan.nextInt();
		}
		while (rowEdit > rowInput-1 || rowEdit < 0);
	}
	public int getRowEdit() {
		return rowEdit;
	}
	// edit col index
	public void setColEdit() {
		do {
		System.out.printf("Specify column index (0:%d) to update: ", colInput-1);
		this.colEdit = scan.nextInt();
		} while (colEdit > colInput-1 || colEdit < 0);
	}
	public int getColEdit() {
		return colEdit;
	}
	
	// replace Key
	public void setEditValue(String editValue) {
		this.editValue = editValue;
	}
	public String getEditValue() {
		return editValue;
	}
	public void setEditKeyString() {
		this.editKeyString = scan.nextLine();
		if (editKeyString.isEmpty()) nullInput();
	}
	public String getEditKeyString() {
		return editKeyString;
	}

	// replace Value
	public void setEditKey(String editKey) {
		this.editKey = editKey;
	}
	public String getEditKey() {
		return editKey;
	}
	public void setEditValueString() {
		this.editValueString = scan.nextLine();
		if (editValueString.isEmpty()) nullInput();
	}
	public String getEditValueString() {
		return editValueString;
	}

	// ======== SORT ========
	// sort order
	public void setSortOrder() {
		System.out.print("Sort order = asc/desc: ");
		this.sortOrder = scan.nextLine();
	}
	public  String getSortOrder() {
		return sortOrder;
	}

	// invalid input
	public void nullInput() {
		System.out.println("Invalid input.");
		System.exit(0);
	}
}
