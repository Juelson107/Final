
public class Words {
    
    private String [] wordList;
    private String answer;
    private String displayWord;
    private int complete;

   
    public Words() {
        wordList = new String [20];
        wordList[0]= "abcdefghijklmnopqrstuvwxyz";
        wordList[1]= "abcdefghijklmnopqrstuvwxyz";
        wordList[2]= "abcdefghijklmnopqrstuvwxyz";
        wordList[3]= "abcdefghijklmnopqrstuvwxyz";
        wordList[4]= "abcdefghijklmnopqrstuvwxyz";
        wordList[5]= "abcdefghijklmnopqrstuvwxyz";
        wordList[6]= "abcdefghijklmnopqrstuvwxyz";
        wordList[7]= "abcdefghijklmnopqrstuvwxyz";
        wordList[8]= "abcdefghijklmnopqrstuvwxyz";
        wordList[9]= "abcdefghijklmnopqrstuvwxyz";
        wordList[10]= "abcdefghijklmnopqrstuvwxyz";
        wordList[11]= "abcdefghijklmnopqrstuvwxyz";
        wordList[12]= "abcdefghijklmnopqrstuvwxyz";
        wordList[13]= "abcdefghijklmnopqrstuvwxyz";
        wordList[14]= "abcdefghijklmnopqrstuvwxyz";
        wordList[15]= "abcdefghijklmnopqrstuvwxyz";
        wordList[16]= "abcdefghijklmnopqrstuvwxyz";
        wordList[17]= "abcdefghijklmnopqrstuvwxyz";
        wordList[18]= "abcdefghijklmnopqrstuvwxyz";
        wordList[19]= "abcdefghijklmnopqrstuvwxyz";

        complete = 0;

        
        System.out.println(wordList[2]);
        answer = wordList[getRandomNumber() ];
        System.out.println(answer);

    
answer=getRandomWord();
displayWord= setDisplayWord();
System.out.println(answer);

    }

 



 

 

private String setDisplayWord() {

 

// TODO Auto-generated method stub
String s="";

 


for(int i=0; i<answer.length(); i++) {
if(answer.charAt(i)==' ') {
s+=" ";
}
else {
s+="-";
}
}

 

return s;
}

 


public int getRandomNumber() {
return (int)(Math.random()*(wordList.length -1-0))+0 +1 ;
}

 

public String getRandomWord() {
return wordList[getRandomNumber()];
}

 


public String getDisplayWord() {
return displayWord;
}

 


public boolean checkGuess(char c) {
boolean correct =false;
for(int i=0; i<answer.length(); i++) {

 


if(Character.toLowerCase(answer.charAt(i))==c) {

 

 

correct = true;
displayWord = displayWord.substring(0,i)+ c + displayWord.substring(i + 1);
}
}
return correct;

 


}


public void finish(int value) {
    complete += value;
}
public void setComplete(int value) {
    complete = value;
    System.out.println(wordList[2]);
        answer = wordList[getRandomNumber() ];
        System.out.println(answer);

    
answer=getRandomWord();
displayWord= setDisplayWord();
System.out.println(answer);

}
public int getComplete() {
    return complete;
}
public void changecomplete(int c) {
    complete += c;
}



}