import java.util.Arrays;
import java.util.List;
public class DemoComposite {
	   public static void main(String[] args) {
	        IFileComponent file1 = new FileLeaf("txt", 10);
	        IFileComponent file2 = new FileLeaf("png", 5);
	        IFileComponent file3 = new FileLeaf("jpg", 12);
	 
	        List<IFileComponent> files = Arrays.asList(file1, file2, file3);
	        IFileComponent folder = new FolderComposite(files);
	        
	        System.out.println("File1: " + file1.getType());
	        System.out.println("Folder type:" + folder.getType());
	        System.out.println("Total Size: " + folder.getSize());
	    }
}
