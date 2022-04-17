public class FileLeaf implements IFileComponent {
 
    private String type;
    private Long size;
 
    public FileLeaf(String type, long size) {
        super();
        this.type = type;
        this.size = size;
    }
 
    @Override
    public Long getSize() {
        return size;
    }
 
    @Override
    public String getType() {
        return this.type;
    }
}