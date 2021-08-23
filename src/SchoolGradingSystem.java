public class SchoolGradingSystem extends GradingSystem {

    public void loadData(String data, int n) {
        
        this.setmSchoolNotas(new float[n][4]);
        float acumulado = 0;
        float[][] matrizNotas = this.getmSchoolNotas();
        String[] filasData = data.split("\n");
        for (int i = 0; i < n; i++) {
            String[] datoAtomico = filasData[i].split(" ");
            for (int j = 0; j < matrizNotas[i].length; j++) {
                matrizNotas[i][j] = Float.parseFloat(datoAtomico[j]);
                acumulado += matrizNotas[i][3];
                this.setAcumulado(acumulado);
            }
        }
        this.setmSchoolNotas(matrizNotas);
        this.setPromedio(acumulado/n);

    }
}
