package com.xiaojie;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiaojie
 * Date: 1/5/14
 * Time: 11:21
 * To change this template use File | Settings | File Templates.
 */
public class StopThread {
    private static volatile    boolean stopFlag = false;
    public static void main(String args[]) throws InterruptedException {
        Thread runningThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(!stopFlag){
                    i++;
                }
            }
        }) ;
        runningThread.start();;
        Thread.sleep(2000);
        stopFlag = true;
    }
}
