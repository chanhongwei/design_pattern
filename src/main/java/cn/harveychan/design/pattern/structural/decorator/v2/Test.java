package cn.harveychan.design.pattern.structural.decorator.v2;

public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SousageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc() + " 销售价格:" + aBattercake.cost());
    }
}
