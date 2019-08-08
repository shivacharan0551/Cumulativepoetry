 class CumulativePoetry {


    public static void main(String[] args) {

        //Poetry poetryobject = new Poetry();
        Poetry poetry = new Poetry();

        String str1 = "--reveal-for-day";
        String str2 = "--recite";


        if (args[0].equals(str1)) {
            int dayNo = Integer.parseInt(args[1]);
            poetry.revealForDay(dayNo);

        } else if (args[0].equals(str2)) {
            poetry.recite();
        }
    }
}
