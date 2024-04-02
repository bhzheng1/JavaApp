package com.atguigu.enumDemo;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Season.SPRING.getClass());
        System.out.println(Season.SPRING.getClass().getSuperclass());
        System.out.println(Season.SPRING.getClass().getSuperclass().getSuperclass());

        //name()
        System.out.println(Season.SPRING);
        System.out.println(Season.AUTUMN.name());

        //values()
        for (Season v : Season.values()) {
            System.out.println(v);
        }

        //valueOf(String name)
        System.out.println(Season.valueOf("WINTER").getSeasonDesc());

        //ordinal()
        System.out.println(Season.AUTUMN.ordinal());
    }
}

//enum的父类是Object
enum Season {
    //1. define instances of the enum
    SPRING("spring", "spring season"),
    SUMMER("summer", "summer season"),
    AUTUMN("autumn", "autumn season"),
    WINTER("winter", "winter season");

    //2. define private final properties
    private final String seasonName;
    private final String seasonDesc;

    //3. define private constructor
    private Season(String seasonName, String seasonDesc) {
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
}

//如果一个类有有限几个instance则可以定义为enum class
// 由class定义enum的方式
class Season0 {
    // 1. define final properties
    private final String seasonName;
    private final String seasonDesc;

    //2. 私有化构造器
    private Season0(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3. getter
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4. define instances, 必须是static final
    public static final Season0 SPRING = new Season0("春天", "春暖花开");
    public static final Season0 SUMMER = new Season0("夏天", "夏日炎炎");
    public static final Season0 AUTUMN = new Season0("秋天", "秋高气爽");
    public static final Season0 WINTER = new Season0("冬天", "白雪皑皑");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

}
