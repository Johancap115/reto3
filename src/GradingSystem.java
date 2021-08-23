import java.util.Scanner;

public class GradingSystem {
    private static final float MASCULINO = 0.0f;
    private int examMenoresProm, excelente;
    Scanner leerData = new Scanner(System.in);
    private String dato = "";
    private float[][] mSchoolNotas;
    private float promedio, acumulado, promLiteratura = 0, promBiologia = 0, promGeografia = 0, mayorCalLitera = 0,
            mejorLit = 0;

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public float getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(float acumulado) {
        this.acumulado = acumulado;
    }

    public float[][] getmSchoolNotas() {
        return mSchoolNotas;
    }

    public void setmSchoolNotas(float[][] mSchoolNotas) {
        this.mSchoolNotas = mSchoolNotas;
    }

    public int getExcelente() {
        return excelente;
    }

    public void setExcelente(int excelente) {
        this.excelente = excelente;
    }

    public int getExamMenoresProm() {
        return examMenoresProm;
    }

    public void setExamMenoresProm(int examMenoresProm) {
        this.examMenoresProm = examMenoresProm;
    }

    public Scanner getLeerData() {
        return leerData;
    }

    public void setLeerData(Scanner leerData) {
        this.leerData = leerData;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public void loadData() {
        setDato(getLeerData().next());
    }

    /**
     * 1. ¿Cuántos exámenes tienen una calificación menor a la del promedio del
     * grupo?
     * 
     * @return
     */
    public int stat1() {
        return getExamMenoresProm();
    }

    /**
     * 2. ¿Cuántos exámenes tienen una calificación Excelente?
     * 
     * @return
     */
    public int stat2() {
        return getExcelente();
    }

    /**
     * 3. ¿Cuál es la materia con el peor desempeño promedio para el género
     * masculino?
     * 
     * @return
     */
    public String stat3() {
        String peorMateria = "";
        if (promLiteratura < promBiologia && promLiteratura < promGeografia) {
            peorMateria = "literatura";
        } else if (promBiologia < promGeografia && promBiologia < promLiteratura) {
            peorMateria = "biologia";
        } else if (promGeografia < promLiteratura && promGeografia < promBiologia) {
            peorMateria = "geografia";
        }
        return peorMateria;
    }

    /**
     * 4. ¿Cuál es el estudiante con el mejor desempeño para la materia literatura?
     * 
     * @return
     */
    public String stat4() {
        String mejorLiterato = "";
        if (mejorLit == 1.0) {
            mejorLiterato = "armando";
        } else if (mejorLit == 2.0) {
            mejorLiterato = "nicolas";
        } else if (mejorLit == 3.0) {
            mejorLiterato = "daniel";
        } else if (mejorLit == 4.0) {
            mejorLiterato = "maria";
        } else if (mejorLit == 5.0) {
            mejorLiterato = "marcela";
        } else if (mejorLit == 6.0) {
            mejorLiterato = "alexandra";
        }
        return mejorLiterato;
    }

    

    void resolverPreguntas() {
        int countMenPro = 0, countExc = 0;
        for (int i = 0; i < mSchoolNotas.length; i++) {
            for (int j = 0; j < mSchoolNotas[i].length; j++) {
            }
            if (mSchoolNotas[i][3] < this.promedio) {
                countMenPro += 1;
                setExamMenoresProm(countMenPro);
            }
            if (mSchoolNotas[i][3] > 4.5 && mSchoolNotas[i][3] <= 5) {
                countExc += 1;
                setExcelente(countExc);
            }
            if (mSchoolNotas[i][1] == MASCULINO) {
                if (mSchoolNotas[i][2] == 1.0) {
                    promLiteratura += mSchoolNotas[i][3];
                } else if (mSchoolNotas[i][2] == 2.0) {
                    promBiologia += mSchoolNotas[i][3];
                } else if (mSchoolNotas[i][2] == 3.0) {
                    promGeografia += mSchoolNotas[i][3];
                }
            }
            if (mSchoolNotas[i][2] == 1.0) {
                if (mSchoolNotas[i][3] > mayorCalLitera) {
                    mayorCalLitera = mSchoolNotas[i][3];
                    mejorLit = mSchoolNotas[i][0];
                }
            }
        }
    }
}
