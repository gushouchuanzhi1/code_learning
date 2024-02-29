package testday5;
/**定义一个方法，int数组中的元素按照指定格式拼接成一个字符串返回*/
public class test2 {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,4,5};
        String result = arrToString(arr);
        System.out.println(result);
    }
    public static String arrToString(int []arr){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }
            else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
