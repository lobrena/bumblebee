package FHJ.GEB24;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        int[] numbers = {5, 3, 8, 2, 1};
        BubbleSort(numbers);

        // Ausgabe
        for (int n : numbers) {
            System.out.print(n + " ");
        }

    }
    // AUFGABE 1
    public static void BubbleSort(int[]a){
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < a.length - 1; i ++){
                if (a[i] > a[i+1]){
                    int t = a[i]; a[i] = a[i + 1]; a[i + 1] = t;
                    swapped = true;
                }
            }

        }
        while (swapped);
    }
}