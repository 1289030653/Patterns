package org.eddie.corejava.innerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @Author: ShenXudong
 * @Description:
 * @Date: 2018/8/31 16:19
 */
public class TalkingClock {
    private int interval;
    private boolean beep;


    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;

    }

    public void start() {
        //ActionListener listener = new TimePrinter();
        ActionListener listener = this.new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener
    {
        //any static fields declared in an inner class must be final
        private static final String code = "1111";

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the tiem is " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
            System.out.println(TalkingClock.this.beep);
            System.out.println(code);
        }
        // inner class cannot have static methods
//        public static void hello() {
//            System.out.println("hello");
//        }
    }

    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();
        TalkingClock.TimePrinter listener = clock.new TimePrinter();

        JOptionPane.showMessageDialog(null, "quit?");
        System.exit(0);
    }
}
