# Java Homework 3 (CH3 / CH4 / CH5)

應用軟體實習 HW3：講義範例程式重新撰寫 + 3 個 ChatGPT 範例程式。

## 目錄結構

每一頁投影片放在獨立的 package（`ch章節.p頁碼`），避免多個範例都定義 `Car` 類別而衝突。

| 題目 | 資料夾 | 投影片頁碼 |
|---|---|---|
| 1. CH3 類別 | `src/ch3/` | P5, 6, 7, 9, 11, 12, 14, 15, 16, 17, 20, 22, 24, 26, 27, 28, 31, 34, 36, 37, 38, 40, 43, 45, 47, 51 |
| 2. CH4 繼承與介面 | `src/ch4/` | P4, 6, 9, 11, 14, 17, 24, 25, 26, 29, 32, 38, 41 |
| 3. CH5 套件、例外、I/O、執行緒 | `src/ch5/` | P6, 8, 10, 14, 19, 21, 24, 26, 30, 32, 34, 35, 36, 40, 44, 45, 46, 47, 48, 50, 52, 55 |
| 4. ChatGPT 範例 | `src/chatgpt/` | `java.util`、`java.io`、`java.awt` + `java.awt.event` |

### ChatGPT 範例

| 檔案 | 使用的類別 | 內容 |
|---|---|---|
| `Example1_CarFleet.java` | `java.util`：ArrayList、HashMap、Collections、Comparator、Random | 車隊管理：排序、依車種統計、找出需要加油的車 |
| `Example2_FuelLog.java` | `java.io`：FileWriter、PrintWriter、BufferedReader、File | 加油紀錄 CSV 讀寫、try-with-resources、自訂例外 |
| `Example3_FuelCalculatorGUI.java` | `java.awt`、`java.awt.event`：Frame、Button、TextField、Choice、ActionListener、WindowAdapter | 油耗計算機視窗程式 |

## 編譯與執行

在 `HW3` 資料夾下：

```bash
# 編譯全部
javac -encoding UTF-8 -d out $(find src -name "*.java")

# 執行範例（類別名稱要加 package）
java -cp out ch3.p05.Sample3_1
java -cp out ch4.p29.Sample4_10
java -cp out ch5.p40.Sample5_9 test3.txt     # 命令列引數範例
java -cp out chatgpt.Example3_FuelCalculatorGUI
```

Windows 主控台若中文亂碼，可加上 `-Dstdout.encoding=UTF-8` 或先執行 `chcp 65001`。

## 注意事項

- `ch5.p19.Sample5_1`、`ch5.p32.Sample5_5` 會因例外而中止，這是講義要示範的結果。
- `ch5.p36.Sample5_8` 會讀取 `test1.txt`，要先執行 `ch5.p35.Sample5_7` 產生這個檔案。
- `ch5.p52.Sample6_7` 沒有同步化，每次執行結果可能不同；`ch5.p55.Sample6_8` 加上 `synchronized` 後合計一定是 300 元。
- CH5 P6 講義的 `show()` 把汽油量印成 `num`，這裡已改成 `gas`。
