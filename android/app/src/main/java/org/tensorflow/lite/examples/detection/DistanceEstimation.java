package org.tensorflow.lite.examples.detection;

public class DistanceEstimation {

    public static double bbWidth = 0;
    public static double focalLengthValue = 0;
    public static double distance = 0;
    public static boolean triggerVibration = false;

    public static double getFocalLengthValue() {
        return focalLengthValue;
    }

    public static double getBbWidth() {
        return bbWidth;
    }

    public static void setBbWidth(double bbWidth) {
        DistanceEstimation.bbWidth = bbWidth;
    }

    public static void focalLengthFinder(double measuredDistance, double realWidth, double refImageWidth){
        focalLengthValue = (refImageWidth * measuredDistance) / realWidth;
    }

    public static void distanceFinder(double focalLength, double realObjectWidth){

        distance = (realObjectWidth * focalLength) / bbWidth ;

        if(distance < 120){
            triggerVibration = true;

        }
        else {
            triggerVibration = false;
        }
    }
}