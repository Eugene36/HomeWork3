package Builder;

public class Computer {
    private final String cpu;
    private final String motherboard;

    private final String display;
    private final String keyboard;
    private final String mouse;

    private Computer(ComputerBuilder builder){
        this.cpu = builder.cpu;
        this.motherboard = builder.motherboard;
        this.display = builder.display;
        this.keyboard = builder.keyboard;
        this.mouse = builder.mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", display='" + display + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }

    public static class ComputerBuilder{
        private final String cpu;
        private final String motherboard;

        private String display;
        private String keyboard;
        private String mouse;

        public ComputerBuilder(String cpu, String motherboard){
            this.cpu = cpu;
            this.motherboard = motherboard;
        }

        public ComputerBuilder addDisplay(String display){
            this.display = display;
            return this;
        }

        public ComputerBuilder addKeyboard(String keyboard){
            this.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder addMouse(String mouse){
            this.mouse = mouse;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

}
