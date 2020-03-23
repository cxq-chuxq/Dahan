import java.util.*;

//定义一个泛型Dao<T>，在其中顶一个Map成员变量,Map的键为String类型，值为T类型
//分别创建以下方法:
//public void save(String id,T entity) 保存T乐行的对象到map集合中
//public T get(String id) 从map中获取id对应的对象
//public  void update(String id,T entity) 替换map中的key为id的内容
//public List<T> list()  返回map中所有的 T 对象
//public  void delete(String id) 删除指定对象
public class Dao<T> {
    Map<String,T> map;//定义一个泛型Dao<T>，在其中顶一个Map成员变量,Map的键为String类型，值为T类型
    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }
    public void save(String id,T entity){//public void save(String id,T entity) 保存T乐行的对象到map集合中
        map.put(id, entity);
    }
    public T get(String id){//public T get(String id) 从map中获取id对应的对象
        return map.get(id);
    }
    public void update(String id,T enetity){//public  void update(String id,T entity) 替换map中的key为id的内容
        map.replace(id,enetity);
    }
    public List<T> list(){//public List<T> list()  返回map中所有的 T 对象
        List<T> list=new ArrayList<>();
        Set<String> set=map.keySet();
        Iterator it=set.iterator();
        while (it.hasNext()){
            String key= (String) it.next();
            System.out.println(map.get(key));
        }
        return list;
    }
    public void delete(String id){//public  void delete(String id) 删除指定对象
        map.remove(id);
    }

}
