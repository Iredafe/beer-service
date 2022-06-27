package dafe.springframework.beerservice;

public class FileSystem {

    private static void addFileToSystem(String fileName, int fileSize, String collectionName){

    }


    public static void main(String[] args) {
       // file2.txt(size: 200) in collection "collection1"
    addFileToSystem("file1.txt", 200, "collection1");
    addFileToSystem("file2.txt", 130, "");
    addFileToSystem("file3.txt", 300, "collection2");
    addFileToSystem("file4.txt", 170, "collection3");
    addFileToSystem("file5.txt", 250, "");

        //total files = 1250
        //top 2 collection = collection2=300 & collection1 = 200

        addFileToSystem("file1.txt", 200, "collection1");
        addFileToSystem("file2.txt", 130, "");
        addFileToSystem("file3.txt", 300, "collection2");
        addFileToSystem("file4.txt", 170, "collection1");
        addFileToSystem("file5.txt", 250, "");

        //total files = 1250
        //top 2 collection = collection2=370 & collection2 = 300

    }
}
