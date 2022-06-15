package dafe.springframework.beerservice.Grokking;

import io.micrometer.core.instrument.util.AbstractPartition;

import java.util.ArrayList;
import java.util.List;

public class TopKFileSizeFromCollections {

    static int totalSizeOfFiles;

    class Directory{
        String directoryName;
        List<File> files;
        int size;

        public Directory(String name, int size){
            this.directoryName = name;
            this.size = size;
            files = new ArrayList<>();
        }
    }

    class File{
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


    private static int getTotalSize(){
        return totalSizeOfFiles;
    }

    private static List<Directory> addFileToDirectory(String fileName, int size, String directoryName){

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        TopKFileSizeFromCollections topKFileSizeFromCollections = new TopKFileSizeFromCollections();


        topKFileSizeFromCollections.addFileToDirectory("file1.txt", 100, "");
        topKFileSizeFromCollections.addFileToDirectory("file2.txt", 100, "collection1");
        topKFileSizeFromCollections.addFileToDirectory("file3.txt", 200, "collection1");
        topKFileSizeFromCollections.addFileToDirectory("file4.txt", 300, "collection3");
        topKFileSizeFromCollections.addFileToDirectory("file5.txt", 400, "collection4");
    }
}
