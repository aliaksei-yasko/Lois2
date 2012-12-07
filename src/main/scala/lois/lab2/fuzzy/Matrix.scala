package lois.lab2.fuzzy

/**
 * Class that represent two dimensional matrix.
 *
 * @author Q-YAA
 */
class Matrix(array: Array[Array[Float]]) {

    val matrixData = array

    /**
     * Returns the value that placed in i row and j column.
     *
     * @param i row number
     * @param j column number
     * @return Float value from the matrix
     */
    def getValue(i: Int, j: Int): Float = matrixData(i)(j)

    /**
     * Returns matrix row with i number.
     *
     * @param i row number
     * @return Array[Float] row from matrix
     */
    def getRow(i: Int): Array[Float] = matrixData(i)

    /**
     * Set the value in i row and j column.
     *
     * @param i row number
     * @param j column number
     * @param value value to set
     */
    def setValue(i: Int, j: Int, value: Float) {
        matrixData(i)(j) = value
    }

    def sup: Array[Float] = {
        val supArray = Array.ofDim[Float](matrixData(0).length)

        System.arraycopy(matrixData(0), 0, supArray, 0, supArray.length)

        for (row <- matrixData) {
            for (i <- 0 until supArray.length) {

                if (supArray(i) < row(i)) {
                    supArray(i) = row(i)
                }
            }
        }

        supArray
    }

    def width = if (matrixData.size > 0) matrixData(0).size else 0

    def height = matrixData.size

    def apply(i: Int) = matrixData(i)

    override def toString: String = {
        val stringBuilder = new StringBuilder

        for (row <- matrixData) {
            for (element <- row) {
                stringBuilder.append(element).append("  ")
            }
            stringBuilder.append("\n")
        }

        stringBuilder.toString()
    }
}
