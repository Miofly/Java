package com.mio.service;

import com.mio.pojo.MioLeftList;
import com.mio.pojo.vo.MioLeftListCustom;
import com.mio.pojo.vo.MioLeftListQueryVo;
import com.mio.util.EUDataGridResult;
import com.mio.util.EUTreeNode;

import java.util.List;
import java.util.Map;

public interface UserService {

	/*treetable*/
	/*树形节点表格分页及查询条件*/
	EUDataGridResult findTableList(MioLeftListQueryVo mioLeftListQueryVo, int pageIndex, int pageSize) throws Exception;
	/*单个删除*/
	public void delRow(Long id) throws Exception;
	/*批量单个删除*/
	public void delRows(List<Long> ids) throws Exception;
	/*查询某个用户信息*/
	public MioLeftListCustom findTreeId(MioLeftListQueryVo mioLeftListQueryVo) throws Exception;
	/*修改用户提交*/
	public void updateTreeById(MioLeftListCustom mioLeftListCustom) throws Exception;

	public void updateTreesnew(MioLeftListCustom mioLeftListCustom)throws Exception;

	List<EUTreeNode> getCategoryList(Long parentId) throws Exception;





//	public void updateTrees(List<BigDecimal> ids) throws Exception;
	public void updateTrees(MioLeftList mioLeftList)throws Exception;

	public void insertTree(MioLeftList mioLeftList) throws Exception;


//	public List<MioLeftListCustom> selectTreeList() throws  Exception;

	public List<MioLeftListCustom> findTreeExp(MioLeftListQueryVo mioLeftListQueryVo)
			throws Exception;



}
