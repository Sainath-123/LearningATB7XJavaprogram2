package exe_27082024;

public class Lab147 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "PRAMOD";
        s1 = "Dutta";

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // change the value of string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta
        stringBuffer.append("JI"); //PramodDutta
        System.out.println(stringBuffer);
        StringBuilder sai = new StringBuilder("Amit");
        sai.append("Sharma");
        System.out.println(sai);

        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)


    }
}
