package com.company;

public class History implements SkillsHistory{

    @Override
    public void beginning() {
        System.out.println("История начинается");
    }

    @Override
    public void ending() {
        System.out.println("История заканчивается");
    }
}
