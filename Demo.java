public class Demo {
    public static void main(String[] args) {

            Member member1 = new Member("Helga", "Address 1");
            Member member2 = new Member("Ivan", "Address 2");
            
            member1.deposit(500000);
            member2.deposit(1000000);
            
            System. out.println("Deposit of " + member1. getName() + ": Rp. "+ member1.getDeposit());
            System.out.println("Deposit of " + member2. getName() + ": Rp. " + member2.getDeposit());
}
}
