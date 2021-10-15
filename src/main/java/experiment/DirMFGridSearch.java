package experiment;

import recommender.DirMF;
import es.upm.etsisi.cf4j.data.DataModel;
import es.upm.etsisi.cf4j.qualityMeasure.prediction.MAE;
import es.upm.etsisi.cf4j.util.Range;
import es.upm.etsisi.cf4j.util.optimization.GridSearch;
import es.upm.etsisi.cf4j.util.optimization.ParamsGrid;

import java.io.IOException;

public class DirMFGridSearch {

    private final static int TOP_N = 10;

    public static void main(String[] args) throws IOException {

        DataModel datamodel = Settings.DATAMODEL;

        ParamsGrid paramsGrid;
        GridSearch gridSearch;


        // DirMF Recommender

        paramsGrid = new ParamsGrid();

        paramsGrid.addParam("numFactors", new int[]{6,8,10,12});
        paramsGrid.addParam("learningRate", Range.ofDoubles(0.01, 0.01, 3));
        paramsGrid.addParam("regularization", Range.ofDoubles(0.01, 0.01, 3));
        paramsGrid.addParam("beta", Range.ofDoubles(1.0,0.5, 1));
        paramsGrid.addParam("numIters", new int[]{100});

        paramsGrid.addFixedParam("ratings", Settings.RATINGS);
        paramsGrid.addFixedParam("seed", Settings.RANDOM_SEED);

        gridSearch = new GridSearch(datamodel, paramsGrid, DirMF.class, MAE.class);
        gridSearch.fit();
        gridSearch.printResults(TOP_N);
    }
}
