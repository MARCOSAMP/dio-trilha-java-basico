public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(23);
        
        System.out.println("Tv ligada? "+smartTv.ligada);
        System.out.println("Canal atual? "+smartTv.canal);
        System.out.println("Volume Atual? "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada? "+smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual? "+smartTv.volume);

    }
}
