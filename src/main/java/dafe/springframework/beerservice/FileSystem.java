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
    }

    public static void main(String[] args) {
        System.out.println("Hello World");


        /*

        *test cases
        test that files can be added to the collection successfully
        test that files can exist without being in a collection

        test that the total no of files is accurate - red->green
        test that the top n files are return accurately by the function

        */
    }
}
