package chatgpt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// 範例2：使用 java.io (FileWriter、PrintWriter、BufferedReader、File) + try-with-resources
// 把加油紀錄寫成 CSV 檔，再讀回來計算總額，並示範自訂例外處理格式錯誤的資料
public class Example2_FuelLog
{
    private static final String FILE_NAME = "fuel_log.csv";

    public static void main(String[] args)
    {
        writeLog();

        try
        {
            List<FuelRecord> records = readLog();
            double totalLiters = 0;
            int totalCost = 0;

            System.out.println("=== 讀回的加油紀錄 ===");
            for (FuelRecord r : records)
            {
                System.out.println(r);
                totalLiters += r.liters;
                totalCost += r.cost;
            }

            System.out.printf("共 %d 筆，總計 %.1f 公升，%d 元，平均每公升 %.2f 元%n",
                    records.size(), totalLiters, totalCost, totalCost / totalLiters);
        }
        catch (IOException e)
        {
            System.out.println("讀檔失敗：" + e.getMessage());
        }
    }

    // try-with-resources：區塊結束時自動 close()，不必自己寫 finally
    static void writeLog()
    {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(FILE_NAME))))
        {
            pw.println("date,carNum,liters,cost");
            pw.println("2026-11-01,1234,30.5,915");
            pw.println("2026-11-08,2345,25.0,750");
            pw.println("2026-11-15,1234,abc,600");   // 故意放一筆格式錯誤的資料
            pw.println("2026-11-20,3456,40.0,1200");
            System.out.println("已寫入 " + new File(FILE_NAME).getAbsolutePath());
        }
        catch (IOException e)
        {
            System.out.println("寫檔失敗：" + e.getMessage());
        }
    }

    static List<FuelRecord> readLog() throws IOException
    {
        List<FuelRecord> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME)))
        {
            br.readLine();   // 跳過標題列
            String line;
            int lineNo = 1;
            while ((line = br.readLine()) != null)
            {
                lineNo++;
                try
                {
                    list.add(FuelRecord.parse(line));
                }
                catch (BadRecordException e)
                {
                    System.out.println("第 " + lineNo + " 行略過：" + e.getMessage());
                }
            }
        }
        return list;
    }
}

class FuelRecord
{
    final String date;
    final int carNum;
    final double liters;
    final int cost;

    FuelRecord(String date, int carNum, double liters, int cost)
    {
        this.date = date;
        this.carNum = carNum;
        this.liters = liters;
        this.cost = cost;
    }

    static FuelRecord parse(String line) throws BadRecordException
    {
        String[] f = line.split(",");
        if (f.length != 4)
            throw new BadRecordException("欄位數量不對 → " + line);
        try
        {
            return new FuelRecord(f[0], Integer.parseInt(f[1]),
                    Double.parseDouble(f[2]), Integer.parseInt(f[3]));
        }
        catch (NumberFormatException e)
        {
            throw new BadRecordException("數字格式錯誤 → " + line);
        }
    }

    @Override
    public String toString()
    {
        return date + " 車號" + carNum + " 加了 " + liters + " 公升，" + cost + " 元";
    }
}

// 自訂例外 (對應講義 CH5 的 CarException)
class BadRecordException extends Exception
{
    BadRecordException(String msg)
    {
        super(msg);
    }
}
