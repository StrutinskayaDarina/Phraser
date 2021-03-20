package a.e.phraser;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;



public class Phraser  extends AppCompatActivity {
    private static BreakIterator textView;
    private TextView tv_phrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_phrase = findViewById(R.id.tv_phrase);
        tv_phrase.setText("Всё, что нам нужно – это " + PhraserGen());

    }
    public void onButtonClick(View v) {
        tv_phrase.setText("Всё, что нам нужно – это " + PhraserGen());
    }

    public String  PhraserGen() {


    {
            String[] wordListOne = {"Круглосуточный", "Трех-звенный",
                    "30-футовьй", "Взаимный", "Обоюдный выигрыш", "Фронтэнд",
                    "На основе веб-технологий", "Проникащий", "Умный", "Динамичный"};

            String[] wordListTwo = {"уполномоченный", "трудный",
                    "чистый продукт", "ориентированный", "центральный",
                    "распределенный", "кластеризованный", "фирменный",
                    "нестандартный ум", "позиционированный", "сетевой",
                    "сфокусированный", "использованный с выгодой", "выровненный",
                    "целесообразный", "общий", "совместный", "ускоренный"};

            String[] wordListThree = {"процесс.", "пункт разгрузки.",
                    "выход из положения.", "тип структуры", "талант.", "подход.",
                    "уровень завоеванного внимания.", "портал.", "период времени.",
                    "обзор.", "образец.", "пункт следования."};

            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordListThree.length;
            int rl = (int) (Math.random() * oneLength);
            int r2 = (int) (Math.random() * twoLength);
            int r3 = (int) (Math.random() * threeLength);

            String phrase = (wordListOne[rl] + " " +
                    wordListTwo[r2] + " " + wordListThree[r3]);


            this.tv_phrase.setText(phrase);

            return phrase;

    }


    }

}
