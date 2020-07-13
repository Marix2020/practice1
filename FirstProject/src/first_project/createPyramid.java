package first_project;

public class createPyramid {

	public static void main(String[] args) {
		
//Inverted half pyramid pattern
		int row = 10;

        for(int i = row; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();                         
        }
        
            
  //Full pyramid pattern
        int rows = 5, k = 0, count = 0, count1 = 0;

        for(int i = 1; i <= rows; ++i) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
                ++count;
            }

            while(k != 2 * i - 1) {
                if (count <= rows - 1) {
                    System.out.print((i + k) + " ");
                    ++count;
                }
                else {
                    ++count1;
                    System.out.print((i + k - 2 * count1) + " ");
                }

                ++k;
            }
            count1 = count = k = 0;

            System.out.println();
            
        }
 // Half pyramid using alphabet        
        char last = 'E', alphabet = 'A';

        for(int i = 1; i <= (last-'A'+1); ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(alphabet + " ");
            }
            ++alphabet;

            System.out.println();
        }
        
        
        
        
        
	}

}
