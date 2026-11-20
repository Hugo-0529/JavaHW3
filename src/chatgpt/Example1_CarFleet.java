package chatgpt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

// 範例1：使用 java.util (ArrayList、HashMap、Collections、Comparator、Random)
// 以講義的 Car 為基礎，用集合類別取代固定大小的 Car[] 陣列來管理車隊
public class Example1_CarFleet
{
    public static void main(String[] args)
    {
        List<Car> fleet = new ArrayList<>();   // 長度可變，不必事先決定陣列大小
        Random random = new Random(42);        // 固定種子，每次執行結果相同

        String[] types = {"轎車", "賽車", "卡車"};
        for (int i = 0; i < 6; i++)
        {
            int num = 1000 + i * 111;
            double gas = Math.round(random.nextDouble() * 600) / 10.0;   // 0.0 ~ 60.0
            fleet.add(new Car(num, gas, types[i % types.length]));
        }

        System.out.println("=== 原始車隊 ===");
        for (Car c : fleet)
        {
            System.out.println(c);
        }

        // 依汽油量由多到少排序
        Collections.sort(fleet, Comparator.comparingDouble(Car::getGas).reversed());
        System.out.println("\n=== 依汽油量排序 ===");
        fleet.forEach(System.out::println);

        // 用 HashMap 依車種分組統計
        Map<String, Integer> countByType = new HashMap<>();
        Map<String, Double> gasByType = new HashMap<>();
        for (Car c : fleet)
        {
            countByType.merge(c.getType(), 1, Integer::sum);
            gasByType.merge(c.getType(), c.getGas(), Double::sum);
        }

        System.out.println("\n=== 依車種統計 ===");
        for (String type : countByType.keySet())
        {
            System.out.printf("%s：%d 台，總汽油量 %.1f 公升%n",
                    type, countByType.get(type), gasByType.get(type));
        }

        // 找出需要加油 (少於 20 公升) 的車
        System.out.println("\n=== 需要加油的車 ===");
        fleet.stream()
             .filter(c -> c.getGas() < 20)
             .forEach(c -> System.out.println("車號 " + c.getNum() + " 只剩 " + c.getGas() + " 公升"));
    }
}

class Car
{
    private final int num;
    private final double gas;
    private final String type;

    public Car(int num, double gas, String type)
    {
        this.num = num;
        this.gas = gas;
        this.type = type;
    }

    public int getNum()     { return num; }
    public double getGas()  { return gas; }
    public String getType() { return type; }

    @Override
    public String toString()
    {
        return String.format("[%s] 車號:%d 汽油量:%.1f", type, num, gas);
    }
}
