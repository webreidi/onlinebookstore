import com.google.inject.*;
import static org.mockito.Mockito.*;
import java.sql.Connection;

import config.DBConnection;

public class TestModule extends AbstractModule {
    @Override
    protected void configure() {
        DBConnection dbConnection = mock(DBConnection.class);
        Connection con = mock(Connection.class);
 
        when(dbConnection.getCon()).thenReturn(con);
        bind(DBConnection.class).toInstance(dbConnection);
    }
}