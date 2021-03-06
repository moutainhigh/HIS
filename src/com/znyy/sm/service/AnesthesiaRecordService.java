package com.znyy.sm.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.znyy.bean.SmAnaesEvent;
import com.znyy.bean.SmAnaesEventItems;
import com.znyy.bean.SmAnaesRecord;
import com.znyy.bean.SmBloodtypeItem;
import com.znyy.bean.SmBodyPosition;
import com.znyy.bean.SmBreathEvent;
import com.znyy.bean.SmIoDefination;
import com.znyy.bean.SmIoEvent;
import com.znyy.bean.SmMedicalEvent;
import com.znyy.bean.SmMedicalTakeWay;
import com.znyy.bean.SmMedicine;
import com.znyy.bean.SmOperationEvent;
import com.znyy.bean.SmOutRoomStatus;
import com.znyy.bean.SmRegOpt;
import com.znyy.bean.SmRemarkPoint;
import com.znyy.bean.SmWaveData;

public interface AnesthesiaRecordService {
	
	
	
	 /**
	 * @方法名称: loadAnesthesiaRecordMainView
	 * @功能描述: 医疗文书跳转到麻醉记录界面
	 * @作者:崔连瑞
	 * @创建时间:2016-3-02 上午10:41:21
	 * @param ylwsid
	 * @return SmRegOpt
	 */
	public SmRegOpt loadAnesthesiaRecordMainView(String ylwsid);
	
	 /**
	 * @方法名称: collectItemsPointByOptId
	 * @功能描述: 通过手术ID获取该病人的要查询时间的点
	 * @作者:崔连瑞
	 * @创建时间:2016-3-04 上午10:41:21
	 * @param operationId
	 * @return List<SmRemarkPoint>   
	 */
	public List<SmRemarkPoint> collectItemsPointByOptId(String operationId,String id);
	
	public List<Map<String, Object>> loadAllDocumentState();
	
	 /**
	 * @方法名称: getSmMedicineAllList
	 * @功能描述: 获取麻醉用药
	 * @作者:崔连瑞
	 * @创建时间:2016-3-04 上午10:41:21
	 * @param 
	 * @return List<SmMedicine>   
	 */
	public List<SmMedicine> getSmMedicineAllList();
	 /**
	 * @方法名称: getMedicineNameByPinYin
	 * @功能描述: 获取麻醉用药
	 * @作者:崔连瑞
	 * @创建时间:2016-3-04 上午10:41:21
	 * @param 
	 * @return List<SmMedicine>   
	 */
	public List<SmMedicine> getMedicineNameByPinYin(String mpyCode);
	 /**
	 * @方法名称: getMedicineById
	 * @功能描述: 获取麻醉用药
	 * @作者:崔连瑞
	 * @创建时间:2016-3-04 上午10:41:21
	 * @param 
	 * @return SmMedicine 
	 */
	public SmMedicine getMedicineById(Integer medicineId);
	 /**
	 * @方法名称: getSmMedicalTakeWayAllList
	 * @功能描述: 获取给药途径
	 * @作者:崔连瑞
     * @创建时间:2016-3-15 上午10:41:21
	 * @param 
	 * @return List<SmMedicalTakeWay>   
	 */
	public List<SmMedicalTakeWay> getSmMedicalTakeWayAllList();
	
	 /**
		 * @方法名称: getInPutById
		 * @功能描述: 获取液体入量
		 * @作者:崔连瑞
	     * @创建时间:2016-3-24 上午10:41:21
		 * @param 
		 * @return SmIoDefination 
		 */
	public SmIoDefination getInPutById(Integer inPutId);
	
	 /**
		 * @方法名称: getSmIoDefinationList
		 * @功能描述: 获取液体出量
		 * @作者:崔连瑞
	     * @创建时间:2016-3-24 上午10:41:21
		 * @param 
		 * @return List<SmIoDefination>   
		 */
	public List<SmIoDefination> getSmIoDefinationList();
	
	/**
	 * @方法名称: getSmBloodtypeItemList
	 * @功能描述: 获取血型
	 * @作者:崔连瑞
	 * @创建时间:2016-3-24 上午10:41:21
	 * @param 
	 * @return List<SmBloodtypeItem>   
	 */
	public List<SmBloodtypeItem> getSmBloodtypeItemList();
	
	 /**
		 * @方法名称: addSmIoEvent
		 * @功能描述: 添加液体出量
		 * @作者:崔连瑞
	     * @创建时间:2016-3-24 上午10:41:21
		 * @param 
		 * @return    
		 */
	public void addSmIoEvent(SmIoEvent smie);

	
	/**
	 * @方法名称: addSmAnaesRecord
	 * @功能描述: 创建麻醉记录单
	 * @作者:崔连瑞
	 * @创建时间:2016-3-24 上午10:41:21
	 * @param 
	 * @return    
	 */
	public void addSmAnaesRecord(SmAnaesRecord sar);
	
	
	/**
	 * @方法名称: updateSmAnaesRecord
	 * @功能描述: 更新麻醉记录单
	 * @作者:崔连瑞
	 * @创建时间:2016-3-24 上午10:41:21
	 * @param 
	 * @return    
	 */
	public void updateSmAnaesRecord(SmAnaesRecord sar);
	
	
	/**
	 * @方法名称: updateSmAnaesRecord
	 * @功能描述: 更新麻醉记录单
	 * @作者:崔连瑞
	 * @创建时间:2016-3-24 上午10:41:21
	 * @param 
	 * @return    
	 */
	public SmAnaesRecord getSmAnaesRecordByoperationId(String operationId);
		
	 /**
	 * @方法名称: addSmIoEvent
	 * @功能描述: 添加液体出量
	 * @作者:崔连瑞
     * @创建时间:2016-3-24 上午10:41:21
	 * @param 
	 * @return    
	 */
    public SmIoEvent getSmIoEventById(String operationId,String itemId); 
    
    /**
   	 * @方法名称: updateSmIoEvent
   	 * @功能描述: 修改液体出量
   	 * @作者:崔连瑞
     * @创建时间:2016-3-24 上午10:41:21
   	 * @param 
   	 * @return    
   	 */
       public void updateSmIoEvent(SmIoEvent smie); 
       
      /**
       * @方法名称: getSmIoEventListByOperationId
       * @功能描述: 获取液体出量
       * @作者:崔连瑞
       * @创建时间:2016-3-24 上午10:41:21
       * @param 
       * @return    
       */
       public List<SmIoEvent> getSmIoEventListByOperationId(String operationId,String type);
       
       /**
        * @方法名称: getSmIoEventListByOperationId
        * @功能描述: 获取液体出量
        * @作者:崔连瑞
        * @创建时间:2016-3-24 上午10:41:21
        * @param 
        * @return    getSmIoEventListById
        */
        public SmIoEvent getSmIoEventById(Integer id);
        
       
       /**
        * @方法名称: getInChildNamesBySubType
        * @功能描述: 获取液体出量
        * @作者:崔连瑞
        * @创建时间:2016-3-24 上午10:41:21
        * @param 
        * @return    
        */
       public List<SmIoDefination> getInChildNamesBySubType(String subType);
       
       /**
        * @方法名称: getSmAnaesEventItemsList
        * @功能描述: 获取麻醉事件项
        * @作者:崔连瑞
        * @创建时间:2016-3-31 上午10:41:21
        * @param 
        * @return    List<SmAnaesEventItems>
        */
       public List<SmAnaesEventItems> getSmAnaesEventItemsList();
       
       /**
        * @方法名称: getSmAnaesEventItem
        * @功能描述: 获取麻醉事件项
        * @作者:崔连瑞
        * @创建时间:2016-3-31 上午10:41:21
        * @param 
        * @return    SmAnaesEventItem
        */
       public SmAnaesEventItems getSmAnaesEventItem(String code);
       
       /**
        * @方法名称: addSmAnesthesiaEvent
        * @功能描述: 添加麻醉事件
        * @作者:崔连瑞
        * @创建时间:2016-3-31 上午10:41:21
        * @param 
        * @return    
        */
       public void addSmAnesthesiaEvent(SmAnaesEvent sae);
       
       /**
        * @方法名称: addSmAnesthesiaEvent
        * @功能描述: 添加麻醉事件
        * @作者:崔连瑞
        * @创建时间:2016-3-31 上午10:41:21
        * @param 
        * @return    
        */
       public void updateSmAnesthesiaEvent(SmAnaesEvent sae);
       
       /**
        * @方法名称: getSmAnesthesiaEventsListByOptId
        * @功能描述: 查询麻醉事件，通过手术ID
        * @作者:崔连瑞
        * @创建时间:2016-3-31 上午11:41:21
        * @param 
        * @return    
        */
       public List<SmAnaesEvent> getSmAnesthesiaEventsListByOptId(String operationId);
       
       /**
        * @方法名称: getSmAnesEventByOptIdAndCode
        * @功能描述: 查询麻醉事件，通过手术ID
        * @作者:崔连瑞
        * @创建时间:2016-3-31 上午11:41:21
        * @param 
        * @return    
        */
       public SmAnaesEvent getSmAnesEventByOptIdAndCode(String operationId,String code);
       
       /**
        * @方法名称: getSmAnesEventByOptId
        * @功能描述: 查询麻醉事件，通过手术ID
        * @作者:崔连瑞
        * @创建时间:2016-3-31 上午11:41:21
        * @param 
        * @return    
        */
       public List<SmAnaesEvent> getSmAnesEventByOptId(String operationId);
       
       /**
        * @方法名称: updateSmRegOpt
        * @功能描述: 更新手术信息
        * @作者:崔连瑞
        * @创建时间:2016-3-31 上午11:41:21
        * @param 
        * @return    
        */
       public void updateSmRegOpt(SmRegOpt sro);
       
       /**
        * @方法名称: getSmMedicalEventByOptIdAndMedCode
        * @功能描述: 查询用药事件，通过手术ID
        * @作者:崔连瑞
        * @创建时间:2016-4-12 上午11:41:21
        * @param 
        * @return    
        */
       public SmMedicalEvent getSmMedicalEventByOptIdAndMedCode(String operationId,String medId);
       
       /**
        * @方法名称: addSmMedicalEvent
        * @功能描述: 添加麻醉用药
        * @作者:崔连瑞
        * @创建时间:2016-4-12 上午11:41:21
        * @param 
        * @return    
        */
       public void addSmMedicalEvent(SmMedicalEvent sme);
       
       /**
        * @方法名称: updateSmMedicalEvent
        * @功能描述: 修改麻醉用药
        * @作者:崔连瑞
        * @创建时间:2016-4-12 上午11:41:21
        * @param 
        * @return    
        */
       public void updateSmMedicalEvent(SmMedicalEvent sme);
       
       /**
        * @方法名称: getMedEventById
        * @功能描述: 获取麻醉用药
        * @作者:崔连瑞
        * @创建时间:2016-4-12 上午11:41:21
        * @param id
        * @return    SmMedicalEvent
        */
       public SmMedicalEvent getMedEventById(Integer id);
       
       /**
        * @方法名称: getSmMedicalEventListByOperationId
        * @功能描述: 获取麻醉用药
        * @作者:崔连瑞
        * @创建时间:2016-4-12 上午11:41:21
        * @param operationId
        * @return    List<SmMedicalEvent>
        */
       public List<SmMedicalEvent> getSmMedicalEventListByOperationId(String operationId);
       
       /**
        * @方法名称: addMonitoringSign
        * @功能描述: 保存采集项
        * @作者:崔连瑞
        * @创建时间:2016-4-19 下午7:41:21
        * @param 
        * @return    
        */
       public void addMonitoringSign(SmWaveData smwd);
       
       /**
        * @方法名称: updateMonitoringSign
        * @功能描述: 修改采集项
        * @作者:崔连瑞
        * @创建时间:2016-4-19 下午7:41:21
        * @param 
        * @return    
        */
       public void updateMonitoringSign(SmWaveData smwd);
       
       
       /**
        * @方法名称: getMonitoringSignBy
        * @功能描述: 获取采集项
        * @作者:崔连瑞
        * @创建时间:2016-4-19 下午7:41:21
        * @param 
        * @return    
        */
       public SmWaveData getMonitoringSignByOperationIdAndTime(String operationId,Integer xpoint);
       
       /**
        * @方法名称: getOperationEventById
        * @功能描述: 获取手术事件对象ById
        * @作者:崔连瑞
        * @创建时间:2016-4-19 下午7:41:21
        * @param id
        * @return    SmOperationEvent
        */
       public SmOperationEvent getOperationEventById(String id);
       
       
       
       /**
        * @方法名称: getOperationEventByOperationId
        * @功能描述: 获取手术事件   通过手术ID
        * @作者:崔连瑞
        * @创建时间:2016-4-19 下午7:41:21
        * @param operationId
        * @return    List<SmOperationEvent>
        */
       public List<SmOperationEvent> getOperationEventByOperationId(String operationId);
       
       /**
        * @方法名称: addOperationEvent
        * @功能描述: 保存手术事件
        * @作者:崔连瑞
        * @创建时间:2016-4-19 下午7:41:21
        * @param 
        * @return    
        */
       public void addOperationEvent(SmOperationEvent sopet);
       
       /**
        * @方法名称: updateOperationEvent
        * @功能描述: 修改手术事件
        * @作者:崔连瑞
        * @创建时间:2016-4-19 下午7:41:21
        * @param 
        * @return    
        */
       public void updateOperationEvent(SmOperationEvent sopet);
       
       /**
        * @方法名称: getMonitoringSignListByOperationId
        * @功能描述: 获取采集项   通过手术ID
        * @作者:崔连瑞
        * @创建时间:2016-4-19 下午7:41:21
        * @param operationId
        * @return    List<SmWaveData>
        */
       public List<SmWaveData> getMonitoringSignListByOperationId(String operationId);
       
       
   	/**
   	 * @throws ParseException 
   	 * @Title: getArrangeWeekPrint 
   	 * @Description: 获取打印数据
   	 * @author 崔连瑞
   	 * @date 2016-2-24 下午5:59:54
   	 * @param @return
   	 * @return List<Map<String,Object>>
   	 * @throws 
   	 *
   	 */ 
   	
      public List<Map<String, Object>> getAnesthesiaRecordWeekPrint(String operationId);
       
      
      /**
       * @方法名称: getSmBreathEventById
       * @功能描述: 获取呼吸事件对象ById
       * @作者:崔连瑞
       * @创建时间:2016-4-19 下午7:41:21
       * @param 
       * @return     
       */
      public SmBreathEvent getSmBreathEventById(String id);
      
      
      
      /**
       * @方法名称: getSmBreathEventByOperationId
       * @功能描述: 获取呼吸事件   通过手术ID
       * @作者:崔连瑞
       * @创建时间:2016-4-19 下午7:41:21
       * @param operationId
       * @return    List<SmOperationEvent>
       */
      public List<SmBreathEvent> getSmBreathEventByOperationId(String operationId);
      
      /**
       * @方法名称: addSmBreathEvent
       * @功能描述: 保存呼吸事件
       * @作者:崔连瑞
       * @创建时间:2016-4-19 下午7:41:21
       * @param 
       * @return    
       */
      public void addSmBreathEvent(SmBreathEvent sbet);
      
      /**
       * @方法名称: updateSmBreathEvent
       * @功能描述: 修改呼吸事件
       * @作者:崔连瑞
       * @创建时间:2016-4-19 下午7:41:21
       * @param 
       * @return    
       */
      public void updateSmBreathEvent(SmBreathEvent sbet);
  
      
      
      /**
       * @方法名称: getSmBodyPositionByOperationId
       * @功能描述: 获取体位  通过手术ID
       * @作者:崔连瑞
       * @创建时间:2016-4-19 下午7:41:21
       * @param   operationId
       * @return  List<SmBodyPosition>
       */
      public SmBodyPosition getSmBodyPositionByOperationId(String operationId);
      
      /**
       * @方法名称: addSmBreathEvent
       * @功能描述: 保存体位
       * @作者:崔连瑞
       * @创建时间:2016-4-19 下午7:41:21
       * @param 
       * @return    
       */
      public void addSmBodyPosition(SmBodyPosition sbp);
      
      /**
       * @方法名称: updateSmBodyPosition
       * @功能描述: 修改体位
       * @作者:崔连瑞
       * @创建时间:2016-4-19 下午7:41:21
       * @param 
       * @return    
       */
      public void updateSmBodyPosition(SmBodyPosition sbp);
      
      
      /**
       * @方法名称: getSmOutRoomStatusByoperationId
       * @功能描述: 获取出室情况
       * @作者:崔连瑞
       * @创建时间:2016-4-19 下午7:41:21
       * @param   operationId
       * @return  SmOutRoomStatus
       */
      public SmOutRoomStatus getSmOutRoomStatusByoperationId(String operationId);
      
      /**
       * @方法名称: addSmOutRoomStatus
       * @功能描述: 保存出室情况
       * @作者:崔连瑞
       * @创建时间:2016-4-19 下午7:41:21
       * @param 
       * @return    
       */
      public void addSmOutRoomStatus(SmOutRoomStatus sors);
      
      /**
       * @方法名称: updateSmOutRoomStatus
       * @功能描述: 修改出室情况
       * @作者:崔连瑞
       * @创建时间:2016-4-19 下午7:41:21
       * @param 
       * @return    
       */
      public void updateSmOutRoomStatus(SmOutRoomStatus sors);

	 /**
	 * @方法名称: modAnesthetistersByoperationName
	 * @功能描述: 删除麻醉人员
	 * @作者:付士山
	 * @创建时间:2016-6-17 下午4:59:07
	 * @param sross void   
	 */
	 
	public void modAnesthetistersByoperationName(SmRegOpt sross);

	public SmAnaesRecord getAnaesRecordByoperationId(String operationId);

	 /**
     * @方法名称: createVitalSign
     * @功能描述: 模拟创建体征信息
     * @作者:崔连瑞
     * @创建时间:2016-4-19 下午7:41:21
     * @param 
     * @return    
     */
    public void createVitalSign(SmRemarkPoint srp);
	
	/**
	 * @方法名称: getTimesByOptId
	 * @功能描述: 获取病人所有体征信息时间集合
	 * @作者:崔连瑞
	 * @创建时间:2016-3-04 上午10:41:21
	 * @param String operationId,String hospitalCode,String roomCode
	 * @return List<Date>   
	 */
	public List<Date> getTimesByOptId(String operationId,String hospitalCode,String roomCode);
	
	 /**
	 * @方法名称: collectItemsPointByOptId
	 * @功能描述: 通过手术ID获取该病人的要查询时间的点
	 * @作者:崔连瑞
	 * @创建时间:2016-3-04 上午10:41:21
	 * @param operationId
	 * @return SmRemarkPoint 
	 */
	public SmRemarkPoint collectItemsPointByOptId(String operationId,String itemCode, String hospitalCode,String roomCode,Date time);
	
	/**
	 * @Description: 获取手术事件列表
	 * @param @return   
	 * @return List<Map<String,Object>>  
	 * @throws
	 * @author 白东旭
	 * @date 2016年7月25日
	 */
	public List<Map<String, Object>> getAnesEventList();

	/**
	 * @Description: 添加麻醉事件
	 * @param @param itemCode
	 * @param @param operationId
	 * @param @param userid
	 * @param @return   
	 * @return Map<String,Object>  
	 * @throws
	 * @author 白东旭
	 * @date 2016年7月25日
	 */
	public Map<String, Object> addAnesEventItem(String itemCode, String operationId,
			String userid);

	/**
	 * @Description: 根据手术id获取麻醉事件
	 * @param @param ylwsid
	 * @param @return   
	 * @return List<Map<String, Object>>  
	 * @throws
	 * @author 白东旭
	 * @date 2016年7月26日
	 */
	public List<Map<String, Object>> getAnesEventByOperationId(String ylwsid);

	/**
	 * @param operationId 
	 * @Description: 添加手术事件
	 * @param @param title
	 * @param @param content
	 * @param @param time   
	 * @return SmOperationEvent  
	 * @throws ParseException 
	 * @throws
	 * @author 白东旭
	 * @date 2016年7月26日
	 */
	public SmOperationEvent addOperationEvent(String title, String content, String time, String operationId) throws ParseException;

	/**
	 * @Description: 获取手术事件
	 * @param @param ylwsid
	 * @param @return   
	 * @return List<SmOperationEvent>  
	 * @throws
	 * @author 白东旭
	 * @date 2016年7月27日
	 */
	public List<SmOperationEvent> getOpEventByOperationId(String ylwsid);

	/**
	 * @Description: 删除手术事件
	 * @param @param id   
	 * @return void  
	 * @throws
	 * @author 白东旭
	 * @date 2016年7月27日
	 */
	public void delOperationEventItem(String id);

	/**
	 * @Description: 根据id获取手术事件
	 * @param @param id
	 * @param @return   
	 * @return SmOperationEvent  
	 * @throws
	 * @author 白东旭
	 * @date 2016年7月27日
	 */
	public Map<String, Object> getOpEventById(String id);

	/**
	 * @Description: 修改手术信息
	 * @param @param title
	 * @param @param content
	 * @param @param time
	 * @param @param id
	 * @param @return   
	 * @return SmOperationEvent  
	 * @throws ParseException 
	 * @throws
	 * @author 白东旭
	 * @date 2016年7月27日
	 */
	public SmOperationEvent modOperationEvent(String title, String content,
			String time, String id) throws ParseException;

	/**
	 * @Description: 添加呼吸事件
	 * @param @param operationId
	 * @param @param time
	 * @param @param breathFlag
	 * @param @return   
	 * @return SmBreathEvent  
	 * @throws ParseException 
	 * @throws
	 * @author 白东旭
	 * @date 2016年7月28日
	 */
	public SmBreathEvent addBreathEvent(String operationId, String time,
			String breathFlag) throws ParseException;

	/**
	 * @Description: 获取呼吸事件列表
	 * @param @param ylwsid
	 * @param @return   
	 * @return List<SmBreathEvent>  
	 * @throws
	 * @author 白东旭
	 * @date 2016年7月28日
	 */
	public List<SmBreathEvent> getBreathEventByOperationId(String ylwsid);

	/**
	 * @Description: 删除呼吸事件
	 * @param @param id   
	 * @return void  
	 * @throws
	 * @author 白东旭
	 * @date 2016年7月28日
	 */
	public void delBreathEventItem(String id);


}
