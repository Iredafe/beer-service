package dafe.springframework.beerservice.Grokking;

import java.nio.file.attribute.FileAttribute;
import java.util.*;

public class TopKFileSizeFromCollections {

    static int totalSizeOfFiles;
    static PriorityQueue<Directory> directoryHeap;
    static Map<String, FileAttribute> directoryDetailsMap;
    static Set<Directory> isDirectoryPresentInHeap;

    public TopKFileSizeFromCollections(){
        directoryHeap = new PriorityQueue<Directory>((a, b)-> b.size - a.size);
        directoryDetailsMap = new HashMap<>();
        isDirectoryPresentInHeap = new HashSet<>();
        this.totalSizeOfFiles = 0;
    }

    private static int getTotalSize(){
        return totalSizeOfFiles;
    }

    private static List<Directory> getTopNCollections(int n){
        List<Directory> output = new ArrayList<>();
        PriorityQueue<Directory> tempDirectoryHeap = new PriorityQueue<>((a,b)-> b.size-a.size);

        if(directoryHeap.size() < n) return new ArrayList<>();
        for(int i=0 ; i< n ; i++){
            Directory directory = directoryHeap.poll();
            output.add(directory);
            tempDirectoryHeap.add(directory);
        }

        for(int i=0; i<n; i++){
            directoryHeap.add(tempDirectoryHeap.poll());
        }
        return output;
    }

    private static List<Directory> addFileToDirectory(String fileName, int size, String directoryName){
        File file;
        if(directoryName.equals("")){
            file = new File(fileName, size);
        }else{
            Directory directory = (Directory) directoryDetailsMap
                    .getOrDefault(directoryName, new Directory(directoryName, size));
        }
        return new ArrayList<>();
    }


    public static void main(String[] args) {

        TopKFileSizeFromCollections fileSystem = new TopKFileSizeFromCollections();

        fileSystem.addFileToDirectory("file1.txt", 100, "");
        fileSystem.addFileToDirectory("file2.txt", 100, "collection1");
        fileSystem.addFileToDirectory("file3.txt", 200, "collection1");
        fileSystem.addFileToDirectory("file4.txt", 300, "collection2");
        fileSystem.addFileToDirectory("file5.txt", 400, "");
    }

    static class File implements FileAttribute{
        String fileName;
        int size;
        Directory directory;

        public File(String fileName, int size){
            this.fileName=fileName;
            this.size=size;
        }

        public File(String fileName, int size, Directory directory){
            this.fileName = fileName;
            this.size = size;
            this.directory = directory;
        }
    }
    static class Directory implements FileAttribute {
        String directoryName;
        List<File> files;
        int size;

        public Directory(String name, int size){
            this.directoryName = name;
            this.size = size;
            files = new ArrayList<>();
        }
    }

    interface FileAttribute{}
}


