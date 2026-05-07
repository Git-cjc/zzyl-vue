package com.ruoyi.serve.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 护理项目对象 nursing_project
 *
 * @author ruoyi
 * @date 2026-05-06
 */
@Schema(description = "护理项目对象")
public class NursingProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Schema(description = "护理项目编号")
    private Long id;

    /** 名称 */
    @Schema(description = "护理项目名称")
    @Excel(name = "名称")
    private String name;

    /** 排序号 */
    @Schema(description = "排序号，数值越小越靠前")
    @Excel(name = "排序号")
    private Integer orderNo;

    /** 单位 */
    @Schema(description = "护理项目计费单位，例如次、小时、天")
    @Excel(name = "单位")
    private String unit;

    /** 价格 */
    @Schema(description = "护理项目价格")
    @Excel(name = "价格")
    private BigDecimal price;

    /** 图片 */
    @Schema(description = "护理项目图片地址")
    @Excel(name = "图片")
    private String image;

    /** 护理要求 */
    @Schema(description = "护理项目的服务要求或注意事项")
    @Excel(name = "护理要求")
    private String nursingRequirement;

    /** 状态（0：禁用，1：启用） */
    @Schema(description = "状态：0禁用，1启用", allowableValues = {"0", "1"})
    @Excel(name = "状态", readConverterExp = "0=禁用,1=启用")
    private Integer status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setOrderNo(Integer orderNo) 
    {
        this.orderNo = orderNo;
    }

    public Integer getOrderNo() 
    {
        return orderNo;
    }

    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }

    public void setNursingRequirement(String nursingRequirement) 
    {
        this.nursingRequirement = nursingRequirement;
    }

    public String getNursingRequirement() 
    {
        return nursingRequirement;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("orderNo", getOrderNo())
            .append("unit", getUnit())
            .append("price", getPrice())
            .append("image", getImage())
            .append("nursingRequirement", getNursingRequirement())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
