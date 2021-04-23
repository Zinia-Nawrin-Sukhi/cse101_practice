public class QuizAtester{
    public static void main(String[] args){
    QuizA sc = new QuizA();
    sc.methodA();
    sc.methodA();
    }
}

public class QuizA{
    public int sum;
    public int y;
    public void methodA(){
        int x = 0;y = 0;
        y = y + this.y;
        x = this.y + 1;
        sum = x+y+methodB(x,y);
        System.out.println(x+" "+y+" ");
    }
    public int methodB(int m,int n){
        int x = 0;
        y = y+m;
        x = x+3+n;
        sum = sum+x+y;
        System.out.println(x+" "+y+" ");
        return sum;
    }
}