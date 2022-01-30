package com.company;

public class Main {

    public static void main(String[] args) {
        History history = new History();
        history.beginning();
        Author author = new Author("Автор");
        Minerals minerals = new Minerals("Полезные ископаемые");
        Ice ice = new Ice("Вечные льды");
        System.out.println();
        author.authorsActions();
        author.reveal(TypeOfEssence.причины);
        author.listen(TypeOfEssence.совет);
        ice.authorsActions();
        minerals.authorsActions();
        ice.melt();
        minerals.toBe();
        System.out.println();
        history.ending();
    }
}
