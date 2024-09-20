public class Main {
    public static void main(String[] args) {
        Ciudad neiva = new Ciudad();

        neiva.setNombre("Huila");
        neiva.setPoblacion(142445);
        neiva.setPais("Colombia");
        neiva.setPresidente("Petro");

        System.out.println("Cuidad: " + neiva.getNombre());
        System.out.println("Población:" + neiva.getPoblacion());
        System.out.println("País: " + neiva.getPais());
        System.out.println("Presidente: " + neiva.getPresidente());

    }
}