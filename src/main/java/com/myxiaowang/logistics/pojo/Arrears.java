package com.myxiaowang.logistics.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wck
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年01月21日 17:59:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "arrears")
public class Arrears {
    @TableId(value = "id" ,type = IdType.AUTO)
    private Integer id;
    @TableField(value = "userid")
    private String userId;
    @TableField(value = "money")
    private BigDecimal money;
    @TableField(value = "goodsname")
    private String goodsName;
    @TableField(value = "orderid")
    private String orderId;
    @TableField(value = "username")
    private String username;
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(value = "arruserid")
    private String arrUserid;
}
