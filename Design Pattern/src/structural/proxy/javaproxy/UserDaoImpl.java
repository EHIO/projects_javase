package structural.proxy.javaproxy;

public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("start dao save");
    }

}