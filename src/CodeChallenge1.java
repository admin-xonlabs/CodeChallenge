
public class CodeChallenge1 {

	public static void traverse(int[][] arr)
	{
		// your logic here
		if(arr==null || arr.length==0 || arr[0].length==0)
			System.out.println("Null value.....Please enter proper matrix");
		else{
			int k=0;
			int row=arr.length-1;
			int col=arr[0].length-1;
			while(k<=(row+col)){
				if(k%2!=0){
					for(int i=0;i<=row;i++){
						for(int j=0;j<=col;j++){
							if((i+j)==k){
								System.out.print(arr[i][j]+" ");
							}
						}
					}
				} else{
					for(int i=row;i>=0;i--){
						for(int j=0;j<=col;j++){
							if((i+j)==k){
								System.out.print(arr[i][j]+" ");
							}
						}
					}
				}
				k++;
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		int[][] mat = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
						};
		
		traverse(mat);
		
	}

}
