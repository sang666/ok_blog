package com.sang.blog.commom.utils;

import org.omg.CORBA.INTERNAL;

public interface Constants {
    String FROM_PC = "p_";
    String FROM_MOBILE="m_";

    interface user {
        String ROLE_ADMIN = "role_admin";
        String ROLE_NORMAL = "role_normal";
        String DEFAULT_AVATER = "https://sang666.oss-cn-hangzhou.aliyuncs.com/img/0S9_HXEE}B1EK$Z8INHF}E1.png";//头像
        Integer DEFAULT_STATE = 0;
        String KEY_COPTCHA_CONTENT = "key_coptcha_content_";
        String KEY_EMAIL_CODE_CONTENT = "key_email_code_content_";
        String KEY_EMAIL_SEND_IP = "key_email_send_ip_";
        String KEY_EMAIL_SEND_ADDRESS = "key_email_send_address_";
        String KEY_TOKEN = "key_token_";
        String COOKIE_TOKEN_KEY = "blog_token";
        String KEY_PC_LOGIN_ID = "key_pc_login_id_";
        String KEY_PC_LOGIN_STATE_FALSE = "false";
        String KEY_PC_LOGIN_STATE_TRUE = "true";
     }


    interface settings {
        String MANAGER_ACCOUNT_INIT_STATE = "MANAGER_ACCOUNT_INIT_STATE";
        String WEB_SITE_TITLE = "web_site_title";
        String WEB_SITE_DESCRIPTION = "web_site_description";
        String WEB_SITE_KEYWORDS = "web_site_keywords";

        String WEB_SITE_VIEW_COUNT = "web_site_view_count";
    }


    /**
     * 单位是秒
     */
    interface TimeValue {

        int MIN = 60;
        int HOUR = 60 * MIN;
        long HOUR_2 = 2 * 60 * 60 * 1000;
        long DAY = HOUR * 24;
        long WEEK = 7 * DAY;
        long MONTH = 30 * DAY;

    }

    /**
     * 单位是毫秒
     */
    interface TimeValueInMillions {

        int MIN = 60*1000;
        int HOUR = 60 * MIN;
        long HOUR_2 = 2 * 60 * 60 * 1000;
        long DAY = HOUR * 24;
        long WEEK = 7 * DAY;
        long MONTH = 30 * DAY;

    }

    interface Article{
        String TUPE_MARKDOWM="1";
        String TYPE_RICH_TEXT="0";

        int TITLE_MAX_LENGTH = 128;
        int SUMMARY_MAX_LENGTH = 128;

        //状态（1表示删除，0表示发布，2表示草稿,3表示置顶）
        Integer STATE_DELETE = 1;
        Integer STATE_PUBLISH = 0;
        Integer STATE_DRAFT = 2;
        Integer STATE_TOP = 3;
        String KEY_ARTICLE_CACHE = "key_article_cache_";
        String KEY_ARTICLE_CACHE_COUNT= "key_article_cache_count_";
        String KEY_ARTICLE_LIST_FIRST_PAGE = "key_article_list_first_page_";


    }

    interface Comment{
        //状态（1表示删除，0表示发布,3表示置顶）
        Integer STATE_PUBLISH = 0;
        Integer STATE_TOP = 3;
        String KEY_COMMENT_FIRST_PAGE_CACHE="key_comment_first_page_cache_";


    }
     interface EsConstant {

        /**
         * 高亮显示 - 开始标签
         */
        String HIGH_LIGHT_START_TAG = "<em>";

        /**
         * 高亮显示 - 结束标签
         */
        String HIGH_LIGHT_END_TAG = "</em>";

        /**
         * 索引名称
         */
        class INDEX_NAME {
            /**
             * 游记
             */
            public static final String TRAVEL = "travel";
        }
    }



}
