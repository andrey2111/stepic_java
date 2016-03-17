/**
 * Created by andrey on 16.10.2015.
 */
public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);
    @Override
    void close();
}
public interface RobotConnectionManager {
    RobotConnection getConnection();
}
public class RobotConnectionException extends RuntimeException {

    public RobotConnectionException(String message) {
        super(message);

    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
public class Robot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int errorCount=0; boolean isClosed = false;
        RobotConnection uplink=null;
        while(errorCount<3){
            try
            {isClosed = false;
                uplink = robotConnectionManager.getConnection();
                uplink.moveRobotTo(toX, toY);
                break;
            }
            catch(RobotConnectionException e)
            {
                ++ errorCount;
                if(errorCount == 3)
                {
                    throw new RobotConnectionException(" ");
                }
            }
            catch(RuntimeException e)
            {
                try
                {    if(isClosed == false) {
                    uplink.close();
                    isClosed=true;
                }
                }
                catch (RobotConnectionException e1) { }
                throw e;
            }
            finally
            {
                try{if(isClosed == false) {
                    uplink.close();
                    isClosed=true;
                }}
                catch(RuntimeException e){ }
            }

        }
    }
    }