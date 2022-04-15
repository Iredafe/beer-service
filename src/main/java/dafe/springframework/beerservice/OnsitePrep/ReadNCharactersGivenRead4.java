package dafe.springframework.beerservice.OnsitePrep;

public class ReadNCharactersGivenRead4 {

    public static int read(char [] buf, int n){
        int copiedChar = 0; int readChars = 4;
        char [] buf4 = new char[4];

        while(copiedChar < n && readChars<4){
            readChars = read4(buf4);

            for(int i=0; i<readChars; i++){
                if(copiedChar == readChars) return copiedChar;
            }
        }
    }
}
