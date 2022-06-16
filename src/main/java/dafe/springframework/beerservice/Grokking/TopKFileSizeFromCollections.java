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
        totalSizeOfFiles = 0;
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

    private static void addFileToDirectory(String fileName, int size, String directoryName){
        File file;
        if(directoryName.equals("")){
            file = new File(fileName, size);
            directoryDetailsMap.put(fileName, file);
        }else{
            Directory directory = (Directory) directoryDetailsMap
                    .getOrDefault(directoryName, new Directory(directoryName));
            file = new File(fileName, size, directory);

            directory.size +=size;
            directory.files.add(file);

            if(!isDirectoryPresentInHeap.contains(directory)){
                directoryHeap.add(directory);
                isDirectoryPresentInHeap.add(directory);
            }

            directoryDetailsMap.put(directoryName, directory);
        }
            totalSizeOfFiles += size;
    }


    public static void main(String[] args) {

        TopKFileSizeFromCollections fileSystem = new TopKFileSizeFromCollections();

        fileSystem.addFileToDirectory("file1.txt", 100, "");
        fileSystem.addFileToDirectory("file2.txt", 100, "collection 1");
        fileSystem.addFileToDirectory("file3.txt", 200, "collection 1");
        fileSystem.addFileToDirectory("file4.txt", 300, "collection 2");
        fileSystem.addFileToDirectory("file5.txt", 400, "");

        int n = 2;
        System.out.println("total size is : " + fileSystem.getTotalSize());
        List<Directory> topNCollections = fileSystem.getTopNCollections(n);

        for (Directory collection: topNCollections)
            System.out.println("The top " +n+ " collections and size is "  +collection.directoryName+" " + collection.size+" ");
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

        public Directory(String name){
            this.directoryName = name;
            this.size = 0;
            files = new ArrayList<>();
        }
    }

    interface FileAttribute{}
}


