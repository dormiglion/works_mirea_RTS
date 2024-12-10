package ru.mirea.work24.task2.Interfaces;

import ru.mirea.work24.task2.FunctionalChair;
import ru.mirea.work24.task2.MagicChair;
import ru.mirea.work24.task2.VictorianChair;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagiChair();
    FunctionalChair createFunctionalChair();
}
