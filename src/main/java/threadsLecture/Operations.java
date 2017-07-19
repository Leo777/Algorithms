package threadsLecture;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.concurrent.TimeUnit;

public class Operations {
    public static void main(String[] args) throws IcufitienFundsException, InterruptedException {
        final Account account1 = new Account(1000);
        final Account account2 = new Account(2000);

        new Thread(new Runnable() {
            public void run() {
                try {
                    transfer(account1,account2,500);
                } catch (IcufitienFundsException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Transfer Succesfully");

            }
        }).start();
        transfer(account2, account1, 300);
        System.out.println("Transfer Successful2");
        System.out.println("Balance Account 1: "     +account1.getBalance());
        System.out.println("Balance Account 2: " +account2.getBalance());
    }

    private static void transfer(Account account1, Account account2, int amount) throws IcufitienFundsException, InterruptedException {
        if(account1.getLock().tryLock(1, TimeUnit.SECONDS)){
            try {
                if(account2.getLock().tryLock(1,TimeUnit.SECONDS)){
                    try{
                        if(account1.getBalance()<amount){
                            throw new IcufitienFundsException();
                        }
                        account1.withdraw(amount);
                        account2.deposit(amount);
                    }finally {
                        account2.getLock().unlock();
                    }
                }


            }finally {
                account1.getLock().unlock();
            }
        }else {
            System.out.println("Waiting Lock");
        }

    }
}
