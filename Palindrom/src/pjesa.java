/**
 * Created by andrey on 02.10.2015.
 */
public class pjesa {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder ();
        String [] roles= {
                "Gorodnichij","Ammos Fedorovich",
                "Artemij Filippovich",
                "Luka Lukich"};
        String [] textLines={
                "Gorodnichij: Ja priglasil vas, gospoda, s tem, chtoby soobshhit' vam preneprijatnoe izvestie: k nam edet revizor.",
                "Ammos Fedorovich: Kak revizor?",
                "Artemij Filippovich: Kak revizor?",
                "Gorodnichij: Revizor iz Peterburga, inkognito. I eshhe s sekretnym predpisan'em.",
                "Ammos Fedorovich: Vot te na!",
                "Artemij Filippovich: Vot ne bylo zaboty, tak podaj!",
                "Luka Lukich: Gospodi bozhe! eshhe i s sekretnym predpisan'em!"};

        for (int i=0;i<roles.length;i++){
            //System.out.println(roles[i]+":");
            text.append(roles[i]+":\n");
            for (int j=0;j<textLines.length;j++){
                if(textLines[j].startsWith(roles[i] + ":")){
                    textLines[j] = textLines[j].replaceFirst(roles[i]+":",j+1+")");
                    text.append(textLines[j]+"\n");
                   // System.out.println(textLines[j]);
                }
            }
            text.append("\n");
        }
        System.out.println(text);
    }
}
