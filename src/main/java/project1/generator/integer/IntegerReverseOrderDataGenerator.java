package project1.generator.integer;

import project1.generator.DataType;
import project1.generator.ReverseOrderDataGenerator;

public final class IntegerReverseOrderDataGenerator implements ReverseOrderDataGenerator<Integer> {

    private Integer[] list;

    @Override
    public void makeData(int size) {
        list = new Integer[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = list.length - i;
        }
    }

    @Override
    public int getCurrentDataSize() {
        return list.length;
    }

    @Override
    public Integer[] getGeneratedDataCopy() {
        return list.clone();
    }

    @Override
    public DataType getDataType() {
        return DataType.REVERSE_ORDER;
    }
}
