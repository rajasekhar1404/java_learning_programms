
class MultiDiamentionalArrays {
    public static void main(String[] args) {
        System.out.println("multi dimentional arrays");
        // int marks[][] = new int[4][5];
        // marks[1][2] = 20;
    //     int marks[][] = { {1,3, 4,5,6},
    //     {7,9,10,30,50},
    // {40,30,40,55,65}

    //     };
    //     // System.out.println(marks[0][2]);
    //     for(int k = 0; k<3; k++) {
    //         for(int l = 0; l<5; l++)
    //         {
    //             System.out.print(marks[k][l]+"\t");
                
    //         }System.out.println();
    //     }
        // for (int i = 0; i < 6; i++)
        // {
        //     // System.out.println(marks[1][2]);
        //     System.out.println(marks.length);
        // }
    //     int[][][] marks =
    //     {{ { 1, 2, 3, 4, 5

    //     }, {7,8,9,10,11

    //     }, {12,13,14,15,16

    //     }},
    //  { {1,2,3,4,5

    //     }, {7,8,9,10,11

    //     }, {12,13,14,15,16

    //     }},
    //     {{1,2,3,4,5

    //     }, {7,8,9,10,11

    //     }, {12,13,14,15,16

    //     }}

    //     };
    //     for (int i = 0; i<2; i++) {
    //         for (int j = 0; i<3; i++) {
    //             for (int k = 0; i<5; i++) {
    //                 System.out.println(marks[i][j][k]);
    //             }
    //         } System.out.println();
    //     }
    
    int[][][] marks =
            { 
            {{1,2,3,4,5},{7,8,9,10,11},{12,13,14,15,16}},
                 {{1,2,3,4,5},{7,8,9,10,11},{12,13,14,15,16}},
                {{1,2,3,4,5},{7,8,9,10,11},{12,13,14,15,16}}
    
            };
            for (int i = 0; i<3; i++) {
                for (int j = 0; j<3; j++) {
                    System.out.print("{ ");
                    for (int k = 0; k<5; k++) 
                    {
                        System.out.print(marks[i][j][k]);
                        System.out.print("\t");
                    }
                    System.out.print(" } ");
                } System.out.println();
            }
        }
    }