import java.util.LinkedHashMap;

public class CharCounter {

    public static void main(String[] args) {
        charcounter("sedanur akkoyun");
    }

    private static void charcounter(String msg) {
        LinkedHashMap<Object,Integer> count = new LinkedHashMap<>();
        Integer counter = 0;

        for(int i = 0; i<msg.length(); i++){
            char key = msg.charAt(i);
            counter = count.get(key);
            if(counter == null){
                count.put(key,1);
            }
            else {
                count.put(key,counter+1);
            }
        }

        count.forEach((key, value) -> System.err.print(key+""+value));
    }
}
