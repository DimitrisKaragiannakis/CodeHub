public class Utilities {

    public int getFirstRepeatedCharacter(String str) {
        int position = -1;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    position = i;
                }
            }
        }
        return  position ;
    }

    //---------------------------------------------------------------------------

    public void goDownToOne(int startNumber){

        int num = startNumber;

        while(num>1){
            System.out.println(num);

            if(num % 2 == 0){
                num = num / 2;
            }
            else{
                num = num * 2 + 1;
            }
        }
    }

    //---------------------------------------------------------------------------
}
