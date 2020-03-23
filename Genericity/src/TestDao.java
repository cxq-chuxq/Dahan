import java.util.HashMap;
import java.util.Map;

//定义一个测试类 分别对上述方法进行测试
public class TestDao {
    public static void main(String[] args) {
        Dao<User> dao = new Dao<User>();
        Map<String, User> map = new HashMap<>();
        dao.setMap(map);
        dao.save("1", new User(1, "长江1号"));
        dao.save("2", new User(2, "长江2号"));
        dao.save("3", new User(3, "长江3号"));
        System.out.println("1= "+dao.get("1"));
        dao.update("1", new User(4, "长江4号"));
        System.out.println("1= "+dao.get("1"));
        System.out.println(dao.list());
        dao.delete("2");
        System.out.println(dao.list());
    }
}
