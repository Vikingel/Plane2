public class Main {
    public static void main(String[] args) {
        Plane p1 = new Plane("Боинг747", "пассажирский", 1000);
        String s1 = p1.toString();
        System.out.println(s1);
        Plane p2 = new Plane("ТУ-154", "грузовой", 2000);
        p2.setName("СуперДжет100");
        p2.setType("пассажирский");
                System.out.println("дальность полета в км = " + p2.getRange());
        Plane p3 = new Plane("ТУ-154", "грузовой", 2000);
                p3.setName("СУ25");
        p3.setType("боевой");
        Plane p4 = new Plane("ТУ-154", "грузовой", 3000);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("-----------------------------------------------------------");
        Plane[] planes={p1,p2,p3,p4};
        for (int i = 0; i < planes.length; i++) {
            System.out.println(planes[i]);
        }

        //Cat o3 = new Cat("Мурзик", "черный", 8.4);
        //System.out.println(o2);
        //System.out.println(o3);

        //Racoon o4 = new Racoon("Фёдор", 10);
        //System.out.println(o4);

        //System.out.println("у нас поселились " + o2 + ", " + o3 + " и " + o4);
        //o2.name = "Василий Иваныч";  благодаря модификатору private напрямую сделать нельзя
        //o2.setName("Василий Иваныч");
        //o3.setName("Эй ты");

        //System.out.println("у нас живут коты " + o2 + ", " + o3);

        //o3.setWeight(9.1);
        //System.out.println(o3);
        //System.out.println("вес кота " + o3.getWeight());

        //Racoon o5 = new Racoon("Неправильный", -9);
        //System.out.println(o5);
    }
}

class Plane {
    private String type;
    private double flightRange;
    private String producer;


    public double getRange() {
        System.out.println("Отмечаем дальность полета " + producer + ":");
        return flightRange;
    }

    public Plane(String producer, String type, double flightRange) {
        this.type = type;
        this.flightRange = flightRange;
        this.producer = producer;
    }

    @Override
    public String toString() {
        String s = "Самолет: " + producer + " " + type + " с дальностью полета " + flightRange + " км";
        return s;
    }

    public void setName(String name) {
        System.out.println("переименование " + this.producer + " в " + name);
        this.producer = name;
    }

    public void setType(String name) {
        System.out.println("изменение типа c " + this.type + " на " + name);
        this.type = name;
    }

}

