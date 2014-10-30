package edu.wpi.checksims.algorithm;

/**
 * Interface for various approaches for outputting a similarity matrix as a string
 */
public interface SimilarityMatrixPrinter {
    public String printMatrix(SimilarityMatrix matrix);
}
