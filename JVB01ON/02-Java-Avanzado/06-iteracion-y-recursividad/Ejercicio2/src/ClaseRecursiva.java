public class ClaseRecursiva<T> {

    public void mostrarContenidoArray(T[] array, int indice) {
        if (indice != array.length) {
            System.out.println(array[indice]);
            mostrarContenidoArray(array, indice+1);
        }

    }
}
