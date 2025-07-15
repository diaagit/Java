public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at in index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        //insert
        sb.insert(3, 'n');
        System.out.println(sb);

        //delete
        sb.delete(3, 4);
        System.out.println(sb);

        //append
        sb.append("Stark");
        System.out.println(sb);
        System.out.println(sb.length());


    }
}
