package dafe.springframework.beerservice;

public class FileSystem {

    class File{
        String fileName;
        int fileSize;
        FileDirectory fileDirectory;

        public File(String fileName, int fileSize){

        }

    }
    private static void addFileToSystem(String fileName, int fileSize, String collectionName){


    }


    public static void main(String[] args) {
        FileSystem fileSystem1 = new FileSystem();
       // file2.txt(size: 200) in collection "collection1"
        fileSystem1.addFileToSystem("file1.txt", 200, "collection1");
        fileSystem1.addFileToSystem("file2.txt", 130, "");
        fileSystem1.addFileToSystem("file3.txt", 300, "collection2");
        fileSystem1.addFileToSystem("file4.txt", 170, "collection3");
        fileSystem1.addFileToSystem("file5.txt", 250, "");

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
