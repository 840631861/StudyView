package com.python.cat.studyview.net;

import com.python.cat.studyview.bean.ArticleBean;

import io.reactivex.Observable;
import retrofit2.http.HTTP;
import retrofit2.http.Path;

/**
 * Created by cat on 2018/6/15.
 * * http://www.wanandroid.com/article/list/0/json
 */

public interface ArticleBeanInterface {
    @HTTP(method = "GET", path = "article/list/{id}/json")
    Observable<ArticleBean> getArticles(@Path("id") int id);
}
