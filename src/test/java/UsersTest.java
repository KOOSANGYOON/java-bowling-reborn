import com.bowling.reborn.domain.Frames;
import com.bowling.reborn.domain.User;
import com.bowling.reborn.domain.Users;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UsersTest {
    private static final Logger log = LoggerFactory.getLogger(UsersTest.class);

    private Users makeUsers() {
        log.debug("make new Users.");
        Users userlist = new Users();
        return userlist;
    }

    private Frames makeFrames() {
        log.debug("make new Frames.");
        Frames newFrames = new Frames();
        return newFrames;
    }

    private User makeNewUser(String userName) {
        log.debug("make new User that name is \"" + userName + "\".");
        Frames newFrames = makeFrames();
        User testUser = new User(userName, newFrames);
        return testUser;
    }

    @Test
    public void getUserTest() {
        log.debug("---Start get User Test---");
        Users userList = makeUsers();

        userList.addPlayer(makeNewUser("testUser"));
        assertThat(userList.getUser(0).getUserName(), is("testUser"));
    }

    @Test
    public void addUserTest() {
        log.debug("---Start add User Test---");
        Users userList = makeUsers();
        assertThat(userList.totalUserSize(), is(0));

        userList.addPlayer(makeNewUser("test1"));
        assertThat(userList.totalUserSize(), is(1));
    }
}
