package com.mio.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StableTerminalInfo implements Serializable {
    private Long id;

    private String terminalId;

    private String hostIp;

    private String hostName;

    private String cpuModel;

    private BigDecimal cpuFrequency;

    private BigDecimal memorySize;

    private BigDecimal diskSize;

    private String graphic;

    private String networkCard;

    private String operateSystem;

    private String browser;

    private String printerModel;

    private String tabletsModel;

    private String districtId;

    private String officeId;

    private Date createdTime;

    private String deviceType;

    private String clientIp;

    private Date updateTime;

    private String state;

    private Date devUpTime;

    private Date dtdevDownTime;

    private Date dtdevFirstfoundTime;

    private String isStatus;

    private String terUse;

    private String mac;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId == null ? null : terminalId.trim();
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp == null ? null : hostIp.trim();
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel == null ? null : cpuModel.trim();
    }

    public BigDecimal getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(BigDecimal cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public BigDecimal getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(BigDecimal memorySize) {
        this.memorySize = memorySize;
    }

    public BigDecimal getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(BigDecimal diskSize) {
        this.diskSize = diskSize;
    }

    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic == null ? null : graphic.trim();
    }

    public String getNetworkCard() {
        return networkCard;
    }

    public void setNetworkCard(String networkCard) {
        this.networkCard = networkCard == null ? null : networkCard.trim();
    }

    public String getOperateSystem() {
        return operateSystem;
    }

    public void setOperateSystem(String operateSystem) {
        this.operateSystem = operateSystem == null ? null : operateSystem.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getPrinterModel() {
        return printerModel;
    }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel == null ? null : printerModel.trim();
    }

    public String getTabletsModel() {
        return tabletsModel;
    }

    public void setTabletsModel(String tabletsModel) {
        this.tabletsModel = tabletsModel == null ? null : tabletsModel.trim();
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId == null ? null : districtId.trim();
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getDevUpTime() {
        return devUpTime;
    }

    public void setDevUpTime(Date devUpTime) {
        this.devUpTime = devUpTime;
    }

    public Date getDtdevDownTime() {
        return dtdevDownTime;
    }

    public void setDtdevDownTime(Date dtdevDownTime) {
        this.dtdevDownTime = dtdevDownTime;
    }

    public Date getDtdevFirstfoundTime() {
        return dtdevFirstfoundTime;
    }

    public void setDtdevFirstfoundTime(Date dtdevFirstfoundTime) {
        this.dtdevFirstfoundTime = dtdevFirstfoundTime;
    }

    public String getIsStatus() {
        return isStatus;
    }

    public void setIsStatus(String isStatus) {
        this.isStatus = isStatus == null ? null : isStatus.trim();
    }

    public String getTerUse() {
        return terUse;
    }

    public void setTerUse(String terUse) {
        this.terUse = terUse == null ? null : terUse.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", terminalId=").append(terminalId);
        sb.append(", hostIp=").append(hostIp);
        sb.append(", hostName=").append(hostName);
        sb.append(", cpuModel=").append(cpuModel);
        sb.append(", cpuFrequency=").append(cpuFrequency);
        sb.append(", memorySize=").append(memorySize);
        sb.append(", diskSize=").append(diskSize);
        sb.append(", graphic=").append(graphic);
        sb.append(", networkCard=").append(networkCard);
        sb.append(", operateSystem=").append(operateSystem);
        sb.append(", browser=").append(browser);
        sb.append(", printerModel=").append(printerModel);
        sb.append(", tabletsModel=").append(tabletsModel);
        sb.append(", districtId=").append(districtId);
        sb.append(", officeId=").append(officeId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", clientIp=").append(clientIp);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", state=").append(state);
        sb.append(", devUpTime=").append(devUpTime);
        sb.append(", dtdevDownTime=").append(dtdevDownTime);
        sb.append(", dtdevFirstfoundTime=").append(dtdevFirstfoundTime);
        sb.append(", isStatus=").append(isStatus);
        sb.append(", terUse=").append(terUse);
        sb.append(", mac=").append(mac);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}