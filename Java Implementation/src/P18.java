public class P18 {

  public static void main(String[] args) {

    int[] arrayA = {75};
    int[] arrayB = {95,64};
    int[] arrayC = {17,47,82};
    int[] arrayD = {18,35,87,10};
    int[] arrayE = {20, 4,82,47,65};
    int[] arrayF = {19, 1,23,75, 3,34};
    int[] arrayG = {88, 2,77,73, 7,63,67};
    int[] arrayH = {99,65, 4,28, 6,16,70,92};
    int[] arrayI = {41,41,26,56,83,40,80,70,33};
    int[] arrayJ = {41,48,72,33,47,32,37,16,94,29};
    int[] arrayK = {53,71,44,65,25,43,91,52,97,51,14};
    int[] arrayL = {70,11,33,28,77,73,17,78,39,68,17,57};
    int[] arrayM = {91,71,52,38,17,14,91,43,58,50,27,29,48};
    int[] arrayN = {63,66, 4,68,89,53,67,30,73,16,69,87,40,31};
    int[] arrayO = { 4,62,98,27,23, 9,70,98,73,93,38,53,60, 4,23};
    
    int largestSum = 0;

    for (int a = 0; a < 1; a++) {
      int inc1 = a;
      int sum1 = arrayA[inc1];
      String s1 = Integer.toString(arrayA[inc1]);

      for (int b = 0; b < 2; b++) {
        int inc2 = inc1 + b;
        int sum2 = sum1 + arrayB[inc2];
        String s2 = s1 + " " + arrayB[inc2];

        for (int c = 0; c < 2; c++) {
          int inc3 = inc2 + c;
          int sum3 = sum2 + arrayC[inc3];
          String s3 = s2 + " " + arrayC[inc3];

          for (int d = 0; d < 2; d++) {
            int inc4 = inc3 + d;
            int sum4 = sum3 + arrayD[inc4];
            String s4 = s3 + " " + arrayD[inc4];

            for (int e = 0; e < 2; e++) {
              int inc5 = inc4 + e;
              int sum5 = sum4 + arrayE[inc5];
              String s5 = s4 + " " + arrayE[inc5];

              for (int f = 0; f < 2; f++) {
                int inc6 = inc5 + f;
                int sum6 = sum5 + arrayF[inc6];
                String s6 = s5 + " " + arrayF[inc6];

                for (int g = 0; g < 2; g++) {
                  int inc7 = inc6 + g;
                  int sum7 = sum6 + arrayG[inc7];
                  String s7 = s6 + " " + arrayG[inc7];

                  for (int h = 0; h < 2; h++) {
                    int inc8 = inc7 + h;
                    int sum8 = sum7 + arrayH[inc8];
                    String s8 = s7 + " " + arrayH[inc8];

                    for (int i = 0; i < 2; i++) {
                      int inc9 = inc8 + i;
                      int sum9 = sum8 + arrayI[inc9];
                      String s9 = s8 + " " + arrayI[inc9];

                      for (int j = 0; j < 2; j++) {
                        int inc10 = inc9 + j;
                        int sum10 = sum9 + arrayJ[inc10];
                        String s10 = s9 + " " + arrayJ[inc10];

                        for (int k = 0; k < 2; k++) {
                          int inc11 = inc10 + k;
                          int sum11 = sum10 + arrayK[inc11];
                          String s11 = s10 + " " + arrayK[inc11];

                          for (int l = 0; l < 2; l++) {
                            int inc12 = inc11 + l;
                            int sum12 = sum11 + arrayL[inc12];
                            String s12 = s11 + " " + arrayL[inc12];

                            for (int m = 0; m < 2; m++) {
                              int inc13 = inc12 + m;
                              int sum13 = sum12 + arrayM[inc13];
                              String s13 = s12 + " " + arrayM[inc13];

                              for (int n = 0; n < 2; n++) {
                                int inc14 = inc13 + n;
                                int sum14 = sum13 + arrayN[inc14];
                                String s14 = s13 + " " + arrayN[inc14];

                                for (int o = 0; o < 2; o++) {
                                  int inc15 = inc14 + o;
                                  int sum15 = sum14 + arrayO[inc15];
                                  String s15 = s14 + " " + arrayO[inc15];

                                  System.out.println(s15);
                                  if (sum15 > largestSum) {
                                    largestSum = sum15;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    System.out.println("Largest sum: " + largestSum);
  }
}
