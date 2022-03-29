package com.docoding.challangendp.betterMe;

import com.docoding.challangendp.R;

import java.util.ArrayList;

public class FoodRecomendation {
    private static String[] foodNames = {
            "Jagung",
            "Sayuran berdaun hijau"
    };

    private static String[] foodDetails = {
            "Jagung memiliki nilai glikemik rendah sehingga bisa dijadikan makanan pokok pengganti nasi yang baik untuk penderita diabetes. Semakin rendah beban glikemik suatu makanan semakin baik untuk orang yang menderita kencing manis.\n" +
                    "\n" +
                    "Selain itu, makanan untuk diabetes ini juga mengandung serat dan pati (jenis karbohidrat kompleks) yang membutuhkan waktu lebih lama untuk dicerna oleh tubuh. Hal ini membuat kadar gula darah tidak begitu cepat naik setelah makan.\n" +
                    "\n" +
                    "Proses pencernaannya yang lebih lama pun membuat perut kenyang lebih lama. Keinginan ngemil makanan yang tidak sehat jadi bisa dicegah. Rutin makan jagung yang kaya akan pati setiap hari dapat membantu diabetesi mengendalikan gula darahnya lebih baik.",

            "Beberapa sayuran berpati mengandung tinggi karbohidrat dengan indeks glikemik yang juga tinggi. Namun, tidak semua sayuran mengandung pati. Ada pula sayuran non-pati yang memiliki karbohidrat dan indeks glikemik yang rendah, sayuran hijau contohnya.\n" +
                    "\n" +
                    "Sayuran hijau mengandung antioksidan lutein dan zeaxanthin yang melimpah. Kedua antioksidan tersebut dapat membantu melindungi mata dari degenerasi makula dan katarak. Kedua kondisi ini merupakan gangguan penglihatan akibat komplikasi diabetes yang paling umum dialami.\n" +
                    "\n" +
                    "Beberapa jenis sayuran hijau yang direkomendasikan sebagai makanan untuk diabetes, yaitu: Brokoli, bayam, sawi, Bok choy, kubis "
    };

    private static int[] foodImages = {
            R.drawable.jagung,
            R.drawable.sayur_hijau
    };

    static ArrayList<Food>ListData() {
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
