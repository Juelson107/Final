
public class Answers {
    
    private String [] wordList;
    private String answer;
    private String displayWord;
    private int complete;

   
    public Answers() {
        wordList = new String [10];
        wordList[0]= "an egg";
        wordList[1]= "a candle";
        wordList[2]= "all of them";
        wordList[3]= "a sponge";
        wordList[4]= "are you asleep yet?";
        wordList[5]= "the future";
        wordList[6]= "there aren’t any—it’s a one-story house.";
        wordList[7]= "a promise";
        wordList[8]= "your age";
        wordList[9]= "he was bald.";
        

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