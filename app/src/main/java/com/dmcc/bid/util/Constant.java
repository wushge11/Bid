package com.dmcc.bid.util;


public class Constant {
    public static String Cookie = "";
    /**
     * 服务器地址
     */
    private static final String API_HOST = "https://api.douban.com/v2/movie";
    //    private static final String API_HOST = "http://192.168.31.209/file";
    public static final String SERVER = API_HOST + "/";
    /**
     * 项目根SD卡目录
     **/
    public static final String PROJECT_ROOT = "CRM";
    public static final String SDPATH = SDCardUtils.getSDCardPath() + "/"
            + PROJECT_ROOT + "/";
    /**
     * 多媒体路径
     */
    public static final String DEFAULT_IMAGE_PATH =SDPATH+"_IMG";
    public static final String DEFAULT_VOICE_PATH =SDPATH+"_VOICE";
    public static final String DEFAULT_VIDEO_PATH =SDPATH+"_VIDEO";
    /**
     * OKHttp CaChe
     */
    public static String Cache_Root_Dir;
    public static final String CACHE_DIR = "http_cache_dir";
    /**
     * 是否是第一次进入
     **/
    public static final String APP_ISFIRST = "APP_ISFIRST";// 是否是第一次进入
    /**
     * 自动登陆
     **/
    public static final String APP_AUTO_LOGIN = "APP_AUTO_LOGIN";// 是否是第一次进入
    public static final String APP_CACHE_AUTHCONTEXT = "APP_CACHE_AUTHCONTEXT";// 是否是第一次进入
    public static final String APP_CACHE_ACCOUNT = "APP_CACHE_ACCOUNT";// 是否是第一次进入
    public static final String APP_CACHE_PASSWORD = "APP_CACHE_PASSWORD";// 是否是第一次进入


    public static final String UPLOAD_TYPE_USER_IMG ="0";//用户图像
    public static final String UPLOAD_TYPE_CUSTOMERS_IMG ="1";//客户图像
    public static final String UPLOAD_TYPE_PROJECT_RECORD ="2";//项目记录
    public static final String UPLOAD_TYPE_CUSTOMER_RECORD ="3";//客户记录
    public static final String UPLOAD_TYPE_WORKGROUP ="4";//工作组

    /********************************趣拍sdk********************************************/
    /**
     * 默认最大时长
     */
    public static int DEFAULT_DURATION_MAX_LIMIT = 8;

    public static int DEFAULT_DURATION_LIMIT_MIN = 2;
    /**
     * 默认码率
     */
    public static int DEFAULT_BITRATE = 800 * 1024;
    /**
     * 默认CRF参数
     */
    public static int DEFAULT_VIDEO_RATE_CRF = 25;

    /**
     * VideoPreset
     */
    public static String DEFAULT_VIDEO_Preset = "faster";
    /**
     * VideoLevel
     */
    public static int DEFAULT_VIDEO_LEVEL = 30;

    /**
     * VideoTune
     */
    public static String DEFAULT_VIDEO_TUNE = "zerolatency";
    /**
     * movflags_KEY
     */
    public static String DEFAULT_VIDEO_MOV_FLAGS_KEY = "movflags";

    /**
     * movflags_VALUE
     */
    public static String DEFAULT_VIDEO_MOV_FLAGS_VALUE = "+faststart";

    /**
     * 默认Video保存路径，请开发者自行指定
     */
    public static String VIDEOPATH;

    public static String THUMBNAILPATH = VIDEOPATH + ".png";
    /**
     * 水印本地路径，文件必须为rgba格式的PNG图片
     */
    public static String WATER_MARK_PATH = "assets://Qupai/watermark/qupai-logo.png";
    /**
     * 水印位置1为右上，2为右下
     */
    public static int WATER_MARK_POSITION = 1;

    public static String appkey = "1453203460112";// 204955a834a7c36
    public static String appsecret = "b29ba954-0364-43f3-aaa0-2c273090853b";// 55e409dc27c04a87be124a2939348b58
    public static String tags = "tags";
    public static String description = "description";
    public static int shareType = 1; //是否公开 0公开分享 1私有(default) 公开类视频不需要AccessToken授权

    public static String accessToken;//accessToken 通过调用授权接口得到
    public static String space = "workspace"; //存储目录 建议使用uid cid之类的信息
    public static String domain = "http://video.ycqiyuan.com";//当前TEST应用的域名。该地址每个应用都不同 sdk.s.qupai.me
}
