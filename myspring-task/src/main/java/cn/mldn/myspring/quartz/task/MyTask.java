package cn.mldn.myspring.quartz.task;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component  //相当于是个bean 
public class MyTask {	// 整个的类没有任何的强制性的定义
//	@Scheduled(cron="0 * * * * ?") 	// 每秒一触发		 
	@Scheduled(fixedRate=1000)	//每秒一触发 （属于间隔 触发）
	public void runJob() {	// 自己定义了一个任务调度执行方法
		System.out.println(
				"【当前日期时间】" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
						.format(new java.util.Date()));
	}
}
