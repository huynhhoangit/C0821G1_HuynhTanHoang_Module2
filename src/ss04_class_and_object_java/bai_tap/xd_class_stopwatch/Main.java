package ss04_class_and_object_java.bai_tap.xd_class_stopwatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
         int sumsolanvonglap =0 ;
        stopWatch.start();
          for (int i  = 0; i < 1000000000; i++){
              for (int k= 0; k < 1000000000 ; k++){
                  sumsolanvonglap =  i+k;

              }
          }
          stopWatch.stop();
        System.out.println("time thực hiện ct :"+ stopWatch.getElapsedTime());


    }
}
