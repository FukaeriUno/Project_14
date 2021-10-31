package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int from_id;
    private int created_by;
    private String logoImageURL;
    private String groupName;
    private String date;
    private Article articleInfo;
    private String postText;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private ReplyInfo reportInfo;
    private ViewsInfo viewsInfo;
}