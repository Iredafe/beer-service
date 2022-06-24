package dafe.springframework.beerservice;

import java.util.List;

public class FileSystem  {


    class File{
        String fileName;
        int size;
        FileCollection collection;

        public File(String fileName, int size){
            this.fileName = fileName;
            this.size=size;
        }

        public File(String fileName, int size, FileCollection collection){
            this.fileName=fileName;
            this.size=size;
            this.collection=collection;
        }
    }

    class FileCollection{
     String collectionName;
     int size;
     List<File> files;

     public FileCollection(String collectionName){
         this.collectionName=collectionName;
     }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        String fileName1 = "file1.txt";
        String fileName2 = "file2.txt";
        System.out.println("Number of files in collection : " + addFile(fileName1, 200, collection1));
        System.out.println("Number of files in collection : " + addFile(fileName2, 200, collection1));
        /*
file2.txt(size: 200) in collection "collection1"
file3.txt(size: 200) in collection "collection1"
file4.txt(size: 300) in collection "collection2"

        *test cases
        test that files can be added to the collection successfully
        test that files can exist without being in a collection

        test that the total no of files is accurate - red->green
        test that the top n files are return accurately by the function

        */
    }
}
