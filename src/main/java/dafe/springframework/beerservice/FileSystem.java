package dafe.springframework.beerservice;

import java.util.*;

public class FileSystem {
    static HashMap<String, FileBehaviour> fileDirectoryMap;
    static PriorityQueue<FileDirectory> maxHeap;
    static Set<FileDirectory> isDirectoryInHeap;
   static int totalSize;

    public FileSystem(){
        this.fileDirectoryMap = new HashMap<>();
        this.maxHeap = new PriorityQueue<>((a,b)->b.size-a.size);
        this.isDirectoryInHeap = new HashSet<>();
        this.totalSize=0;
    }

    interface FileBehaviour{}

    static class File implements FileBehaviour{
        String fileName;
        int fileSize;
        FileDirectory fileDirectory;

        public File(String fileName, int fileSize){
            this.fileName = fileName;
            this.fileSize = fileSize;
        }

        public File(String fileName, int fileSize, FileDirectory fileDirectory){
            this.fileName = fileName;
            this.fileSize = fileSize;
            this.fileDirectory = fileDirectory;
        }
    }

    static class FileDirectory implements FileBehaviour{
        String directoryName;
        int size;
        List<File> files;

        public FileDirectory(String directoryName){
            this.directoryName = directoryName;
            this.files=new ArrayList<>();
            this.size=0;
        }
    }
    private static void addFileToSystem(String fileName, int fileSize, String collectionName){
        File file;
        if(collectionName.equals("")){
            file = new File(fileName, fileSize);
            fileDirectoryMap.put(fileName, file);
        }else{
            FileDirectory directory = (FileDirectory)
                    fileDirectoryMap.getOrDefault(collectionName, new FileDirectory(collectionName));
            file = new File(fileName, fileSize, directory);

            directory.size += fileSize;
            directory.files.add(file);

            if(isDirectoryInHeap.contains(directory)){
                isDirectoryInHeap.add(directory);
                maxHeap.add(directory);
            }
            fileDirectoryMap.put(collectionName, directory);
        }
        totalSize += fileSize;
    }

    private static List<FileDirectory> getTopNCollections(int N){
        PriorityQueue<FileDirectory> temporaryMaxHeap = new PriorityQueue<>((a,b)->b.size-a.size);
        List<FileDirectory> output = new ArrayList<>();
        for(int number =0; number< N; number++){
            FileDirectory directory = temporaryMaxHeap.poll();
            temporaryMaxHeap.add(directory);
            output.add(directory);
        }

        for(int number = 0; number<N; number++){
            maxHeap.add(temporaryMaxHeap.poll());
        }

    return output;
    }

    public static void main(String[] args) {
        FileSystem fileSystem1 = new FileSystem();
        int n=2;
       // file2.txt(size: 200) in collection "collection1"
        fileSystem1.addFileToSystem("file1.txt", 200, "collection1");
        fileSystem1.addFileToSystem("file2.txt", 130, "");
        fileSystem1.addFileToSystem("file3.txt", 300, "collection2");
        fileSystem1.addFileToSystem("file4.txt", 170, "collection3");
        fileSystem1.addFileToSystem("file5.txt", 250, "");

        System.out.println("Size of all files is : " + fileSystem1.totalSize);
        List<FileDirectory> topCollections = getTopNCollections(n);
        for(FileDirectory collection : topCollections){
            System.out.println("Top N elements " + getTopNCollections(n));
        }
        //total files = 1250
        //top 2 collection = collection2=300 & collection1 = 200

        FileSystem fileSystem2 = new FileSystem();
        fileSystem2.addFileToSystem("file1.txt", 200, "collection1");
        fileSystem2.addFileToSystem("file2.txt", 130, "");
        fileSystem2.addFileToSystem("file3.txt", 300, "collection2");
        fileSystem2.addFileToSystem("file4.txt", 170, "collection1");
        fileSystem2.addFileToSystem("file5.txt", 250, "");

        //total files = 1250
        //top 2 collection = collection2=370 & collection2 = 300

    }
}
