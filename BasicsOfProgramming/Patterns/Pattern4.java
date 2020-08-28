package Patterns;

import java.util.Scanner;

//ye question pichle question ka ulta h 
/*

isme aise print krna hai
*	*	*	*	*	*	*	*	*	*	*	*	*	*	*	
	*	*	*	*	*	*	*	*	*	*	*	*	*	*	
		*	*	*	*	*	*	*	*	*	*	*	*	*	
			*	*	*	*	*	*	*	*	*	*	*	*	
				*	*	*	*	*	*	*	*	*	*	*	
					*	*	*	*	*	*	*	*	*	*	
						*	*	*	*	*	*	*	*	*	
							*	*	*	*	*	*	*	*	
								*	*	*	*	*	*	*	
									*	*	*	*	*	*	
										*	*	*	*	*	
											*	*	*	*	
												*	*	*	
													*	*	
														*
 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();
        
        int stars = n;
        int spaces = 0;
        for (int i = 1; i <= n; i++) { //outer loop for lines
            for (int j = 0; j < spaces; j++) {  //phli row me 0 stars chaie toh zero se
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {  //fir stars print kie 
                System.out.print("*");
            }
            spaces++;
            stars--;
            System.out.println();
        }
    }
}