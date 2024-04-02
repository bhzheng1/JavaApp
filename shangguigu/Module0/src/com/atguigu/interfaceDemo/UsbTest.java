package com.atguigu.interfaceDemo;

public class UsbTest {
    public static void main(String[] args) {
        //create objects
        Computer computer = new Computer();
        Printer printer = new Printer();

        computer.transferData(printer);
        computer.transferData(new Camera());

        //temporary
        Usb usb1 = new Usb() {
            @Override
            public void start() {
                System.out.println("usb starts");
            }

            @Override
            public void stop() {
                System.out.println("usb end");
            }
        };
        computer.transferData(usb1);
    }
}


interface Usb {
    void start();

    void stop();
}

class Computer {
    public void transferData(Usb usb) {
        System.out.println("linked");
        usb.start();
        System.out.println("downloading");
        usb.stop();
    }
}

//printer driver for usb
class Printer implements Usb {

    @Override
    public void start() {
        System.out.println("printer starts");
    }

    @Override
    public void stop() {
        System.out.println("printer ends");
    }
}

class Camera implements Usb {

    @Override
    public void start() {
        System.out.println("camera starts working!");
    }

    @Override
    public void stop() {
        System.out.println("camera ends working!");
    }
}