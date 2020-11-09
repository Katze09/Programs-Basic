public String binary_to_decimal(String num) {
    int counter = 0;
    int decimal = 0;
    int[] decimalNum = new int[num.length()];
    int[] listNum = new int[num.length()];
    counter = 0;
    listNum[0] = 1;
    for (int i = 1; i < num.length(); i++) 
        listNum[i] = listNum[i - 1] * 2;
    int j = 0;
    for (int i = num.length(); i > 0; i--) {
        if (Integer.parseInt(num.substring(i - 1, i)) == 1) {
            decimalNum[counter] = listNum[j];
            counter++;
        }
        j++;
    }
    for (int i = 0; i < counter; i++) 
        decimal = decimal + decimalNum[i];
    return "" + decimal;
}
