import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by IntelliJ IDEA.
 * User: Chuffo
 * Date: 2009-maj-15
 * Time: 14:46:25
 * To change this template use File | Settings | File Templates.
 */
public class TorsoPara {
    public static void main() {
        LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>();
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(4, 4, 500, java.util.concurrent.TimeUnit.MILLISECONDS, workQueue);
    }
}

