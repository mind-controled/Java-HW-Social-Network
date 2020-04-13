package ru.netology.domain;

public class Post {
    private int postId;
    private int wallOwnerId;
    private int authorId;
    private int postDate;
    private String text;
    private int signerId;


    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
}
