package dafe.springframework.beerservice;

import io.micrometer.core.instrument.util.AbstractPartition;

import java.util.*;

public class FileSystem  {
    static int totalSize;
    static HashMap<String, FileBehaviour> fileCollectionMap=new HashMap<>();
    static PriorityQueue<FileCollection> maxHeap= new PriorityQueue<>((a,b)->b.size-a.size);
    static Set<FileCollection> isCollectionInHeap=new HashSet<>();

    public FileSystem(){
        this.totalSize=0;
    }
    //marker interface
    interface FileBehaviour{}

   static class FileCollection implements FileBehaviour{
        String collectionName;
        int size;
        List<File> files;

        public FileCollection(String collectionName){
            this.collectionName = collectionName;
            this.files = new ArrayList<>();
            this.size=0;
        }
    }

    static class File implements FileBehaviour{
        String fileName;
        int size;
        FileCollection fileCollection;

        public File(String fileName, int size){
            this.fileName=fileName;
            this.size=size;
        }

        public File(String fileName, int size, FileCollection collection){
            this.fileName=fileName;
            this.size=size;
            this.fileCollection=collection;
        }
    }

    private static void addFile(String fileName, int size, String collectionName){
        File file;
        if(collectionName.equals("")){
            file = new File(fileName, size);
            fileCollectionMap.put(fileName, file);
        }else{
            FileCollection collection = (FileCollection) fileCollectionMap.getOrDefault(collectionName, new FileCollection(collectionName));
            file = new File(collectionName, size, collection);
            collection.size += size;
            collection.files.add(file);

            if(!isCollectionInHeap.contains(collection)){
                isCollectionInHeap.add(collection);
                maxHeap.add(collection);
            }
            fileCollectionMap.put(collectionName, collection);
        }
        totalSize += size;
    }

    private static int totalSizeOfFiles(){
        return totalSize;
    }

    private static List<FileCollection> getTopNFiles(int numberLimit){
        PriorityQueue<FileCollection> temporaryMaxHeap = new PriorityQueue<>((a,b)->b.size-a.size);
        List<FileCollection> topNFiles = new ArrayList<>();
        for (int indexOfCollectionInMaxHeap =0; indexOfCollectionInMaxHeap<numberLimit; indexOfCollectionInMaxHeap++){
            FileCollection fileCollection = maxHeap.poll();
            topNFiles.add(fileCollection);
            temporaryMaxHeap.add(fileCollection);
        }

        for(int indexOfCollectionInTempMaxHeap = 0; indexOfCollectionInTempMaxHeap< numberLimit; indexOfCollectionInTempMaxHeap++){
            maxHeap.add(temporaryMaxHeap.poll());
        }
        return topNFiles;
    }

    public static void main(String[] args) {
        String fileName1 = "file1.txt";
        String fileName2 = "file2.txt";
        String fileName3 = "file3.txt";
        String fileCollection1 = "collection1";
        String fileCollection2 = "collection2";
        int topNumberOfFiles = 2;

        FileSystem fileSystem = new FileSystem();
        fileSystem.addFile(fileName1, 200, fileCollection1);
        fileSystem.addFile(fileName2, 150, fileCollection2);
        fileSystem.addFile(fileName3, 120, "");

        for(Map.Entry<String, FileBehaviour> entry : fileCollectionMap.entrySet()){
            System.out.println("test addFiles method to see files & collections that have been added to file system successfully -> " + entry.getKey());
        }

        List<FileCollection> topNFiles = getTopNFiles(topNumberOfFiles);
        for(FileCollection collection : topNFiles){
            System.out.println("Test top n files in collection : " + collection.collectionName + " size : " + collection.size);
        }
        System.out.println("test total number of files are correctly computed : " + totalSizeOfFiles());

        /*
        file2.txt(size: 200) in collection "collection1"
        file3.txt(size: 200) in collection "collection1"
        file4.txt(size: 300) in collection "collection2"

        *test cases
        test that files can be added to the collection successfully
        test that files can exist without being in a collection

        test that the total no of files is accurate - red->green
        test that the top n files are return accurately by the function

        *solution plan
        create a map that can hold key-value pairs of fileName -> File && collectionName -> FileCollection
        create a maxHeap to compute the top n files
        check if the input has a collection name
            - if it does not have a collection name, then it is a file with no collection
                * store it in the map as a file object
            - if the input has a collection name, then it is a file that belongs to a collection
                * store the mapping of collectionName -> collection in the map.

            add the collections that have been built up inside the maxheap
            -the maxheap will sort the files in descending order of size
            -we can pop out the smallest collections in the heap and leave only n number of collections inside the heap.
            -compute the total size by adding all the sizes of both files in a collection and files not in a collection.

        */
    }
}
