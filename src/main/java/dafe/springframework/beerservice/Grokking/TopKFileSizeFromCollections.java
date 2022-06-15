package dafe.springframework.beerservice.Grokking;

public class TopKFileSizeFromCollections {


    private static Lis<Directory> addFileToDirectory(){

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
