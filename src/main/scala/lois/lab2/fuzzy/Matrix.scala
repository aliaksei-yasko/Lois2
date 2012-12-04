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

    def sup(id: Int): Float = {
        var sup = Float.MinValue
        matrixData.foreach(row => sup = if (row(id) > sup) row(id) else sup)
        sup
    }

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
