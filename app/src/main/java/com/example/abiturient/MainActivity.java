package com.example.abiturient;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO:    1) Написать адаптер University -> ListView          (ArrayAdapter<University>)
        //          2) Написать пережачу данных в UniversityFragment    (Возможно через Bundle)
        //          3) Разобраться с иерархией классов                  (Фотку перешлю)
        //          4) Дописать основные классы
        //          5) Попросить фронтендера написать стиль и fill'еры его стилей
        //          6) Написать взамиодействие с базой данных
        /*
         *                                                    ФИЧА 1 Возможность включать режимы
         *
         *                                                  1         Хогвартс          ON/OFF
         *                                                           +======================+
         * +================================+                        V                      V
         * |            Фрагмент            | <=================[ [ Список вузов ] или [ Проф.тест ] или [ Информация про вуз ] ]
         * |                                |                       ^                                          ^
         * |                                |                       +                                          |
         * |                                |                       +==========================================+
         * |                                |                       class University
         * |                                |               2      ДАННЫЕ ПРО ВУЗЫ <================ База данных
         * |                                |                                   Имя вуза = getName()                                    +
         * |                                |                                   Степендия = getMoney()
         * |                                |                                   Стоимость обучения = getEducationCost()
         * |                                |                                   Направление вуза = getDirection() -> enum Direction
         * |                                |                                   Картинка = getImage()
         * |                                |                                   Логотип = getLogo()
         * |                                |                                   Факультет = getFaculties()
         * |                                |                                   Год основания = getDate()
         * |                                |                                   Где расположен = getLocation()
         * |                                |                                   Директор/Декан = getHeadmasterName()                    +
         * |                                |                                   Главная Ссылка сайта = getLink()
         * |                                |                                   Документы = getDocuments()
         * |                                |                                   Проходные баллы =  getPassingGrade() -> Ege
         * |                                |                                   Вузовские олимпиады = getOlympiads() -> ArrayList<Olympiad>
         * |                                |                                   Наличие общежития = hasDormitory() -> bool
         * |                                |                                   // Доп поля TODO
         * |                                |               3       Профиль пользователя == class User
         * |                                |                                   Имя, Фамилия, Отчество = getFullName()                  +
         * |                                |                                   Баллы ЕГЭ (ОГЭ) = getScoreEge() -> Ege
         * |                                |                                   Достижения = getAchievement() -> ArrayList<Olympiad>
         * |                                |                                   Проф.Тест = getResult() -> enum Direction
         * |                                |                                   Местоположение = getLocation()
         * +================================+
         *
         */
    }
}