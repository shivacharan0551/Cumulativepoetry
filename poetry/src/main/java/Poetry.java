 class Poetry {

    String[] arr =null;

    Poetry() {
        arr = new String[]{"the house that Jack built \n",
                "the malth that lay in \n",
                "the rat that ate \n",
                "the cat that killed \n",
                "the dog that worried \n",
                "that cow with the crumpled horn that tossed \n",
                "the maiden all forlorn that milked \n",
                "the man all tattered and torn that kissed \n",
                "the priest all shaven and shorn that married \n",
                "the rooster that crowed in the morn that woke \n",
                "the farmer sowing his corn that kept \n",
                "the horse and the hound and the horn that belonged to \n"};
    }

    public String revealForDay(int day) {
        String poem= "This is ";
        poem = poem + arr[day-1];
       // System.out.println("This is " + arr[day - 1]);
        for (int i = day - 2; i >= 0; i--) {
          //  System.out.println(arr[i]);
            poem += arr[i];
        }
        return poem;
    }

    public String recite()
    {
        String completePoem="";
        for(int i=0;i< arr.length;i++)
        {
            int j=i+1;
            completePoem += "Day "+ j +"- \n";
          //  System.out.println("Day "+ j +"- \n");
           completePoem += revealForDay(i+1);
        }
        return completePoem;
    }

     public static void main(String[] args) {

         //Poetry poetryobject = new Poetry();
         Poetry poetry = new Poetry();

         String str1 = "--reveal-for-day";
         String str2 = "--recite";


         if (args[0].equals(str1)) {
             int dayNo = Integer.parseInt(args[1]);
            System.out.println( poetry.revealForDay(dayNo) );

         } else if (args[0].equals(str2)) {
            System.out.println( poetry.recite() );
         }
     }


}