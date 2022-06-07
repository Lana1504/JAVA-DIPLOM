package ru.netology.graphics.image;

public class SchemaImpl implements TextColorSchema {

    public static final char[] C2 = {'#', '$', '@', '%', '*', '+', '-', '\''};

    @Override
    public char convert(int color) {
        return C2[color / 32];
    }
}


//    Реализация условным оператором
//    private static final char[] CHARS = {'#', '$', '@', '%', '*', '+', '-', '`'};

//    @Override
//    public char convert(int color) {
//
//        if (color >= 0 && color <= 32) {
//            return CHARS[0];
//        } else if (color > 32 && color < 64) {
//            return CHARS[1];
//        } else if (color >=64 && color < 96) {
//            return CHARS[2];
//        } else if (color >= 96 && color < 128) {
//            return CHARS[3];
//        } else if (color >=128 && color < 160) {
//            return CHARS[4];
//        } else if (color > 160 && color < 192) {
//            return CHARS[5];
//        } else if (color >= 192 && color < 224) {
//            return CHARS[6];
//        } else if (color >= 224 && color < 256) {
//            return CHARS[7];
//        } else if (color >= 256 && color < 288) {
//            return CHARS[8];
//        } else if (color >= 288 && color < 320) {
//            return CHARS[9];
//        } else {
//            return CHARS[10];
//        }
