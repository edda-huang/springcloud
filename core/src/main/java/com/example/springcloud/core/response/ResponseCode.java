package com.example.springcloud.core.response;

/**
 * 响应请求结果代码
 * @author huangzhihua
 * @Time 2016年7月2日 下午6:50:51
 */
public class ResponseCode {
    //--------------------------系统错误------------------------------------------
    /**
     * json返回响应结果成功标识，为success时表示处理成功
     */
    public static final String RESPONSE_COMMON_SUCCESS_CODE                    = "success";
    /**
     * json返回响应结果成功标识，为success时表示处理成功
     */
    public static final String RESPONSE_COMMON_SUCCESS_MESSAGE                 = "操作成功";

    /**
     * 系统错误Code
     */
    public static final String RESPONSE_COMMON_ERROR_CODE                      = "common_error";

    /**
     * 系统错误Message
     */
    public static final String RESPONSE_COMMON_ERROR_MESSAGE                   = "系统错误";

    /**
     * 用户未登录Code
     */
    public static final String RESPONSE_NOT_LOGIN_CODE                         = "user_not_login";

    /**
     * 用户未登录Message
     */
    public static final String RESPONSE_NOT_LOGIN_MESSAGE                      = "用户未登录";

    /**
     * 用户名密码错误Code
     */
    public static final String RESPONSE_USERNAME_PASS_ERROR_CODE               = "username_password_error";
    /**
     * 用户名密码错误Message
     */
    public static final String RESPONSE_USERNAME_PASS_ERROR_MESSAGE            = "用户名密码错误";

    /**
     * 用户5分钟登录失败3次,禁止用户10分钟内再次登录，错误Code
     */
    public static final String RESPONSE_LOCK_USER_ERROR_CODE               = "lock_user";

    /**
     * Token已过期Code
     */
    public static final String RESPONSE_TOKEN_TIMEOUT_CODE                     = "token_timeout";
    /**
     * Token已过期Message
     */
    public static final String RESPONSE_TOKEN_TIMEOUT_MESSAGE                  = "Token已过期";

    /**
     * 验证码错误Code
     */
    public static final String RESPONSE_VALIDATE_CODE_ERROR_CODE               = "validate_code_error";
    /**
     * 验证码错误Message
     */
    public static final String RESPONSE_VALIDATE_CODE_ERROR_MESSAGE            = "验证码错误";
    
    /**
     * 验证码错误Code
     */
    public static final String RESPONSE_VALIDATE_CODE2_ERROR_CODE               = "validate_code2_error";
    
    /**
     * 验证码错误Code
     */
    public static final String RESPONSE_VALIDATE_CODE2_EMPTY_CODE               = "validate_code2_empty";

    /**
     * 无效的客户端Code
     */
    public static final String RESPONSE_INVALID_SIGN_CODE                      = "invalid_sign";
    /**
     * 无效的客户端Message
     */
    public static final String RESPONSE_INVALID_SIGN_MESSAGE                   = "签名错误";

    /**
     * 登录名已经存在Code
     */
    public static final String RESPONSE_LOGIN_NAME_EXISTS_CODE                 = "login_name_exists";
    /**
     * 登录名已经存在Message
     */
    public static final String RESPONSE_LOGIN_NAME_EXISTS_MESSAGE              = "登录名已经存在！";
    /**
     * 登录名已经存在Code
     */
    public static final String RESPONSE_LOGIN_DEVICE_NOT_EXISTS_CODE                 = "device_not_exists";
    /**
     * 登录名已经存在Message
     */
    public static final String RESPONSE_LOGIN_DEVICE_NOT_EXISTS_MESSAGE              = "Minipay设备不存在！";

    /**
     * 请求参数错误Code
     */
    public static final String RESPONSE_REQUEST_PARAM_ERROR_CODE               = "request_param_error";

    /**
     * 请求参数错误Message
     */
    public static final String RESPONSE_REQUEST_PARAM_ERROR_MESSAGE            = "请求参数错误";

    /**
     * 用户登陆错误Code
     */
    public static final String RESPONSE_USER_LOGIN_ERROR_CODE                  = "user_login_error";
    /**
     * 用户登陆错误Message
     */
    public static final String RESPONSE_USER_LOGIN_ERROR_MESSAGE               = "用户登陆错误";

    /**
     * 生成微信签名字符串错误Code
     */
    public static final String RESPONSE_GEN_WECHAT_SIGN_ERROR_CODE             = "gen_wechat_sign_error";
    /**
     * 生成微信签名字符串错误Message
     */
    public static final String RESPONSE_GEN_WECHAT_SIGN_ERROR_MESSAGE          = "生成微信签名字符串错误";

    /**
     * 生成微信签名字符串错误Code
     */
    public static final String MP_CODE_INVALID_ERROR_CODE                      = "mp_code_invalid_error";
    /**
     * 生成微信签名字符串错误Message
     */
    public static final String MP_CODE_INVALID_ERROR_MESSAGE                   = "微信小程序登录CODE无效";

    /**
     * 查询日期错误Code
     */
    public static final String RESPONSE_QUERY_DATE_ERROR_CODE                  = "query_date_error";
    /**
     * 查询日期错误Message
     */
    public static final String RESPONSE_QUERY_DATE_ERROR_MESSAGE               = "查询日期错误";

    /**
     * 查询日期范围错误Code
     */
    public static final String RESPONSE_DATE_RANGE_ERROR_CODE                  = "date_range_error";
    /**
     * 查询日期范围错误Message
     */
    public static final String RESPONSE_DATE_RANGE_ERROR_MESSAGE               = "查询日期范围错误";

    /**
     * 配置错误错误Code
     */
    public static final String RESPONSE_CONFIG_ERROR_CODE                      = "config_error";
    /**
     * 配置错误错误Message
     */
    public static final String RESPONSE_CONFIG_ERROR_MESSAGE                   = "配置错误";

    //--------------------------系统错误------------------------------------------

    //--------------------------接口错误------------------------------------------
    /**
     * 接口不支持调用Code
     */
    public static final String RESPONSE_INTERFACE_NOT_SUPPORTED_CODE           = "interface_not_supported";
    /**
     * 接口不支持调用Message
     */
    public static final String RESPONSE_INTERFACE_NOT_SUPPORTED_MESSAGE        = "接口不支持调用！";
    //--------------------------接口错误------------------------------------------

    //--------------------------OCR识别错误---------------------------------------
    /** OCR可识别文件不存在Code */
    public static final String RESPONSE_OCR_FILE_NOT_EXISTS_CODE               = "ocr_file_not_exists";
    /** OCR可识别文件不存在Message */
    public static final String RESPONSE_OCR_FILE_NOT_EXISTS_MESSAGE            = "OCR可识别文件不存在";

    /** OCR识别错误Code */
    public static final String RESPONSE_OCR_ERROR_CODE                         = "ocr_error";
    /** OCR识别错误Message */
    public static final String RESPONSE_OCR_ERROR_MESSAGE                      = "OCR识别错误";
    //--------------------------OCR识别错误---------------------------------------

    //--------------------------科室繁忙度度---------------------------------------
    /**楼层信息不完整code*/
    public static final String RESPONSE_UNCOMPLETE_FLOORINFO_CODE              = "uncomplete_floorInfo";
    /**楼层信息不完整message*/
    public static final String RESPONSE_UNCOMPLETE_FLOORINFO_MESSAGE           = "请先维护楼层信息";

    /**大楼布局信息不完整code*/
    public static final String RESPONSE_UNCOMPLETE_LAYOUT_CODE                 = "uncomplete_layoutinfo";
    /**大楼布局信息不完整message*/
    public static final String RESPONSE_UNCOMPLETE_LAYOUT_MESSAGE              = "请先维护楼宇分布信息";

    /**楼宇分布信息为空code*/
    public static final String RESPONSE_EMPTY_HOSPITALLAYOUTINFO_ERROR_CODE    = "empty_hospitalLayoutInfo";
    /**楼宇分布信息为空message*/
    public static final String RESPONSE_EMPTY_HOSPITALLAYOUTINFO_ERROR_MESSAGE = "楼宇分布信息为空";

    /**楼层序号已存在code*/
    public static final String RESPONSE_EXIT_FLOORINDEX_CODE                   = "exit_floor_index";
    /**楼层序号已存在message*/
    public static final String RESPONSE_EXIT_FLOORINDEX_MESSAGE                = "楼层序号已存在";

    /**楼层名称已存在code*/
    public static final String RESPONSE_EXIT_FLOORNAME_CODE                    = "exit_floor_name";
    /**楼层名称已存在message*/
    public static final String RESPONSE_EXIT_FLOORNAME_MESSAGE                 = "楼层名称已存在";

    /**楼层序号不能为空code*/
    public static final String RESPONSE_EMPTY_FLOORINDEX_CODE                  = "empty_floor_index";
    /**楼层序号不能为空message*/
    public static final String RESPONSE_EMPTY_FLOORINDEX_MESSAGE               = "楼层序号不能为空";

    /**楼层名称不能为空code*/
    public static final String RESPONSE_EMPTY_FLOORNAME_CODE                   = "empty_floor_name";
    /**楼层名称不能为空message*/
    public static final String RESPONSE_EMPTY_FLOORNAME_MESSAGE                = "楼层名称不能为空";

    /**科室分布信息(微信)不能为空code*/
    public static final String RESPONSE_EMPTY_WEBCODE_CODE                     = "empty_floor_webcode";
    /**科室分布信息(微信)不能为空message*/
    public static final String RESPONSE_EMPTY_WEBCODE_MESSAGE                  = "科室分布信息(微信)不能为空";

    /**科室分布信息(app)不能为空code*/
    public static final String RESPONSE_EMPTY_APPCODE_CODE                     = "empty_floor_appcode";
    /**科室分布信息(app)不能为空message*/
    public static final String RESPONSE_EMPTY_APPCODE_MESSAGE                  = "科室分布信息(app)不能为空";

    /**楼宇名称不能为空message**/
    public static final String RESPONSE_EMPTY_BUILDNAME_MESSAGE                = "楼宇名称不能为空";
    /**楼层名称不能为空code*/
    public static final String RESPONSE_EMPTY_BUILDNAME_CODE                   = "empty_build_name";

    /**楼宇名称不能为空message**/
    public static final String RESPONSE_EXIST_BUILDNAME_MESSAGE                = "楼宇名称已存在";
    /**楼层名称不能为空code*/
    public static final String RESPONSE_EXIST_BUILDNAME_CODE                   = "exist_build_name";

    /**科室分布信息(app)不能为空code*/
    public static final String RESPONSE_EMPTY_DEPARTMENT_FLOOR_CODE            = "empty_department_floor";
    /**科室分布信息(app)不能为空message*/
    public static final String RESPONSE_EMPTY_DEPARTMENT_FLOOR_MESSAGE         = "科室分布信息中不包含科室";

    /**json解析错误code*/
    public static final String RESPONSE_JSON_PARSE_ERROR_CODE                  = "json_parse_error";
    /**json解析错误message*/
    public static final String RESPONSE_JSON_PARSE_ERROR_MESSAGE               = "json解析错误,请检查楼层信息的配置";

    /**无效的楼层id code*/
    public static final String RESPONSE_INVALID_FLOOR_ID_ERROR_CODE            = "invalid_floor_id";
    /**无效的楼层id message*/
    public static final String RESPONSE_INVALID_FLOOR_ID_ERROR_MESSAGE         = "无效的楼层id";

    /**不可以重复添加楼层布局信息code*/
    public static final String RESPONSE_EXIST_HOSPITALLAYOUTINFO_ERROR_CODE    = "exist_hospitalLayoutInfo";
    /**不可以重复添加楼层布局信息message*/
    public static final String RESPONSE_EXIST_HOSPITALLAYOUTINFO_ERROR_MESSAGE = "不可重复添加楼宇布局信息";
    //--------------------------科室繁忙度---------------------------------------

    //---------------------------文件上传-----------------------------------------

    /**文件上传错误code*/
    public static final String RESPONSE_FILE_UPLOAD_ERROR_CODE                 = "file_upload_error";
    /**文件上传错误message*/
    public static final String RESPONSE_FILE_UPLOAD_ERROR_MESSAGE              = "文件上传错误";
    //---------------------------文件上传-----------------------------------------

    //---------------------------调用HIS相关错误-----------------------------------
    /**返回数据错误code*/
    public static final String RESPONSE_CONVERTER_ERROR_CODE                   = "converter_error";
    /**返回数据错误message*/
    public static final String RESPONSE_CONVERTER_ERROR_MESSAGE                = "数据解析异常";
    /**调用his失败code*/
    public static final String RESPONSE_CALL_HIS_FAILED_ERROR_CODE             = "call_his_failed";

    //---------------------------个人中心相关错误-----------------------------------
    /**返回预约用户编号为空code*/
    public static final String CUSTOMERID_NULL_ERROR_CODE                      = "customerId_null";
    /**返回预约用户编号为空message*/
    public static final String CUSTOMERID_NULL_ERROR_MESSAGE                   = "用户编号为空";

    /**返回无效身份证code*/
    public static final String INVALID_ID_CARD_ERROR_CODE                      = "invalid_id_card";
    /**返回无效身份证message*/
    public static final String INVALID_ID_CARD_ERROR_MESSAGE                   = "无效身份证";

    /**预约用户所属就诊人超过限制code*/
    public static final String PATIENT_OVER_ERROR_CODE                         = "patient_over";
    /**预约用户所属就诊人超过限制message*/
    public static final String PATIENT_OVER_ERROR_MESSAGE                      = "预约用户所属就诊人超过5人限制";

    /**有待支付挂号记录code*/
    public static final String HAVE_REGISTER_ERROR_CODE                        = "sub_and_reg_over";
    /**有待支付挂号记录message*/
    public static final String HAVE_REGISTER_ERROR_MESSAGE                     = "您有未完成挂号记录,不能编辑/删除就诊人";
    /**有预约记录或者预约未支付记录code*/
    public static final String HAVE_ORDER_ERROR_CODE                           = "have_order";
    /**有预约记录或者预约未支付记录message*/
    public static final String HAVE_ORDER_ERROR_MESSAGE                        = "您有预约或未支付记录,不能编辑/删除就诊人";
    public static final String HAVE_EXAMIN_ERROR_MESSAGE                        = "您有尚未完成的体检订单，无法删除就诊人";
    /**已添加过该就诊人code*/
    public static final String ALREADY_HAVE_PATIENT_ERROR_CODE                 = "already_have_patient";
    /**已添加过该就诊人message*/
    public static final String ALREADY_HAVE_PATIENT_ERROR_MESSAGE              = "已添加过该就诊人！";
    /**就诊人姓名不一致code*/
    public static final String REAL_NAME_ERROR_CODE                            = "real_name_error";
    /**就诊人姓名不一致message*/
    public static final String REAL_NAME_ERROR_MESSAGE                         = "就诊人姓名与医院预留姓名不一致！";
    /**返回无效身份证code*/
    public static final String MISMATCH_ID_CARD_ERROR_CODE                     = "mismatch_id_card";
    /**返回无效身份证message*/
    public static final String MISMATCH_ID_CARD_ERROR_MESSAGE                  = "身份证号与医院预留号码不一致！";
    /**超过每天校验就诊人最大失败次数code*/
    public static final String OVER_MAX_CHECK_TIMES_ERROR_CODE                     = "over_max_check_times";

    //---------------------------minipay相关错误-----------------------------------
    /**已添加过该设备code*/
    public static final String ALREADY_HAVE_MINIPAY_ERROR_CODE                 = "already_have_minipay";
    /**已添加过该设备message*/
    public static final String ALREADY_HAVE_MINIPAY_ERROR_MESSAGE              = "已添加过该设备！";
    /**minipay一卡通支付密码不能为空*/
    public static final String PASSWORD_CAN_NOT_EMPTY_ERROR_CODE              = "password_can_not_empty";
    /**minipay一卡通支付密码不能为空*/
    public static final String PASSWORD_CAN_NOT_EMPTY_ERROR_MESSAGE              = "支付密码不能为空！";
    
    //---------------------------个人中心相关错误-----------------------------------

    //---------------------------His返回错误----------------------------------------
    /**调用HIS接口通讯异常code*/
    public static final String CALL_HIS_NETWORK_ERROR_CODE                     = "call_his_network_error";
    /**调用HIS接口通讯异常message*/
    public static final String CALL_HIS_NETWORK_ERROR_MESSAGE                  = "调用HIS接口通讯异常！";
    /**His返回错误信息*/
    public static final String CALL_HIS_DATA_ERROR_CODE                        = "call_his_data_error";
    public static final String CALL_HIS_UNKNOWN_ERROR_CODE                     = "call_his_unknown_error";

    //---------------------------His返回错误----------------------------------------

    /**订单金额不匹配code*/
    public static final String RESPONSE_ORDER_AMOUNT_DEROR_CODE                = "order_amount_does_not_match";
    /**订单金额不匹配Message*/
    public static final String RESPONSE_ORDER_AMOUNT_DEROR_MESSAGE             = "订单金额不匹配";

    /**订单状态错误code*/
    public static final String RESPONSE_ORDER_UNCORRECT_STATUS_CODE            = "order_uncorrect_status";
    /**订单状态错误Message*/
    public static final String RESPONSE_ORDER_UNCORRECT_STATUS_MESSAGE         = "订单状态错误";

    /**创建订单失败code*/
    public static final String RESPONSE_CREATE_ORDER_FAILURE_CODE              = "create_order_failure";
    /**创建订单失败Message*/
    public static final String RESPONSE_CREATE_ORDER_FAILURE_MESSAGE           = "创建订单失败";

    /**关闭订单失败code*/
    public static final String RESPONSE_CLOSE_ORDER_FAILURE_CODE              = "close_order_failure";
    /**关闭订单失败Message*/
    public static final String RESPONSE_CLOSE_ORDER_FAILURE_MESSAGE           = "关闭订单失败";

    /**创建订单失败code*/
    public static final String RESPONSE_PAY_FAILURE_CODE                       = "pay_failure";
    /**创建订单失败Message*/
    public static final String RESPONSE_PAY_FAILURE_MESSAGE                    = "订单支付失败";

    /**未配置远程调用所需的配置信息错误code*/
    public static final String RESPONSE_RPC_CONFIG_NOT_CONFIGURED_CODE         = "rpc_config_not_configured";
    /**未配置远程调用所需的配置信息错误Message*/
    public static final String RESPONSE_RPC_CONFIG_NOT_CONFIGURED_MESSAGE      = "未配置远程调用所需的配置信息";

    /**无记录错误code*/
    public static final String RESPONSE_NO_RECORDS_CODE                        = "no_records";
    /**无记录错误Message*/
    public static final String RESPONSE_NO_RECORDS_MESSAGE                     = "暂无记录";
    
    /** 微信医保支付实名验证失败code */
    public static final String RESPONSE_MEDICAL_VERIFY_NAME_FAIL_CODE          = "medical_verify_name_fail";
    /** 微信医保支付实名验证失败message */
    public static final String RESPONSE_MEDICAL_VERIFY_NAME_FAIL_MESSAGE       = "medical_verify_name_fail";
    
    //---------------------------预警错误-----------------------------------------
    /**预警模板配置错误Code*/
    public static final String RESPONSE_ALTER_EMAIL_TEMPLATE_ERROR_CODE        = "alert_email_template_error";
    /**预警模板配置错误message*/
    public static final String RESPONSE_ALTER_EMAIL_TEMPLATE_ERROR_MESSAGE     = "预警模板配置错误";
    //---------------------------预警错误-----------------------------------------

    //---------------------------预约相关错误--------------------------------------
    public static final String RESPONSE_VALIDATE_SUB_RULE_FAILED_ERROR_CODE    = "validate_sub_rule_failed";

    public static final String RESPONSE_VERIFY_CASE_IS_NULL_ERROR_CODE    = "verify_cause_is_null";//审核失败原因为空
    public static final String RESPONSE_VERIFY_RESULT_IS_NULL_ERROR_CODE    = "verify_result_is_null";//审核结果为空
    public static final String RESPONSE_VERIFY_CASE_IS_LONG_ERROR_CODE    = "verify_cause_is_long";//审核原因字数超过限制：50

    public static final String RESPONSE_OVER_CANCEL_SUB_TIME_ERROR_CODE        = "over_cancel_sub";
    public static final String RESPONSE_OVER_CANCEL_SUB_TIME_ERROR_MESSAGE     = "已过取消预约时间点，不能取消";

    public static final String RESPONSE_CAN_NOT_FIND_SUB_RECORD_ERROR_CODE     = "can_not_find_sub_record";
    public static final String RESPONSE_CAN_NOT_FIND_SUB_RECORD_ERROR_MESSAGE  = "不存在此预约记录";

    public static final String RESPONSE_SUB_ORDER_ALREADY_PAID_ERROR_CODE      = "sub_order_already_paid";
    public static final String RESPONSE_SUB_ORDER_ALREADY_PAID_ERROR_MESSAGE   = "订单已支付";
    //同一科室已存在预约错误码
    public static final String RESPONSE_SUB_EXISTS_IN_DEPARTMENT_ERROR_CODE    = "sub_exists_in_department";

    //---------------------------预约相关错误--------------------------------------

    //-------------挂号相关常量定义--------------------
    /**如果直接挂号，检查挂号时，同一个就诊人同一天中。不能有 预约+挂号 大于等于3次*/
    public static final int    REGISTER_MAX                                    = 3;
    public static final int    REG_MAX                                    = 1;


	public static enum REGISTER {
        REGISTER_OBJECT_NULL("not_find_obj", "排班或者就诊人为空"),
        REGISTER_REALNAME_NULL("patient_realname_notnull", "就诊人姓名不能为空"),
        REGISTER_DEPARTMENT_NULL("patient_department_notnull", "就诊科室不能为空"),
        REGISTER_IDCARD_NULL("patient_idcard_notnull", "就诊人身份证不能为空"),
        REGISTER_BLACK_TIMES("patient_black_times", "就诊人爽约次数超过限制"),
        REGISTER_TIME_ERROR("regist_time_error", "挂号的就诊时间错误"),
        REGISTER_CARD_NULL("patient_card_notnull", "就诊卡号不能为空"),
        REGISTER_DEPARTMENT_EXIST("patient_reg_exist", "该科室已有未完成的挂号"),
        REGISTER_DEPARTMENT_SUB("patient_reg_sub", "该科室已有预约"),
        REGISTER_DEPARTMENT_DOCTORY("patient_dep_doc", "查询科室医生信息异常"),
        REGISTER_SUB_CHECK("patient_sub_check", "预约查询his返回失败"),
        REGISTER_NOTIFY_ORDER_STATUS("order_not_pay", "订单不存在或未支付"),
        REGISTER_MAX_OVER("patient_reg_max", "当前挂号预约不能超过3次"),
        REGISTER_DEP_MAX("patient_reg_dep_max", "当前科室最多仅能挂号三次"),
    	REG_REPEAT_MAX("patient_reg_repeat_max", "同一时间段内,您已存在一笔相同的挂号记录"),
    	DIFFRENT_DEPT_REG_MAX("diffrent_dept_patient_reg_max", "不同科室, 当日挂号预约不能超过%s次"),
    	SAME_DEPT_REG_MAX("same_dept_patient_reg_max", "当前挂号预约不能超过%s次"),
        REGISTER_OUT_TIME("register_out_time", "由于您长时间未支付，该挂号已自动取消，请重新预约挂号！");
        private final String code;
        private final String message;

        REGISTER(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

    }

    //-------------挂号相关常量定义  end--------------------

    //---------------------------挂号相关错误--------------------------------------
    public static final String RESPONSE_REG_ORDER_ALREADY_PAID_ERROR_CODE       = "reg_order_already_paid";
    //同一科室已存在挂号错误码
    public static final String RESPONSE_REG_EXISTS_IN_DEPARTMENT_ERROR_CODE     = "reg_exists_in_department";

    /**此挂号不能支付*/
    public static final String RESPONSE_CAN_NOT_PAY_REG                         = "can_not_pay_reg";

    public static final String RESPONSE_CAN_NOT_FIND_REG_RECORD_ERROR_CODE      = "can_not_find_reg_record";
    public static final String RESPONSE_CAN_NOT_FIND_REG_RECORD_ERROR_MESSAGE   = "不存在此挂号记录";

    public static final String RESPONSE_CAN_NOT_CANCEL_REG_RECORD_ERROR_CODE    = "can_not_cancel_reg_record";
    public static final String RESPONSE_CAN_NOT_CANCEL_REG_RECORD_ERROR_MESSAGE = "您的挂号记录已支付，不能取消挂号！";
    public static final String RESPONSE_REG_ALRADY_CANCEL_ERROR_CODE            = "reg_alrady_cancel";
    public static final String RESPONSE_REG_ALRADY_CANCEL_ERROR_MESSAGE         = "您的挂号记录已取消，不能重复取消！";

    public static final String RESPONSE_NOT_IN_REG_TIME_ERROR_CODE              = "not_in_reg_time_error_code";

    public static final String RESPONSE_OVER_CANCEL_REG_TIME_ERROR_CODE         = "over_cancel_reg";
    public static final String RESPONSE_OVER_CANCEL_REG_TIME_ERROR_MESSAGE      = "已过取消挂号时间点，不能取消";
    public static final String RESPONSE_PATIENT_SUB_MAX_ERROR_CODE              = "patient_sub_max";
    public static final String RESPONSE_PATIENT_SUB_MAX_ERROR_MESSAGE           = "当前预约不能超过3次";

    //---------------------------挂号相关错误  end--------------------------------------
    //---------------------------预约相关错误--------------------------------------

    /** 订单信息错误Code */
    public static final String RESPONSE_ORDER_INFO_ERROE_CODE                   = "order_info_error";
    /** 订单信息错误Message */
    public static final String RESPONSE_ORDER_INFO_ERROE_MESSAGE                = "订单信息错误";

    /** 支付失败Code */
    public static final String RESPONSE_PAY_FAIL_CODE                           = "pay_failure";
    /** 支付失败Message */
    public static final String RESPONSE_PAY_FAIL_MESSAGE                        = "支付失败";

    public static final String RESPONSE_REFUND_FAIL_MESSAGE                     = "refund_fail";
    
    /**订单关闭失败*/
    public static final String RESPONSE_ORDER_CLOSE_FAIL_CODE                     = "order_close_fail";

    //---------------------------预约相关错误   end--------------------------------------

    //---------------------------科室相关错误--------------------------------------------

    /** 科室信息错误Code */
    public static final String RESPONSE_DEPARTMENT_ERROR_CODE                   = "department_error_code";

    //---------------------------科室相关错误   end-----------------------------------------

    //---------------------------医生相关错误--------------------------------------------

    /** 医生信息错误Code */
    public static final String RESPONSE_DOCTORS_ERROR_CODE                      = "doctors_error_code";

    //---------------------------医生相关错误   end-----------------------------------------

    //-----------------------排班相关---------------------------------
    /**停诊错误*/
    public static final String RESPONSE_STOP_SCHECULE_ERROR_CODE                = "stop_schedule_error";
    //-----------------------排班相关---------------------------------

    //------------------------评价(估)相关错误---------------------------------------------
    /** 没有查询到评价(估)问卷错误Code */
    public static final String RESPONSE_NOT_FIND_APPRAISE_ERROR_CODE            = "not_find_appraise";
    /** 没有查询到评价(估)问卷错误Message */
    public static final String RESPONSE_NOT_FIND_APPRAISE_ERROR_MESSAGE         = "没有查询到评价(估)问卷";
    //------------------------评价(估)相关错误---------------------------------------------

    //------------------------退款错误码---------------------
    /**退款申请失败*/
    public static final String RESPONSE_REFUND_APPLY_FAIL                       = "refund_apply_fail";
    /**退款查询失败*/
    public static final String RESPONSE_QUREY_APPLY_FAIL                        = "refund_qurey_fail";
    /**退款失败*/
    public static final String RESPONSE_REFUND_FAIL                             = "refund_fail";
    //------------------------退款错误码---------------------

    //-----------------------就诊卡相关---------------------------------
    /**停诊错误*/
    public static final String RESPONSE_QUERY_PATIENT_ERROR_CODE                = "query_patient_error";
    //-----------------------就诊卡相关---------------------------------
    
    //-----------------------服务端心跳相关---------------------------------
    
    public static final String RESPONSE_REQUEST_PARM_HOSPITAL_ID_INVALID_ERROR_CODE      = "request_parm_hospital_id_invalid_error";

    public static final String RESPONSE_REQUEST_PARM_HOSPITAL_ID_INVALID_ERROR_MESSAGE   = "请求入参hospital_id无效";

    public static final String RESPONSE_REQUEST_PARM_DEVICE_ID_INVALID_ERROR_CODE        = "request_parm_device_id_invalid_error";

    public static final String RESPONSE_REQUEST_PARM_DEVICE_ID_INVALID_ERROR_MESSAGE     = "请求入参device_id无效";

    public static final String RESPONSE_REQUEST_PARM_PLATFORM_TYPE_INVALID_ERROR_CODE    = "request_parm_platform_type_invalid_error";

    public static final String RESPONSE_REQUEST_PARM_PLATFORM_TYPE_INVALID_ERROR_MESSAGE = "请求入参platform_type无效";
    
    //-----------------------服务端心跳相关---------------------------------

    //-----------------------停车场相关---------------------------------
    /**车牌号错误*/
    public static final String RESPONSE_REQUEST_WRONG_LICENSE_NO                         = "您输入的车牌号有误，请重新输入";

    /**车牌号已绑定*/
    public static final String RESPONSE_REQUEST_LICENSE_NO_EXISTED                       = "已绑定过该车牌，请勿重复绑定";

    //-----------------------停车场相关---------------------------------
    
    /**
     * 用户未进行统一认证Code
     */
    public static final String RESPONSE_USER_NOT_UNION_AUTH_CODE               = "user_not_union_auth";
    /**
     * 用户未进行统一认证Message
     */
    public static final String RESPONSE_USER_NOT_UNION_AUTH_MESSAGE            = "用户未进行统一认证";
    
    /**
     * 验证码重复发送Code
     */
    public static final String RESPONSE_SEND_REPEAT_VALIDCODE_CODE               = "send_repeat_validcode";
    
    /**
     * 身份证已注册但用户姓名不一致Code
     */
    public static final String RESPONSE_IDCARD_REGISTERED_USERNAME_NOT_SAME_CODE               = "idCard_registered_and_username_not_same";
    
    /**
     * 身份证已注册但用户姓名不一致Message
     */
    public static final String RESPONSE_IDCARD_REGISTERED_USERNAME_NOT_SAME_MESSAGE               = "身份证信息已被其他姓名注册";

    /** 登录设备状态已禁用**/
    public static final String RESPONSE_LOGIN_DEVICE_STATUS_ERROR_CODE  = "device_status_error";

    /** 登录设备状态已禁用**/
    public static final String RESPONSE_LOGIN_DEVICE_STATUS_ERROR_MESSAGE = "该登录设备已被禁用！";

    /** 挂号/预约导出时间参数异常*/
    public static final String REGISTER_EXPORT_TIME_ERRO_CODE = "register_export_time_erro";

    public static final String REGISTER_EXPORT_TIME_ERRO_MESSAGE = "挂号开始日期或就诊开始日期不能为空！";

    public static final String REGISTER_EXPORT_TIME_OUTSTRIP_CODE = "register_export_time_outstrip";

    public static final String REGISTER_EXPORT_TIME_OUTSTRIP_MESSAGE = "导出时挂号日期和就诊日期不能超过90天！";

    public static final String SUBSCRIPTION_EXPORT_TIME_ERRO_CODE = "subscription_export_time_erro";

    public static final String SUBSCRIPTION_EXPORT_TIME_ERRO_MESSAGE = "预约开始日期或就诊开始日期不能为空！";

    public static final String SUBSCRIPTION_EXPORT_TIME_OUTSTRIP_CODE = "subscription_export_time_outstrip";

    public static final String SUBSCRIPTION_EXPORT_TIME_OUTSTRIP_MESSAGE = "导出时预约日期和就诊日期不能超过90天！";

    /**已添加过该住院人code*/
    public static final String ALREADY_HAVE_IN_PATIENT_CODE                 = "already_have_in_patient";


    public static enum CardType {
        UNKNOWN("0","未知"),
        PATIENT_CARD("1", "普通就诊卡"),
        SOCIAL_CARD("2", "医保卡"),
        HEALTH_CARD("3", "电子健康卡");
        private final String code;
        private final String message;

        CardType(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

        public static String getEnumType(String key) {
            CardType[] cardTypes = CardType.values();
            for (int i = 0; i < cardTypes.length; i++) {
                if (cardTypes[i].getCode().equals(key)) {
                    return cardTypes[i].getMessage();
                }
            }
            return CardType.UNKNOWN.getMessage();
        }

    }
}
