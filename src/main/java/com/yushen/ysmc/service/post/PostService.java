package com.yushen.ysmc.service.post;

import com.yushen.ysmc.controller.post.vo.PostBaseRespVO;
import com.yushen.ysmc.controller.post.vo.PostCreateReqVO;

import java.util.List;

/**
 * @author: yushen
 **/
public interface PostService {

    /**
     * 创建帖子
     * @param reqVO
     */
    void createPost(PostCreateReqVO reqVO);

    /**
     * 更新帖子
     * @param reqVO
     */
    void updatePost(PostCreateReqVO reqVO);

    /**
     * 删除帖子
     * @param id
     */
    void deletePost(Long id);

    /**
     * 获取帖子
     * @param id
     * @return
     */
    PostBaseRespVO getPost(Long id);

    /**
     * 获取帖子列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PostBaseRespVO> getPostList(Integer pageNum, Integer pageSize);
}
