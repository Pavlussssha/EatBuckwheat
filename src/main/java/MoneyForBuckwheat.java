public class MoneyForBuckwheat {
    private final int eatsBuckwheatMonth = 6;// в кг
    private int totalBuckwheat = 100; // в кг
   private final int monthlyFee = 100; // рублей в месяц за хранение гречки
    private final int timeEatBuckwheat =  totalBuckwheat / eatsBuckwheatMonth; //  месяцев

    public MoneyForBuckwheat() {

}
    public static void main(String[] args){
        MoneyForBuckwheat my = new MoneyForBuckwheat();
        my.totalMoneyBuckwheat();
}
public void totalMoneyBuckwheat () {
      int  totalMoney = 0;
    for (int i = 0; i <= timeEatBuckwheat; i++) {
        int moneyEveryMonth = totalBuckwheat * monthlyFee;
        totalBuckwheat = (totalBuckwheat - eatsBuckwheatMonth);
        totalMoney = totalMoney + moneyEveryMonth;
        if (totalBuckwheat <= 0) break;
        System.out.println(" плата за " + (i + 1) + " месяц "  + " - " + moneyEveryMonth);
    }
    System.out.println(" общая сумма за хранение - " + totalMoney);
}
}
