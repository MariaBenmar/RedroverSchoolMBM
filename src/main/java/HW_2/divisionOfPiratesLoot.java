package HW_2;

public class divisionOfPiratesLoot {
    public static void main(String[] args) {
        //По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану,
        // остальное делится поровну между всеми членами команды, включая капитана.
        //Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
        //Вывести на экран кому сколько пиастров полагается
        //Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?

        int pirates  = 8;
        int loot = 100;
        int ownerLoot = loot / 2;
        int captainLoot = (loot - ownerLoot) / 2;
        int teamLoot = (loot - ownerLoot - captainLoot) / (pirates + 1);
        captainLoot = captainLoot + teamLoot;
        int sumLoot = ownerLoot + captainLoot + teamLoot * pirates;
        int remaining = loot - sumLoot;

        System.out.println("Owner gets " + ownerLoot );
        System.out.println("Captain gets " + captainLoot);
        System.out.println("Each of " + pirates + " the team members gets " + teamLoot);
        System.out.println("If the owner of the boat Jack Vorobey then he gets "+ (ownerLoot + captainLoot));
        System.out.println("The money is for drinking "+ remaining);
        System.out.println("The loot " + loot + " is divided by equally? " + ((sumLoot + remaining) ==  loot));
    }
}
