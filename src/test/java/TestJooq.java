import org.jooq.DSLContext;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static com.xqdd.test.jooq.Tables.BOOK;

public class TestJooq extends BaseSpringTest {

    @Autowired
    private DSLContext dsl;

    @Test
    public void testJooq() {
        dsl.select().from(BOOK).fetch();
    }

}

