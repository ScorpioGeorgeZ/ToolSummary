package StopWatchTest;

import StopWatchTool.StopWatchDemo;
import com.alibaba.fastjson.JSON;
import org.springframework.util.StopWatch;

public class StopWatchTest {

    public static void main(String[] args) {


        StopWatchDemo demo = new StopWatchDemo();


        StopWatch stopWatch = new StopWatch("stopwatch test");


        stopWatch.start("执行本地方法");
        demo.executeNative();
        stopWatch.stop();


        stopWatch.start("执行数据库操作");
        demo.executeDB();
        stopWatch.stop();


        stopWatch.start("执行远程调用");
        demo.executeRPC();
        stopWatch.stop();


        System.out.println(stopWatch.prettyPrint());

        System.out.println("\n");


        System.out.println(stopWatch.shortSummary());

        System.out.println("\n");


        System.out.println(JSON.toJSON(stopWatch.getTaskInfo()));
    }


}
