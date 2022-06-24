package dafe.springframework.beerservice;

import io.micrometer.core.instrument.util.AbstractPartition;

import java.util.*;

public class FileSystem  {

    HashMap<String, FileBehaviour> fileCollectionMap = new HashMap<>();
    PriorityQueue<FileCollection> maxHeap = new PriorityQueue<>((a,b)->b.size-a.size);
    Set<FileCollection> isCollectionInHeap = new HashSet<>();

    //marker interface
    interface FileBehaviour{}

    class FileCollection implements FileBehaviour{
        String collectionName;
        int size;
        List<File> files;

        public FileCollection(String collectionName){
            this.collectionName = collectionName;
        }
    }

    class File implements FileBehaviour{
        String fileName;
        int size;
        FileCollection fileCollection;
    }

    private static List<FileCollection> addFile(String fileName, int size, String fileCollection){

        return new ArrayList<>();
    }

    private static int totalSizeOfFiles(){

        return 0;
    }

    private static List<FileCollection> getTopNFiles(int numberLimit){

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        String fileName1 = "file1.txt";
        String fileName2 = "file2.txt";
        String fileName3 = "file3.txt";
        String fileCollection1 = "collection1";
        String fileCollection2 = "collection2";
        int topNumberOfFiles = 2;
        System.out.println("Test that files can exist without a collection : " + addFile(fileName3, 120, ""));
        System.out.println("test Number of files added successfully to collection : " + addFile(fileName1, 200, fileCollection1));
        System.out.println("test Number of files added successfully to collection : " + addFile(fileName2, 200, fileCollection2));
        System.out.println("test total number of files are correctly computed : " + totalSizeOfFiles());
        System.out.println("Test top n files in collection : " + getTopNFiles(topNumberOfFiles));
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
