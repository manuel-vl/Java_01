public class Main {
    // Metodo de entrada de la aplicacion
    public static void main(String[] args){
        String[] cities={
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "Sao Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio"
        };

        int [][] temperatures={
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        int tempMax = Integer.MIN_VALUE; // Inicializar con el valor mínimo posible
        int tempMin = Integer.MAX_VALUE; // Inicializar con el valor máximo posible
        int maxIndex = 0;
        int minIndex = 0;

        for(int i=0; i<temperatures.length; i++){
            int minTempCity=temperatures[i][0];
            int maxTempCity=temperatures[i][1];

            if(minTempCity<tempMin){
                tempMin=minTempCity;
                minIndex=i;
            }

            if(maxTempCity>tempMax){
                tempMax=maxTempCity;
                maxIndex=i;
            }
        }

        System.out.println("La temperatura mínima la tuvo " + cities[minIndex] + " con "+ tempMin + "º C.");
        System.out.println("La temperatura máxima la tuvo "+ cities[maxIndex] + " con "+ tempMax+ "º C.");
    }
}
