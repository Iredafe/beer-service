package dafe.springframework.beerservice;

import io.micrometer.core.instrument.util.AbstractPartition;

import java.util.ArrayList;
import java.util.List;

public class FileSystem  {

    class FileCollection{
        String collectionName;
        int size;
        List<File> files;

        public FileCollection(String collectionName){
            this.collectionName = collectionName;
        }

    }

    class File{
        String fileName;
    }
    private static List<FileCollection> addFile(String fileName, int size, String fileCollection){

        return new ArrayList<>();
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

        System.out.println("Test that files can exist without a collection : " + addFile(fileName3, 120, ""));
        System.out.println("test Number of files added successfully to collection : " + addFile(fileName1, 200, fileCollection1));
        System.out.println("test Number of files added successfully to collection : " + addFile(fileName2, 200, fileCollection2));

        System.out.println("Test top n files in collection : " + getTopNFiles(n));
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
