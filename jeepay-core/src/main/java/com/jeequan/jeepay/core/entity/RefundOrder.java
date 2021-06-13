/*
 * Copyright (c) 2021-2031, 河北计全科技有限公司 (https://www.jeequan.com & jeequan@126.com).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jeequan.jeepay.core.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jeequan.jeepay.core.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 退款订单表
 * </p>
 *
 * @author [mybatis plus generator]
 * @since 2021-04-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_refund_order")
public class RefundOrder extends BaseModel implements Serializable {

    public static final LambdaQueryWrapper<RefundOrder> gw(){
        return new LambdaQueryWrapper<>();
    }

    private static final long serialVersionUID=1L;

    /**
     * 退款订单号
     */
    @TableId
    private String refundOrderId;

    /**
     * 支付订单号
     */
    private String payOrderId;

    /**
     * 渠道支付单号
     */
    private String channelPayOrderNo;

    /**
     * 商户号
     */
    private String mchNo;

    /**
     * 类型: 1-普通商户, 2-特约商户(服务商模式)
     */
    private Byte mchType;

    /**
     * 商户退款单号
     */
    private String mchRefundNo;

    /**
     * 服务商号
     */
    private String isvNo;

    /**
     * 支付方式代码
     */
    private String wayCode;

    /**
     * 支付接口代码
     */
    private String ifCode;

    /**
     * 支付金额,单位分
     */
    private Long payAmount;

    /**
     * 退款金额,单位分
     */
    private Long refundAmount;

    /**
     * 三位货币代码,人民币:cny
     */
    private String currency;

    /**
     * 退款状态:0-订单生成,1-退款中,2-退款成功,3-退款失败
     */
    private Byte state;

    /**
     * 退款结果:0-不确认结果,1-等待手动处理,2-确认成功,3-确认失败
     */
    private Byte result;

    /**
     * 客户端IP
     */
    private String clientIp;

    /**
     * 备注
     */
    private String remark;

    /**
     * 渠道订单号
     */
    private String channelOrderNo;

    /**
     * 渠道错误码
     */
    private String channelErrCode;

    /**
     * 渠道错误描述
     */
    private String channelErrMsg;

    /**
     * 特定渠道发起时额外参数
     */
    private String channelExtra;

    /**
     * 通知地址
     */
    private String notifyUrl;

    /**
     * 扩展参数
     */
    private String extParam;

    /**
     * 订单退款成功时间
     */
    private Date successTime;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;


}