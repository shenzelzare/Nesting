public class Nesting {
    public int solution(String S) {
        int counter=0;
        for(int i=0; i<S.length();i++){
            String s = S.substring(i,i+1);
            if(s.equals("(")){
                counter++;
            }
            else  {
                counter--;
            }
            if(counter<0){
                return 0 ;
            }
        }
        return counter ==0 ? 1 :0;
    }
    public static void main(String [] args){
        Nesting nesting = new Nesting();
        System.out.println(nesting.solution("(()(())())"));
    }
}
