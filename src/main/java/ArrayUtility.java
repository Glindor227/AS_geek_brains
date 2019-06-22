
class ArrayUtility {

    private int [] data;

    ArrayUtility(int[] data) {
        this.data = data;
    }

    //функция должна возвращать сумму элементов массива
    long arraySum(){
        int sum=0;
        for (int datum : data) {
            sum = sum + datum;
        }
        return sum;
    }
    //функция должна возвращать среднее арифметическое
    //элементов массива
    double avg(){
        //TODO
        return (double)arraySum()/data.length;
    }

    //функция должна возвращать медиану массива
    //медиана - это элемент посередине в упорядоченном массиве для
    //нечетных длин массива
    //или среднее арифметическое двух соседних элементов посередине
    //для четных длин
    //1 2 3 4 5 - 3
    //1 2 3 4 - (2 + 3) / 2 = 2,5
    double median(){
        if(data.length==0)
            return 0.0;
        int medLength = data.length/2;
        if ((data.length&1)==1){
            return data[medLength];
        }
        else {
            return (double)(data[medLength-1]+data[medLength])/2;
        }
    }
}
