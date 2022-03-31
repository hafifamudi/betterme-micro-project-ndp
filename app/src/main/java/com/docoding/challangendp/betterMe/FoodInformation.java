package com.docoding.challangendp.betterMe;

import com.docoding.challangendp.R;

import java.util.ArrayList;

public class FoodInformation {
    private static String[] foodNames = {
            "Jagung",
            "Sayuran berdaun hijau",
            "Kacang - kacangan",
            "Yogurt Probiotik"
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
                    "Beberapa jenis sayuran hijau yang direkomendasikan sebagai makanan untuk diabetes, yaitu: Brokoli, bayam, sawi, Bok choy, kubis ",

            "Kacang merupakan pilihan makanan atau camilan untuk penderita diabetes yang aman dikonsumsi. Pasalnya, kacang kaya serat dan protein. Kacang juga juga mengandung karbohidrat kompleks dan termasuk makanan yang memiliki indeks glikemik rendah.\n" +
                    "\n" +
                    "Oleh karena itu, kacang lebih lama diubah menjadi glukosa, sehingga tidak menyebabkan kenaikan gula darah secara drastis. \n" +
                    "\n" +
                    "Beberapa pilihan kacang yang menjadi makanan sehat untuk diabetes, antara lain :\n" +
                    "Kacang almond, Kacang kenari, Kacang mete, Kacang pistachio, Kacang tanah untuk diabetes, Kacang merah\n" +
                    "\n" +
                    "Tapi juga perlu berhati-hati dalam mengkonsumsi kacang-kacangan ini. Pasalnya, kacang tinggi kalori sehingga tidak boleh dikonsumsi berlebihan karena bisa menaikkan berat badan. Sementara berat badan yang berlebih merupakan salah satu penyebab dari diabetes.",

            "Probiotik adalah bakteri yang baik yang membantu meningkatkan kesehatan pencernaan dan kesehatan Anda secara menyeluruh. Makanan probiotik yang baik untuk diabetes contohnya adalah yogurt.\n" +
                    "\n" +
                    "Tak hanya membantu menurunkan gula darah, yogurt juga dapat membantu meningkatkan kepekaan sel-sel tubuh terhadap insulin.\n" +
                    "Makanan yang mengandung probiotik juga dapat membantu tubuh meningkatkan kadar kolesterol baik pada penderita diabetes tipe 2.\n" +
                    "\n" +
                    "Peningkatan kadar kolesterol baik dari makanan ini baik untuk jantung sehingga dapat menurunkan risiko diabetesi untuk terkena penyakit jantung di kemudian hari.\n" +
                    "\n" +
                    "Untuk penderita diabetes, pilihlah varian yogurt plain (tawar). Hindari yogurt dengan berbagai pilihan rasa karena umumnya telah ditambahkan banyak gula."
    };

    private static int[] foodImages = {
            R.drawable.jagung,
            R.drawable.sayur_hijau,
            R.drawable.kacang,
            R.drawable.yogurt
    };

    private static String[] foodCategory = {
            "Makanan",
            "Makanan",
            "Makanan",
            "Makanan",
    };

    static ArrayList<Food> ListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            food.setCategory(foodCategory[position]);
            list.add(food);
        }

        return list;
    }


}

