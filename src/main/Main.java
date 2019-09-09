package main;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class Main {
    LocalDate Arrival;
    LocalDate Departure;
    LocalDate today;
    double totalMoney;
    double moneyLeft;
    public static void main(String[] args){
        Main main = new Main();

    }
    Main(){
        JFrame mainFrame = new JFrame();
        JPanel panel = new JPanel();
        JTextField destFArrived = new JTextField("Date of arrival(xx/x/xxxx): ");
        JTextField tFArrived = new JTextField();
        JTextField destFDepart = new JTextField("Date departing(xx/x/xxxx): ");
        JTextField tFDepart = new JTextField();
        JTextField destFTotalMoney = new JTextField("Total money: ");
        JTextField tFTotalMoney = new JTextField();
        JTextField destFMoneyLeft = new JTextField("Money left: ");
        JTextField tfMoneyLeft = new JTextField();
        JButton calculate = new JButton("Calculate");
        destFArrived.setEditable(false);
        destFDepart.setEditable(false);
        destFMoneyLeft.setEditable(false);
        destFTotalMoney.setEditable(false);
        tFArrived.setPreferredSize(new Dimension(40,20));
        tFDepart.setPreferredSize(new Dimension(40,20));
        tFTotalMoney.setPreferredSize(new Dimension(60,20));
        tfMoneyLeft.setPreferredSize(new Dimension(60,20));
        panel.add(destFArrived);
        panel.add(tFArrived);
        panel.add(destFDepart);
        panel.add(tFDepart);
        panel.add(destFTotalMoney);
        panel.add(tFTotalMoney);
        panel.add(destFMoneyLeft);
        panel.add(tfMoneyLeft);
        panel.add(calculate);
        mainFrame.add(panel);

        mainFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        mainFrame.setVisible(true);
        calculate.addActionListener(e -> {
            /*
            String[] ArrivalDate = tFArrived.getText().split("/");
            String[] DepartureDate = tFDepart.getText().split("/");
            Arrival = LocalDate.of(Integer.parseInt(ArrivalDate[2]), Integer.parseInt(ArrivalDate[1]),Integer.parseInt(ArrivalDate[0]));
            Departure = LocalDate.of(Integer.parseInt(DepartureDate[2]),Integer.parseInt(DepartureDate[1]),Integer.parseInt(DepartureDate[0]));
            today = LocalDate.now();
            totalMoney = Double.parseDouble(tFTotalMoney.getText());
            moneyLeft = Double.parseDouble(tfMoneyLeft.getText());

             */

            System.out.println(compareDates(LocalDate.of(2016,1,1),LocalDate.of(2017,1,1)));

        });





    }
    private int compareDates(LocalDate start, LocalDate end){
        int days = 0;
        for(int i = start.getYear(); i< end.getYear();i++){
            LocalDate tempDate = LocalDate.of(i,1,1);
            if(tempDate.isLeapYear()){
                days+=366;

            } else {
                days+=365;
            }

        }

        return days;
    }
}
