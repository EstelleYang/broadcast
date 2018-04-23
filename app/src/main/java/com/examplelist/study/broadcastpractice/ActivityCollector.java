package com.examplelist.study.broadcastpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 强制下线需要关闭所有的活动，然后回到登录页面，创建一个活动管理类
 */
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();
    /**
     * 添加活动
     */
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    /**
     * 删除活动
     */
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    /**
     * 销毁活动
     */
    public static void finishAll(){
        for (Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }
}