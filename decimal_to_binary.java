public String decimal_A_binary(int num) {
    String binary = "";
    if(num > 0){
        int[] binarioList = new int[50];
        int counter = 0;
        while (num > 1) {
            binarioList[counter] = num % 2;
            num = num / 2;
            counter++;
        }
        binarioList[counter] = 1;
        for (int i = counter; i >= 0; i--) 
            binary = binary + binarioList[i];
    }else
        binary = "0";
    return binary;
}
