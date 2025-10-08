class Floyd{
    public static void main(String args[]){
        int i,j,k=1,num=6;
        for(i=1;i<=num;i++){
            for(j=1;j<=i;j++){
                System.out.print(k+"  ");
                k++;
            }
            System.out.println();
        }
    }
}
