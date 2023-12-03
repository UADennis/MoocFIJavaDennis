package FlightControl;

import FlightControl.logic.Logico;
import FlightControl.ui.Ui;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanno = new Scanner(System.in);
        Logico tes = new Logico();
        Ui test = new Ui(scanno, tes);
        test.start();
    }
}
