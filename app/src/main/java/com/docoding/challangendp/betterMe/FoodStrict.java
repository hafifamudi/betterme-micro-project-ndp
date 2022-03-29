package com.docoding.challangendp.betterMe;

import com.docoding.challangendp.R;

import java.util.ArrayList;

public class FoodStrict {
    private static String[] foodNames = {
            "Gorengan",
            "Manisan"
    };

    private static String[] foodDetails = {
            "Makanan yang mengandung lemak trans juga termasuk pantangan bagi penderita diabetes.\n" +
                    "\n" +
                    "Beberapa jenis makanan kaya lemak trans adalah keripik kentang kemasan, kentang goreng, dan gorengan. Lemak trans juga sebagian besar ditemukan pada margarin, selai, dan makanan yang diawetkan.\n" +
                    "\n" +
                    "Kombinasi minyak goreng dan karbohidrat dari kentang itulah yang dapat meningkatkan kadar gula darah.\n" +
                    "\n" +
                    "Meski tidak benar-benar langsung menaikkan gula darah, lemak trans dapat memicu resistensi insulin dan sindrom metabolik yang merupakan penyebab diabetes.\n" +
                    "\n" +
                    "Makanan pantangan diabetes ini juga dapat meningkatkan risiko kerusakan pembuluh darah dan mengurangi kadar kolesterol baik HDL.",

            "Makanan manis seperti kue, kukis, martabak, es krim, puding dan camilan kemasan (biskuit, wafer, dan permen) mengandung banyak gula. Gula sendiri merupakan jenis karbohidrat sederhana yang paling cepat dicerna oleh tubuh menjadi glukosa atau gula darah.\n" +
                    "\n" +
                    "Artinya, konsumsi makanan manis bisa cepat membuat gula darah pasien diabetes melonjak naik. Makanan manis bahkan bisa terbuat dari berbagai jenis gula yang membuat kandungan gulanya makin tinggi. \n" +
                    "\n" +
                    "Makanan manis biasanya juga tinggi kalori sehingga bisa menyebabkan kenaikan berat badan. Hal ini tentunya perlu dihindari oleh diabetesi yang harus menurunkan bobot tubuh untuk mengatasi gejala diabetes.\n" +
                    "\n" +
                    "Tak jarang, beberapa camilan kemasan bahkan memiliki kandungan pemanis buatan yang bisa meningkatkan risiko resistensi insulin. Kondisi ini merupakan faktor risiko utama dari diabetes tipe 2."
    };


    private static int[] foodImages = {
            R.drawable.gorengan,
            R.drawable.manisan
    };

    static ArrayList<Food> ListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            list.add(food);
        }

        return list;
    }
}