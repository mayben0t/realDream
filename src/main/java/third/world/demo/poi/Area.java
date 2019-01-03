package third.world.demo.poi;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/1/3
 **/
public class Area {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name;
    }
}
