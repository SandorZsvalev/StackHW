public class Calculator {

    private char[] charArray;
    private MyStack<Integer> stack = new MyStack<>();
    private int i;

    public Calculator(String args) {
        this.charArray = args.toCharArray();
    }

    public int calc (){
        stack.push(0);
        for (i = 0; i < charArray.length; i++) {
            if(!ifNextIsDigit(i)){
                switch (charArray[i]){
                    case '+':{
                        continue;
                    }
                    case '-':{
                        i=i+1;
                        findNextDigit();
                        int result = stack.pop();
                        stack.push(-result);
                        continue;
                    }
                    case '*':{
                        i=i+1;
                        int a = stack.pop();
                        findNextDigit();
                        int b = stack.pop();
                        stack.push(a*b);
                        continue;
                    }
                    case '/':{
                        i=i+1;
                        int a = stack.pop();
                        findNextDigit();
                        int b = stack.pop();
                        stack.push(a/b);
                        continue;
                    }
                }
            } else {
                findNextDigit();
            }
        }
        return total();
    }

    private boolean ifNextIsDigit (int next){
        return charArray[next] != '+' && charArray[next] != '-' && charArray[next] != '*' && charArray[next] != '/';
    }

    private void findNextDigit (){
        stack.push(charArray[i]-'0');
        while ((i<charArray.length-1) && ifNextIsDigit(i+1)){
            int firstDigit = stack.pop()*10;
            int secondDigit = charArray[i+1]-'0';
            stack.push((firstDigit+secondDigit));
            i++;
        }
    }

    private int total(){
        int sum = 0;
        while (!stack.isEmpty()){
           sum += stack.pop();
        }
        return sum;
    }
}
