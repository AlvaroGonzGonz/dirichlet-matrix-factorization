package com.github.ferortega.bemf.experiment;

import com.github.ferortega.bemf.qualityMeasure.Precision;
import com.github.ferortega.bemf.qualityMeasure.Recall;
import com.github.ferortega.bemf.qualityMeasure.ReliablePrecision;
import com.github.ferortega.bemf.qualityMeasure.ReliableRecall;
import com.github.ferortega.bemf.recommender.BeMF;
import com.github.ferortega.bemf.recommender.DirMF;
import es.upm.etsisi.cf4j.data.DataModel;
import es.upm.etsisi.cf4j.util.plot.LinePlot;
import es.upm.etsisi.cf4j.util.plot.PlotSettings;
import es.upm.etsisi.cf4j.recommender.matrixFactorization.PMF;

import java.io.IOException;

import static com.github.ferortega.bemf.experiment.Settings.*;

public class QualityOfRecommendations {

    private static double[] RELIABILITY_THRESHOLD = {0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9};

    public static void main(String[] args) throws IOException {

        DataModel datamodel = DATAMODEL;

        LinePlot precisionPlot = new LinePlot(RELIABILITY_THRESHOLD, "Recommendation reliability", "Precision");
        LinePlot recallPlot = new LinePlot(RELIABILITY_THRESHOLD, "Recommendation reliability", "Recall");


        // Evaluate BeMF Recommender
        BeMF bemf = new BeMF(datamodel, BEMF_PARAMS);
        bemf.fit();

        precisionPlot.addSeries("BeMF");
        recallPlot.addSeries("BeMF");

        for (double threshold : RELIABILITY_THRESHOLD) {
            ReliablePrecision rPrecision = new ReliablePrecision(bemf, NUM_RECOMMENDATIONS, threshold, LIKE_THRESHOLD);
            double rPrecisionScore = rPrecision.getScore();
            precisionPlot.setValue("BeMF", threshold, rPrecisionScore);

            ReliableRecall rRecall = new ReliableRecall(bemf, NUM_RECOMMENDATIONS, threshold, LIKE_THRESHOLD);
            double rRecallScore = rRecall.getScore();
            recallPlot.setValue("BeMF", threshold, rRecallScore);
        }


        //Evaluate DirMF Recommender
        DirMF dirmf = new DirMF(datamodel, DIRMF_PARAMS);
        dirmf.fit();

        precisionPlot.addSeries("DirMF");
        recallPlot.addSeries("DirMF");

        for (double threshold : RELIABILITY_THRESHOLD) {
            ReliablePrecision rPrecision = new ReliablePrecision(dirmf, NUM_RECOMMENDATIONS, threshold, LIKE_THRESHOLD);
            double rPrecisionScore = rPrecision.getScore();
            precisionPlot.setValue("DirMF", threshold, rPrecisionScore);

            ReliableRecall rRecall = new ReliableRecall(dirmf, NUM_RECOMMENDATIONS, threshold, LIKE_THRESHOLD);
            double rRecallScore = rRecall.getScore();
            recallPlot.setValue("DirMF", threshold, rRecallScore);
        }


        // Evaluate PMF Recommender
        PMF pmf = new PMF(datamodel, PMF_PARAMS);
        pmf.fit();

        Precision precision = new Precision(pmf, NUM_RECOMMENDATIONS, LIKE_THRESHOLD);
        double precisionScore = precision.getScore();
        precisionPlot.addSeries("PMF", precisionScore);

        Recall recall = new Recall(pmf, NUM_RECOMMENDATIONS, LIKE_THRESHOLD);
        double recalScore = recall.getScore();
        recallPlot.addSeries("PMF", recalScore);



        // Print results
        PlotSettings.setWidth(PLOT_WIDTH);
        PlotSettings.setHeight(PLOT_HEIGHT);

        precisionPlot.exportPlot("results/" + EXPORT_PREFIX + "-precision.png");
        precisionPlot.printData();
        precisionPlot.exportData("results/" + EXPORT_PREFIX + "-precision.csv");

        recallPlot.exportPlot("results/" + EXPORT_PREFIX + "-recall.png");
        recallPlot.printData();
        recallPlot.exportData("results/" + EXPORT_PREFIX + "-recall.csv");
    }
}
