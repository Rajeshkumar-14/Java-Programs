abstract class bank {
    bank() {
        System.out.println("Deposited...");
    }

    abstract void run();

    void credited() {
        System.out.println("Credited...");
    }

}

class sbi extends bank {
    void run() {
        System.out.println("From SBI BANK");
    }
}

class Cub extends bank {
    void run() {
        System.out.println("From CUB BANK");
    }
}

class abstract_bank {

    public static void main(String args[]) {
        sbi cb = new sbi();
        cb.run();
        cb.credited();
    }

}
