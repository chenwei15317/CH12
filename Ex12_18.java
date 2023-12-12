public class Ex12_18 {
    public static void main(String[] args) {

        String N = "45874356676541331";

        try {

            long longN = Long.parseLong(N);

            System.out.println("轉換後的long值:" + longN);
        } 
        catch (NumberFormatException e) {
            System.out.println("無法轉換成long型態，請確認字串格式是否正確。");
        }
    }
}
