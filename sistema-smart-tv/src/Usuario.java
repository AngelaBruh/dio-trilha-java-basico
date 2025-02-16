public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarTv = new SmartTv();

        System.out.println("TV Ligada? " + smarTv.ligada);
        System.out.println("Canal Atual? " + smarTv.canal);
        System.out.println("Volume Atual? " + smarTv.volume);
        
    }
}
