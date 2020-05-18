package test;

import java.util.List;
import java.util.Map;


/**
 * 定时任务service层
 * @author zx
 *
 */
public interface IQuartzService {
	
	/**
	 * 获取任务状态为1启用、触发器状态为1运行中的所有定时任务集合
	 */
	public List<InstmtQuartz> getInstmtQuartzList(Map<String, Object> map);
	
	/**
	 * 根据id获取到定时任务类
	 * @param id
	 * @return
	 */
	public InstmtQuartz getQuartzByid(String id);
	
	/**
	 * 根据id删除定时任务
	 * @param id
	 */
	public void delQuartzByid(String id);
	
	/**
	 * 新增InstmtQuartz对象
	 * @param quartz
	 */
	public void insertQuartz(InstmtQuartz quartz);
	
	/**
	 * 根据id进行对应字段的更新(选择性的更新)
	 * @param quartz
	 */
	public void updateQuartzByid(InstmtQuartz quartz);

}
