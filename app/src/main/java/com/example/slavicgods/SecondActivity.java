package com.example.slavicgods;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса God
    List<God> gods = new ArrayList<God>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_god);

        // создадим адаптер и загрузим в него контейнер с данными
        GodAdapter adapter = new GodAdapter(this, gods);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности God
       gods.add( new God("Перун", "боггромовержец в славянской мифологии, покровитель князя и дружины в древнерусском языческом пантеоне. Бог Перун всегда оказывал поддержку тем, кто борется за правое дело, и презирал тех, кто нарушил закон.",
                R.drawable.perun));
        gods.add( new God("Сварог", "верховный бог восточных славян, небесный огонь, бог огня. Сварог – бог-хозяин, ему выпала честь сотворить священный огонь. ",
                R.drawable.svarog));
        gods.add( new God("Хорс", "древнерусское божество, обычно соотносимое с солнцем.  герой олицетворял надежду, борьбу с Чернобогом и защиту от диких животных.",
                R.drawable.hors));
        gods.add( new God("Мокошь", "одна из самых неоднозначных богинь славянского пантеона, покровительствующая судьбе. В качестве приношений Макоши жертвовали пряжу, ведь она считалась гениальной ткачихой.",
                R.drawable.mokosh));
        gods.add( new God("Стрибог", "Стрибог - славянский Бог стихии Воздуха, Бог ветра. Стрибог — бог, верховный повелитель ветров, которые веют с моря стрелами, то есть мечут молнии из дождевой тучи. Его почитали и как истребителя всяческих злодеяний, разрушителя злоумышлении. Богом ветра, бури и войны почитался Стрибог",
                R.drawable.stribog));
    }
}
