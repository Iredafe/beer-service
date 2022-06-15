package dafe.springframework.beerservice.Grokking;

import io.micrometer.core.instrument.util.AbstractPartition;
import org.apache.tomcat.jni.Directory;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFileSizeFromCollections {

    static int totalSizeOfFiles;
    PriorityQueue<Directory> directoryPriorityQueue;

    public TopKFileSizeFromCollections(){
        directoryPriorityQueue = new PriorityQueue<Directory>((a, b)-> b.size - a.size);

    }

    private static int getTotalSize(){
        return totalSizeOfFiles;
    }

    private static List<Directory> getTopNCollections(int n){

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
        org.apache.tomcat.jni.Directory directory;

        public File(String fileName, int size){
            this.fileName=fileName;
            this.size=size;
        }

        public File(String fileName, int size, org.apache.tomcat.jni.Directory directory){
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


