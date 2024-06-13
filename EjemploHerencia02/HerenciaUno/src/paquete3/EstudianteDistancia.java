
package paquete3;

public class EstudianteDistancia extends Estudiante{
    
    private int numeroAsignaturas;
    private double costoAsignatura;
    private double matriculaDistancia;
    
    public EstudianteDistancia(String n, String ap, String iden, int e){
        super(n, ap, iden, e);
    }
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){
        matriculaDistancia = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia(){
        return matriculaDistancia;
    }
    /*
    @Override 
    public String toString(){
        String cadena = String.format("Nombre: %s\n"
                + "Numero de asignaturas: %d\n"
                + "Valor de asignatura: %.2f\n"
                + "Valor de la matricula: %.2f\n",
                obtenerNombresEstudiante(), 
                numeroAsignaturas,
                costoAsignatura,
                obtenerMatriculaDistancia());
        return cadena;
    }
*/
    @Override 
    public String toString(){
        String cadena = String.format("%sNumero de asignaturas: %d\n"
                + "Valor de asignatura: %.2f\n"
                + "Valor de la matricula: %.2f\n",
                super.toString(), 
                numeroAsignaturas,
                costoAsignatura,
                obtenerMatriculaDistancia());
        return cadena;
    }
    
    /*
    se puede llamar al metodo toString de la superclase Estudiante para poder
    imprimir los atributos que se encuentren ahi, junto al toString de esta clase
    */

}
