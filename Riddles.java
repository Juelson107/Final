
public class Riddles {
    
    private String [] wordList;
    private String answer;
    private String displayWord;
    private int complete;

   
    public Riddles() {
        wordList = new String [10];
        wordList[0]= "what has to be broken before you can use it?";
        wordList[1]= "i’m tall when I’m young, and I’m short when I’m old. What am I?";
        wordList[2]= "what month of the year has 28 days?";
        wordList[3]= "what is full of holes but still holds water?";
        wordList[4]= "what question can you never answer yes to?";
        wordList[5]= "what is always in front of you but can’t be seen?";
        wordList[6]= "there’s a one-story house in which everything is yellow. Yellow walls, yellow doors, yellow furniture. What color are the stairs?";
        wordList[7]= "What can you break, even if you never pick it up or touch it?";
        wordList[8]= "What goes up but never comes down?";
        wordList[9]= "A man who was outside in the rain without an umbrella or hat didn’t get a single hair on his head wet. Why?";
       

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