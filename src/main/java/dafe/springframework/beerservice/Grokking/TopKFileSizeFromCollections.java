package dafe.springframework.beerservice.Grokking;

import java.util.*;

public class TopKFileSizeFromCollections {

    static int totalSizeOfFiles;
    static PriorityQueue<Directory> directoryHeap;
    Map<String, File> directoryDetailsMap;
    Set<Directory> isDirectoryPresentInHeap;

    public TopKFileSizeFromCollections(){
        directoryHeap = new PriorityQueue<Directory>((a, b)-> b.size - a.size);
        directoryDetailsMap = new HashMap<>();
        isDirectoryPresentInHeap = new HashSet<>();
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
        }

        for(int i=0; i<n; i++){
            tempDirectoryHeap.add()
        }
        return new ArrayList<>();
    }

    private static List<Directory> addFileToDirectory(String fileName, int size, String directoryName){

        return new ArrayList<>();
    }


    public static void main(String[] args) {
        TopKFileSizeFromCollections topKFileSizeFromCollections = new TopKFileSizeFromCollections();


        addFileToDirectory("file1.txt", 100, "");
        addFileToDirectory("file2.txt", 100, "collection1");
        addFileToDirectory("file3.txt", 200, "collection1");
        addFileToDirectory("file4.txt", 300, "collection3");
        addFileToDirectory("file5.txt", 400, "collection4");
    }

    static class File{
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
    static class Directory{
        String directoryName;
        List<File> files;
        int size;

        public Directory(String name, int size){
            this.directoryName = name;
            this.size = size;
            files = new ArrayList<>();
        }
    }
}


