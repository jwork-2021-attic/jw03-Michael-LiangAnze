package S191220055;

public class SelectSorter implements Sorter {

    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
        int index = 0,temp_max = 0;;
        for(int i = a.length-1;i > 0;i--){
            temp_max = 0;
            for(int j = 0;j <= i;j++){
                if(temp_max < a[j]){
                    temp_max = a[j];
                    index = j;
                }
            }
            swap(i, index);
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}