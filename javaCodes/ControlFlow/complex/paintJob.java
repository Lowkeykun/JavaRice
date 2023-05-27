package ControlFlow.complex;

public class paintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(6.26,2.2));
    }
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        return (int)Math.ceil(width * height/areaPerBucket - extraBuckets);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        return (int)Math.ceil(width * height/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        return (int)Math.ceil((double)area/areaPerBucket);
    }
}

//    public static int getBucketCount(double width, double height, double areaPerBucket){
//        // if(width<=0 || height<=0 || areaPerBucket<=0) return -1;
//        // return (int) Math.ceil(width*height/areaPerBucket);
//        return getBucketCount(width, height, areaPerBucket, 0); // call first method
//    }
//
//    public static int getBucketCount(double area, double areaPerBucket){
//        // if(area<=0 || areaPerBucket<=0) return -1;
//        // return (int) Math.ceil(area/areaPerBucket);
//        return getBucketCount(area, 1, areaPerBucket, 0); // call first method where width*height = area is the same as area*1 = area
