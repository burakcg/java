package work4;
public class SAS extends Hero implements Score, AVG {

    public SAS(int i, String ash, String s) {
        super(i, ash);
    }

    public enum Voice {
        TERMİTE("EXPLOSİON"),
        ASH("BOOOM"),
        TECHER("DİSABLE"),
        SLEGE("BAM BAM");

        private final String voiceStyle;

        Voice(String voiceStyle) {
            this.voiceStyle = voiceStyle;
        }

        public String getVoiceStyle() {
            return this.voiceStyle;
        }

    }
    public Voice voice;
    public int kd;


        public SAS(int age, String name, Voice voice, int kd) {
            super(age, name);
            this.voice = voice;
            this.kd = kd;
    }

    @Override
    public double avg() {
    return kd*headshot;
    }

    @Override
    public double puan() {
        return a*avg();
    }
}
