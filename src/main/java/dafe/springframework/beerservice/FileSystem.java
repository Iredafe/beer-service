package dafe.springframework.beerservice;

import java.util.*;

public class FileSystem {

/*
sys stores files in different collections, we want to understand where the resources are being taken up

file1.txt (size: 100)
file2.txt (size: 200) in collection "collection1"
file3.txt (size: 200) in collection "collection1"
file4.txt (size: 300) in collection "collection2"
file5.txt (size: 10)


files - 100 + 200+ 200+ 300 + 10
collection - if n = 1 . top n collection = 200 + 200 = 400 -> collection

output the total size of all the file - (return int totalSizeOfFiles)
output the top N number of collections - (return String collectionName)
where N - any number that a user can define.

file1.txt (size: 500)
file2.txt (size: 200) in collection "collection1"
file3.txt (size: 200) in collection "collection1"
file4.txt (size: 300) in collection "collection2"
file5.txt (size: 1000)

//solution plan
check the input if it has a collection name
-if it does, create a FileCollection, build the files & sizes into the collection
- if it does not have a collection name, create a file object without a collection name
- keep track of the files without a collection -> fileName - File
- keep track of the files with a collection -> collectionName - FileCollection
-use a map for this
- use a maxheap to keep track of the largest n numbers as you iterate through
-get total size by always adding the file size of any file you encounter
-keep track of the size in each collection


Acceptance criteria

-if the files without a collection are larger than the files in a collection, the top n collection would still be the highest among the collections
-if the collection has multiple files, consider the collection of all the sizes in the different files contained in the collection
-we want to find the total number of files regardless of what collection they belong to

 */
    static HashMap<String, FileBehaviour> fileBehaviourMap = new HashMap<>();
    static PriorityQueue<FileCollections> maxHeap = new PriorityQueue<>((a,b)->b.size-a.size);
    static Set<FileCollections> set = new HashSet<>();
    static int totalSize = 0;


    interface FileBehaviour{}

    static class FileCollections implements FileBehaviour{
        String collectionName;
        int size;
        List<File> fileList;

        public FileCollections(String collectionName){
            this.collectionName = collectionName;
            this.size=0;
            this.fileList = new ArrayList<>();
        }

    }

   static class File implements FileBehaviour{
        String fileName;
        int fileSize;
        FileCollections fileCollections;

        public File(String fileName, int size){
            this.fileName = fileName;
            this.fileSize = size;
        }

        public File(String fileName, int size, FileCollections collections){
            this.fileName=fileName;
            this.fileSize = size;
            this.fileCollections = collections;
        }
    }
    private static int getTotalSizeOfFiles(){

        return totalSize;
    }

    private static List<FileCollections> getTopNCollections(int number){

        PriorityQueue<FileCollections> tempMaxHeap = new PriorityQueue<>((a,b)->b.size-a.size);

        List<FileCollections> topFileCollections = new ArrayList<>();
        for (int index = 0; index < number; index++){
           FileCollections fileCollections = maxHeap.poll();
           topFileCollections.add(fileCollections);
           tempMaxHeap.add(fileCollections);
        }

        for (int index=0; index<number;index++){
            maxHeap.add(tempMaxHeap.poll());
        }

        return topFileCollections;
    }

    private static void addFileToSystem(String fileName, int size, String collectionName){
        File file;
        if(collectionName.equals("")){
            file = new File(fileName, size);
            fileBehaviourMap.put(fileName, file);
        }else{
            FileCollections collection = (FileCollections) fileBehaviourMap.getOrDefault(collectionName, new FileCollections(collectionName));
            file = new File(fileName, size, collection);
            collection.size += size;
            collection.fileList.add(file);

            if(!set.contains(collection)){
                set.add(collection);
                maxHeap.add(collection);
            }
            fileBehaviourMap.put(collectionName, collection);
        }
        totalSize += size;
    }

    public static void main(String[] args) {

        FileSystem fileSystem = new FileSystem();
    /*
    file1.txt (size: 500)
file2.txt (size: 200) in collection "collection1"
file3.txt (size: 200) in collection "collection1"
file4.txt (size: 300) in collection "collection2"
file5.txt (size: 1000)
     */

        int N = 1;
        fileSystem.addFileToSystem("file1.txt", 500, "");
        fileSystem.addFileToSystem("file2.txt", 200, "collection1");
        fileSystem.addFileToSystem("file3.txt", 200, "collection1");
        fileSystem.addFileToSystem("file4.txt", 300, "collection2");
        fileSystem.addFileToSystem("file5.txt", 1000, "");

        //total file size -> 2200
        //top 1 collection - > collection1
        List<FileCollections> topNCollection = getTopNCollections(N);

        for (FileCollections collections : topNCollection){
            System.out.println("top " + N + " collection(s) : " + collections.collectionName);
            System.out.println("top " + N + " collection(s) : " + collections.collectionName);
        }

        System.out.println("total number of files : " + getTotalSizeOfFiles());
 System.out.println("total number of files : " + getTotalSizeOfFiles());
        System.out.println("total number of files : " + getTotalSizeOfFiles());


    }
}
