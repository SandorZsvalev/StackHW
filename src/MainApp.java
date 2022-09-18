public class MainApp {

    public static void main(String[] args) {

        /*
First level: Написать свой класс Stack(назвать как удобнее) в котором, в качестве структуры хранения данных
использовать класс Node по аналогии с LinkedList.
Класс должен иметь методы push,pop,peek,empty , а также метод printStack
который может выводить все содержимое стека в консоль
,начиная с вершины стека и до его начала.


Second level: Написать базовый калькулятор, способный вычислять элементарные действия.
Входные данные - строка вида "4+42", в строке могут быть числа от 0 до 9, операции +,-,,/
На данном этапе не нужно использовать двух и более значные числа во входной строке, только в диапазоне от 0 до 9.
         */

        MyStack <String> stringMyStack = new MyStack<>();
        System.out.println(stringMyStack.isEmpty());
        stringMyStack.push("one");
        stringMyStack.push("two");
        stringMyStack.push("three");
        stringMyStack.push("four");

        stringMyStack.printStack();
        System.out.println(" ");
        System.out.println("peek method: "+stringMyStack.peek());
        System.out.println(" ");
        stringMyStack.printStack();
        System.out.println(" ");
        System.out.println("pop method: "+stringMyStack.pop());
        System.out.println(" ");
        stringMyStack.printStack();


        System.out.println("\n Калькулятор");
        String sum = "100-50*5";
        Calculator calculator = new Calculator(sum);
        System.out.println(calculator.calc());
    }

}
