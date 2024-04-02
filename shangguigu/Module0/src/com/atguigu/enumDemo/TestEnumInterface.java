package com.atguigu.enumDemo;

public class TestEnumInterface {
    public static void main(String args[]){
        Season1.WINTER.show();
        Season1.SPRING.show();
    }
}


enum Season1 implements Info{
    //1. define instances of the enum
    SPRING("spring", "spring season"){
        // implement the interface
        public void show(){
            System.out.println("welcome spring");
        }
    },
    SUMMER("summer", "summer season"){
        public void show(){
            System.out.println("welcome summer");
        }
    },
    AUTUMN("autumn", "autumn season"),
    WINTER("winter", "winter season");

    //2. define private final properties
    private final String seasonName;
    private final String seasonDesc;

    //3. define private constructor
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4. define getter
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //枚举类实现接口
    @Override
    public void show() {
        System.out.println("this is a season enum!");
    }
}

interface Info{
    void show();
}
