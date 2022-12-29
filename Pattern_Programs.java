package pattern;

public class HollowPattern {
	
	static void	hollowPatterns(int row,	int column)
	{
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (i	==	1	||	i	==	row	||	j	==	1	||	j	==	column) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	static	void	halfpyramidpattern(int	n)
	{
		System.out.println();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static	void	halfpyramidpattern1(int	n)
	{
		System.out.println();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static	void	halfpyramidpattern2(int	n)
	{
		System.out.println();
		System.out.println();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static	void	halfpyramidpatternwithnumber(int	n)
	{
		System.out.println();
		System.out.println();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	static	void	floydsTriangle(int	n)
	{
		System.out.println();
		System.out.println();
		int	counter	=	1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}
	}
	
	
	static	void	zerooneTriangle(int	n)
	{
		System.out.println();
		System.out.println();
		int	counter	=	1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i+j)%2==0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
	
	
	static	void	mahindralogo(int n)
	{
		System.out.println();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
				for (int j = 1; j <= 2*(n-i); j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
		}
		}
	
	
	static	void	butterfly(int n)
	{
		System.out.println();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
				for (int j = 1; j <= 2*(n-i); j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
		}
		
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
				for (int j = 1; j <= 2*(n-i); j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		
	}
	
	
	static	void	solidRhombus(int	n)
	{
		System.out.println();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void	hollowRhombus(int n)
	{
		System.out.println();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= n; j++) {
				if (i	==	1	||	i	==	n	||	j	==	1	||	j	==	n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	static	void	diamond(int	n)
	{
		System.out.println();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static	void	numberPyramid(int	n)
	{
		System.out.println();
		System.out.println();
		int	counter	=	1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(counter+" ");
			}
			counter++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		hollowPatterns(4, 5);
		halfpyramidpattern(4);
		halfpyramidpattern1(4);
		halfpyramidpattern2(4);
		halfpyramidpatternwithnumber(5);
		floydsTriangle(5);
		zerooneTriangle(5);
		mahindralogo(8);
		butterfly(4);
		solidRhombus(5);
		hollowRhombus(5);
		diamond(4);
		numberPyramid(5);
		
	}
}
