import java.util.ArrayList;
import java.util.List;
 
public class FolderComposite implements IFileComponent {
 
    private List<IFileComponent> files = new ArrayList<>();
 
    public FolderComposite(List<IFileComponent> files) {
        this.files = files;
    }
 
    @Override
    public String getType() {
        return "Folder";
    }
 
    @Override
    public Long getSize() {
        long total = 0;
        for (IFileComponent file : files) {
            total += file.getSize();
        }
        return total;
    }
}
